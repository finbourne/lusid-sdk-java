# com.finbourne.lusid.model.MarginRunRequest
A request to value collateral agreements for a business date and publish their margin calls.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | **String** | The business date, datetime or cut label to value the agreements at. With an effectiveFrom, the last date of the span. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime to read agreements, portfolios and market data at. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**agreementFilter** | **String** | An expression selecting the collateral agreements to run, in the same syntax as listing collateral agreements. Every agreement the caller may calculate margin for is run if not specified. | [optional] [default to String]
**scenarios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The stored scenarios to value the agreements under, each as a what-if beside the base market, which the run always values. A scenario&#39;s calls are served beside the base calls only when asked for, and cannot be accepted, disputed or matched to a counterparty demand. At most 20. Only the base market is valued if not specified. | [optional] [default to List<ResourceId>]
**effectiveFrom** | **String** | The first business date, datetime or cut label of a span ending at effectiveAt. Each weekday from it to effectiveAt is valued as a run of its own, all at the same asAt, and a date after the asAt is a projection valued on the market as at the asAt that cannot be accepted, disputed or matched to a counterparty demand. At most 130 weekdays. Only effectiveAt is valued if not specified. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarginRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String AgreementFilter = "example AgreementFilter";
@jakarta.annotation.Nullable List<ResourceId> Scenarios = new List<ResourceId>();
@jakarta.annotation.Nullable String EffectiveFrom = "example EffectiveFrom";


MarginRunRequest marginRunRequestInstance = new MarginRunRequest()
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .AgreementFilter(AgreementFilter)
    .Scenarios(Scenarios)
    .EffectiveFrom(EffectiveFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
