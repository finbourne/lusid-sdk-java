# com.finbourne.lusid.model.FundConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the FundConfiguration. | [optional] [default to String]
**description** | **String** | A description for the FundConfiguration. | [optional] [default to String]
**dealingFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the dealing. | [optional] [default to List<ComponentFilter>]
**pnlFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the PnL. | [optional] [default to List<ComponentFilter>]
**backOutFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the back outs. | [optional] [default to List<ComponentFilter>]
**externalFeeFilters** | [**List&lt;ExternalFeeComponentFilter&gt;**](ExternalFeeComponentFilter.md) | The set of filters used to decide which JE lines are used for inputting fees from an external source. | [optional] [default to List<ExternalFeeComponentFilter>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund Configuration. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FundConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<ComponentFilter> DealingFilters = new List<ComponentFilter>();
@jakarta.annotation.Nullable List<ComponentFilter> PnlFilters = new List<ComponentFilter>();
@jakarta.annotation.Nullable List<ComponentFilter> BackOutFilters = new List<ComponentFilter>();
@jakarta.annotation.Nullable List<ExternalFeeComponentFilter> ExternalFeeFilters = new List<ExternalFeeComponentFilter>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FundConfiguration fundConfigurationInstance = new FundConfiguration()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .DealingFilters(DealingFilters)
    .PnlFilters(PnlFilters)
    .BackOutFilters(BackOutFilters)
    .ExternalFeeFilters(ExternalFeeFilters)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
