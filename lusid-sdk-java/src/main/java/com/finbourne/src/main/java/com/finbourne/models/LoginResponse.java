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
 * The LoginResponse model.
 */
public class LoginResponse {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The firstName property.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /**
     * The defaultScope property.
     */
    @JsonProperty(value = "defaultScope")
    private String defaultScope;

    /**
     * The sessionContextId property.
     */
    @JsonProperty(value = "sessionContextId")
    private String sessionContextId;

    /**
     * The logoUri property.
     */
    @JsonProperty(value = "logoUri")
    private String logoUri;

    /**
     * The valueCurrencyCode property.
     */
    @JsonProperty(value = "valueCurrencyCode")
    private String valueCurrencyCode;

    /**
     * The valueCurrencySymbol property.
     */
    @JsonProperty(value = "valueCurrencySymbol")
    private String valueCurrencySymbol;

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
     * @return the LoginResponse object itself.
     */
    public LoginResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the firstName value.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName value.
     *
     * @param firstName the firstName value to set
     * @return the LoginResponse object itself.
     */
    public LoginResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the defaultScope value.
     *
     * @return the defaultScope value
     */
    public String defaultScope() {
        return this.defaultScope;
    }

    /**
     * Set the defaultScope value.
     *
     * @param defaultScope the defaultScope value to set
     * @return the LoginResponse object itself.
     */
    public LoginResponse withDefaultScope(String defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    /**
     * Get the sessionContextId value.
     *
     * @return the sessionContextId value
     */
    public String sessionContextId() {
        return this.sessionContextId;
    }

    /**
     * Set the sessionContextId value.
     *
     * @param sessionContextId the sessionContextId value to set
     * @return the LoginResponse object itself.
     */
    public LoginResponse withSessionContextId(String sessionContextId) {
        this.sessionContextId = sessionContextId;
        return this;
    }

    /**
     * Get the logoUri value.
     *
     * @return the logoUri value
     */
    public String logoUri() {
        return this.logoUri;
    }

    /**
     * Set the logoUri value.
     *
     * @param logoUri the logoUri value to set
     * @return the LoginResponse object itself.
     */
    public LoginResponse withLogoUri(String logoUri) {
        this.logoUri = logoUri;
        return this;
    }

    /**
     * Get the valueCurrencyCode value.
     *
     * @return the valueCurrencyCode value
     */
    public String valueCurrencyCode() {
        return this.valueCurrencyCode;
    }

    /**
     * Set the valueCurrencyCode value.
     *
     * @param valueCurrencyCode the valueCurrencyCode value to set
     * @return the LoginResponse object itself.
     */
    public LoginResponse withValueCurrencyCode(String valueCurrencyCode) {
        this.valueCurrencyCode = valueCurrencyCode;
        return this;
    }

    /**
     * Get the valueCurrencySymbol value.
     *
     * @return the valueCurrencySymbol value
     */
    public String valueCurrencySymbol() {
        return this.valueCurrencySymbol;
    }

    /**
     * Set the valueCurrencySymbol value.
     *
     * @param valueCurrencySymbol the valueCurrencySymbol value to set
     * @return the LoginResponse object itself.
     */
    public LoginResponse withValueCurrencySymbol(String valueCurrencySymbol) {
        this.valueCurrencySymbol = valueCurrencySymbol;
        return this;
    }

}
