

# SequenceDefinition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**increment** | **Long** | The Resource Id of the sequence definition |  |
|**minValue** | **Long** | The minimum value of the sequence |  |
|**maxValue** | **Long** | The maximum value of the sequence |  |
|**start** | **Long** | The start value of the sequence |  |
|**value** | **Long** | The last used value of the sequence |  [optional] |
|**cycle** | **Boolean** | Indicates if the sequence would start from minimun value once it reaches maximum value. If set to false, a failure would return if the sequence reaches maximum value. |  |
|**pattern** | **String** | The pattern to be used to generate next values in the sequence. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



