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
 * The PortfolioPropertiesDto model.
 */
public class PortfolioPropertiesDto {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The originPortfolioId property.
     */
    @JsonProperty(value = "originPortfolioId")
    private ResourceId originPortfolioId;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * The version of the portfolio.
     */
    @JsonProperty(value = "version")
    private VersionDto version;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

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
     * @return the PortfolioPropertiesDto object itself.
     */
    public PortfolioPropertiesDto withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the originPortfolioId value.
     *
     * @return the originPortfolioId value
     */
    public ResourceId originPortfolioId() {
        return this.originPortfolioId;
    }

    /**
     * Set the originPortfolioId value.
     *
     * @param originPortfolioId the originPortfolioId value to set
     * @return the PortfolioPropertiesDto object itself.
     */
    public PortfolioPropertiesDto withOriginPortfolioId(ResourceId originPortfolioId) {
        this.originPortfolioId = originPortfolioId;
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
     * @return the PortfolioPropertiesDto object itself.
     */
    public PortfolioPropertiesDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
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
     * @return the PortfolioPropertiesDto object itself.
     */
    public PortfolioPropertiesDto withVersion(VersionDto version) {
        this.version = version;
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
     * @return the PortfolioPropertiesDto object itself.
     */
    public PortfolioPropertiesDto with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

}
