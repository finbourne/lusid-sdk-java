# com.finbourne.lusid.model.WeightedInstrument
Specification for a holding or quantity of (weight for) an instrument on a given date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | The quantity of the instrument that is owned. | [optional] [default to java.math.BigDecimal]
**holdingIdentifier** | **String** | Identifier for the instrument.  For a single, unique trade or transaction this can be thought of as equivalent to the transaction identifier, or  a composite of the sub-holding keys for a regular sub-holding. When there are multiple transactions sharing the same underlying instrument  such as purchase of shares on multiple dates where tax implications are different this would not be the case.    In an inlined aggregation request if this is wanted to identify a line item, it can be specified in the set of aggregation keys given on the aggregation  request that accompanies the set of weighted instruments. | [optional] [default to String]
**instrument** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**inLineLookupIdentifiers** | [**WeightedInstrumentInLineLookupIdentifiers**](WeightedInstrumentInLineLookupIdentifiers.md) |  | [optional] [default to WeightedInstrumentInLineLookupIdentifiers]
**instrumentScope** | **String** | The scope in which to resolve the instrument, if no inlined definition is provided.  If left empty, the default scope will be used. | [optional] [default to String]

```java
import com.finbourne.lusid.model.WeightedInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String HoldingIdentifier = "example HoldingIdentifier";
LusidInstrument Instrument = new LusidInstrument();
@jakarta.annotation.Nullable WeightedInstrumentInLineLookupIdentifiers InLineLookupIdentifiers = new WeightedInstrumentInLineLookupIdentifiers();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";


WeightedInstrument weightedInstrumentInstance = new WeightedInstrument()
    .Quantity(Quantity)
    .HoldingIdentifier(HoldingIdentifier)
    .Instrument(Instrument)
    .InLineLookupIdentifiers(InLineLookupIdentifiers)
    .InstrumentScope(InstrumentScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
