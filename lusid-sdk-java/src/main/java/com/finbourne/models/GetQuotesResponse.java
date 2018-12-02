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
 * The GetQuotesResponse model.
 */
public class GetQuotesResponse {
    /**
     * The found property.
     */
    @JsonProperty(value = "found")
    private List<Quote> found;

    /**
     * The notFound property.
     */
    @JsonProperty(value = "notFound")
    private List<QuoteId> notFound;

    /**
     * Get the found value.
     *
     * @return the found value
     */
    public List<Quote> found() {
        return this.found;
    }

    /**
     * Set the found value.
     *
     * @param found the found value to set
     * @return the GetQuotesResponse object itself.
     */
    public GetQuotesResponse withFound(List<Quote> found) {
        this.found = found;
        return this;
    }

    /**
     * Get the notFound value.
     *
     * @return the notFound value
     */
    public List<QuoteId> notFound() {
        return this.notFound;
    }

    /**
     * Set the notFound value.
     *
     * @param notFound the notFound value to set
     * @return the GetQuotesResponse object itself.
     */
    public GetQuotesResponse withNotFound(List<QuoteId> notFound) {
        this.notFound = notFound;
        return this;
    }

}
