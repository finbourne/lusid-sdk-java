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

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GetInstrumentsResponse model.
 */
public class GetInstrumentsResponse {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The instruments, keyed by their requested identifier. Only instruments
     * that were found
     * will be contained in this collection.
     */
    @JsonProperty(value = "values")
    private Map<String, Instrument> values;

    /**
     * If any instruments were not found, then they will be listed in as
     * 'Failed', along with the nature
     * of their failure.
     */
    @JsonProperty(value = "failed")
    private Map<String, ErrorDetail> failed;

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
     * @return the GetInstrumentsResponse object itself.
     */
    public GetInstrumentsResponse withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the instruments, keyed by their requested identifier. Only instruments that were found
     will be contained in this collection.
     *
     * @return the values value
     */
    public Map<String, Instrument> values() {
        return this.values;
    }

    /**
     * Set the instruments, keyed by their requested identifier. Only instruments that were found
     will be contained in this collection.
     *
     * @param values the values value to set
     * @return the GetInstrumentsResponse object itself.
     */
    public GetInstrumentsResponse withValues(Map<String, Instrument> values) {
        this.values = values;
        return this;
    }

    /**
     * Get if any instruments were not found, then they will be listed in as 'Failed', along with the nature
     of their failure.
     *
     * @return the failed value
     */
    public Map<String, ErrorDetail> failed() {
        return this.failed;
    }

    /**
     * Set if any instruments were not found, then they will be listed in as 'Failed', along with the nature
     of their failure.
     *
     * @param failed the failed value to set
     * @return the GetInstrumentsResponse object itself.
     */
    public GetInstrumentsResponse withFailed(Map<String, ErrorDetail> failed) {
        this.failed = failed;
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
     * @return the GetInstrumentsResponse object itself.
     */
    public GetInstrumentsResponse withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
