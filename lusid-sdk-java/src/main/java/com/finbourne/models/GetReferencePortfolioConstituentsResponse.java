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
 * The GetReferencePortfolioConstituentsResponse model.
 */
public class GetReferencePortfolioConstituentsResponse {
    /**
     * The effectiveFrom property.
     */
    @JsonProperty(value = "effectiveFrom", required = true)
    private DateTime effectiveFrom;

    /**
     * Possible values include: 'Static', 'Floating', 'Periodical'.
     */
    @JsonProperty(value = "weightType", required = true)
    private String weightType;

    /**
     * Possible values include: 'Daily', 'Weekly', 'Monthly', 'Quarterly',
     * 'Annually'.
     */
    @JsonProperty(value = "periodType")
    private String periodType;

    /**
     * The periodCount property.
     */
    @JsonProperty(value = "periodCount")
    private Integer periodCount;

    /**
     * Set of constituents (instrument/weight pairings).
     */
    @JsonProperty(value = "constituents", required = true)
    private List<ReferencePortfolioConstituent> constituents;

    /**
     * The Uri that returns the same result as the original request,
     * but may include resolved as at time(s).
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The links property.
     */
    @JsonProperty(value = "links")
    private List<Link> links;

    /**
     * Get the effectiveFrom value.
     *
     * @return the effectiveFrom value
     */
    public DateTime effectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Set the effectiveFrom value.
     *
     * @param effectiveFrom the effectiveFrom value to set
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withEffectiveFrom(DateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    /**
     * Get possible values include: 'Static', 'Floating', 'Periodical'.
     *
     * @return the weightType value
     */
    public String weightType() {
        return this.weightType;
    }

    /**
     * Set possible values include: 'Static', 'Floating', 'Periodical'.
     *
     * @param weightType the weightType value to set
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withWeightType(String weightType) {
        this.weightType = weightType;
        return this;
    }

    /**
     * Get possible values include: 'Daily', 'Weekly', 'Monthly', 'Quarterly', 'Annually'.
     *
     * @return the periodType value
     */
    public String periodType() {
        return this.periodType;
    }

    /**
     * Set possible values include: 'Daily', 'Weekly', 'Monthly', 'Quarterly', 'Annually'.
     *
     * @param periodType the periodType value to set
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Get the periodCount value.
     *
     * @return the periodCount value
     */
    public Integer periodCount() {
        return this.periodCount;
    }

    /**
     * Set the periodCount value.
     *
     * @param periodCount the periodCount value to set
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withPeriodCount(Integer periodCount) {
        this.periodCount = periodCount;
        return this;
    }

    /**
     * Get set of constituents (instrument/weight pairings).
     *
     * @return the constituents value
     */
    public List<ReferencePortfolioConstituent> constituents() {
        return this.constituents;
    }

    /**
     * Set set of constituents (instrument/weight pairings).
     *
     * @param constituents the constituents value to set
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withConstituents(List<ReferencePortfolioConstituent> constituents) {
        this.constituents = constituents;
        return this;
    }

    /**
     * Get the Uri that returns the same result as the original request,
     but may include resolved as at time(s).
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the Uri that returns the same result as the original request,
     but may include resolved as at time(s).
     *
     * @param href the href value to set
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withHref(String href) {
        this.href = href;
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
     * @return the GetReferencePortfolioConstituentsResponse object itself.
     */
    public GetReferencePortfolioConstituentsResponse withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
