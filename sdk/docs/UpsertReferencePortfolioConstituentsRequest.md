# com.finbourne.lusid.model.UpsertReferencePortfolioConstituentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | **String** | The first date from which the weights will apply | [default to String]
**weightType** | **String** | The available values are: Static, Floating, Periodical | [default to String]
**periodType** | **String** | The available values are: Daily, Weekly, Monthly, Quarterly, Annually | [optional] [default to String]
**periodCount** | **Integer** |  | [optional] [default to Integer]
**constituents** | [**List&lt;ReferencePortfolioConstituentRequest&gt;**](ReferencePortfolioConstituentRequest.md) | Set of constituents (instrument/weight pairings) | [default to List<ReferencePortfolioConstituentRequest>]

```java
import com.finbourne.lusid.model.UpsertReferencePortfolioConstituentsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EffectiveFrom = "example EffectiveFrom";
String WeightType = "example WeightType";
@jakarta.annotation.Nullable String PeriodType = "example PeriodType";
@jakarta.annotation.Nullable Integer PeriodCount = new Integer("100.00");
List<ReferencePortfolioConstituentRequest> Constituents = new List<ReferencePortfolioConstituentRequest>();


UpsertReferencePortfolioConstituentsRequest upsertReferencePortfolioConstituentsRequestInstance = new UpsertReferencePortfolioConstituentsRequest()
    .EffectiveFrom(EffectiveFrom)
    .WeightType(WeightType)
    .PeriodType(PeriodType)
    .PeriodCount(PeriodCount)
    .Constituents(Constituents);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
