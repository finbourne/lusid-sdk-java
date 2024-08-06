

# A2BDataRecord

A2B Record - shows values on, and changes between two dates: A and B

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. |  [optional] |
|**instrumentScope** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. |  [optional] |
|**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. |  [optional] |
|**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. |  [optional] |
|**currency** | **String** | The holding currency. |  [optional] |
|**transactionId** | **String** | The unique identifier for the transaction. |  [optional] |
|**start** | [**A2BCategory**](A2BCategory.md) |  |  [optional] |
|**flows** | [**A2BCategory**](A2BCategory.md) |  |  [optional] |
|**gains** | [**A2BCategory**](A2BCategory.md) |  |  [optional] |
|**carry** | [**A2BCategory**](A2BCategory.md) |  |  [optional] |
|**end** | [**A2BCategory**](A2BCategory.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; domain. |  [optional] |
|**groupId** | **String** | Arbitrary string that can be used to cross reference an entry in the A2B report with activity in the A2B-Movements. This should be used purely as a token. The content should not be relied upon. |  [optional] |
|**errors** | [**List&lt;ResponseMetaData&gt;**](ResponseMetaData.md) | Any errors with the record are reported here. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


