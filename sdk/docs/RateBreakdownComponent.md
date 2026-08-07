# com.finbourne.lusid.model.RateBreakdownComponent
A tax-characterised payout line within a CashElection on a CashDividendEvent.  Each line carries a rate-type classifier and a per-unit amount in the parent election's currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rateType** | **String** | Free-string distribution rate-type code (e.g. UNFR, FLFR, PID). | [default to String]
**dividendRate** | **java.math.BigDecimal** | Per-unit amount for this line, in the parent election&#39;s dividend currency. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RateBreakdownComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RateType = "example RateType";
java.math.BigDecimal DividendRate = new java.math.BigDecimal("100.00");


RateBreakdownComponent rateBreakdownComponentInstance = new RateBreakdownComponent()
    .RateType(RateType)
    .DividendRate(DividendRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
