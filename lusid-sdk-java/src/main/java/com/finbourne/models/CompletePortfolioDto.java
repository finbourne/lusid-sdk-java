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
 * The CompletePortfolioDto model.
 */
public class CompletePortfolioDto {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private ResourceId id;

    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * The parentPortfolioId property.
     */
    @JsonProperty(value = "parentPortfolioId")
    private ResourceId parentPortfolioId;

    /**
     * The version property.
     */
    @JsonProperty(value = "version")
    private VersionDto version;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * The baseCurrency property.
     */
    @JsonProperty(value = "baseCurrency")
    private String baseCurrency;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public ResourceId id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withId(ResourceId id) {
        this.id = id;
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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withHref(String href) {
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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withDescription(String description) {
        this.description = description;
        return this;
    }

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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withName(String name) {
        this.name = name;
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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withCreated(DateTime created) {
        this.created = created;
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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withParentPortfolioId(ResourceId parentPortfolioId) {
        this.parentPortfolioId = parentPortfolioId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public VersionDto version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withVersion(VersionDto version) {
        this.version = version;
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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withProperties(List<PropertyDto> properties) {
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
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto withBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * Get the _links value.
     *
     * @return the _links value
     */
    public List<Link> _links() {
        return this._links;
    }

    /**
     * Set the _links value.
     *
     * @param _links the _links value to set
     * @return the CompletePortfolioDto object itself.
     */
    public CompletePortfolioDto with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

}
