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
 * The PortfolioDto model.
 */
public class PortfolioDto {
    /**
     * Link to retrieve the current entity.
     */
    @JsonProperty(value = "href", access = JsonProperty.Access.WRITE_ONLY)
    private String href;

    /**
     * Identifier for the portfolio.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceId id;

    /**
     * The type of portfolio this is (e.g. Transaction Portfolio, Reference
     * Portfolio). Possible values include: 'Transaction', 'Reference',
     * 'DerivedTransaction'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Display name of the portfolio.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Description of the portfolio.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Portfolio creation time in UTC.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * If this is a derived portfolio, the identifier of the portfolio from
     * which it is derived.
     */
    @JsonProperty(value = "parentPortfolioId", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceId parentPortfolioId;

    /**
     * The version of the portfolio.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private VersionDto version;

    /**
     * The isDerived property.
     */
    @JsonProperty(value = "isDerived", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDerived;

    /**
     * The links property.
     */
    @JsonProperty(value = "links")
    private List<Link> links;

    /**
     * Get link to retrieve the current entity.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Get identifier for the portfolio.
     *
     * @return the id value
     */
    public ResourceId id() {
        return this.id;
    }

    /**
     * Get the type of portfolio this is (e.g. Transaction Portfolio, Reference  Portfolio). Possible values include: 'Transaction', 'Reference', 'DerivedTransaction'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get display name of the portfolio.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get description of the portfolio.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get portfolio creation time in UTC.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get if this is a derived portfolio, the identifier of the portfolio from which it is derived.
     *
     * @return the parentPortfolioId value
     */
    public ResourceId parentPortfolioId() {
        return this.parentPortfolioId;
    }

    /**
     * Get the version of the portfolio.
     *
     * @return the version value
     */
    public VersionDto version() {
        return this.version;
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
     * @return the PortfolioDto object itself.
     */
    public PortfolioDto withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
