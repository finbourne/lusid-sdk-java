

# UpsertPersonsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**values** | [**Map&lt;String, Person&gt;**](Person.md) | The Person(s) that have been successfully upserted |  |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The Person(s) that could not be upserted along with a reason for their failure. |  |
|**asAtDate** | **OffsetDateTime** | The as-at datetime at which Person(s) were created or updated. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



