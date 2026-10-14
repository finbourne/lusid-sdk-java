# com.finbourne.lusid.model.EligibleCollateralSchedule
An eligible collateral schedule: the collateral a party may post under a margin arrangement and the valuation  percentage each class of collateral is accepted at.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** | A description of the Eligible Collateral Schedule. Optional. | [optional] [default to String]
**rows** | [**List&lt;EligibleCollateralRow&gt;**](EligibleCollateralRow.md) | The classes of collateral that may be posted, each with the valuation percentage it is accepted at. At least one and at most 200 rows. | [optional] [default to List<EligibleCollateralRow>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Eligible Collateral Schedule. Filterable. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.EligibleCollateralSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<EligibleCollateralRow> Rows = new List<EligibleCollateralRow>();
Version Version = new Version();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


EligibleCollateralSchedule eligibleCollateralScheduleInstance = new EligibleCollateralSchedule()
    .Href(Href)
    .Id(Id)
    .Description(Description)
    .Rows(Rows)
    .Version(Version)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
