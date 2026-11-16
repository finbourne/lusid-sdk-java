# com.finbourne.lusid.model.TaxReconciliationDifferenceRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**category** | **String** | The reconciliation category. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. | [optional] [default to String]
**comparedAmount** | **java.math.BigDecimal** | The amount on the side being reconciled from. | [optional] [default to java.math.BigDecimal]
**taxAmount** | **java.math.BigDecimal** | The amount on the tax side. | [optional] [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | The difference between the two sides. | [optional] [default to java.math.BigDecimal]
**explanation** | **String** | The explanation of the difference. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxReconciliationDifferenceRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String Category = "example Category";
java.math.BigDecimal ComparedAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal TaxAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal Difference = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Explanation = "example Explanation";


TaxReconciliationDifferenceRow taxReconciliationDifferenceRowInstance = new TaxReconciliationDifferenceRow()
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .Category(Category)
    .ComparedAmount(ComparedAmount)
    .TaxAmount(TaxAmount)
    .Difference(Difference)
    .Explanation(Explanation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
