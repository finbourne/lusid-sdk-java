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
 * A 'transition' within a corporate action, representing a set of output
 * movements paired to a single input position.
 */
public class CorporateActionTransitionDto {
    /**
     * The inputTransition property.
     */
    @JsonProperty(value = "inputTransition")
    private CorporateActionTransitionComponentDto inputTransition;

    /**
     * The outputTransitions property.
     */
    @JsonProperty(value = "outputTransitions")
    private List<CorporateActionTransitionComponentDto> outputTransitions;

    /**
     * Get the inputTransition value.
     *
     * @return the inputTransition value
     */
    public CorporateActionTransitionComponentDto inputTransition() {
        return this.inputTransition;
    }

    /**
     * Set the inputTransition value.
     *
     * @param inputTransition the inputTransition value to set
     * @return the CorporateActionTransitionDto object itself.
     */
    public CorporateActionTransitionDto withInputTransition(CorporateActionTransitionComponentDto inputTransition) {
        this.inputTransition = inputTransition;
        return this;
    }

    /**
     * Get the outputTransitions value.
     *
     * @return the outputTransitions value
     */
    public List<CorporateActionTransitionComponentDto> outputTransitions() {
        return this.outputTransitions;
    }

    /**
     * Set the outputTransitions value.
     *
     * @param outputTransitions the outputTransitions value to set
     * @return the CorporateActionTransitionDto object itself.
     */
    public CorporateActionTransitionDto withOutputTransitions(List<CorporateActionTransitionComponentDto> outputTransitions) {
        this.outputTransitions = outputTransitions;
        return this;
    }

}
