# com.finbourne.lusid.model.AllocationEventTransfer
One leg of a Transfer Allocation Event: a fraction of a capital interest line moving to another line.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromLineId** | **String** | The identifier of the capital interest line the fraction moves from, as it appears on the register of one of the map&#39;s members. | [default to String]
**toInvestorRecordId** | **String** | The investor record that receives the transferred interest. | [default to String]
**toLineId** | **String** | The identifier of the capital interest line the fraction moves to. Created if it does not exist. | [default to String]
**toPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**fraction** | **java.math.BigDecimal** | The fraction of the source line transferred, greater than zero and at most one. One closes the source line. Each balance moved is the source balance times the fraction, truncated to the currency&#39;s minor unit, so any remainder stays with the transferor. | [default to java.math.BigDecimal]
**pnlSplit** | **String** | How the profit and loss of the period containing the transfer is split: InterimClose closes the books on the transfer date; DailyProration prorates by days held. Defaults to InterimClose. Available values: InterimClose, DailyProration. | [optional] [default to String]
**consideration** | [**AllocationEventTransferConsideration**](AllocationEventTransferConsideration.md) |  | [optional] [default to AllocationEventTransferConsideration]
**consentReference** | **String** | A reference to the consent obtained for the transfer, when the fund requires one. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventTransfer;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FromLineId = "example FromLineId";
String ToInvestorRecordId = "example ToInvestorRecordId";
String ToLineId = "example ToLineId";
ResourceId ToPortfolioId = new ResourceId();
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String PnlSplit = "example PnlSplit";
AllocationEventTransferConsideration Consideration = new AllocationEventTransferConsideration();
@jakarta.annotation.Nullable String ConsentReference = "example ConsentReference";


AllocationEventTransfer allocationEventTransferInstance = new AllocationEventTransfer()
    .FromLineId(FromLineId)
    .ToInvestorRecordId(ToInvestorRecordId)
    .ToLineId(ToLineId)
    .ToPortfolioId(ToPortfolioId)
    .Fraction(Fraction)
    .PnlSplit(PnlSplit)
    .Consideration(Consideration)
    .ConsentReference(ConsentReference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
