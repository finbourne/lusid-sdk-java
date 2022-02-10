

# CreateReferencePortfolioRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the reference portfolio. | 
**description** | **String** | A long form text description of the portfolio. |  [optional]
**code** | **String** | Unique identifier for the portfolio. | 
**created** | **OffsetDateTime** | The original creation date, defaults to today if not specified when creating a portfolio. |  [optional]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Portfolio properties to add to the portfolio. |  [optional]
**instrumentScopes** | **List&lt;String&gt;** | Instrument Scopes. |  [optional]
**baseCurrency** | **String** | The base currency of the transaction portfolio in ISO 4217 currency code format. |  [optional]



