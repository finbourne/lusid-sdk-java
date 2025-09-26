# com.finbourne.lusid.model.GroupFilterStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the compliance step | [default to String]
**limitCheckParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for an absolute limit check | [default to List<ComplianceTemplateParameter>]

```java
import com.finbourne.lusid.model.GroupFilterStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
List<ComplianceTemplateParameter> LimitCheckParameters = new List<ComplianceTemplateParameter>();


GroupFilterStep groupFilterStepInstance = new GroupFilterStep()
    .Label(Label)
    .LimitCheckParameters(LimitCheckParameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
