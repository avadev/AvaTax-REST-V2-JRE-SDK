package net.avalara.avatax.rest.client;

import java.util.HashMap;

public class AvaTaxPath {
    private String path;
    private HashMap<String, String> queryParams = new HashMap<>();
    private HashMap<String, String> headerParams = new HashMap<>();

    public AvaTaxPath(String path) {
        this.path = path;
    }

    public void applyField(String fieldName, Object value) {
        if (fieldName.startsWith("$")) {
            addQuery(fieldName, value);
        } else {
            this.path = path.replace("{" + fieldName + "}", value.toString());
        }
    }

    public void addQuery(String fieldName, Object value) {
        if (value != null) {
            queryParams.put(fieldName, value.toString());
        }
    }

    public void addHeader(String fieldName, Object value) {
        if (value != null) {
            headerParams.put(fieldName, value.toString());
        }
    }

    public HashMap<String, String>  getHeaders() {
        return this.headerParams;
    }

    @Override
    public String toString() {
        if (queryParams.size() > 0) {
            path = path + "?";

            for (String key : queryParams.keySet()) {
                try {
                    path = String.format("%s%s=%s&", path, java.net.URLEncoder.encode(key, "UTF-8"), java.net.URLEncoder.encode(queryParams.get(key), "UTF-8"));
                } catch (java.io.UnsupportedEncodingException ex) {
                    System.out.println("Could not find encoding UTF-8: ");
                    ex.printStackTrace();
                }
            }

            path = path.substring(0, path.length() - 1);
        }

        return path;
    }
}
