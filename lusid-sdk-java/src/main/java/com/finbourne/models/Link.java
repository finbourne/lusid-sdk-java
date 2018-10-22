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
 * The Link model.
 */
public class Link {
    /**
     * Possible values include: 'Root', 'Properties', 'Transactions',
     * 'Details', 'Constituents', 'Holdings', 'Commands',
     * 'HoldingsAdjustments', 'Parent', 'PropertySchema', 'EntitySchema',
     * 'Quote'.
     */
    @JsonProperty(value = "relation", required = true)
    private String relation;

    /**
     * The href property.
     */
    @JsonProperty(value = "href", required = true)
    private String href;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Possible values include: 'POST', 'GET', 'PATCH', 'DELETE'.
     */
    @JsonProperty(value = "method", required = true)
    private String method;

    /**
     * Get possible values include: 'Root', 'Properties', 'Transactions', 'Details', 'Constituents', 'Holdings', 'Commands', 'HoldingsAdjustments', 'Parent', 'PropertySchema', 'EntitySchema', 'Quote'.
     *
     * @return the relation value
     */
    public String relation() {
        return this.relation;
    }

    /**
     * Set possible values include: 'Root', 'Properties', 'Transactions', 'Details', 'Constituents', 'Holdings', 'Commands', 'HoldingsAdjustments', 'Parent', 'PropertySchema', 'EntitySchema', 'Quote'.
     *
     * @param relation the relation value to set
     * @return the Link object itself.
     */
    public Link withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Get the href value.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href value.
     *
     * @param href the href value to set
     * @return the Link object itself.
     */
    public Link withHref(String href) {
        this.href = href;
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
     * @return the Link object itself.
     */
    public Link withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get possible values include: 'POST', 'GET', 'PATCH', 'DELETE'.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Set possible values include: 'POST', 'GET', 'PATCH', 'DELETE'.
     *
     * @param method the method value to set
     * @return the Link object itself.
     */
    public Link withMethod(String method) {
        this.method = method;
        return this;
    }

}
