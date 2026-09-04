# com.finbourne.lusid.model.ModelOptionShiftDefinition
A shift of a pricing model option for the duration of the scenario. Unlike every other shift  type, the target is not a piece of market data: it is a field of the model options carried by  the recipe's model rule (for example the short-rate volatility of the Hull-White one-factor  lattice), which no market data shift can reach because a model option is configuration, not a  resolved market element. The shift is scoped to a model rule by the model's name, optionally  narrowed to one instrument type, and applies to every instrument that rule prices.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelName** | **String** | The pricing model whose options this shift targets, exactly as named on the recipe&#39;s model  rule, e.g. \&quot;HullWhite1F\&quot;. Only models with shiftable options are accepted; an unknown or  unsupported model name is rejected when the scenario is stored. | [default to String]
**instrumentType** | **String** | The instrument type narrowing which of the model&#39;s rules the shift applies to, matching the  instrument-type addressing of model rules in the recipe, e.g. \&quot;ComplexBond\&quot;. Omitted, the  shift applies to every instrument the named model prices. | [optional] [default to String]
**optionName** | **String** | The model option field the shift moves, e.g. \&quot;Volatility\&quot; or \&quot;MeanReversion\&quot; for  HullWhite1F. Only a whitelisted set of options per model is shiftable; an unknown option  name is rejected when the scenario is stored. | [default to String]
**ccy** | **String** | For options carrying per-currency overrides (e.g. HullWhite1F&#39;s VolatilityByCurrency): the  ISO currency code whose effective value the shift moves. The shifted entry starts from the  existing override for that currency, or from the scalar option where no override exists.  Omitted, the shift moves the scalar option and every per-currency override together, so the  effective value moves for every instrument regardless of which level supplies it. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by ShiftType: the option&#39;s own units for Absolute  (0.0010 on a volatility of 0.008 is ten basis points of annualised volatility), or a  fraction of the configured value for Relative (0.1 raises it by ten percent). | [optional] [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative. | [default to String]

```java
import com.finbourne.lusid.model.ModelOptionShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ModelName = "example ModelName";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
String OptionName = "example OptionName";
@jakarta.annotation.Nullable String Ccy = "example Ccy";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String ShiftType = "example ShiftType";


ModelOptionShiftDefinition modelOptionShiftDefinitionInstance = new ModelOptionShiftDefinition()
    .ModelName(ModelName)
    .InstrumentType(InstrumentType)
    .OptionName(OptionName)
    .Ccy(Ccy)
    .Amount(Amount)
    .ShiftType(ShiftType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
