/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TransactionTypeAliasDto model.
 */
public class TransactionTypeAliasDto {
    /**
     * The transaction type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Brief description of the transaction.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut.
     */
    @JsonProperty(value = "transactionClass", required = true)
    private String transactionClass;

    /**
     * Group is a set of codes related to a source, or sync.
     */
    @JsonProperty(value = "transactionGroup", required = true)
    private String transactionGroup;

    /**
     * Transactions role within a class. E.g. Increase a long position.
     * Possible values include: 'None', 'LongLonger', 'LongShorter',
     * 'ShortShorter', 'ShortLonger', 'Longer', 'Shorter', 'AllRoles'.
     */
    @JsonProperty(value = "transactionRoles")
    private String transactionRoles;

    /**
     * Get the transaction type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the transaction type.
     *
     * @param type the type value to set
     * @return the TransactionTypeAliasDto object itself.
     */
    public TransactionTypeAliasDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get brief description of the transaction.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set brief description of the transaction.
     *
     * @param description the description value to set
     * @return the TransactionTypeAliasDto object itself.
     */
    public TransactionTypeAliasDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut.
     *
     * @return the transactionClass value
     */
    public String transactionClass() {
        return this.transactionClass;
    }

    /**
     * Set relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut.
     *
     * @param transactionClass the transactionClass value to set
     * @return the TransactionTypeAliasDto object itself.
     */
    public TransactionTypeAliasDto withTransactionClass(String transactionClass) {
        this.transactionClass = transactionClass;
        return this;
    }

    /**
     * Get group is a set of codes related to a source, or sync.
     *
     * @return the transactionGroup value
     */
    public String transactionGroup() {
        return this.transactionGroup;
    }

    /**
     * Set group is a set of codes related to a source, or sync.
     *
     * @param transactionGroup the transactionGroup value to set
     * @return the TransactionTypeAliasDto object itself.
     */
    public TransactionTypeAliasDto withTransactionGroup(String transactionGroup) {
        this.transactionGroup = transactionGroup;
        return this;
    }

    /**
     * Get transactions role within a class. E.g. Increase a long position. Possible values include: 'None', 'LongLonger', 'LongShorter', 'ShortShorter', 'ShortLonger', 'Longer', 'Shorter', 'AllRoles'.
     *
     * @return the transactionRoles value
     */
    public String transactionRoles() {
        return this.transactionRoles;
    }

    /**
     * Set transactions role within a class. E.g. Increase a long position. Possible values include: 'None', 'LongLonger', 'LongShorter', 'ShortShorter', 'ShortLonger', 'Longer', 'Shorter', 'AllRoles'.
     *
     * @param transactionRoles the transactionRoles value to set
     * @return the TransactionTypeAliasDto object itself.
     */
    public TransactionTypeAliasDto withTransactionRoles(String transactionRoles) {
        this.transactionRoles = transactionRoles;
        return this;
    }

}
