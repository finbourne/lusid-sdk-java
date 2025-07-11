

# UpsertInvestmentAccountRequest

Request to create or update an investor record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investment Account. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investment Account. |  [optional] |
|**displayName** | **String** | The display name of the Investment Account |  |
|**description** | **String** | The description of the Investment Account |  [optional] |
|**accountType** | **String** | The type of the of the Investment Account. |  |
|**accountHolders** | [**List&lt;AccountHolderIdentifier&gt;**](AccountHolderIdentifier.md) | The identification of the account holders associated with this investment account |  [optional] |
|**investmentPortfolios** | [**List&lt;InvestmentPortfolioIdentifier&gt;**](InvestmentPortfolioIdentifier.md) | The identification of the investment portfolios associated with this investment account |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


