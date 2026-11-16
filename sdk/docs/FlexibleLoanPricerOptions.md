# com.finbourne.lusid.model.FlexibleLoanPricerOptions
Model options for instruments of type flexibleDeposit and flexibleLoan when used on a standalone basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setCleanPVToZero** | **Boolean** | If set to true the CleanPV will be set to zero in valuations and PV will effectively just be the Accrual. | [default to Boolean]
**usePriceQuoteForCleanPV** | **Boolean** | If set to true the CleanPV calculation will be looking for a price quote (no default price is assumed). CleanPV will be calculated as Holding/Balance docker-compose.yml Dockerfile Dockerfile.cicd docs generate justfile LICENSE.md publish README.md resources test_sdk priceQuote / quoteScaleFactor | [optional] [default to Boolean]
**excludeIncomeFromPV** | **Boolean** | Read by a TotalReturnSwap whose asset leg has a ResetSchedule and whose underlying pays interest or coupons. If set to true the swap&#39;s PV leaves out the underlying&#39;s interest and coupon payments and adds the interest accrued on them to the valuation date instead, so CleanPV is the price return and PV is CleanPV + Accrued. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FlexibleLoanPricerOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean SetCleanPVToZero = true;
@jakarta.annotation.Nullable Boolean UsePriceQuoteForCleanPV = true;
@jakarta.annotation.Nullable Boolean ExcludeIncomeFromPV = true;


FlexibleLoanPricerOptions flexibleLoanPricerOptionsInstance = new FlexibleLoanPricerOptions()
    .SetCleanPVToZero(SetCleanPVToZero)
    .UsePriceQuoteForCleanPV(UsePriceQuoteForCleanPV)
    .ExcludeIncomeFromPV(ExcludeIncomeFromPV);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
