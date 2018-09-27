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
 * The CreatePortfolioGroupRequest model.
 */
public class CreatePortfolioGroupRequest {
    /**
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The values property.
     */
    @JsonProperty(value = "values")
    private List<ResourceId> values;

    /**
     * The subGroups property.
     */
    @JsonProperty(value = "subGroups")
    private List<ResourceId> subGroups;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CreatePortfolioGroupRequest object itself.
     */
    public CreatePortfolioGroupRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<ResourceId> values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the CreatePortfolioGroupRequest object itself.
     */
    public CreatePortfolioGroupRequest withValues(List<ResourceId> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the subGroups value.
     *
     * @return the subGroups value
     */
    public List<ResourceId> subGroups() {
        return this.subGroups;
    }

    /**
     * Set the subGroups value.
     *
     * @param subGroups the subGroups value to set
     * @return the CreatePortfolioGroupRequest object itself.
     */
    public CreatePortfolioGroupRequest withSubGroups(List<ResourceId> subGroups) {
        this.subGroups = subGroups;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CreatePortfolioGroupRequest object itself.
     */
    public CreatePortfolioGroupRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

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
     * @return the CreatePortfolioGroupRequest object itself.
     */
    public CreatePortfolioGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

}
