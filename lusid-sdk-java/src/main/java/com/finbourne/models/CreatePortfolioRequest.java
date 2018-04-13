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
 * The CreatePortfolioRequest model.
 */
public class CreatePortfolioRequest {
    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The code property.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * The baseCurrency property.
     */
    @JsonProperty(value = "baseCurrency", required = true)
    private String baseCurrency;

    /**
     * The corporateActionSourceId property.
     */
    @JsonProperty(value = "corporateActionSourceId")
    private ResourceId corporateActionSourceId;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CreatePortfolioRequest object itself.
     */
    public CreatePortfolioRequest withName(String name) {
        this.name = name;
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
     * @return the CreatePortfolioRequest object itself.
     */
    public CreatePortfolioRequest withCode(String code) {
        this.code = code;
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
     * @return the CreatePortfolioRequest object itself.
     */
    public CreatePortfolioRequest withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the baseCurrency value.
     *
     * @return the baseCurrency value
     */
    public String baseCurrency() {
        return this.baseCurrency;
    }

    /**
     * Set the baseCurrency value.
     *
     * @param baseCurrency the baseCurrency value to set
     * @return the CreatePortfolioRequest object itself.
     */
    public CreatePortfolioRequest withBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * Get the corporateActionSourceId value.
     *
     * @return the corporateActionSourceId value
     */
    public ResourceId corporateActionSourceId() {
        return this.corporateActionSourceId;
    }

    /**
     * Set the corporateActionSourceId value.
     *
     * @param corporateActionSourceId the corporateActionSourceId value to set
     * @return the CreatePortfolioRequest object itself.
     */
    public CreatePortfolioRequest withCorporateActionSourceId(ResourceId corporateActionSourceId) {
        this.corporateActionSourceId = corporateActionSourceId;
        return this;
    }

}
