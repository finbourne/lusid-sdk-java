

# InstrumentEventInstructionsResponse

The collection of successfully upserted instructions, and the collection of failures for those instructions that could not be upserted

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**values** | [**Map&lt;String, InstrumentEventInstruction&gt;**](InstrumentEventInstruction.md) | The collection of successfully upserted instructions |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of error information for instructions that could not be upserted |  [optional] |



