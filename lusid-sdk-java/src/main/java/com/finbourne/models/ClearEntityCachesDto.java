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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ClearEntityCachesDto model.
 */
public class ClearEntityCachesDto {
    /**
     * The total number of items cleared from all instances of the caches on
     * this machine instance.
     */
    @JsonProperty(value = "numberOfItemsCleared")
    private Long numberOfItemsCleared;

    /**
     * Get the total number of items cleared from all instances of the caches on this machine instance.
     *
     * @return the numberOfItemsCleared value
     */
    public Long numberOfItemsCleared() {
        return this.numberOfItemsCleared;
    }

    /**
     * Set the total number of items cleared from all instances of the caches on this machine instance.
     *
     * @param numberOfItemsCleared the numberOfItemsCleared value to set
     * @return the ClearEntityCachesDto object itself.
     */
    public ClearEntityCachesDto withNumberOfItemsCleared(Long numberOfItemsCleared) {
        this.numberOfItemsCleared = numberOfItemsCleared;
        return this;
    }

}
