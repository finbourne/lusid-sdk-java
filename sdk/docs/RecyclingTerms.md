# com.finbourne.lusid.model.RecyclingTerms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  | [default to Boolean]
**capPercentageOfCommitments** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**recyclingEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecyclingTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Enabled = true;
@jakarta.annotation.Nullable java.math.BigDecimal CapPercentageOfCommitments = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RecyclingEndDate = OffsetDateTime.now();


RecyclingTerms recyclingTermsInstance = new RecyclingTerms()
    .Enabled(Enabled)
    .CapPercentageOfCommitments(CapPercentageOfCommitments)
    .RecyclingEndDate(RecyclingEndDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
