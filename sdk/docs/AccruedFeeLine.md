# com.finbourne.lusid.model.AccruedFeeLine
A management fee accrued to one partner that the run left to its accrual rather than pooling.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The partner the fee was accrued to, when the accrual names one. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The fee accrued to the partner, as the journal debits it. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AccruedFeeLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


AccruedFeeLine accruedFeeLineInstance = new AccruedFeeLine()
    .InvestorRecordId(InvestorRecordId)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
