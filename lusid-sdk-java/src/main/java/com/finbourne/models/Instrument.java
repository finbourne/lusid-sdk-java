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
 * The Instrument model.
 */
public class Instrument {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The lusid instrument id (LUID) of the instrument.
     */
    @JsonProperty(value = "lusidInstrumentId")
    private String lusidInstrumentId;

    /**
     * The version of the instrument.
     */
    @JsonProperty(value = "version")
    private Version version;

    /**
     * The name of the instrument.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The set of identifiers that can be used to uniquely identify the
     * instrument.
     */
    @JsonProperty(value = "identifiers")
    private Map<String, String> identifiers;

    /**
     * Any requested instrument properties. If no property can be found for the
     * instrument, then
     * a value of 'Unknown' will be returned.
     */
    @JsonProperty(value = "properties")
    private List<Property> properties;

    /**
     * The market identifier of the instrument (if any).
     */
    @JsonProperty(value = "marketIdentifierCode")
    private String marketIdentifierCode;

    /**
     * The lookthrough portfolio of the instrument (if any).
     */
    @JsonProperty(value = "lookthroughPortfolio")
    private ResourceId lookthroughPortfolio;

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
     * @return the Instrument object itself.
     */
    public Instrument withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the lusid instrument id (LUID) of the instrument.
     *
     * @return the lusidInstrumentId value
     */
    public String lusidInstrumentId() {
        return this.lusidInstrumentId;
    }

    /**
     * Set the lusid instrument id (LUID) of the instrument.
     *
     * @param lusidInstrumentId the lusidInstrumentId value to set
     * @return the Instrument object itself.
     */
    public Instrument withLusidInstrumentId(String lusidInstrumentId) {
        this.lusidInstrumentId = lusidInstrumentId;
        return this;
    }

    /**
     * Get the version of the instrument.
     *
     * @return the version value
     */
    public Version version() {
        return this.version;
    }

    /**
     * Set the version of the instrument.
     *
     * @param version the version value to set
     * @return the Instrument object itself.
     */
    public Instrument withVersion(Version version) {
        this.version = version;
        return this;
    }

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
     * @return the Instrument object itself.
     */
    public Instrument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the set of identifiers that can be used to uniquely identify the instrument.
     *
     * @return the identifiers value
     */
    public Map<String, String> identifiers() {
        return this.identifiers;
    }

    /**
     * Set the set of identifiers that can be used to uniquely identify the instrument.
     *
     * @param identifiers the identifiers value to set
     * @return the Instrument object itself.
     */
    public Instrument withIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get any requested instrument properties. If no property can be found for the instrument, then
     a value of 'Unknown' will be returned.
     *
     * @return the properties value
     */
    public List<Property> properties() {
        return this.properties;
    }

    /**
     * Set any requested instrument properties. If no property can be found for the instrument, then
     a value of 'Unknown' will be returned.
     *
     * @param properties the properties value to set
     * @return the Instrument object itself.
     */
    public Instrument withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the market identifier of the instrument (if any).
     *
     * @return the marketIdentifierCode value
     */
    public String marketIdentifierCode() {
        return this.marketIdentifierCode;
    }

    /**
     * Set the market identifier of the instrument (if any).
     *
     * @param marketIdentifierCode the marketIdentifierCode value to set
     * @return the Instrument object itself.
     */
    public Instrument withMarketIdentifierCode(String marketIdentifierCode) {
        this.marketIdentifierCode = marketIdentifierCode;
        return this;
    }

    /**
     * Get the lookthrough portfolio of the instrument (if any).
     *
     * @return the lookthroughPortfolio value
     */
    public ResourceId lookthroughPortfolio() {
        return this.lookthroughPortfolio;
    }

    /**
     * Set the lookthrough portfolio of the instrument (if any).
     *
     * @param lookthroughPortfolio the lookthroughPortfolio value to set
     * @return the Instrument object itself.
     */
    public Instrument withLookthroughPortfolio(ResourceId lookthroughPortfolio) {
        this.lookthroughPortfolio = lookthroughPortfolio;
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
     * @return the Instrument object itself.
     */
    public Instrument withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
