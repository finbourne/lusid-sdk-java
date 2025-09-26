# com.finbourne.lusid.model.StructuredResultDataId
An identifier that uniquely describes an item of structured result data such as the risk to an interest curve or a set of yields or analytics on an index.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The platform or vendor that provided the structured result data, e.g. &#39;client&#39;. This is primarily of interest when data could have been sourced from multiple sources | [default to String]
**code** | **String** | The identifier for the entity that this id describes. It could be an index, instrument or other form of structured data | [optional] [default to String]
**effectiveAt** | **String** | The effectiveAt or cut label that this item of structured result data is/was updated/inserted with. | [optional] [default to String]
**resultType** | **String** | An identifier that denotes the class of data that the id points to. This is not the same as the format, but a more generic identifier such as &#39;risk result&#39;, &#39;cashflow&#39;, &#39;index&#39; or similar. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StructuredResultDataId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Source = "example Source";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable String ResultType = "example ResultType";


StructuredResultDataId structuredResultDataIdInstance = new StructuredResultDataId()
    .Source(Source)
    .Code(Code)
    .EffectiveAt(EffectiveAt)
    .ResultType(ResultType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
