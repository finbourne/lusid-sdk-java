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
 * The SecurityClassificationDto model.
 */
public class SecurityClassificationDto {
    /**
     * Unique security identifier.
     */
    @JsonProperty(value = "uid")
    private String uid;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<CreatePropertyRequest> properties;

    /**
     * Get unique security identifier.
     *
     * @return the uid value
     */
    public String uid() {
        return this.uid;
    }

    /**
     * Set unique security identifier.
     *
     * @param uid the uid value to set
     * @return the SecurityClassificationDto object itself.
     */
    public SecurityClassificationDto withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<CreatePropertyRequest> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the SecurityClassificationDto object itself.
     */
    public SecurityClassificationDto withProperties(List<CreatePropertyRequest> properties) {
        this.properties = properties;
        return this;
    }

}
