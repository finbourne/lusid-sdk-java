

# AborConfigurationRequest

The request used to create an AborConfiguration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the Abor Configuration. |  |
|**displayName** | **String** | The name of the Abor Configuration. |  [optional] |
|**description** | **String** | A description for the Abor Configuration. |  [optional] |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**postingModuleCodes** | **List&lt;String&gt;** | The Posting Module Codes from which the rules to be applied are retrieved. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor Configuration. |  [optional] |



