# com.finbourne.lusid.model.ManagementFeeOffset
A fee income the manager has earned elsewhere that offsets the management fee.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceRef** | **String** | A reference to the fee income being offset. | [default to String]
**amount** | **java.math.BigDecimal** | The amount of fee income received. | [default to java.math.BigDecimal]
**offsetPercentage** | **java.math.BigDecimal** | The fraction of the fee income that offsets the management fee, between 0 and 1. | [default to java.math.BigDecimal]
**deal** | **String** | For a deal-linked offset, the deal the fee income relates to. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ManagementFeeOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SourceRef = "example SourceRef";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal OffsetPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Deal = "example Deal";


ManagementFeeOffset managementFeeOffsetInstance = new ManagementFeeOffset()
    .SourceRef(SourceRef)
    .Amount(Amount)
    .OffsetPercentage(OffsetPercentage)
    .Deal(Deal);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
