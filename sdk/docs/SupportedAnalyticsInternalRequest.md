

# SupportedAnalyticsInternalRequest

The request body for the SupportedAnalyticsInternal endpoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeAllAddresses** | **Boolean** | If true, then we show every possible address key, otherwise we show the address keys specified in addresses array. | 
**addresses** | **List&lt;String&gt;** | Address keys specified here will be included in the response to the call, which will include details on whether those keys are supported. |  [optional]
**groupBy** | **List&lt;String&gt;** | The address keys to group by. | 
**showTestCounts** | **Boolean** | If true, returns an integer matrix showing test counts for each address.  If false, masks to a boolean matrix representing whether an address is supported or unsupported. |  [optional]



