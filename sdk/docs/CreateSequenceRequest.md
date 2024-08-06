

# CreateSequenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code of the sequence definition to create |  |
|**increment** | **Long** | The value to increment between each value in the sequence |  [optional] |
|**minValue** | **Long** | The minimum value of the sequence |  [optional] |
|**maxValue** | **Long** | The maximum value of the sequence |  [optional] |
|**start** | **Long** | The start value of the sequence |  [optional] |
|**cycle** | **Boolean** | Set to true to start the sequence over again when it reaches the end. Defaults to false if not provided. |  [optional] |
|**pattern** | **String** | The pattern to be used to generate next values in the sequence. Defaults to null if not provided. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


