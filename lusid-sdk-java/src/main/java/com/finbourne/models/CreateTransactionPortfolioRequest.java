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

import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateTransactionPortfolioRequest model.
 */
public class CreateTransactionPortfolioRequest {
    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The code property.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * The created property.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * The baseCurrency property.
     */
    @JsonProperty(value = "baseCurrency", required = true)
    private String baseCurrency;

    /**
     * The corporateActionSourceId property.
     */
    @JsonProperty(value = "corporateActionSourceId")
    private ResourceId corporateActionSourceId;

    /**
     * Possible values include: 'Default', 'AverageCost', 'FirstInFirstOut',
     * 'LastInFirstOut', 'HighestCostFirst', 'LowestCostFirst'.
     */
    @JsonProperty(value = "accountingMethod")
    private String accountingMethod;

    /**
     * The subHoldingKeys property.
     */
    @JsonProperty(value = "subHoldingKeys")
    private List<String> subHoldingKeys;

    /**
     * Portfolio properties to add to the portfolio.
     */
    @JsonProperty(value = "properties")
    private Map<String, PropertyValue> properties;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withDisplayName(String displayName) {
        this.displayName = displayName;
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
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withDescription(String description) {
        this.description = description;
        return this;
    }

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
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set the created value.
     *
     * @param created the created value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the baseCurrency value.
     *
     * @return the baseCurrency value
     */
    public String baseCurrency() {
        return this.baseCurrency;
    }

    /**
     * Set the baseCurrency value.
     *
     * @param baseCurrency the baseCurrency value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * Get the corporateActionSourceId value.
     *
     * @return the corporateActionSourceId value
     */
    public ResourceId corporateActionSourceId() {
        return this.corporateActionSourceId;
    }

    /**
     * Set the corporateActionSourceId value.
     *
     * @param corporateActionSourceId the corporateActionSourceId value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withCorporateActionSourceId(ResourceId corporateActionSourceId) {
        this.corporateActionSourceId = corporateActionSourceId;
        return this;
    }

    /**
     * Get possible values include: 'Default', 'AverageCost', 'FirstInFirstOut', 'LastInFirstOut', 'HighestCostFirst', 'LowestCostFirst'.
     *
     * @return the accountingMethod value
     */
    public String accountingMethod() {
        return this.accountingMethod;
    }

    /**
     * Set possible values include: 'Default', 'AverageCost', 'FirstInFirstOut', 'LastInFirstOut', 'HighestCostFirst', 'LowestCostFirst'.
     *
     * @param accountingMethod the accountingMethod value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withAccountingMethod(String accountingMethod) {
        this.accountingMethod = accountingMethod;
        return this;
    }

    /**
     * Get the subHoldingKeys value.
     *
     * @return the subHoldingKeys value
     */
    public List<String> subHoldingKeys() {
        return this.subHoldingKeys;
    }

    /**
     * Set the subHoldingKeys value.
     *
     * @param subHoldingKeys the subHoldingKeys value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withSubHoldingKeys(List<String> subHoldingKeys) {
        this.subHoldingKeys = subHoldingKeys;
        return this;
    }

    /**
     * Get portfolio properties to add to the portfolio.
     *
     * @return the properties value
     */
    public Map<String, PropertyValue> properties() {
        return this.properties;
    }

    /**
     * Set portfolio properties to add to the portfolio.
     *
     * @param properties the properties value to set
     * @return the CreateTransactionPortfolioRequest object itself.
     */
    public CreateTransactionPortfolioRequest withProperties(Map<String, PropertyValue> properties) {
        this.properties = properties;
        return this;
    }

}
