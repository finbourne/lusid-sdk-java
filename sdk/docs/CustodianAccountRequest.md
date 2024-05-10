

# CustodianAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | **String** | The Scope assigned to the Custodian Account, where left blank the parent Portfolio Scope will be used |  [optional] |
|**code** | **String** | Unique Code representing the Custodian Account |  |
|**status** | **String** | The Account status. Can be Active, Inactive or Deleted. |  [optional] |
|**accountNumber** | **String** | The Custodian Account Number |  |
|**accountName** | **String** | The identifiable name given to the Custodian Account |  |
|**accountingMethod** | **String** | The Accounting method to be used |  |
|**currency** | **String** | The Currency for the Account |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique Custodian Account properties and associated values to store with the Custodian Account. Each property must be from the &#39;CustodianAccount&#39; domain. |  [optional] |
|**custodianIdentifier** | [**TypedResourceId**](TypedResourceId.md) |  |  |
|**accountType** | **String** | The Type of the Custodian Account. Can be Margin, Cash or Swap. Defaults to Margin. |  [optional] |



