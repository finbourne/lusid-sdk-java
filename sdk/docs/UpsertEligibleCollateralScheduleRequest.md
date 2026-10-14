# com.finbourne.lusid.model.UpsertEligibleCollateralScheduleRequest
The request used to create or replace the definition of an Eligible Collateral Schedule from an effective date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the Eligible Collateral Schedule. Optional. | [optional] [default to String]
**rows** | [**List&lt;EligibleCollateralRowRequest&gt;**](EligibleCollateralRowRequest.md) | The classes of collateral that may be posted, each with the valuation percentage it is accepted at. At least one and at most 200 rows. | [default to List<EligibleCollateralRowRequest>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Eligible Collateral Schedule. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime or cut label from which the change applies. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.UpsertEligibleCollateralScheduleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Description = "example Description";
List<EligibleCollateralRowRequest> Rows = new List<EligibleCollateralRowRequest>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();


UpsertEligibleCollateralScheduleRequest upsertEligibleCollateralScheduleRequestInstance = new UpsertEligibleCollateralScheduleRequest()
    .Description(Description)
    .Rows(Rows)
    .Properties(Properties)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
