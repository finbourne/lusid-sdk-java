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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ReferencePortfolioConstituentDto model.
 */
public class ReferencePortfolioConstituentDto {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * The quantity property.
     */
    @JsonProperty(value = "quantity")
    private Double quantity;

    /**
     * Possible values include: 'Shares', 'Weight', 'Nominal'.
     */
    @JsonProperty(value = "type")
    private String type;

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
     * @return the ReferencePortfolioConstituentDto object itself.
     */
    public ReferencePortfolioConstituentDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<PropertyDto> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ReferencePortfolioConstituentDto object itself.
     */
    public ReferencePortfolioConstituentDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the quantity value.
     *
     * @return the quantity value
     */
    public Double quantity() {
        return this.quantity;
    }

    /**
     * Set the quantity value.
     *
     * @param quantity the quantity value to set
     * @return the ReferencePortfolioConstituentDto object itself.
     */
    public ReferencePortfolioConstituentDto withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get possible values include: 'Shares', 'Weight', 'Nominal'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'Shares', 'Weight', 'Nominal'.
     *
     * @param type the type value to set
     * @return the ReferencePortfolioConstituentDto object itself.
     */
    public ReferencePortfolioConstituentDto withType(String type) {
        this.type = type;
        return this;
    }

}
