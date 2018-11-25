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
 * The InstrumentProperty model.
 */
public class InstrumentProperty {
    /**
     * Unique instrument identifier.
     */
    @JsonProperty(value = "lusidInstrumentId")
    private String lusidInstrumentId;

    /**
     * A collection of properties to create or update.
     */
    @JsonProperty(value = "properties")
    private List<CreateInstrumentPropertyRequest> properties;

    /**
     * A collection of property keys to remove property values from, if any are
     * set for the instrument.
     */
    @JsonProperty(value = "deletedProperties")
    private List<DeleteInstrumentPropertyRequest> deletedProperties;

    /**
     * Get unique instrument identifier.
     *
     * @return the lusidInstrumentId value
     */
    public String lusidInstrumentId() {
        return this.lusidInstrumentId;
    }

    /**
     * Set unique instrument identifier.
     *
     * @param lusidInstrumentId the lusidInstrumentId value to set
     * @return the InstrumentProperty object itself.
     */
    public InstrumentProperty withLusidInstrumentId(String lusidInstrumentId) {
        this.lusidInstrumentId = lusidInstrumentId;
        return this;
    }

    /**
     * Get a collection of properties to create or update.
     *
     * @return the properties value
     */
    public List<CreateInstrumentPropertyRequest> properties() {
        return this.properties;
    }

    /**
     * Set a collection of properties to create or update.
     *
     * @param properties the properties value to set
     * @return the InstrumentProperty object itself.
     */
    public InstrumentProperty withProperties(List<CreateInstrumentPropertyRequest> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get a collection of property keys to remove property values from, if any are set for the instrument.
     *
     * @return the deletedProperties value
     */
    public List<DeleteInstrumentPropertyRequest> deletedProperties() {
        return this.deletedProperties;
    }

    /**
     * Set a collection of property keys to remove property values from, if any are set for the instrument.
     *
     * @param deletedProperties the deletedProperties value to set
     * @return the InstrumentProperty object itself.
     */
    public InstrumentProperty withDeletedProperties(List<DeleteInstrumentPropertyRequest> deletedProperties) {
        this.deletedProperties = deletedProperties;
        return this;
    }

}
