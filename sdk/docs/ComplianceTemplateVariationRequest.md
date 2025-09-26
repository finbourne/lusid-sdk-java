# com.finbourne.lusid.model.ComplianceTemplateVariationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**outcomeDescription** | **String** |  | [optional] [default to String]
**referencedGroupLabel** | **String** |  | [optional] [default to String]
**steps** | [**List&lt;ComplianceStepRequest&gt;**](ComplianceStepRequest.md) |  | [default to List<ComplianceStepRequest>]

```java
import com.finbourne.lusid.model.ComplianceTemplateVariationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
String Description = "example Description";
@jakarta.annotation.Nullable String OutcomeDescription = "example OutcomeDescription";
@jakarta.annotation.Nullable String ReferencedGroupLabel = "example ReferencedGroupLabel";
List<ComplianceStepRequest> Steps = new List<ComplianceStepRequest>();


ComplianceTemplateVariationRequest complianceTemplateVariationRequestInstance = new ComplianceTemplateVariationRequest()
    .Label(Label)
    .Description(Description)
    .OutcomeDescription(OutcomeDescription)
    .ReferencedGroupLabel(ReferencedGroupLabel)
    .Steps(Steps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
