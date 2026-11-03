#!/usr/bin/env bash
# Imports the GPG signing key from $GPG_PRIVATE_KEY into the runner's keyring.
#
# Accepts the key in any of the forms it tends to end up in after being pasted
# into a GitHub secret:
#   - a full ASCII-armored block (with or without the blank line after BEGIN)
#   - an armored block whose line breaks became spaces, literal "\n", or CRLF
#   - just the base64 body of an armored block (no BEGIN/END lines)
#   - a base64-encoded binary or armored export
# Never prints the key itself; only its shape and, after import, its key ID.
set -euo pipefail

if [ -z "${GPG_PRIVATE_KEY:-}" ]; then
  echo "::error::OSSRH_GPG_SECRET_KEY is empty or not set."
  exit 1
fi

begin='-----BEGIN PGP PRIVATE KEY BLOCK-----'
end='-----END PGP PRIVATE KEY BLOCK-----'
work="$(mktemp -d)"
trap 'rm -rf "$work"' EXIT

# Normalize line endings: literal "\n" -> newline, drop CR, trim each line.
printf '%s\n' "$GPG_PRIVATE_KEY" | sed 's/\\n/\n/g' | tr -d '\r' \
  | sed 's/^[[:space:]]*//; s/[[:space:]]*$//' > "$work/raw"

echo "Secret shape: $(wc -l < "$work/raw" | tr -d ' ') line(s), $(wc -c < "$work/raw" | tr -d ' ') bytes," \
  "BEGIN marker: $(grep -qF -- "$begin" "$work/raw" && echo yes || echo no)," \
  "END marker: $(grep -qF -- "$end" "$work/raw" && echo yes || echo no)"

if grep -qF -- '-----BEGIN PGP PUBLIC KEY BLOCK-----' "$work/raw"; then
  echo "::error::OSSRH_GPG_SECRET_KEY contains a PUBLIC key. It must be the private key (gpg --armor --export-secret-keys <KEYID>)."
  exit 1
fi

# Turn base64 text (one or many lines/words) into the binary key packets.
# Drops armor headers (Key: value lines) and the "=XXXX" armor checksum.
decode_body() {
  grep -vE '^[A-Za-z][A-Za-z-]*: ' \
    | tr -s '[:space:]' '\n' \
    | grep -vE '^=[A-Za-z0-9+/]{4}$' \
    | tr -d '\n' \
    | base64 -d
}

if grep -qF -- "$begin" "$work/raw"; then
  # Armored: take what is between the markers, wherever the markers sit.
  tr '\n' '\001' < "$work/raw" \
    | sed "s/.*${begin}//; s/${end}.*//" | tr '\001' '\n' \
    | decode_body > "$work/key.gpg"
else
  # No markers: either the armor body alone or a base64-encoded export.
  decode_body < "$work/raw" > "$work/key.gpg"
  if head -c 64 "$work/key.gpg" | grep -qF -- '-----BEGIN PGP'; then
    mv "$work/key.gpg" "$work/key.asc"
    GPG_PRIVATE_KEY="$(cat "$work/key.asc")" exec "$0"
  fi
fi

if ! gpg --batch --import "$work/key.gpg"; then
  echo "::error::Could not import OSSRH_GPG_SECRET_KEY. Re-export it with: gpg --armor --export-secret-keys <KEYID> > key.asc && gh secret set OSSRH_GPG_SECRET_KEY < key.asc"
  exit 1
fi

if [ -z "$(gpg --list-secret-keys --with-colons | grep '^sec')" ]; then
  echo "::error::No secret key was imported (the secret may only contain a public key)."
  exit 1
fi
gpg --list-secret-keys --keyid-format LONG | grep -E '^(sec|uid)'
