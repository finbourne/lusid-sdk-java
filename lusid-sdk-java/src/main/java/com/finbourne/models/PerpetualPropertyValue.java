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
 * The PerpetualPropertyValue model.
 */
public class PerpetualPropertyValue {
    /**
     * The labelValue property.
     */
    @JsonProperty(value = "labelValue")
    private String labelValue;

    /**
     * The metricValue property.
     */
    @JsonProperty(value = "metricValue")
    private MetricValue metricValue;

    /**
     * Get the labelValue value.
     *
     * @return the labelValue value
     */
    public String labelValue() {
        return this.labelValue;
    }

    /**
     * Set the labelValue value.
     *
     * @param labelValue the labelValue value to set
     * @return the PerpetualPropertyValue object itself.
     */
    public PerpetualPropertyValue withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * Get the metricValue value.
     *
     * @return the metricValue value
     */
    public MetricValue metricValue() {
        return this.metricValue;
    }

    /**
     * Set the metricValue value.
     *
     * @param metricValue the metricValue value to set
     * @return the PerpetualPropertyValue object itself.
     */
    public PerpetualPropertyValue withMetricValue(MetricValue metricValue) {
        this.metricValue = metricValue;
        return this;
    }

}
