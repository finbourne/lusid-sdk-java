# com.finbourne.lusid.model.PercentCheckStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the compliance step | [default to String]
**limitCheckParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for an absolute limit check | [default to List<ComplianceTemplateParameter>]
**warningCheckParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for a warning limit check | [default to List<ComplianceTemplateParameter>]

```java
import com.finbourne.lusid.model.PercentCheckStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
List<ComplianceTemplateParameter> LimitCheckParameters = new List<ComplianceTemplateParameter>();
List<ComplianceTemplateParameter> WarningCheckParameters = new List<ComplianceTemplateParameter>();


PercentCheckStep percentCheckStepInstance = new PercentCheckStep()
    .Label(Label)
    .LimitCheckParameters(LimitCheckParameters)
    .WarningCheckParameters(WarningCheckParameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
