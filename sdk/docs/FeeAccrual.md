# com.finbourne.lusid.model.FeeAccrual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date for which the fee accrual has been calculated. | [default to OffsetDateTime]
**code** | **String** | The code of the fee for which the accrual has been calculated. | [default to String]
**name** | **String** | The name of the fee for which the accrual has been calculated. | [default to String]
**calculationBase** | **java.math.BigDecimal** | The basis the annual accrual derives from: the result of evaluating the fee&#39;s calculation base expression, or the configured annual amount for a fixed-amount fee. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The result of applying the fee to the calculation base, and scaled down to a day. | [optional] [default to java.math.BigDecimal]
**previousAccrual** | **java.math.BigDecimal** | The previous valuation point&#39;s total accrual. | [optional] [default to java.math.BigDecimal]
**previousTotalAccrual** | **java.math.BigDecimal** | The previous valuation point&#39;s total accrual. | [optional] [default to java.math.BigDecimal]
**totalAccrual** | **java.math.BigDecimal** | The sum of the PreviousAccrual and Amount. | [optional] [default to java.math.BigDecimal]
**capPeriodAccrual** | **java.math.BigDecimal** | The amount accrued so far in the current fee year (from the fee&#39;s AnchorDate), in the fund currency, against which an annual FeeCap is assessed. | [optional] [default to java.math.BigDecimal]
**feeCapApplied** | **Boolean** | Whether the FeeCap reduced the amount accrued at this valuation point. | [optional] [default to Boolean]
**feeFloorApplied** | **Boolean** | Whether the FeeFloor raised the amount accrued at this valuation point. | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FeeAccrual;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
String Code = "example Code";
String Name = "example Name";
java.math.BigDecimal CalculationBase = new java.math.BigDecimal("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal PreviousAccrual = new java.math.BigDecimal("100.00");
java.math.BigDecimal PreviousTotalAccrual = new java.math.BigDecimal("100.00");
java.math.BigDecimal TotalAccrual = new java.math.BigDecimal("100.00");
java.math.BigDecimal CapPeriodAccrual = new java.math.BigDecimal("100.00");
Boolean FeeCapApplied = true;
Boolean FeeFloorApplied = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FeeAccrual feeAccrualInstance = new FeeAccrual()
    .EffectiveAt(EffectiveAt)
    .Code(Code)
    .Name(Name)
    .CalculationBase(CalculationBase)
    .Amount(Amount)
    .PreviousAccrual(PreviousAccrual)
    .PreviousTotalAccrual(PreviousTotalAccrual)
    .TotalAccrual(TotalAccrual)
    .CapPeriodAccrual(CapPeriodAccrual)
    .FeeCapApplied(FeeCapApplied)
    .FeeFloorApplied(FeeFloorApplied)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
