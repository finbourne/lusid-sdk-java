# com.finbourne.lusid.model.PartnerCapitalAccountRowDetail
One labelled part of a capital account row's total: the kind of amount, the allocation event it arose on and its  quarter-, year- and inception-to-date amounts, each already included in the row's own column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | The kind of amount the entry labels: WithholdingTax for tax withheld from a distribution on the partner&#39;s behalf; on the CallCredit row, CallCreditGranted for a credit an equalisation kept for the partner and CallCreditApplied, negative, for the part of it a call drew on. | [default to String]
**allocationEventId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the allocation event the amount arose on. | [default to OffsetDateTime]
**qtd** | **java.math.BigDecimal** | The part of the row&#39;s quarter-to-date amount the entry labels; zero when the event falls outside the quarter. | [default to java.math.BigDecimal]
**ytd** | **java.math.BigDecimal** | The part of the row&#39;s year-to-date amount the entry labels; zero when the event falls outside the year. | [default to java.math.BigDecimal]
**itd** | **java.math.BigDecimal** | The part of the row&#39;s inception-to-date amount the entry labels. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerCapitalAccountRowDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Kind = "example Kind";
ResourceId AllocationEventId = new ResourceId();
OffsetDateTime EventDate = OffsetDateTime.now();
java.math.BigDecimal Qtd = new java.math.BigDecimal("100.00");
java.math.BigDecimal Ytd = new java.math.BigDecimal("100.00");
java.math.BigDecimal Itd = new java.math.BigDecimal("100.00");


PartnerCapitalAccountRowDetail partnerCapitalAccountRowDetailInstance = new PartnerCapitalAccountRowDetail()
    .Kind(Kind)
    .AllocationEventId(AllocationEventId)
    .EventDate(EventDate)
    .Qtd(Qtd)
    .Ytd(Ytd)
    .Itd(Itd);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
