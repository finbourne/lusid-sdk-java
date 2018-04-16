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
 * The TransactionCodeMovementsDto model.
 */
public class TransactionCodeMovementsDto {
    /**
     * The transaction code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * The transaction code description.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Movement data for the transaction code.
     */
    @JsonProperty(value = "movements", required = true)
    private List<MovementDataDto> movements;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the TransactionCodeMovementsDto object itself.
     */
    public TransactionCodeMovementsDto withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the TransactionCodeMovementsDto object itself.
     */
    public TransactionCodeMovementsDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the movements value.
     *
     * @return the movements value
     */
    public List<MovementDataDto> movements() {
        return this.movements;
    }

    /**
     * Set the movements value.
     *
     * @param movements the movements value to set
     * @return the TransactionCodeMovementsDto object itself.
     */
    public TransactionCodeMovementsDto withMovements(List<MovementDataDto> movements) {
        this.movements = movements;
        return this;
    }

}
