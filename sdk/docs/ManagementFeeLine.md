# com.finbourne.lusid.model.ManagementFeeLine
One partner's management fee for the period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the fee belongs to. | [default to String]
**basisAmount** | **java.math.BigDecimal** | The capital the fee was charged on. | [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** | The annual fee rate applied. | [default to java.math.BigDecimal]
**dayCountFraction** | **java.math.BigDecimal** | The fraction of a year the period covers, on an ACT/365 basis. | [default to java.math.BigDecimal]
**gross** | **java.math.BigDecimal** | The fee before offsets. | [default to java.math.BigDecimal]
**offset** | **java.math.BigDecimal** | The offset applied to the fee. | [default to java.math.BigDecimal]
**net** | **java.math.BigDecimal** | The fee after offsets. | [default to java.math.BigDecimal]
**carriedForward** | **java.math.BigDecimal** | Offset in excess of the fee, carried forward to the next period. | [default to java.math.BigDecimal]
**waived** | **Boolean** | Whether the partner is fee-exempt and the fee was waived. | [default to Boolean]

```java
import com.finbourne.lusid.model.ManagementFeeLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal BasisAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
java.math.BigDecimal DayCountFraction = new java.math.BigDecimal("100.00");
java.math.BigDecimal Gross = new java.math.BigDecimal("100.00");
java.math.BigDecimal Offset = new java.math.BigDecimal("100.00");
java.math.BigDecimal Net = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarriedForward = new java.math.BigDecimal("100.00");
Boolean Waived = true;


ManagementFeeLine managementFeeLineInstance = new ManagementFeeLine()
    .InvestorRecordId(InvestorRecordId)
    .BasisAmount(BasisAmount)
    .Rate(Rate)
    .DayCountFraction(DayCountFraction)
    .Gross(Gross)
    .Offset(Offset)
    .Net(Net)
    .CarriedForward(CarriedForward)
    .Waived(Waived);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
