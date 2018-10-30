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
 * The ExecutionRequest model.
 */
public class ExecutionRequest {
    /**
     * FIX Field 17.  Unique execution identifier.
     */
    @JsonProperty(value = "executionId", required = true)
    private String executionId;

    /**
     * FIX Field 54.
     */
    @JsonProperty(value = "side", required = true)
    private String side;

    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "instrumentUid", required = true)
    private String instrumentUid;

    /**
     * FIX field 60.  Time the transaction represented by this ExecutionReport
     * occurred.
     */
    @JsonProperty(value = "transactTime", required = true)
    private DateTime transactTime;

    /**
     * FIX field 38.  Order quantity.
     */
    @JsonProperty(value = "orderQty", required = true)
    private double orderQty;

    /**
     * FIX field 44.
     */
    @JsonProperty(value = "price", required = true)
    private double price;

    /**
     * FIX field 15.
     */
    @JsonProperty(value = "currency", required = true)
    private String currency;

    /**
     * Get fIX Field 17.  Unique execution identifier.
     *
     * @return the executionId value
     */
    public String executionId() {
        return this.executionId;
    }

    /**
     * Set fIX Field 17.  Unique execution identifier.
     *
     * @param executionId the executionId value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * Get fIX Field 54.
     *
     * @return the side value
     */
    public String side() {
        return this.side;
    }

    /**
     * Set fIX Field 54.
     *
     * @param side the side value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * Get unique instrument identifier.
     *
     * @return the instrumentUid value
     */
    public String instrumentUid() {
        return this.instrumentUid;
    }

    /**
     * Set unique instrument identifier.
     *
     * @param instrumentUid the instrumentUid value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withInstrumentUid(String instrumentUid) {
        this.instrumentUid = instrumentUid;
        return this;
    }

    /**
     * Get fIX field 60.  Time the transaction represented by this ExecutionReport occurred.
     *
     * @return the transactTime value
     */
    public DateTime transactTime() {
        return this.transactTime;
    }

    /**
     * Set fIX field 60.  Time the transaction represented by this ExecutionReport occurred.
     *
     * @param transactTime the transactTime value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withTransactTime(DateTime transactTime) {
        this.transactTime = transactTime;
        return this;
    }

    /**
     * Get fIX field 38.  Order quantity.
     *
     * @return the orderQty value
     */
    public double orderQty() {
        return this.orderQty;
    }

    /**
     * Set fIX field 38.  Order quantity.
     *
     * @param orderQty the orderQty value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withOrderQty(double orderQty) {
        this.orderQty = orderQty;
        return this;
    }

    /**
     * Get fIX field 44.
     *
     * @return the price value
     */
    public double price() {
        return this.price;
    }

    /**
     * Set fIX field 44.
     *
     * @param price the price value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withPrice(double price) {
        this.price = price;
        return this;
    }

    /**
     * Get fIX field 15.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Set fIX field 15.
     *
     * @param currency the currency value to set
     * @return the ExecutionRequest object itself.
     */
    public ExecutionRequest withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

}
