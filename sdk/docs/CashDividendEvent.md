

# CashDividendEvent

A cash distribution paid out to shareholders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | The date the company begins distributing the dividend. |  [optional] |
|**exDate** | **OffsetDateTime** | The first business day on which the dividend is not owed to the buying party. |  [optional] |
|**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Possible elections for this event, each keyed with a unique identifier. |  |
|**announcementDate** | **OffsetDateTime** | Date on which the dividend is announced by the company. |  [optional] |
|**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to participate in the tender. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


