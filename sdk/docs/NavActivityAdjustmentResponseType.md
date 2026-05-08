# com.finbourne.lusid.model.NavActivityAdjustmentResponseType
Discriminator for NavActivityAdjustmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NavActivityAdjustmentResponseType** | [**String**](.md) | **Discriminator for NavActivityAdjustmentResponse** | [default to String]

```java
import com.finbourne.lusid.model.NavActivityAdjustmentResponseType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of NavActivityAdjustmentResponseType:
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.PORTFOLIOTRANSACTIONADJUSTMENT;
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.PORTFOLIOSETTLEMENTINSTRUCTIONADJUSTMENT;
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.INSTRUMENTACTIVITYADJUSTMENT;
NavActivityAdjustmentResponseType method = NavActivityAdjustmentResponseType.QUOTEACTIVITYADJUSTMENT;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
