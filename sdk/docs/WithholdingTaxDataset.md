# com.finbourne.lusid.model.WithholdingTaxDataset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the relational dataset definition. | [default to String]
**code** | **String** | The code of the relational dataset definition. Together with the scope this uniquely identifies the definition. | [default to String]
**dimensions** | [**List&lt;SeriesIdentifierField&gt;**](SeriesIdentifierField.md) | The dimensions created on this dataset as series identifiers, as stored. The mandatory core is not returned here; read the full field schema from the relational dataset definition at Href. | [default to List<SeriesIdentifierField>]
**href** | [**URI**](URI.md) | The specific Uri of the relational dataset definition. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.WithholdingTaxDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
List<SeriesIdentifierField> Dimensions = new List<SeriesIdentifierField>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


WithholdingTaxDataset withholdingTaxDatasetInstance = new WithholdingTaxDataset()
    .Scope(Scope)
    .Code(Code)
    .Dimensions(Dimensions)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
