# com.finbourne.lusid.model.MarketDataFieldConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataCategory** | **String** | The category of market data this configuration applies to. Available values: Quote, Complex. | [default to String]
**scope** | **String** | The scope of the market data field configuration. | [default to String]
**metadataFieldSchema** | [**List&lt;MetadataFieldDefinition&gt;**](MetadataFieldDefinition.md) | The metadata field definitions for this configuration. | [default to List<MetadataFieldDefinition>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.MarketDataFieldConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MarketDataCategory = "example MarketDataCategory";
String Scope = "example Scope";
List<MetadataFieldDefinition> MetadataFieldSchema = new List<MetadataFieldDefinition>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


MarketDataFieldConfiguration marketDataFieldConfigurationInstance = new MarketDataFieldConfiguration()
    .MarketDataCategory(MarketDataCategory)
    .Scope(Scope)
    .MetadataFieldSchema(MetadataFieldSchema)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
