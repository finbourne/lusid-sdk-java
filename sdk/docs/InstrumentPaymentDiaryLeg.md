# com.finbourne.lusid.model.InstrumentPaymentDiaryLeg
A leg containing a set of cashflows.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legIndex** | **Integer** | Index (integer) for the leg of a payment diary. | [optional] [default to Integer]
**legId** | **String** | Identifier string for the leg of a payment diary. | [optional] [default to String]
**rows** | [**List&lt;InstrumentPaymentDiaryRow&gt;**](InstrumentPaymentDiaryRow.md) | List of individual cashflows within the payment diary. | [optional] [default to List<InstrumentPaymentDiaryRow>]

```java
import com.finbourne.lusid.model.InstrumentPaymentDiaryLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer LegIndex = new Integer("100.00");
@jakarta.annotation.Nullable String LegId = "example LegId";
@jakarta.annotation.Nullable List<InstrumentPaymentDiaryRow> Rows = new List<InstrumentPaymentDiaryRow>();


InstrumentPaymentDiaryLeg instrumentPaymentDiaryLegInstance = new InstrumentPaymentDiaryLeg()
    .LegIndex(LegIndex)
    .LegId(LegId)
    .Rows(Rows);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
