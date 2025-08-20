

# PartialClosureConstituent

A single constituent of a partial closure event for a Flexible Repo. Contains details of the collateral being exchanged in the Instrument field, represented as a NewInstrument object, as well as the amount being exchanged and the type of that amount (Units or Percentage of current units).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **java.math.BigDecimal** | If AmountType is set to Units, this field represents the number of units of the instrument being exchanged. If AmountType is set to Percentage, this field represents the percentage of the total repoed units of the instrument being exchanged. When defining a FlexibleRepoPartialClosureEvent the AmountType can be set to either Units or Percentage, where Units represents the number of units of the instrument being exchanged, and Percentage represents the percentage of the total repoed units of the instrument being exchanged in the context of the FlexibleRepo. |  |
|**amountType** | **String** | The type of amount represented by the Amount field. I.e., does it represent a number of units or a percentage of the total repoed units of the instrument? When defining a FlexibleRepoPartialClosureEvent AmountType can be set to either Units or Percentage.  Supported string (enumeration) values are: [Percentage, Units]. |  |
|**instrument** | [**NewInstrument**](NewInstrument.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


