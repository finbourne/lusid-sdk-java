# com.finbourne.lusid.model.AllocationGroupDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classes** | [**List&lt;AllocationGroupClassDefinition&gt;**](AllocationGroupClassDefinition.md) | An optional list of share classes that belong to this group. Each entry must reference a ShareClass already present on the Fund. You can provide this or the Formula, but not both. | [optional] [default to List<AllocationGroupClassDefinition>]
**code** | **String** | The unique code for the Allocation Group. Must be unique within the Fund. | [default to String]
**name** | **String** | The display name of the Allocation Group. | [default to String]
**description** | **String** | An optional description for the Allocation Group. | [optional] [default to String]
**shareClassShortCode** | **String** | The short code that identifies the Allocation Group. | [default to String]
**apportionmentMethodProperty** | [**AllocationMethodProperty**](AllocationMethodProperty.md) |  | [optional] [default to AllocationMethodProperty]
**formula** | **String** | An optional filter expression used to define which classes belong to this group, based on fund grouping criteria. You can provide this or the Classes, but not both. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationGroupDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AllocationGroupClassDefinition> Classes = new List<AllocationGroupClassDefinition>();
String Code = "example Code";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
String ShareClassShortCode = "example ShareClassShortCode";
AllocationMethodProperty ApportionmentMethodProperty = new AllocationMethodProperty();
@jakarta.annotation.Nullable String Formula = "example Formula";


AllocationGroupDefinition allocationGroupDefinitionInstance = new AllocationGroupDefinition()
    .Classes(Classes)
    .Code(Code)
    .Name(Name)
    .Description(Description)
    .ShareClassShortCode(ShareClassShortCode)
    .ApportionmentMethodProperty(ApportionmentMethodProperty)
    .Formula(Formula);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
