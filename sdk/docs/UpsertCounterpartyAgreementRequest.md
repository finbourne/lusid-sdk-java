# com.finbourne.lusid.model.UpsertCounterpartyAgreementRequest
Counterparty Agreement that is to be stored in the convention data store.  There must be only one of these present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyAgreement** | [**CounterpartyAgreement**](CounterpartyAgreement.md) |  | [default to CounterpartyAgreement]

```java
import com.finbourne.lusid.model.UpsertCounterpartyAgreementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CounterpartyAgreement CounterpartyAgreement = new CounterpartyAgreement();


UpsertCounterpartyAgreementRequest upsertCounterpartyAgreementRequestInstance = new UpsertCounterpartyAgreementRequest()
    .CounterpartyAgreement(CounterpartyAgreement);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
