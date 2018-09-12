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
 * The ReconciliationRequest model.
 */
public class ReconciliationRequest {
    /**
     * The leftScope property.
     */
    @JsonProperty(value = "leftScope")
    private String leftScope;

    /**
     * The leftCode property.
     */
    @JsonProperty(value = "leftCode")
    private String leftCode;

    /**
     * The leftEffectiveAt property.
     */
    @JsonProperty(value = "leftEffectiveAt")
    private DateTime leftEffectiveAt;

    /**
     * The leftAsAt property.
     */
    @JsonProperty(value = "leftAsAt")
    private DateTime leftAsAt;

    /**
     * The rightScope property.
     */
    @JsonProperty(value = "rightScope")
    private String rightScope;

    /**
     * The rightCode property.
     */
    @JsonProperty(value = "rightCode")
    private String rightCode;

    /**
     * The rightEffectiveAt property.
     */
    @JsonProperty(value = "rightEffectiveAt")
    private DateTime rightEffectiveAt;

    /**
     * The rightAsAt property.
     */
    @JsonProperty(value = "rightAsAt")
    private DateTime rightAsAt;

    /**
     * Get the leftScope value.
     *
     * @return the leftScope value
     */
    public String leftScope() {
        return this.leftScope;
    }

    /**
     * Set the leftScope value.
     *
     * @param leftScope the leftScope value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withLeftScope(String leftScope) {
        this.leftScope = leftScope;
        return this;
    }

    /**
     * Get the leftCode value.
     *
     * @return the leftCode value
     */
    public String leftCode() {
        return this.leftCode;
    }

    /**
     * Set the leftCode value.
     *
     * @param leftCode the leftCode value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withLeftCode(String leftCode) {
        this.leftCode = leftCode;
        return this;
    }

    /**
     * Get the leftEffectiveAt value.
     *
     * @return the leftEffectiveAt value
     */
    public DateTime leftEffectiveAt() {
        return this.leftEffectiveAt;
    }

    /**
     * Set the leftEffectiveAt value.
     *
     * @param leftEffectiveAt the leftEffectiveAt value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withLeftEffectiveAt(DateTime leftEffectiveAt) {
        this.leftEffectiveAt = leftEffectiveAt;
        return this;
    }

    /**
     * Get the leftAsAt value.
     *
     * @return the leftAsAt value
     */
    public DateTime leftAsAt() {
        return this.leftAsAt;
    }

    /**
     * Set the leftAsAt value.
     *
     * @param leftAsAt the leftAsAt value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withLeftAsAt(DateTime leftAsAt) {
        this.leftAsAt = leftAsAt;
        return this;
    }

    /**
     * Get the rightScope value.
     *
     * @return the rightScope value
     */
    public String rightScope() {
        return this.rightScope;
    }

    /**
     * Set the rightScope value.
     *
     * @param rightScope the rightScope value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withRightScope(String rightScope) {
        this.rightScope = rightScope;
        return this;
    }

    /**
     * Get the rightCode value.
     *
     * @return the rightCode value
     */
    public String rightCode() {
        return this.rightCode;
    }

    /**
     * Set the rightCode value.
     *
     * @param rightCode the rightCode value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withRightCode(String rightCode) {
        this.rightCode = rightCode;
        return this;
    }

    /**
     * Get the rightEffectiveAt value.
     *
     * @return the rightEffectiveAt value
     */
    public DateTime rightEffectiveAt() {
        return this.rightEffectiveAt;
    }

    /**
     * Set the rightEffectiveAt value.
     *
     * @param rightEffectiveAt the rightEffectiveAt value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withRightEffectiveAt(DateTime rightEffectiveAt) {
        this.rightEffectiveAt = rightEffectiveAt;
        return this;
    }

    /**
     * Get the rightAsAt value.
     *
     * @return the rightAsAt value
     */
    public DateTime rightAsAt() {
        return this.rightAsAt;
    }

    /**
     * Set the rightAsAt value.
     *
     * @param rightAsAt the rightAsAt value to set
     * @return the ReconciliationRequest object itself.
     */
    public ReconciliationRequest withRightAsAt(DateTime rightAsAt) {
        this.rightAsAt = rightAsAt;
        return this;
    }

}
