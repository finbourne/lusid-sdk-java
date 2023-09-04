

# UpsertPersonRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | The identifiers the person will be upserted with.The provided keys should be idTypeScope, idTypeCode, code |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Person. There can be multiple properties associated with a property key. |  [optional] |
|**displayName** | **String** | The display name of the Person |  |
|**description** | **String** | The description of the Person |  [optional] |



