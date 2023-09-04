

# ModelPackage

A structure used to describe the structure of an order or orders that make up a non-trivial trade.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order ids. |  |
|**orderInstructionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order instruction ids. |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



