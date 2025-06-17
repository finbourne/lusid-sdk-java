

# TransferAgencyDates


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**priceDate** | **OffsetDateTime** | The date at which the fund is priced, for the order received on ReceivedDate. Can be passed into the request instead of the ReceivedDate to calculate the TransactionDate and ExpectedPaymentDate. If both the received date and price date are given, the price date is used. |  [optional] |
|**transactionDate** | **OffsetDateTime** | The date at which the transaction into or out of the fund is made. |  [optional] |
|**expectedPaymentDate** | **OffsetDateTime** | The date by which the cash is expected to be paid to or from the fund. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


