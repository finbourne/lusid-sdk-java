

# OptionExercisePhysicalEvent

Event for physical option exercises.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exerciseDate** | **OffsetDateTime** | The exercise date of the option. |  [optional] |
|**deliveryDate** | **OffsetDateTime** | The delivery date of the option. |  [optional] |
|**exerciseType** | **String** | The optionality type of the underlying option e.g. American, European.    Supported string (enumeration) values are: [European, Bermudan, American]. |  |
|**maturityDate** | **OffsetDateTime** | The maturity date of the option. |  [optional] |
|**moneyness** | **String** | The moneyness of the option e.g. InTheMoney, OutOfTheMoney.    Supported string (enumeration) values are: [InTheMoney, OutOfTheMoney, AtTheMoney]. |  [optional] |
|**newInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |
|**optionExerciseElections** | [**List&lt;OptionExerciseElection&gt;**](OptionExerciseElection.md) | Option exercise election for this OptionExercisePhysicalEvent. |  [optional] |
|**optionType** | **String** | Type of optionality that is present e.g. call, put.    Supported string (enumeration) values are: [Call, Put]. |  |
|**startDate** | **OffsetDateTime** | The trade date of the option. |  [optional] |
|**strikeCurrency** | **String** | The strike currency of the equity option. |  |
|**strikePerUnit** | **java.math.BigDecimal** | The strike of the equity option times the number of shares to exchange if exercised. |  |
|**underlyingValuePerUnit** | **java.math.BigDecimal** | The underlying price times the number of shares to exchange if exercised. |  [optional] |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


