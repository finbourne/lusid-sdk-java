# com.finbourne.lusid.model.CreatePortfolioGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code that the portfolio group will be created with. Together with the scope this uniquely identifies the portfolio group. | [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio group was created. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The resource identifiers of the portfolios to be contained within the portfolio group. | [optional] [default to List<ResourceId>]
**subGroups** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The resource identifiers of the portfolio groups to be contained within the portfolio group as sub groups. | [optional] [default to List<ResourceId>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique group properties to add to the portfolio group. Each property must be from the &#39;PortfolioGroup&#39; domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. &#39;PortfolioGroup/Manager/Id&#39;. These properties must be pre-defined. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | A long form description of the portfolio group. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreatePortfolioGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable OffsetDateTime Created = OffsetDateTime.now();
@jakarta.annotation.Nullable List<ResourceId> Values = new List<ResourceId>();
@jakarta.annotation.Nullable List<ResourceId> SubGroups = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


CreatePortfolioGroupRequest createPortfolioGroupRequestInstance = new CreatePortfolioGroupRequest()
    .Code(Code)
    .Created(Created)
    .Values(Values)
    .SubGroups(SubGroups)
    .Properties(Properties)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
