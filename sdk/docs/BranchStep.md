# com.finbourne.lusid.model.BranchStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the compliance step | [default to String]
**parameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for the step | [default to List<ComplianceTemplateParameter>]

```java
import com.finbourne.lusid.model.BranchStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
List<ComplianceTemplateParameter> Parameters = new List<ComplianceTemplateParameter>();


BranchStep branchStepInstance = new BranchStep()
    .Label(Label)
    .Parameters(Parameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
