

# DeletedEntityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. |  [optional]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the deletion was committed to LUSID. | 
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



