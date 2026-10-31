# com.finbourne.lusid.model.ExternalTransferAgencyOrderSource
The system that sent an external order set, and its own reference for the batch.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system** | **String** |  | [default to String]
**reference** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ExternalTransferAgencyOrderSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String System = "example System";
@jakarta.annotation.Nullable String Reference = "example Reference";


ExternalTransferAgencyOrderSource externalTransferAgencyOrderSourceInstance = new ExternalTransferAgencyOrderSource()
    .System(System)
    .Reference(Reference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
