# com.finbourne.lusid.model.FeeType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the fee type. | [default to String]
**description** | **String** | The description of the fee type. | [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the fee type to be created. | [default to List<ComponentTransaction>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FeeType;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String Description = "example Description";
List<ComponentTransaction> ComponentTransactions = new List<ComponentTransaction>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FeeType feeTypeInstance = new FeeType()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .ComponentTransactions(ComponentTransactions)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
