

# UpdatePlacementsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**values** | [**Map&lt;String, Placement&gt;**](Placement.md) | The placements which have been successfully updated. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The placements that could not be updated, along with a reason for their failure. |  [optional] |
|**metadata** | **Map&lt;String, List&lt;ResponseMetaData&gt;&gt;** | Meta data associated with the update event. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |


