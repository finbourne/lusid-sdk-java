

# InstrumentEventInstructionRequest

The request to create an instruction for an instrument event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentEventInstructionId** | **String** | The unique identifier for this instruction |  |
|**instrumentEventId** | **String** | The identifier of the instrument event being instructed |  |
|**instructionType** | **String** | The type of instruction (Ignore, ElectForPortfolio, ElectForHolding) |  |
|**electionKey** | **String** | For elected instructions, the key to be chosen |  [optional] |
|**holdingId** | **Long** | For holding instructions, the id of the holding for which the instruction will apply |  [optional] |


