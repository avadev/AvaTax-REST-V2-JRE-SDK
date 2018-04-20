package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Commit this MultiDocument object so that all transactions within it can be reported on a tax filing.
 */
public class CommitMultiDocumentModel {


    private String code;

    /**
     * Getter for code
     *
     * Represents the unique code of this MultiDocument transaction.
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`. ///
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Represents the unique code of this MultiDocument transaction.
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`. ///
     */
    public void setCode(String value) {
        this.code = value;
    }


    private DocumentType type;

    /**
     * Getter for type
     *
     * Represents the document type of this MultiDocument transaction. For more information about
    * document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/).
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Represents the document type of this MultiDocument transaction. For more information about
    * document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/).
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private Boolean commit;

    /**
     * Getter for commit
     *
     * Set this value to be `true` to commit this transaction.
    * 
    * Committing a transaction allows it to be reported on a tax filing. Uncommitted transactions will not be reported.
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit
     *
     * Set this value to be `true` to commit this transaction.
    * 
    * Committing a transaction allows it to be reported on a tax filing. Uncommitted transactions will not be reported.
     */
    public void setCommit(Boolean value) {
        this.commit = value;
    }


    /**
     * Returns a JSON string representation of CommitMultiDocumentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
