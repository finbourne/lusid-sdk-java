# com.finbourne.lusid.model.MarginRunRequest
A request to value collateral agreements for a business date and publish their margin calls.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | **String** | The business date, datetime or cut label to value the agreements at. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime to read agreements, portfolios and market data at. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**agreementFilter** | **String** | An expression selecting the collateral agreements to run, in the same syntax as listing collateral agreements. Every agreement the caller may calculate margin for is run if not specified. | [optional] [default to String]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.MarginRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String AgreementFilter = "example AgreementFilter";
ResourceId Scenario = new ResourceId();


MarginRunRequest marginRunRequestInstance = new MarginRunRequest()
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .AgreementFilter(AgreementFilter)
    .Scenario(Scenario);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
