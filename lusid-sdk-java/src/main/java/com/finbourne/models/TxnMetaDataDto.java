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
 * The TxnMetaDataDto model.
 */
public class TxnMetaDataDto {
    /**
     * List of transaction codes that map to this specific transaction model.
     */
    @JsonProperty(value = "aliases", required = true)
    private List<TxnTypeAliasDto> aliases;

    /**
     * Movement data for the transaction code.
     */
    @JsonProperty(value = "movements", required = true)
    private List<TxnMovementMetaDataDto> movements;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * Get list of transaction codes that map to this specific transaction model.
     *
     * @return the aliases value
     */
    public List<TxnTypeAliasDto> aliases() {
        return this.aliases;
    }

    /**
     * Set list of transaction codes that map to this specific transaction model.
     *
     * @param aliases the aliases value to set
     * @return the TxnMetaDataDto object itself.
     */
    public TxnMetaDataDto withAliases(List<TxnTypeAliasDto> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get movement data for the transaction code.
     *
     * @return the movements value
     */
    public List<TxnMovementMetaDataDto> movements() {
        return this.movements;
    }

    /**
     * Set movement data for the transaction code.
     *
     * @param movements the movements value to set
     * @return the TxnMetaDataDto object itself.
     */
    public TxnMetaDataDto withMovements(List<TxnMovementMetaDataDto> movements) {
        this.movements = movements;
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
     * @return the TxnMetaDataDto object itself.
     */
    public TxnMetaDataDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

}
