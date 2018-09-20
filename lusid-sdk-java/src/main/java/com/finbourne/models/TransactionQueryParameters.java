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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TransactionQueryParameters model.
 */
public class TransactionQueryParameters {
    /**
     * The required set of transactions should begin from this date.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * The required set of transactions should end at this date.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * The method for date selection. Trade date or Settlement date. Possible
     * values include: 'None', 'TradeDate', 'SettleDate'.
     */
    @JsonProperty(value = "queryMode")
    private String queryMode;

    /**
     * Option to include cancelled transactions in the results.
     */
    @JsonProperty(value = "showCancelledTransactions")
    private Boolean showCancelledTransactions;

    /**
     * Get the required set of transactions should begin from this date.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the required set of transactions should begin from this date.
     *
     * @param startDate the startDate value to set
     * @return the TransactionQueryParameters object itself.
     */
    public TransactionQueryParameters withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the required set of transactions should end at this date.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the required set of transactions should end at this date.
     *
     * @param endDate the endDate value to set
     * @return the TransactionQueryParameters object itself.
     */
    public TransactionQueryParameters withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the method for date selection. Trade date or Settlement date. Possible values include: 'None', 'TradeDate', 'SettleDate'.
     *
     * @return the queryMode value
     */
    public String queryMode() {
        return this.queryMode;
    }

    /**
     * Set the method for date selection. Trade date or Settlement date. Possible values include: 'None', 'TradeDate', 'SettleDate'.
     *
     * @param queryMode the queryMode value to set
     * @return the TransactionQueryParameters object itself.
     */
    public TransactionQueryParameters withQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }

    /**
     * Get option to include cancelled transactions in the results.
     *
     * @return the showCancelledTransactions value
     */
    public Boolean showCancelledTransactions() {
        return this.showCancelledTransactions;
    }

    /**
     * Set option to include cancelled transactions in the results.
     *
     * @param showCancelledTransactions the showCancelledTransactions value to set
     * @return the TransactionQueryParameters object itself.
     */
    public TransactionQueryParameters withShowCancelledTransactions(Boolean showCancelledTransactions) {
        this.showCancelledTransactions = showCancelledTransactions;
        return this;
    }

}
