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
 * The CreateDerivedTransactionPortfolioRequest model.
 */
public class CreateDerivedTransactionPortfolioRequest {
    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The parentPortfolioId property.
     */
    @JsonProperty(value = "parentPortfolioId")
    private ResourceId parentPortfolioId;

    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CreateDerivedTransactionPortfolioRequest object itself.
     */
    public CreateDerivedTransactionPortfolioRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the CreateDerivedTransactionPortfolioRequest object itself.
     */
    public CreateDerivedTransactionPortfolioRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the CreateDerivedTransactionPortfolioRequest object itself.
     */
    public CreateDerivedTransactionPortfolioRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the parentPortfolioId value.
     *
     * @return the parentPortfolioId value
     */
    public ResourceId parentPortfolioId() {
        return this.parentPortfolioId;
    }

    /**
     * Set the parentPortfolioId value.
     *
     * @param parentPortfolioId the parentPortfolioId value to set
     * @return the CreateDerivedTransactionPortfolioRequest object itself.
     */
    public CreateDerivedTransactionPortfolioRequest withParentPortfolioId(ResourceId parentPortfolioId) {
        this.parentPortfolioId = parentPortfolioId;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set the created value.
     *
     * @param created the created value to set
     * @return the CreateDerivedTransactionPortfolioRequest object itself.
     */
    public CreateDerivedTransactionPortfolioRequest withCreated(DateTime created) {
        this.created = created;
        return this;
    }

}
