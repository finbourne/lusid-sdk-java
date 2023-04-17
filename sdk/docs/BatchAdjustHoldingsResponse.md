

# BatchAdjustHoldingsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, HoldingAdjustmentWithDate&gt;**](HoldingAdjustmentWithDate.md) | The holdings which have been successfully adjusted. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The holdings that could not be adjusted along with a reason for their failure. |  [optional]
**metadata** | **Map&lt;String, List&lt;ResponseMetaData&gt;&gt;** | Contains warnings related to adjusted holdings |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



