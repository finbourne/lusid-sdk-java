# com.finbourne.lusid.model.SetShareClassInstrumentsRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. | [default to List<InstrumentResolutionDetail>]

```java
import com.finbourne.lusid.model.SetShareClassInstrumentsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> ShareClassInstrumentScopes = new List<String>();
List<InstrumentResolutionDetail> ShareClassInstruments = new List<InstrumentResolutionDetail>();


SetShareClassInstrumentsRequest setShareClassInstrumentsRequestInstance = new SetShareClassInstrumentsRequest()
    .ShareClassInstrumentScopes(ShareClassInstrumentScopes)
    .ShareClassInstruments(ShareClassInstruments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
