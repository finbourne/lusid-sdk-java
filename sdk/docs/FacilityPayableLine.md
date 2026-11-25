# com.finbourne.lusid.model.FacilityPayableLine
A principal line on the facility payable in a Fund's journal.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The line&#39;s activity date. | [default to OffsetDateTime]
**principal** | **java.math.BigDecimal** | The principal the line puts on the payable: positive for a draw, negative for a repayment. | [default to java.math.BigDecimal]
**currency** | **String** | The currency of the line. | [default to String]
**generalLedgerAccountCode** | **String** | The general ledger account the Fund&#39;s posting rules mapped the line to. Absent when no rule mapped it. | [optional] [default to String]
**transactionId** | **String** | The transaction that booked the line. | [default to String]
**facilityId** | **String** | The Facility the transaction names. Absent when it names none. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FacilityPayableLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Principal = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
@jakarta.annotation.Nullable String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String FacilityId = "example FacilityId";


FacilityPayableLine facilityPayableLineInstance = new FacilityPayableLine()
    .Date(Date)
    .Principal(Principal)
    .Currency(Currency)
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .TransactionId(TransactionId)
    .FacilityId(FacilityId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
