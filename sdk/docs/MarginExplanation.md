# com.finbourne.lusid.model.MarginExplanation
How the margin figures of a call or a line were arrived at: the working behind each figure as a tree of components,  with the working of portfolios the caller may not read replaced by a redacted component.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The URI of this explanation. | [optional] [default to URI]
**runId** | **String** | The run whose figures are explained. | [default to String]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**item** | **String** | The margin item of the call explained or, for a line, of the line. | [optional] [default to String]
**marginType** | **String** | The margin type of the call explained. Null when a line is explained. | [optional] [default to String]
**direction** | **String** | Who posts under the call explained: WePost, TheyPost or None. Null when a line is explained. | [optional] [default to String]
**lineKey** | **String** | The key of the line explained. Null when a call is explained. | [optional] [default to String]
**currency** | **String** | The agreement&#39;s base currency, in which a component&#39;s value is expressed unless the component names another. | [default to String]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**components** | [**List&lt;MarginExplanationComponent&gt;**](MarginExplanationComponent.md) | The working behind each figure explained, one root component per figure: for a call its required amount, named InitialMarginRequired, and for a line each figure asked for that the run explained, named VariationMargin or InitialMargin. | [default to List<MarginExplanationComponent>]

```java
import com.finbourne.lusid.model.MarginExplanation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String RunId = "example RunId";
ResourceId AgreementId = new ResourceId();
@jakarta.annotation.Nullable String Item = "example Item";
@jakarta.annotation.Nullable String MarginType = "example MarginType";
@jakarta.annotation.Nullable String Direction = "example Direction";
@jakarta.annotation.Nullable String LineKey = "example LineKey";
String Currency = "example Currency";
ResourceId Scenario = new ResourceId();
List<MarginExplanationComponent> Components = new List<MarginExplanationComponent>();


MarginExplanation marginExplanationInstance = new MarginExplanation()
    .Href(Href)
    .RunId(RunId)
    .AgreementId(AgreementId)
    .Item(Item)
    .MarginType(MarginType)
    .Direction(Direction)
    .LineKey(LineKey)
    .Currency(Currency)
    .Scenario(Scenario)
    .Components(Components);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
