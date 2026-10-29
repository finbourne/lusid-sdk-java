# com.finbourne.lusid.model.ValuationAddressKeyTemplate
A set of valuation metrics and grouping keys. Funds and NAV Types reference a template by its id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Valuation Template. | [optional] [default to String]
**description** | **String** | A description of the Valuation Template. | [optional] [default to String]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) | The metrics to calculate in a valuation that uses this template. Each metric is an address key, an operation and optional key options. Valuation Templates do not support returnAs. | [optional] [default to List<AggregateSpec>]
**isDefault** | **Boolean** | True if this is the default Valuation Template, which applies when neither the Fund nor the NAV Type references a template. A domain has one default. Set isDefault on UpsertValuationAddressKeyTemplate to change it. | [optional] [default to Boolean]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ValuationAddressKeyTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<AggregateSpec> Metrics = new List<AggregateSpec>();
Boolean IsDefault = true;
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ValuationAddressKeyTemplate valuationAddressKeyTemplateInstance = new ValuationAddressKeyTemplate()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Metrics(Metrics)
    .IsDefault(IsDefault)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
