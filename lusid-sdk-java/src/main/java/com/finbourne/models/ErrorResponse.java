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
 * The ErrorResponse model.
 */
public class ErrorResponse {
    /**
     * The status property.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Integer status;

    /**
     * Possible values include: 'Unknown', 'PersonalisationNotFound',
     * 'NonRecursivePersonalisation', 'VersionNotFound', 'SecurityNotFound',
     * 'PropertyNotFound', 'PortfolioRecursionDepth', 'GroupNotFound',
     * 'PortfolioNotFound', 'PropertySchemaNotFound',
     * 'PortfolioWithIdAlreadyExists', 'OrphanedPortfolio',
     * 'MissingBaseClaims', 'PropertyNotDefined', 'CannotDeleteSystemProperty',
     * 'CannotModifyImmutablePropertyField', 'PropertyAlreadyExists',
     * 'InvalidPropertyLifeTime', 'CannotModifyDefaultPropertyFormat',
     * 'GroupAlreadyExists', 'NoSuchPropertyDataFormat', 'ValidationError',
     * 'LoopDetectedInGroupHierarchy', 'SubGroupAlreadyExists',
     * 'PriceSourceNotFound', 'AnalyticStoreNotFound',
     * 'AnalyticStoreAlreadyExists', 'ClientSecurityAlreadyExists',
     * 'DuplicateInParameterSet', 'ResultsNotFound',
     * 'OrderFieldNotInResultSet', 'OperationFailed', 'ElasticSearchError',
     * 'InvalidParameterValue', 'CommandProcessingFailure',
     * 'EntityStateConstructionFailure', 'EntityTimelineDoesNotExist',
     * 'EventPublishFailure', 'InvalidRequestFailure', 'EventPublishUnknown',
     * 'EventQueryFailure', 'BlobDidNotExistFailure',
     * 'SubSystemRequestFailure', 'SubSystemConfigurationFailure',
     * 'FailedToDelete', 'UpsertClientSecurityFailure', 'IllegalAsAtInterval',
     * 'IllegalBitemporalQuery', 'InvalidAlternateId',
     * 'CannotAddSourcePortfolioPropertyExplicitly',
     * 'EntityAlreadyExistsInGroup', 'EntityWithIdAlreadyExists',
     * 'PortfolioDetailsDoNotExist', 'PortfolioWithNameAlreadyExists',
     * 'InvalidTrades', 'ReferencePortfolioNotFound', 'DuplicateIdFailure',
     * 'SecurityByCodeNotFound', 'CommandRetrievalFailure',
     * 'DataFilterApplicationFailure', 'SearchFailed',
     * 'MovementsEngineConfigurationKeyFailure', 'FxRateSourceNotFound',
     * 'AccrualSourceNotFound', 'EntitlementsFailure', 'InvalidIdentityToken',
     * 'InvalidRequestHeaders', 'PriceNotFound', 'ServerConfigurationError',
     * 'InvalidUnitForDataType', 'InvalidTypeForDataType',
     * 'InvalidValueForDataType', 'UnitNotDefinedForDataType',
     * 'UnitsNotSupportedOnDataType', 'CannotSpecifyUnitsOnDataType',
     * 'UnitSchemaInconsistentWithDataType', 'UnitDefinitionNotSpecified',
     * 'DuplicateUnitDefinitionsSpecified', 'InvalidUnitsDefinition'.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The message property.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The detailedMessage property.
     */
    @JsonProperty(value = "detailedMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String detailedMessage;

    /**
     * The items property.
     */
    @JsonProperty(value = "items")
    private List<ErrorDetailBase> items;

    /**
     * The moreInfo property.
     */
    @JsonProperty(value = "moreInfo", access = JsonProperty.Access.WRITE_ONLY)
    private String moreInfo;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Get possible values include: 'Unknown', 'PersonalisationNotFound', 'NonRecursivePersonalisation', 'VersionNotFound', 'SecurityNotFound', 'PropertyNotFound', 'PortfolioRecursionDepth', 'GroupNotFound', 'PortfolioNotFound', 'PropertySchemaNotFound', 'PortfolioWithIdAlreadyExists', 'OrphanedPortfolio', 'MissingBaseClaims', 'PropertyNotDefined', 'CannotDeleteSystemProperty', 'CannotModifyImmutablePropertyField', 'PropertyAlreadyExists', 'InvalidPropertyLifeTime', 'CannotModifyDefaultPropertyFormat', 'GroupAlreadyExists', 'NoSuchPropertyDataFormat', 'ValidationError', 'LoopDetectedInGroupHierarchy', 'SubGroupAlreadyExists', 'PriceSourceNotFound', 'AnalyticStoreNotFound', 'AnalyticStoreAlreadyExists', 'ClientSecurityAlreadyExists', 'DuplicateInParameterSet', 'ResultsNotFound', 'OrderFieldNotInResultSet', 'OperationFailed', 'ElasticSearchError', 'InvalidParameterValue', 'CommandProcessingFailure', 'EntityStateConstructionFailure', 'EntityTimelineDoesNotExist', 'EventPublishFailure', 'InvalidRequestFailure', 'EventPublishUnknown', 'EventQueryFailure', 'BlobDidNotExistFailure', 'SubSystemRequestFailure', 'SubSystemConfigurationFailure', 'FailedToDelete', 'UpsertClientSecurityFailure', 'IllegalAsAtInterval', 'IllegalBitemporalQuery', 'InvalidAlternateId', 'CannotAddSourcePortfolioPropertyExplicitly', 'EntityAlreadyExistsInGroup', 'EntityWithIdAlreadyExists', 'PortfolioDetailsDoNotExist', 'PortfolioWithNameAlreadyExists', 'InvalidTrades', 'ReferencePortfolioNotFound', 'DuplicateIdFailure', 'SecurityByCodeNotFound', 'CommandRetrievalFailure', 'DataFilterApplicationFailure', 'SearchFailed', 'MovementsEngineConfigurationKeyFailure', 'FxRateSourceNotFound', 'AccrualSourceNotFound', 'EntitlementsFailure', 'InvalidIdentityToken', 'InvalidRequestHeaders', 'PriceNotFound', 'ServerConfigurationError', 'InvalidUnitForDataType', 'InvalidTypeForDataType', 'InvalidValueForDataType', 'UnitNotDefinedForDataType', 'UnitsNotSupportedOnDataType', 'CannotSpecifyUnitsOnDataType', 'UnitSchemaInconsistentWithDataType', 'UnitDefinitionNotSpecified', 'DuplicateUnitDefinitionsSpecified', 'InvalidUnitsDefinition'.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the detailedMessage value.
     *
     * @return the detailedMessage value
     */
    public String detailedMessage() {
        return this.detailedMessage;
    }

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<ErrorDetailBase> items() {
        return this.items;
    }

    /**
     * Set the items value.
     *
     * @param items the items value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withItems(List<ErrorDetailBase> items) {
        this.items = items;
        return this;
    }

    /**
     * Get the moreInfo value.
     *
     * @return the moreInfo value
     */
    public String moreInfo() {
        return this.moreInfo;
    }

}
