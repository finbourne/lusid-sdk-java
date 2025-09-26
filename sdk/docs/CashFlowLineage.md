# com.finbourne.lusid.model.CashFlowLineage
Lineage for cash flow value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | The instrument type of the instrument to which the cash flow belongs to. When upserting CashFlowValues, this  should be null. | [optional] [default to String]
**cashFlowType** | **String** | The cashflow type.When upserting CashFlowValues, this should be null, or one of [Unknown, Coupon, Notional,  Premium, Principal, Protection, Cash] | [optional] [default to String]
**instrumentId** | **String** | The LUID of the instrument to which the cash flow belongs to. When upserting this should be null. | [optional] [default to String]
**legId** | **String** | The leg id to which the cash flow belongs to. | [optional] [default to String]
**sourceTransactionId** | **String** | The source transaction of the instrument to which the cash flow belongs to. When upserting this should be null | [optional] [default to String]
**payReceive** | **String** | Does the cash flow belong to the Pay or Receive leg. When upserting this should either be null or one of [Pay, Receive, NotApplicable] | [optional] [default to String]

```java
import com.finbourne.lusid.model.CashFlowLineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String CashFlowType = "example CashFlowType";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String LegId = "example LegId";
@jakarta.annotation.Nullable String SourceTransactionId = "example SourceTransactionId";
@jakarta.annotation.Nullable String PayReceive = "example PayReceive";


CashFlowLineage cashFlowLineageInstance = new CashFlowLineage()
    .InstrumentType(InstrumentType)
    .CashFlowType(CashFlowType)
    .InstrumentId(InstrumentId)
    .LegId(LegId)
    .SourceTransactionId(SourceTransactionId)
    .PayReceive(PayReceive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
