# com.finbourne.lusid.model.UpdateComplianceTemplateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Compliance Template | [default to String]
**description** | **String** | The description of the Compliance Template | [default to String]
**variations** | [**List&lt;ComplianceTemplateVariationRequest&gt;**](ComplianceTemplateVariationRequest.md) | Variation details of a Compliance Template | [default to List<ComplianceTemplateVariationRequest>]

```java
import com.finbourne.lusid.model.UpdateComplianceTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Description = "example Description";
List<ComplianceTemplateVariationRequest> Variations = new List<ComplianceTemplateVariationRequest>();


UpdateComplianceTemplateRequest updateComplianceTemplateRequestInstance = new UpdateComplianceTemplateRequest()
    .Code(Code)
    .Description(Description)
    .Variations(Variations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
