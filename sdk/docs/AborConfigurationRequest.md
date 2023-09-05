

# AborConfigurationRequest

The request used to create an AborConfiguration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the AborConfiguration. |  |
|**displayName** | **String** | The given name for the AborConfiguration. |  [optional] |
|**description** | **String** | The description for the AborConfiguration. |  [optional] |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  |
|**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  |  |
|**postingModuleIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Posting Modules Ids from where the rules to be applied are retrieved. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to add to the AborConfiguration. |  [optional] |



