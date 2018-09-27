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
 * The PortfolioProperties model.
 */
public class PortfolioProperties {
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
    private List<Property> properties;

    /**
     * The version of the portfolio.
     */
    @JsonProperty(value = "version")
    private Version version;

    /**
     * The links property.
     */
    @JsonProperty(value = "links")
    private List<Link> links;

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
     * @return the PortfolioProperties object itself.
     */
    public PortfolioProperties withHref(String href) {
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
     * @return the PortfolioProperties object itself.
     */
    public PortfolioProperties withOriginPortfolioId(ResourceId originPortfolioId) {
        this.originPortfolioId = originPortfolioId;
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
     * @return the PortfolioProperties object itself.
     */
    public PortfolioProperties withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the version of the portfolio.
     *
     * @return the version value
     */
    public Version version() {
        return this.version;
    }

    /**
     * Set the version of the portfolio.
     *
     * @param version the version value to set
     * @return the PortfolioProperties object itself.
     */
    public PortfolioProperties withVersion(Version version) {
        this.version = version;
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
     * @return the PortfolioProperties object itself.
     */
    public PortfolioProperties withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
