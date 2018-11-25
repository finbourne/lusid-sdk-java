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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UpsertInstrumentRequest model.
 */
public class UpsertInstrumentRequest {
    /**
     * Required. The name of the instrument.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Required. A set of identifiers that uniquely identify this instrument
     * (e.g FIGI, RIC).
     */
    @JsonProperty(value = "identifiers", required = true)
    private Map<String, String> identifiers;

    /**
     * Optional. The identifier of the portfolio that represents this
     * instrument.
     */
    @JsonProperty(value = "lookThroughPortfolioId")
    private ResourceId lookThroughPortfolioId;

    /**
     * Expanded instrument definition - in the case of OTC instruments
     * this contains the definition of the non-exchange traded instrument.
     * The format for this can be client-defined, but in order to transparently
     * use
     * vendor libraries it must conform to a format that LUSID understands.
     */
    @JsonProperty(value = "definition")
    private InstrumentEconomicDefinition definition;

    /**
     * Get required. The name of the instrument.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set required. The name of the instrument.
     *
     * @param name the name value to set
     * @return the UpsertInstrumentRequest object itself.
     */
    public UpsertInstrumentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get required. A set of identifiers that uniquely identify this instrument (e.g FIGI, RIC).
     *
     * @return the identifiers value
     */
    public Map<String, String> identifiers() {
        return this.identifiers;
    }

    /**
     * Set required. A set of identifiers that uniquely identify this instrument (e.g FIGI, RIC).
     *
     * @param identifiers the identifiers value to set
     * @return the UpsertInstrumentRequest object itself.
     */
    public UpsertInstrumentRequest withIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get optional. The identifier of the portfolio that represents this instrument.
     *
     * @return the lookThroughPortfolioId value
     */
    public ResourceId lookThroughPortfolioId() {
        return this.lookThroughPortfolioId;
    }

    /**
     * Set optional. The identifier of the portfolio that represents this instrument.
     *
     * @param lookThroughPortfolioId the lookThroughPortfolioId value to set
     * @return the UpsertInstrumentRequest object itself.
     */
    public UpsertInstrumentRequest withLookThroughPortfolioId(ResourceId lookThroughPortfolioId) {
        this.lookThroughPortfolioId = lookThroughPortfolioId;
        return this;
    }

    /**
     * Get expanded instrument definition - in the case of OTC instruments
     this contains the definition of the non-exchange traded instrument.
     The format for this can be client-defined, but in order to transparently use
     vendor libraries it must conform to a format that LUSID understands.
     *
     * @return the definition value
     */
    public InstrumentEconomicDefinition definition() {
        return this.definition;
    }

    /**
     * Set expanded instrument definition - in the case of OTC instruments
     this contains the definition of the non-exchange traded instrument.
     The format for this can be client-defined, but in order to transparently use
     vendor libraries it must conform to a format that LUSID understands.
     *
     * @param definition the definition value to set
     * @return the UpsertInstrumentRequest object itself.
     */
    public UpsertInstrumentRequest withDefinition(InstrumentEconomicDefinition definition) {
        this.definition = definition;
        return this;
    }

}
