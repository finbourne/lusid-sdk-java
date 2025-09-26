# com.finbourne.lusid.model.ReconciliationBreak
A reconciliation break

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**instrumentUid** | **String** | Unique instrument identifier | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Any other properties that comprise the Sub-Holding Key | [default to Map<String, PerpetualProperty>]
**leftUnits** | **java.math.BigDecimal** | Units from the left hand side | [default to java.math.BigDecimal]
**rightUnits** | **java.math.BigDecimal** | Units from the right hand side | [default to java.math.BigDecimal]
**differenceUnits** | **java.math.BigDecimal** | Difference in units | [default to java.math.BigDecimal]
**leftCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**rightCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**differenceCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**instrumentProperties** | [**List&lt;Property&gt;**](Property.md) | Additional features relating to the instrument | [default to List<Property>]

```java
import com.finbourne.lusid.model.ReconciliationBreak;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String InstrumentUid = "example InstrumentUid";
Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
java.math.BigDecimal LeftUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal RightUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal DifferenceUnits = new java.math.BigDecimal("100.00");
CurrencyAndAmount LeftCost = new CurrencyAndAmount();
CurrencyAndAmount RightCost = new CurrencyAndAmount();
CurrencyAndAmount DifferenceCost = new CurrencyAndAmount();
List<Property> InstrumentProperties = new List<Property>();


ReconciliationBreak reconciliationBreakInstance = new ReconciliationBreak()
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .SubHoldingKeys(SubHoldingKeys)
    .LeftUnits(LeftUnits)
    .RightUnits(RightUnits)
    .DifferenceUnits(DifferenceUnits)
    .LeftCost(LeftCost)
    .RightCost(RightCost)
    .DifferenceCost(DifferenceCost)
    .InstrumentProperties(InstrumentProperties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
