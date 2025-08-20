

# AddressDefinition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The display name of the address key. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Result0D, Json |  [optional] |
|**description** | **String** | The description for this result. |  [optional] |
|**lifeCycleStatus** | **String** | What is the status of the address path. If it is not Production then it might be removed at some point in the future. See the removal date for the likely timing of that if any. |  [optional] |
|**removalDate** | **OffsetDateTime** | If the life-cycle status of the address is Deprecated then this is the date at which support of the address will be suspended. After that date it will be removed at the earliest possible point subject to any specific contractual support and development constraints. |  [optional] |
|**documentationLink** | **String** | Contains a link to the documentation for this AddressDefinition in KnowledgeBase. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;String&quot; |
| INT | &quot;Int&quot; |
| DECIMAL | &quot;Decimal&quot; |
| DATETIME | &quot;DateTime&quot; |
| BOOLEAN | &quot;Boolean&quot; |
| RESULTVALUE | &quot;ResultValue&quot; |
| RESULT0D | &quot;Result0D&quot; |
| JSON | &quot;Json&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


