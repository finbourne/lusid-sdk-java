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
 * The StreamModel model.
 */
public class StreamModel {
    /**
     * The canRead property.
     */
    @JsonProperty(value = "canRead", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canRead;

    /**
     * The canSeek property.
     */
    @JsonProperty(value = "canSeek", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canSeek;

    /**
     * The canTimeout property.
     */
    @JsonProperty(value = "canTimeout", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canTimeout;

    /**
     * The canWrite property.
     */
    @JsonProperty(value = "canWrite", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canWrite;

    /**
     * The length property.
     */
    @JsonProperty(value = "length", access = JsonProperty.Access.WRITE_ONLY)
    private Long length;

    /**
     * The position property.
     */
    @JsonProperty(value = "position")
    private Long position;

    /**
     * The readTimeout property.
     */
    @JsonProperty(value = "readTimeout")
    private Integer readTimeout;

    /**
     * The writeTimeout property.
     */
    @JsonProperty(value = "writeTimeout")
    private Integer writeTimeout;

    /**
     * Get the canRead value.
     *
     * @return the canRead value
     */
    public Boolean canRead() {
        return this.canRead;
    }

    /**
     * Get the canSeek value.
     *
     * @return the canSeek value
     */
    public Boolean canSeek() {
        return this.canSeek;
    }

    /**
     * Get the canTimeout value.
     *
     * @return the canTimeout value
     */
    public Boolean canTimeout() {
        return this.canTimeout;
    }

    /**
     * Get the canWrite value.
     *
     * @return the canWrite value
     */
    public Boolean canWrite() {
        return this.canWrite;
    }

    /**
     * Get the length value.
     *
     * @return the length value
     */
    public Long length() {
        return this.length;
    }

    /**
     * Get the position value.
     *
     * @return the position value
     */
    public Long position() {
        return this.position;
    }

    /**
     * Set the position value.
     *
     * @param position the position value to set
     * @return the StreamModel object itself.
     */
    public StreamModel withPosition(Long position) {
        this.position = position;
        return this;
    }

    /**
     * Get the readTimeout value.
     *
     * @return the readTimeout value
     */
    public Integer readTimeout() {
        return this.readTimeout;
    }

    /**
     * Set the readTimeout value.
     *
     * @param readTimeout the readTimeout value to set
     * @return the StreamModel object itself.
     */
    public StreamModel withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Get the writeTimeout value.
     *
     * @return the writeTimeout value
     */
    public Integer writeTimeout() {
        return this.writeTimeout;
    }

    /**
     * Set the writeTimeout value.
     *
     * @param writeTimeout the writeTimeout value to set
     * @return the StreamModel object itself.
     */
    public StreamModel withWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
        return this;
    }

}
