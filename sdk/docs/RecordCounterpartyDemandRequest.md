# com.finbourne.lusid.model.RecordCounterpartyDemandRequest
The counterparty's figure for a margin call, to match against ours.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The counterparty&#39;s figure for the call, signed as the call. | [default to java.math.BigDecimal]
**receivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the demand was received. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**statementReference** | **String** | A reference to the counterparty&#39;s statement, such as a Drive path. Optional. | [optional] [default to String]
**note** | **String** | A note to record with the demand. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecordCounterpartyDemandRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime ReceivedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String StatementReference = "example StatementReference";
@jakarta.annotation.Nullable String Note = "example Note";


RecordCounterpartyDemandRequest recordCounterpartyDemandRequestInstance = new RecordCounterpartyDemandRequest()
    .Amount(Amount)
    .ReceivedAt(ReceivedAt)
    .StatementReference(StatementReference)
    .Note(Note);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
