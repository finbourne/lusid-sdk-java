# com.finbourne.lusid.model.DerivedPropertyComponent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | The component of the formula which is being evaluated. | [optional] [default to String]
**displayName** | **String** | The display name of the component being evaluated. | [optional] [default to String]
**type** | **String** | The type of the formula component. This can be a Literal, Variable, DerivedProperty, or PartialFormula. | [optional] [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**derivationFormula** | **String** | The derivation formula of the component. This field will only be populated if the component is a derived property. | [optional] [default to String]
**subComponents** | [**List&lt;DerivedPropertyComponent&gt;**](DerivedPropertyComponent.md) | Any sub-components of this formula. If this formula cannot be further decomposed, this collection will be null. | [optional] [default to List<DerivedPropertyComponent>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DerivedPropertyComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Component = "example Component";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Type = "example Type";
PropertyValue Value = new PropertyValue();
@jakarta.annotation.Nullable String DerivationFormula = "example DerivationFormula";
@jakarta.annotation.Nullable List<DerivedPropertyComponent> SubComponents = new List<DerivedPropertyComponent>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DerivedPropertyComponent derivedPropertyComponentInstance = new DerivedPropertyComponent()
    .Component(Component)
    .DisplayName(DisplayName)
    .Type(Type)
    .Value(Value)
    .DerivationFormula(DerivationFormula)
    .SubComponents(SubComponents)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
