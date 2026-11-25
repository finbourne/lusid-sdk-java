# com.finbourne.lusid.model.CollateralSubstitutionConstituent
A single collateral instrument taking part in a FlexibleRepoCollateralSubstitutionEvent, either as outgoing  collateral being returned or as incoming collateral replacing it. Contains a reference to the instrument as a  NewInstrument object, an optional amount and the type of that amount (Units or Percentage of current units).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**amount** | **java.math.BigDecimal** | If AmountType is set to Units, this field represents the number of units of the instrument being transferred.  If AmountType is set to Percentage, this field represents the percentage of the repoed units of the instrument being transferred.  Required for outgoing collateral. For incoming collateral it is required when AdjustCollateralUnits is false;  the instrument is then held in the units given, so its AmountType must be Units. | [optional] [default to java.math.BigDecimal]
**amountType** | **String** | The type of amount represented by the Amount field.  I.e., does it represent a number of units or a percentage of the repoed units of the instrument?  Supported string (enumeration) values are: [Percentage, Units]. Defaults to Units. Must be Units for incoming  collateral. Available values: Percentage, Units. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CollateralSubstitutionConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

NewInstrument Instrument = new NewInstrument();
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String AmountType = "example AmountType";


CollateralSubstitutionConstituent collateralSubstitutionConstituentInstance = new CollateralSubstitutionConstituent()
    .Instrument(Instrument)
    .Amount(Amount)
    .AmountType(AmountType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
