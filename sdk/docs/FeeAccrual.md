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
**isPayableDate** | **Boolean** | Whether the valuation point&#39;s window, from the day after the previous valuation point to this one, holds one of the fee&#39;s payable dates, set by its PayableFrequency and AnchorDate and rolled by its BusinessDayConvention. | [optional] [default to Boolean]
**payableDate** | [**OffsetDateTime**](OffsetDateTime.md) | The latest payable date of the fee in the valuation point&#39;s window, after business day adjustment. Null when the window holds no payable date. | [optional] [default to OffsetDateTime]
**payableAmount** | **java.math.BigDecimal** | The accrued balance that became payable at this valuation point: the previous valuation point&#39;s AccruedBalance plus the accrual through the end of the PayableDate, less what the fund&#39;s own transactions tagged with the fee&#39;s code in a Transaction/&lt;fund scope&gt;/FeeCode property deemed payable on or before it. Several payable dates in one window give one combined payable. Never negative: zero when the window holds no payable date, or when the balance due is not positive, as when tagged transactions already deemed more than was due. A share class&#39;s PayableAmount is its share of the fund&#39;s, apportioned by each class&#39;s balance due before deems, so the classes&#39; add up to the fund&#39;s. | [optional] [default to java.math.BigDecimal]
**accruedBalance** | **java.math.BigDecimal** | The amount accrued and not yet payable. It resets on a payable date, unlike TotalAccrual, and the total consideration of each of the fund&#39;s transactions in the valuation point&#39;s window tagged with the fee&#39;s code in a Transaction/&lt;fund scope&gt;/FeeCode property comes off it. A negative balance, from deeming more than was due, nets off later accruals before anything is payable again, as a prepaid fee does. | [optional] [default to java.math.BigDecimal]
**previousAccruedBalance** | **java.math.BigDecimal** | The previous valuation point&#39;s AccruedBalance. | [optional] [default to java.math.BigDecimal]
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
Boolean IsPayableDate = true;
@jakarta.annotation.Nullable OffsetDateTime PayableDate = OffsetDateTime.now();
java.math.BigDecimal PayableAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal AccruedBalance = new java.math.BigDecimal("100.00");
java.math.BigDecimal PreviousAccruedBalance = new java.math.BigDecimal("100.00");
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
    .IsPayableDate(IsPayableDate)
    .PayableDate(PayableDate)
    .PayableAmount(PayableAmount)
    .AccruedBalance(AccruedBalance)
    .PreviousAccruedBalance(PreviousAccruedBalance)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
