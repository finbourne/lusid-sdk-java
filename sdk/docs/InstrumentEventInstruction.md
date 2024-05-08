

# InstrumentEventInstruction

An instruction for an instrument event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentEventInstructionId** | **String** | The unique identifier for this instruction |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**instrumentEventId** | **String** | The identifier of the instrument event being instructed |  [optional] |
|**instructionType** | **String** | The type of instruction (Ignore, ElectForPortfolio, ElectForHolding) |  [optional] |
|**electionKey** | **String** | For elected instructions, the key to be chosen |  [optional] |
|**holdingId** | **Long** | For holding instructions, the id of the holding for which the instruction will apply |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**href** | **URI** | The uri for this version of this instruction |  [optional] |



