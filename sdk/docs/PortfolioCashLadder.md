

# PortfolioCashLadder


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the cash-flows. | 
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. |  [optional]
**records** | [**List&lt;CashLadderRecord&gt;**](CashLadderRecord.md) | A record of cash flows on a specific date. | 
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The records that could not be returned along with a reason for their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



