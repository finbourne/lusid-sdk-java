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
 * The CreateClientSecurityRequest model.
 */
public class CreateClientSecurityRequest {
    /**
     * The clientSecurityId property.
     */
    @JsonProperty(value = "clientSecurityId", required = true)
    private String clientSecurityId;

    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties", required = true)
    private List<PropertyDto> properties;

    /**
     * The aliases property.
     */
    @JsonProperty(value = "aliases")
    private List<KeyValuePairCodeTypeString> aliases;

    /**
     * The lookThroughPortfolioId property.
     */
    @JsonProperty(value = "lookThroughPortfolioId")
    private ResourceId lookThroughPortfolioId;

    /**
     * There could be multiple underlying instrument definitions (same
     * instrument but different format), but for now store one.
     */
    @JsonProperty(value = "instrument")
    private InstrumentDefinitionDto instrument;

    /**
     * Get the clientSecurityId value.
     *
     * @return the clientSecurityId value
     */
    public String clientSecurityId() {
        return this.clientSecurityId;
    }

    /**
     * Set the clientSecurityId value.
     *
     * @param clientSecurityId the clientSecurityId value to set
     * @return the CreateClientSecurityRequest object itself.
     */
    public CreateClientSecurityRequest withClientSecurityId(String clientSecurityId) {
        this.clientSecurityId = clientSecurityId;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CreateClientSecurityRequest object itself.
     */
    public CreateClientSecurityRequest withName(String name) {
        this.name = name;
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
     * @return the CreateClientSecurityRequest object itself.
     */
    public CreateClientSecurityRequest withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the aliases value.
     *
     * @return the aliases value
     */
    public List<KeyValuePairCodeTypeString> aliases() {
        return this.aliases;
    }

    /**
     * Set the aliases value.
     *
     * @param aliases the aliases value to set
     * @return the CreateClientSecurityRequest object itself.
     */
    public CreateClientSecurityRequest withAliases(List<KeyValuePairCodeTypeString> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get the lookThroughPortfolioId value.
     *
     * @return the lookThroughPortfolioId value
     */
    public ResourceId lookThroughPortfolioId() {
        return this.lookThroughPortfolioId;
    }

    /**
     * Set the lookThroughPortfolioId value.
     *
     * @param lookThroughPortfolioId the lookThroughPortfolioId value to set
     * @return the CreateClientSecurityRequest object itself.
     */
    public CreateClientSecurityRequest withLookThroughPortfolioId(ResourceId lookThroughPortfolioId) {
        this.lookThroughPortfolioId = lookThroughPortfolioId;
        return this;
    }

    /**
     * Get there could be multiple underlying instrument definitions (same
     instrument but different format), but for now store one.
     *
     * @return the instrument value
     */
    public InstrumentDefinitionDto instrument() {
        return this.instrument;
    }

    /**
     * Set there could be multiple underlying instrument definitions (same
     instrument but different format), but for now store one.
     *
     * @param instrument the instrument value to set
     * @return the CreateClientSecurityRequest object itself.
     */
    public CreateClientSecurityRequest withInstrument(InstrumentDefinitionDto instrument) {
        this.instrument = instrument;
        return this;
    }

}
