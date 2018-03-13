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
 * The SecurityDtoAliases model.
 */
public class SecurityDtoAliases {
    /**
     * The undefined property.
     */
    @JsonProperty(value = "Undefined")
    private String undefined;

    /**
     * The reutersAssetId property.
     */
    @JsonProperty(value = "ReutersAssetId")
    private String reutersAssetId;

    /**
     * The cINS property.
     */
    @JsonProperty(value = "CINS")
    private String cINS;

    /**
     * The isin property.
     */
    @JsonProperty(value = "Isin")
    private String isin;

    /**
     * The sedol property.
     */
    @JsonProperty(value = "Sedol")
    private String sedol;

    /**
     * The cusip property.
     */
    @JsonProperty(value = "Cusip")
    private String cusip;

    /**
     * The clientInternal property.
     */
    @JsonProperty(value = "ClientInternal")
    private String clientInternal;

    /**
     * The figi property.
     */
    @JsonProperty(value = "Figi")
    private String figi;

    /**
     * The wertpapier property.
     */
    @JsonProperty(value = "Wertpapier")
    private String wertpapier;

    /**
     * Get the undefined value.
     *
     * @return the undefined value
     */
    public String undefined() {
        return this.undefined;
    }

    /**
     * Set the undefined value.
     *
     * @param undefined the undefined value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withUndefined(String undefined) {
        this.undefined = undefined;
        return this;
    }

    /**
     * Get the reutersAssetId value.
     *
     * @return the reutersAssetId value
     */
    public String reutersAssetId() {
        return this.reutersAssetId;
    }

    /**
     * Set the reutersAssetId value.
     *
     * @param reutersAssetId the reutersAssetId value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withReutersAssetId(String reutersAssetId) {
        this.reutersAssetId = reutersAssetId;
        return this;
    }

    /**
     * Get the cINS value.
     *
     * @return the cINS value
     */
    public String cINS() {
        return this.cINS;
    }

    /**
     * Set the cINS value.
     *
     * @param cINS the cINS value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withCINS(String cINS) {
        this.cINS = cINS;
        return this;
    }

    /**
     * Get the isin value.
     *
     * @return the isin value
     */
    public String isin() {
        return this.isin;
    }

    /**
     * Set the isin value.
     *
     * @param isin the isin value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withIsin(String isin) {
        this.isin = isin;
        return this;
    }

    /**
     * Get the sedol value.
     *
     * @return the sedol value
     */
    public String sedol() {
        return this.sedol;
    }

    /**
     * Set the sedol value.
     *
     * @param sedol the sedol value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withSedol(String sedol) {
        this.sedol = sedol;
        return this;
    }

    /**
     * Get the cusip value.
     *
     * @return the cusip value
     */
    public String cusip() {
        return this.cusip;
    }

    /**
     * Set the cusip value.
     *
     * @param cusip the cusip value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withCusip(String cusip) {
        this.cusip = cusip;
        return this;
    }

    /**
     * Get the clientInternal value.
     *
     * @return the clientInternal value
     */
    public String clientInternal() {
        return this.clientInternal;
    }

    /**
     * Set the clientInternal value.
     *
     * @param clientInternal the clientInternal value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withClientInternal(String clientInternal) {
        this.clientInternal = clientInternal;
        return this;
    }

    /**
     * Get the figi value.
     *
     * @return the figi value
     */
    public String figi() {
        return this.figi;
    }

    /**
     * Set the figi value.
     *
     * @param figi the figi value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withFigi(String figi) {
        this.figi = figi;
        return this;
    }

    /**
     * Get the wertpapier value.
     *
     * @return the wertpapier value
     */
    public String wertpapier() {
        return this.wertpapier;
    }

    /**
     * Set the wertpapier value.
     *
     * @param wertpapier the wertpapier value to set
     * @return the SecurityDtoAliases object itself.
     */
    public SecurityDtoAliases withWertpapier(String wertpapier) {
        this.wertpapier = wertpapier;
        return this;
    }

}
