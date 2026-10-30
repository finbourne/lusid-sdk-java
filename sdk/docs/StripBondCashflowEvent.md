# com.finbourne.lusid.model.StripBondCashflowEvent
A StripBond's receipt of one (payment date, ex date) pair of its parent's flows: the coupons of an  interest-only strip, the principal paydowns of a principal-only one. The cash per unit of original face is the  parent's amount over its initial notional. The booking splits that cash into income and return of capital by  the strip's effective yield. The three outputs the split needs, effectiveYield, accountingChoice and isFinal,  are filled from the recipe's StripBondModelOptions and the market when omitted, and a supplied value wins for  each. A posted event under the generated id replaces the generated one.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The parent flow&#39;s ex-date, the record-date boundary: a lot settled on or after it is not entitled. Required. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date. Required. | [optional] [default to OffsetDateTime]
**currency** | **String** | The parent&#39;s payment currency. Required. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The strip&#39;s cash per unit of original face on this date: the summed parent amount divided by the parent&#39;s  initial notional. Required. | [default to java.math.BigDecimal]
**paymentsPerYear** | **Integer** | The parent&#39;s payments per year, 12 for a monthly parent. The nominal annual yield over this is the  periodic yield a receipt is split on. Required. | [default to Integer]
**effectiveYield** | **java.math.BigDecimal** | The nominal annual yield applied, as a decimal (0.23646524 for 23.646524%). Optional: filled from the  accounting choice when omitted, 0 under CostRecovery, the strip&#39;s EffectiveYield quote at the ex-date under  QuotedYield, left empty under CashAsReceived, which uses no yield. A supplied value wins. | [optional] [default to java.math.BigDecimal]
**accountingChoice** | **String** | The accounting choice the split uses. Optional: filled from the recipe&#39;s StripBondModelOptions when omitted,  CostRecovery when there are none. A supplied value wins.     Supported string (enumeration) values are: [CostRecovery, QuotedYield, CashAsReceived]. Available values: CostRecovery, QuotedYield, CashAsReceived. | [optional] [default to String]
**isFinal** | **Boolean** | Whether the parent&#39;s notional after this payment is zero, so this is the strip&#39;s last payment and the  position closes. Optional: filled from the parent&#39;s populated pool factor at the payment date when omitted,  or its maturity for a parent without one. A supplied value wins. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.StripBondCashflowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");
Integer PaymentsPerYear = new Integer("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal EffectiveYield = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String AccountingChoice = "example AccountingChoice";
@jakarta.annotation.Nullable Boolean IsFinal = true;


StripBondCashflowEvent stripBondCashflowEventInstance = new StripBondCashflowEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CashFlowPerUnit(CashFlowPerUnit)
    .PaymentsPerYear(PaymentsPerYear)
    .EffectiveYield(EffectiveYield)
    .AccountingChoice(AccountingChoice)
    .IsFinal(IsFinal);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
