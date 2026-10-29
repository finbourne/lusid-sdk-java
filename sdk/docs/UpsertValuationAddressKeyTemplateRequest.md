# com.finbourne.lusid.model.UpsertValuationAddressKeyTemplateRequest
The content of a Valuation Template. An upsert replaces the display name, description and metrics.  If isDefault is not specified, the template keeps its current default flag.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Valuation Template. | [default to String]
**description** | **String** | A description of the Valuation Template. | [optional] [default to String]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) | The metrics to calculate in a valuation that uses this template. Each metric is an address key, an operation and optional key options. Valuation Templates do not support returnAs. | [default to List<AggregateSpec>]
**isDefault** | **Boolean** | Set to true to make this template the domain default. The previous default stops being the default. Set to false on the current default to use the system default again. If not specified, the template keeps its current value. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.UpsertValuationAddressKeyTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<AggregateSpec> Metrics = new List<AggregateSpec>();
@jakarta.annotation.Nullable Boolean IsDefault = true;


UpsertValuationAddressKeyTemplateRequest upsertValuationAddressKeyTemplateRequestInstance = new UpsertValuationAddressKeyTemplateRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Metrics(Metrics)
    .IsDefault(IsDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
