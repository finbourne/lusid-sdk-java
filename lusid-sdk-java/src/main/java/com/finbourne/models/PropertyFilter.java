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
 * The PropertyFilter model.
 */
public class PropertyFilter {
    /**
     * The left property.
     */
    @JsonProperty(value = "left")
    private String left;

    /**
     * Possible values include: 'Equals', 'NotEquals', 'GreaterThan',
     * 'GreaterThanOrEqualTo', 'LessThan', 'LessThanOrEqualTo', 'In'.
     */
    @JsonProperty(value = "operator")
    private String operator;

    /**
     * The right property.
     */
    @JsonProperty(value = "right")
    private Object right;

    /**
     * Possible values include: 'Absolute', 'Property'.
     */
    @JsonProperty(value = "rightOperandType")
    private String rightOperandType;

    /**
     * Get the left value.
     *
     * @return the left value
     */
    public String left() {
        return this.left;
    }

    /**
     * Set the left value.
     *
     * @param left the left value to set
     * @return the PropertyFilter object itself.
     */
    public PropertyFilter withLeft(String left) {
        this.left = left;
        return this;
    }

    /**
     * Get possible values include: 'Equals', 'NotEquals', 'GreaterThan', 'GreaterThanOrEqualTo', 'LessThan', 'LessThanOrEqualTo', 'In'.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set possible values include: 'Equals', 'NotEquals', 'GreaterThan', 'GreaterThanOrEqualTo', 'LessThan', 'LessThanOrEqualTo', 'In'.
     *
     * @param operator the operator value to set
     * @return the PropertyFilter object itself.
     */
    public PropertyFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the right value.
     *
     * @return the right value
     */
    public Object right() {
        return this.right;
    }

    /**
     * Set the right value.
     *
     * @param right the right value to set
     * @return the PropertyFilter object itself.
     */
    public PropertyFilter withRight(Object right) {
        this.right = right;
        return this;
    }

    /**
     * Get possible values include: 'Absolute', 'Property'.
     *
     * @return the rightOperandType value
     */
    public String rightOperandType() {
        return this.rightOperandType;
    }

    /**
     * Set possible values include: 'Absolute', 'Property'.
     *
     * @param rightOperandType the rightOperandType value to set
     * @return the PropertyFilter object itself.
     */
    public PropertyFilter withRightOperandType(String rightOperandType) {
        this.rightOperandType = rightOperandType;
        return this;
    }

}
