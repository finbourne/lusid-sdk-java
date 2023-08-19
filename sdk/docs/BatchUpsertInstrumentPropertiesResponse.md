

# BatchUpsertInstrumentPropertiesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **Map&lt;String, List&lt;Property&gt;&gt;** | The properties that have been successfully upserted | 
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The properties that could not be upserted along with a reason for their failure. | 
**asAtDate** | **OffsetDateTime** | The as-at datetime at which properties were created or updated. | 
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



