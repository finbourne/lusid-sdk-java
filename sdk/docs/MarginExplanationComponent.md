# com.finbourne.lusid.model.MarginExplanationComponent
One step in the working behind a margin figure: a value and, unless it is a leaf, the arithmetic over its  sub-components that gives it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the component within its explanation: its position in the tree as dot-separated indexes from the root, such as 0.1.3, the first index being the root&#39;s place among the explanation&#39;s components. | [default to String]
**component** | **String** | A stable name for what the component is, such as PvInBase. A component whose rows the caller may not read is named Redacted. | [default to String]
**displayName** | **String** | A human-readable name for the component. | [default to String]
**type** | **String** | How the component takes its value. One of DerivedProperty, PartialFormula, Variable or Literal. | [default to String]
**value** | **java.math.BigDecimal** | The figure the engine used for the component, as it was computed. Null where the component has none or, for a redacted component, where the rows it stands in for do not share a unit and currency. | [optional] [default to java.math.BigDecimal]
**unit** | **String** | What the value measures. One of Currency, Percentage, Factor, Units or Years. Null where the value is unitless. | [optional] [default to String]
**currency** | **String** | The currency of a Currency value when it is not the explanation&#39;s currency. | [optional] [default to String]
**derivationFormula** | **String** | Plain arithmetic over the sub-components that gives the component&#39;s value. Null for a component with no sub-components. | [optional] [default to String]
**subComponents** | [**List&lt;MarginExplanationComponent&gt;**](MarginExplanationComponent.md) | The components the derivation formula reads. Null for a component that cannot be broken down further. | [optional] [default to List<MarginExplanationComponent>]
**redacted** | **Boolean** | True for a component that stands in for the working of portfolios the caller may not read. The caller sees that those portfolios contributed and, when their rows share a unit and currency, their combined value, so that the parent still adds up to the figure; never which portfolios or holdings they were. Null otherwise. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.MarginExplanationComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Component = "example Component";
String DisplayName = "example DisplayName";
String Type = "example Type";
@jakarta.annotation.Nullable java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Unit = "example Unit";
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String DerivationFormula = "example DerivationFormula";
@jakarta.annotation.Nullable List<MarginExplanationComponent> SubComponents = new List<MarginExplanationComponent>();
@jakarta.annotation.Nullable Boolean Redacted = true;


MarginExplanationComponent marginExplanationComponentInstance = new MarginExplanationComponent()
    .Id(Id)
    .Component(Component)
    .DisplayName(DisplayName)
    .Type(Type)
    .Value(Value)
    .Unit(Unit)
    .Currency(Currency)
    .DerivationFormula(DerivationFormula)
    .SubComponents(SubComponents)
    .Redacted(Redacted);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
