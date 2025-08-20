

# TimeZoneConventions

Provides information on the primary time zone of an instrument and optional cut labels for defining times to be used by instrument events.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryTimeZone** | **String** | The IANA time zone code for the instrument. |  |
|**startOfDay** | **String** | A LUSID Cut Label code used for generating instrument events at a time other than local midnight. |  [optional] |
|**primaryMarketOpen** | **String** | A LUSID Cut Label code used for delaying the transaction time of certain instrument events until market open. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


