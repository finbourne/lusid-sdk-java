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
 * The CreateDerivedPortfolioRequest model.
 */
public class CreateDerivedPortfolioRequest {
    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The parentPortfolio property.
     */
    @JsonProperty(value = "parentPortfolio")
    private ResourceId parentPortfolio;

    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private DateTime created;

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
     * @return the CreateDerivedPortfolioRequest object itself.
     */
    public CreateDerivedPortfolioRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CreateDerivedPortfolioRequest object itself.
     */
    public CreateDerivedPortfolioRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the parentPortfolio value.
     *
     * @return the parentPortfolio value
     */
    public ResourceId parentPortfolio() {
        return this.parentPortfolio;
    }

    /**
     * Set the parentPortfolio value.
     *
     * @param parentPortfolio the parentPortfolio value to set
     * @return the CreateDerivedPortfolioRequest object itself.
     */
    public CreateDerivedPortfolioRequest withParentPortfolio(ResourceId parentPortfolio) {
        this.parentPortfolio = parentPortfolio;
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
     * @return the CreateDerivedPortfolioRequest object itself.
     */
    public CreateDerivedPortfolioRequest withCreated(DateTime created) {
        this.created = created;
        return this;
    }

}
