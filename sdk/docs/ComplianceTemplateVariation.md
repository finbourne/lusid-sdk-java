# com.finbourne.lusid.model.ComplianceTemplateVariation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | Label of a Compliance Template Variation | [default to String]
**description** | **String** | The description of the Compliance Template Variation | [default to String]
**requiredParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | A parameter required by a Compliance Template Variation | [default to List<ComplianceTemplateParameter>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties associated with the Compliance Template Variation | [default to Map<String, PerpetualProperty>]
**acceptedAddressKeys** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**steps** | [**List&lt;ComplianceStep&gt;**](ComplianceStep.md) | The steps expressed in this template, with their required parameters | [default to List<ComplianceStep>]
**referencedGroupLabel** | **String** | The label of a given referenced group in a Compliance Rule Template Variation | [optional] [default to String]

```java
import com.finbourne.lusid.model.ComplianceTemplateVariation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
String Description = "example Description";
List<ComplianceTemplateParameter> RequiredParameters = new List<ComplianceTemplateParameter>();
Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
ResourceId AcceptedAddressKeys = new ResourceId();
List<ComplianceStep> Steps = new List<ComplianceStep>();
@jakarta.annotation.Nullable String ReferencedGroupLabel = "example ReferencedGroupLabel";


ComplianceTemplateVariation complianceTemplateVariationInstance = new ComplianceTemplateVariation()
    .Label(Label)
    .Description(Description)
    .RequiredParameters(RequiredParameters)
    .Properties(Properties)
    .AcceptedAddressKeys(AcceptedAddressKeys)
    .Steps(Steps)
    .ReferencedGroupLabel(ReferencedGroupLabel);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
