# com.finbourne.lusid.model.EligibleCollateralScheduleRequest
The request used to create an Eligible Collateral Schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Eligible Collateral Schedule. | [default to String]
**description** | **String** | A description of the Eligible Collateral Schedule. Optional. | [optional] [default to String]
**rows** | [**List&lt;EligibleCollateralRowRequest&gt;**](EligibleCollateralRowRequest.md) | The classes of collateral that may be posted, each with the valuation percentage it is accepted at. At least one and at most 200 rows. | [default to List<EligibleCollateralRowRequest>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Eligible Collateral Schedule. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Eligible Collateral Schedule applies. Defaults to the beginning of time if not specified, so that the schedule is visible at every effective datetime. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.EligibleCollateralScheduleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
List<EligibleCollateralRowRequest> Rows = new List<EligibleCollateralRowRequest>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();


EligibleCollateralScheduleRequest eligibleCollateralScheduleRequestInstance = new EligibleCollateralScheduleRequest()
    .Code(Code)
    .Description(Description)
    .Rows(Rows)
    .Properties(Properties)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
