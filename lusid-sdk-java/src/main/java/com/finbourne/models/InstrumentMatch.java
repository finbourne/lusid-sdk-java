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
 * The InstrumentMatch model.
 */
public class InstrumentMatch {
    /**
     * The name of the instrument.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The set of identifiers that uniquely identify this instrument.
     */
    @JsonProperty(value = "identifiers")
    private Map<String, String> identifiers;

    /**
     * Any requested properties are decorated on the instrument, and will have
     * a value of
     * 'Unknown', if no value was found for this instrument.
     */
    @JsonProperty(value = "properties")
    private List<Property> properties;

    /**
     * Get the name of the instrument.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the instrument.
     *
     * @param name the name value to set
     * @return the InstrumentMatch object itself.
     */
    public InstrumentMatch withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the set of identifiers that uniquely identify this instrument.
     *
     * @return the identifiers value
     */
    public Map<String, String> identifiers() {
        return this.identifiers;
    }

    /**
     * Set the set of identifiers that uniquely identify this instrument.
     *
     * @param identifiers the identifiers value to set
     * @return the InstrumentMatch object itself.
     */
    public InstrumentMatch withIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get any requested properties are decorated on the instrument, and will have a value of
     'Unknown', if no value was found for this instrument.
     *
     * @return the properties value
     */
    public List<Property> properties() {
        return this.properties;
    }

    /**
     * Set any requested properties are decorated on the instrument, and will have a value of
     'Unknown', if no value was found for this instrument.
     *
     * @param properties the properties value to set
     * @return the InstrumentMatch object itself.
     */
    public InstrumentMatch withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

}
