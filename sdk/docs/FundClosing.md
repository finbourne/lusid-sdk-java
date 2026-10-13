# com.finbourne.lusid.model.FundClosing

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closingId** | **String** |  | [default to String]
**closingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**isFinal** | **Boolean** |  | [optional] [default to Boolean]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundClosing;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ClosingId = "example ClosingId";
OffsetDateTime ClosingDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Boolean IsFinal = true;
@jakarta.annotation.Nullable String Description = "example Description";


FundClosing fundClosingInstance = new FundClosing()
    .ClosingId(ClosingId)
    .ClosingDate(ClosingDate)
    .IsFinal(IsFinal)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
