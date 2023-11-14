

# CashDividendEvent

A cash distribution paid out to shareholders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | The date the company begins distributing the dividend. |  |
|**exDate** | **OffsetDateTime** | The first business day on which the dividend is not owed to the buying party. |  |
|**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Possible elections for this event, each keyed with a unique identifier. |  |
|**announcementDate** | **OffsetDateTime** | Date on which the dividend is announced by the company. |  [optional] |
|**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to participate in the tender. |  [optional] |



