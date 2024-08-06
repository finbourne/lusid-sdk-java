

# CustodianAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**custodianAccountId** | [**ResourceId**](ResourceId.md) |  |  |
|**status** | **String** | The Account status. Can be Active, Inactive or Deleted. |  |
|**accountNumber** | **String** | The Custodian Account Number |  |
|**accountName** | **String** | The identifiable name given to the Custodian Account |  |
|**accountingMethod** | **String** | The Accounting method to be used |  |
|**currency** | **String** | The Currency for the Account |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique Custodian Account properties and associated values to store with the Custodian Account. Each property must be from the &#39;CustodianAccount&#39; domain. |  [optional] |
|**custodian** | [**LegalEntity**](LegalEntity.md) |  |  |
|**accountType** | **String** | The Type of the Custodian Account. Can be Margin, Cash or Swap. Defaults to Margin. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


