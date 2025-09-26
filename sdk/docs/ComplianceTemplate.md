# com.finbourne.lusid.model.ComplianceTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** | The description of the Compliance Template | [default to String]
**tags** | **List&lt;String&gt;** | Tags for a Compliance Template | [optional] [default to List<String>]
**variations** | [**List&lt;ComplianceTemplateVariation&gt;**](ComplianceTemplateVariation.md) | Variation details of a Compliance Template | [default to List<ComplianceTemplateVariation>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ComplianceTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Description = "example Description";
@jakarta.annotation.Nullable List<String> Tags = new List<String>();
List<ComplianceTemplateVariation> Variations = new List<ComplianceTemplateVariation>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ComplianceTemplate complianceTemplateInstance = new ComplianceTemplate()
    .Id(Id)
    .Description(Description)
    .Tags(Tags)
    .Variations(Variations)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
