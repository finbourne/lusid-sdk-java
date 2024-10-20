

# BatchUpdateUserReviewForComparisonResultResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**values** | [**Map&lt;String, GroupReconciliationComparisonResult&gt;**](GroupReconciliationComparisonResult.md) | The collection of comparison results that have been successfully updated. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of comparison results that could not be updated with the provided user input along with a reason for their failure. |  [optional] |
|**metadata** | **Map&lt;String, List&lt;ResponseMetaData&gt;&gt;** | Contains warnings related to the updated comparison result user input |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


