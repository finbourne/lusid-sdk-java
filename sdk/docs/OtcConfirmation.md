# com.finbourne.lusid.model.OtcConfirmation
For the storage of any information pertinent to the confirmation of an OTC trade. e.g the Counterparty Agreement Code

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyAgreementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.OtcConfirmation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CounterpartyAgreementId = new ResourceId();


OtcConfirmation otcConfirmationInstance = new OtcConfirmation()
    .CounterpartyAgreementId(CounterpartyAgreementId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
