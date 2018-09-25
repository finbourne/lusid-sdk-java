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
 * The ProcessedCommandDto model.
 */
public class ProcessedCommandDto {
    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The path property.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * The user that issued the command.
     */
    @JsonProperty(value = "userId")
    private UserIdDto userId;

    /**
     * The as at time of the events published by the processing of
     * this command.
     */
    @JsonProperty(value = "processedTime")
    private Object processedTime;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the ProcessedCommandDto object itself.
     */
    public ProcessedCommandDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the ProcessedCommandDto object itself.
     */
    public ProcessedCommandDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the user that issued the command.
     *
     * @return the userId value
     */
    public UserIdDto userId() {
        return this.userId;
    }

    /**
     * Set the user that issued the command.
     *
     * @param userId the userId value to set
     * @return the ProcessedCommandDto object itself.
     */
    public ProcessedCommandDto withUserId(UserIdDto userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the as at time of the events published by the processing of
     this command.
     *
     * @return the processedTime value
     */
    public Object processedTime() {
        return this.processedTime;
    }

    /**
     * Set the as at time of the events published by the processing of
     this command.
     *
     * @param processedTime the processedTime value to set
     * @return the ProcessedCommandDto object itself.
     */
    public ProcessedCommandDto withProcessedTime(Object processedTime) {
        this.processedTime = processedTime;
        return this;
    }

}
