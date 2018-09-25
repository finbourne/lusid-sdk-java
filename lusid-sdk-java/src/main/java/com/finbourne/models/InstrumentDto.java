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
 * The InstrumentDto model.
 */
public class InstrumentDto {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The uid property.
     */
    @JsonProperty(value = "uid")
    private String uid;

    /**
     * The version property.
     */
    @JsonProperty(value = "version")
    private VersionDto version;

    /**
     * The commonName property.
     */
    @JsonProperty(value = "commonName")
    private String commonName;

    /**
     * The aliases property.
     */
    @JsonProperty(value = "aliases")
    private Map<String, String> aliases;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * The marketIdentifierCode property.
     */
    @JsonProperty(value = "marketIdentifierCode")
    private String marketIdentifierCode;

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
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the uid value.
     *
     * @return the uid value
     */
    public String uid() {
        return this.uid;
    }

    /**
     * Set the uid value.
     *
     * @param uid the uid value to set
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public VersionDto version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withVersion(VersionDto version) {
        this.version = version;
        return this;
    }

    /**
     * Get the commonName value.
     *
     * @return the commonName value
     */
    public String commonName() {
        return this.commonName;
    }

    /**
     * Set the commonName value.
     *
     * @param commonName the commonName value to set
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * Get the aliases value.
     *
     * @return the aliases value
     */
    public Map<String, String> aliases() {
        return this.aliases;
    }

    /**
     * Set the aliases value.
     *
     * @param aliases the aliases value to set
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withAliases(Map<String, String> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<PropertyDto> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the marketIdentifierCode value.
     *
     * @return the marketIdentifierCode value
     */
    public String marketIdentifierCode() {
        return this.marketIdentifierCode;
    }

    /**
     * Set the marketIdentifierCode value.
     *
     * @param marketIdentifierCode the marketIdentifierCode value to set
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withMarketIdentifierCode(String marketIdentifierCode) {
        this.marketIdentifierCode = marketIdentifierCode;
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
     * @return the InstrumentDto object itself.
     */
    public InstrumentDto withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

}
