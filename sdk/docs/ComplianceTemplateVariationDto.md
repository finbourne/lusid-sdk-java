# com.finbourne.lusid.model.ComplianceTemplateVariationDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**outcomeDescription** | **String** |  | [optional] [default to String]
**referencedGroupLabel** | **String** |  | [optional] [default to String]
**steps** | [**List&lt;ComplianceStep&gt;**](ComplianceStep.md) |  | [default to List<ComplianceStep>]

```java
import com.finbourne.lusid.model.ComplianceTemplateVariationDto;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
String Description = "example Description";
@jakarta.annotation.Nullable String OutcomeDescription = "example OutcomeDescription";
@jakarta.annotation.Nullable String ReferencedGroupLabel = "example ReferencedGroupLabel";
List<ComplianceStep> Steps = new List<ComplianceStep>();


ComplianceTemplateVariationDto complianceTemplateVariationDtoInstance = new ComplianceTemplateVariationDto()
    .Label(Label)
    .Description(Description)
    .OutcomeDescription(OutcomeDescription)
    .ReferencedGroupLabel(ReferencedGroupLabel)
    .Steps(Steps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
