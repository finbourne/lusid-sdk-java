# com.finbourne.lusid.model.FundConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** | The name of the Fund. | [optional] [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**dealingFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the dealing. | [default to List<ComponentFilter>]
**pnlFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the PnL. | [default to List<ComponentFilter>]
**backOutFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the back outs. | [default to List<ComponentFilter>]
**externalFeeFilters** | [**List&lt;ExternalFeeComponentFilter&gt;**](ExternalFeeComponentFilter.md) | The set of filters used to decide which JE lines are used for inputting fees from an external source. | [optional] [default to List<ExternalFeeComponentFilter>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund Configuration. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.FundConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<ComponentFilter> DealingFilters = new List<ComponentFilter>();
List<ComponentFilter> PnlFilters = new List<ComponentFilter>();
List<ComponentFilter> BackOutFilters = new List<ComponentFilter>();
@jakarta.annotation.Nullable List<ExternalFeeComponentFilter> ExternalFeeFilters = new List<ExternalFeeComponentFilter>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


FundConfigurationRequest fundConfigurationRequestInstance = new FundConfigurationRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .DealingFilters(DealingFilters)
    .PnlFilters(PnlFilters)
    .BackOutFilters(BackOutFilters)
    .ExternalFeeFilters(ExternalFeeFilters)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
