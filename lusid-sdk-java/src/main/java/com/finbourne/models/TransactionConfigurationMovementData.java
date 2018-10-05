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
 * The TransactionConfigurationMovementData model.
 */
public class TransactionConfigurationMovementData {
    /**
     * The Movement Types. Possible values include: 'Settlement', 'Traded',
     * 'ForwardFx', 'Commitment', 'Receivable', 'CashSettlement', 'Accrual',
     * 'UnsettledCashTypes'.
     */
    @JsonProperty(value = "movementTypes", required = true)
    private String movementTypes;

    /**
     * The Movement Side. Possible values include: 'Side1', 'Side2', 'BondInt'.
     */
    @JsonProperty(value = "side", required = true)
    private String side;

    /**
     * The Movement direction.
     */
    @JsonProperty(value = "direction", required = true)
    private int direction;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<Property> properties;

    /**
     * The mappings property.
     */
    @JsonProperty(value = "mappings")
    private List<TransactionPropertyMapping> mappings;

    /**
     * Get the Movement Types. Possible values include: 'Settlement', 'Traded', 'ForwardFx', 'Commitment', 'Receivable', 'CashSettlement', 'Accrual', 'UnsettledCashTypes'.
     *
     * @return the movementTypes value
     */
    public String movementTypes() {
        return this.movementTypes;
    }

    /**
     * Set the Movement Types. Possible values include: 'Settlement', 'Traded', 'ForwardFx', 'Commitment', 'Receivable', 'CashSettlement', 'Accrual', 'UnsettledCashTypes'.
     *
     * @param movementTypes the movementTypes value to set
     * @return the TransactionConfigurationMovementData object itself.
     */
    public TransactionConfigurationMovementData withMovementTypes(String movementTypes) {
        this.movementTypes = movementTypes;
        return this;
    }

    /**
     * Get the Movement Side. Possible values include: 'Side1', 'Side2', 'BondInt'.
     *
     * @return the side value
     */
    public String side() {
        return this.side;
    }

    /**
     * Set the Movement Side. Possible values include: 'Side1', 'Side2', 'BondInt'.
     *
     * @param side the side value to set
     * @return the TransactionConfigurationMovementData object itself.
     */
    public TransactionConfigurationMovementData withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * Get the Movement direction.
     *
     * @return the direction value
     */
    public int direction() {
        return this.direction;
    }

    /**
     * Set the Movement direction.
     *
     * @param direction the direction value to set
     * @return the TransactionConfigurationMovementData object itself.
     */
    public TransactionConfigurationMovementData withDirection(int direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<Property> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the TransactionConfigurationMovementData object itself.
     */
    public TransactionConfigurationMovementData withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the mappings value.
     *
     * @return the mappings value
     */
    public List<TransactionPropertyMapping> mappings() {
        return this.mappings;
    }

    /**
     * Set the mappings value.
     *
     * @param mappings the mappings value to set
     * @return the TransactionConfigurationMovementData object itself.
     */
    public TransactionConfigurationMovementData withMappings(List<TransactionPropertyMapping> mappings) {
        this.mappings = mappings;
        return this;
    }

}
