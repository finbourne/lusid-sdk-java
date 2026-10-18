# com.finbourne.lusid.model.MarginCallKey
The parts that identify a margin call: its run and the call's business key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the call belongs to. | [default to String]
**agreementScope** | **String** | The scope of the call&#39;s collateral agreement. | [default to String]
**agreementCode** | **String** | The code of the call&#39;s collateral agreement. | [default to String]
**item** | **String** | The margin item of the call. | [default to String]
**marginType** | **String** | The margin type of the call. Currently VariationMargin. | [default to String]
**direction** | **String** | Who posts under the call: WePost, TheyPost or None. | [default to String]

```java
import com.finbourne.lusid.model.MarginCallKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
String AgreementScope = "example AgreementScope";
String AgreementCode = "example AgreementCode";
String Item = "example Item";
String MarginType = "example MarginType";
String Direction = "example Direction";


MarginCallKey marginCallKeyInstance = new MarginCallKey()
    .RunId(RunId)
    .AgreementScope(AgreementScope)
    .AgreementCode(AgreementCode)
    .Item(Item)
    .MarginType(MarginType)
    .Direction(Direction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
