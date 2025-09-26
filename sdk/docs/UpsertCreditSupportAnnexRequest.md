# com.finbourne.lusid.model.UpsertCreditSupportAnnexRequest
Credit Support Annex information. The interaction in terms of margining requirements between a set of trades for a given counterparty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creditSupportAnnex** | [**CreditSupportAnnex**](CreditSupportAnnex.md) |  | [optional] [default to CreditSupportAnnex]

```java
import com.finbourne.lusid.model.UpsertCreditSupportAnnexRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CreditSupportAnnex CreditSupportAnnex = new CreditSupportAnnex();


UpsertCreditSupportAnnexRequest upsertCreditSupportAnnexRequestInstance = new UpsertCreditSupportAnnexRequest()
    .CreditSupportAnnex(CreditSupportAnnex);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
