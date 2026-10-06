# com.finbourne.lusid.model.RevertValuationPointResponse
A Valuation Point reverted to Estimate, with all of its variants. Any variant that finalising the Valuation Point  had rejected is brought back as an Estimate by the revert, and is reported here alongside it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**valuationPointCode** | **String** | The code of the Valuation Point. | [optional] [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [optional] [default to String]
**status** | **String** | The status of the Valuation Point. Available values: Undefined, Estimate, Final, Candidate, Rejected, Unofficial. | [default to String]
**applyClearDown** | **Boolean** | Indicates whether a clear down was applied when the Valuation Point was created. | [optional] [default to Boolean]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Valuation Point. | [default to OffsetDateTime]
**previous** | [**PreviousValuationPoint**](PreviousValuationPoint.md) |  | [optional] [default to PreviousValuationPoint]
**variants** | [**List&lt;EstimateVariant&gt;**](EstimateVariant.md) | The variants of the Estimate Valuation Point.  | [optional] [default to List<EstimateVariant>]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RevertValuationPointResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String ValuationPointCode = "example ValuationPointCode";
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
String Status = "example Status";
Boolean ApplyClearDown = true;
OffsetDateTime EffectiveAt = OffsetDateTime.now();
PreviousValuationPoint Previous = new PreviousValuationPoint();
@jakarta.annotation.Nullable List<EstimateVariant> Variants = new List<EstimateVariant>();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RevertValuationPointResponse revertValuationPointResponseInstance = new RevertValuationPointResponse()
    .Href(Href)
    .ValuationPointCode(ValuationPointCode)
    .NavTypeCode(NavTypeCode)
    .Status(Status)
    .ApplyClearDown(ApplyClearDown)
    .EffectiveAt(EffectiveAt)
    .Previous(Previous)
    .Variants(Variants)
    .StagedModifications(StagedModifications)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
