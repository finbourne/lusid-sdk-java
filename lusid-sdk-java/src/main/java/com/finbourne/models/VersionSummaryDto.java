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
 * The VersionSummaryDto model.
 */
public class VersionSummaryDto {
    /**
     * The apiVersion property.
     */
    @JsonProperty(value = "apiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String apiVersion;

    /**
     * The buildVersion property.
     */
    @JsonProperty(value = "buildVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String buildVersion;

    /**
     * The excelVersion property.
     */
    @JsonProperty(value = "excelVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String excelVersion;

    /**
     * The links property.
     */
    @JsonProperty(value = "links")
    private List<Link> links;

    /**
     * Get the apiVersion value.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Get the buildVersion value.
     *
     * @return the buildVersion value
     */
    public String buildVersion() {
        return this.buildVersion;
    }

    /**
     * Get the excelVersion value.
     *
     * @return the excelVersion value
     */
    public String excelVersion() {
        return this.excelVersion;
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
     * @return the VersionSummaryDto object itself.
     */
    public VersionSummaryDto withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
