

# ResultDataKeyRule

A rule that describes how we resolve (unit) result data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceKey** | **String** | The result data key that identifies the address pattern that this is a rule for | 
**supplier** | **String** | the result resource supplier (where the data comes from) | 
**dataScope** | **String** | which is the scope in which the data should be found | 
**documentCode** | **String** | document code that defines which document is desired | 
**quoteInterval** | **String** | Shorthand for the time interval used to select result data. This must be a dot-separated string              specifying a start and end date, for example &#39;5D.0D&#39; to look back 5 days from today (0 days ago). |  [optional]
**asAt** | **OffsetDateTime** | The AsAt predicate specification. |  [optional]



