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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CompletePortfolio model.
 */
public class CompletePortfolio {
    /**
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceId id;

    /**
     * The href property.
     */
    @JsonProperty(value = "href", access = JsonProperty.Access.WRITE_ONLY)
    private String href;

    /**
     * The description property.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The created property.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The parentPortfolioId property.
     */
    @JsonProperty(value = "parentPortfolioId", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceId parentPortfolioId;

    /**
     * The isDerived property.
     */
    @JsonProperty(value = "isDerived", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDerived;

    /**
     * Possible values include: 'Transaction', 'Reference',
     * 'DerivedTransaction'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The version property.
     */
    @JsonProperty(value = "version")
    private Version version;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<Property> properties;

    /**
     * The baseCurrency property.
     */
    @JsonProperty(value = "baseCurrency")
    private String baseCurrency;

    /**
     * The links property.
     */
    @JsonProperty(value = "links")
    private List<Link> links;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public ResourceId id() {
        return this.id;
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
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
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
     * Get the parentPortfolioId value.
     *
     * @return the parentPortfolioId value
     */
    public ResourceId parentPortfolioId() {
        return this.parentPortfolioId;
    }

    /**
     * Get the isDerived value.
     *
     * @return the isDerived value
     */
    public Boolean isDerived() {
        return this.isDerived;
    }

    /**
     * Get possible values include: 'Transaction', 'Reference', 'DerivedTransaction'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Version version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the CompletePortfolio object itself.
     */
    public CompletePortfolio withVersion(Version version) {
        this.version = version;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<Property> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the CompletePortfolio object itself.
     */
    public CompletePortfolio withProperties(List<Property> properties) {
        this.properties = properties;
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
     * @return the CompletePortfolio object itself.
     */
    public CompletePortfolio withBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * Get the links value.
     *
     * @return the links value
     */
    public List<Link> links() {
        return this.links;
    }

    /**
     * Set the links value.
     *
     * @param links the links value to set
     * @return the CompletePortfolio object itself.
     */
    public CompletePortfolio withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
