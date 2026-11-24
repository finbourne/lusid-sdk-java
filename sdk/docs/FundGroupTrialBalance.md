# com.finbourne.lusid.model.FundGroupTrialBalance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCode** | **String** | The code of the NAV type the row, or result, was produced for. | [optional] [default to String]
**diaryEntryCode** | **String** | The code of the valuation point the row was produced for. | [optional] [default to String]
**valuationPointStatus** | **String** | The status of the valuation point the row was produced for, such as Final or Estimate. | [optional] [default to String]
**effectiveEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The effective end date of the valuation point the row was produced for. | [optional] [default to OffsetDateTime]
**trialBalance** | [**TrialBalance**](TrialBalance.md) |  | [optional] [default to TrialBalance]

```java
import com.finbourne.lusid.model.FundGroupTrialBalance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
@jakarta.annotation.Nullable String DiaryEntryCode = "example DiaryEntryCode";
@jakarta.annotation.Nullable String ValuationPointStatus = "example ValuationPointStatus";
OffsetDateTime EffectiveEnd = OffsetDateTime.now();
TrialBalance TrialBalance = new TrialBalance();


FundGroupTrialBalance fundGroupTrialBalanceInstance = new FundGroupTrialBalance()
    .FundId(FundId)
    .NavTypeCode(NavTypeCode)
    .DiaryEntryCode(DiaryEntryCode)
    .ValuationPointStatus(ValuationPointStatus)
    .EffectiveEnd(EffectiveEnd)
    .TrialBalance(TrialBalance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
