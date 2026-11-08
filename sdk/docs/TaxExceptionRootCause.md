# com.finbourne.lusid.model.TaxExceptionRootCause

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | A stable code for the cause, for example PoolOutOfSync or MissingTreatmentLeaf. | [default to String]
**label** | **String** | A display label for the cause. | [default to String]

```java
import com.finbourne.lusid.model.TaxExceptionRootCause;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Label = "example Label";


TaxExceptionRootCause taxExceptionRootCauseInstance = new TaxExceptionRootCause()
    .Code(Code)
    .Label(Label);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
