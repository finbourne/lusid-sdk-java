# com.finbourne.lusid.model.ValuationPointDiagnostic
Something found while striking a valuation point that did not stop it but should be looked at.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | What kind of finding this is. &#39;OwnershipDrift&#39;: a fund structure holder&#39;s declared sharing percentage in a held member differs from the share its contributions make of that member&#39;s capital by enough to misallocate more of the period&#39;s P&amp;L than the holder&#39;s drift materiality warning amount allows. &#39;FeeStrikeFailed&#39;: the fees struck when the valuation point was last created or updated failed, so its lines carry no fee transactions and it cannot be accepted until they are struck again. &#39;FeeInvoiceOutsideTolerance&#39;: the invoices booked for a fee in the valuation point&#39;s window, tagged with a Transaction/&lt;fund scope&gt;/InvoicedFeeCode property, differ from the fee&#39;s accrual for the period they cover by more than its Fee/&lt;scope&gt;/InvoiceTolerance, or else its fund&#39;s Fund/&lt;scope&gt;/InvoiceTolerance, allows; they are booked as they are. &#39;FeeInvoiceNotChecked&#39;: such an invoice could not be checked, because no final valuation point holds its period&#39;s accrual, it is not in the fee&#39;s currency, or the tolerance cannot be read. Neither stops the valuation point. | [default to String]
**message** | **String** | What was found and what to do about it. | [default to String]
**details** | **Map&lt;String, String&gt;** | The values the finding was made on, by name. For &#39;OwnershipDrift&#39;: holder, member, declaredShare, actualShare, delta (actual less declared) and impact (the P&amp;L the drift would misallocate this period). For &#39;FeeStrikeFailed&#39;: failureType and failureMessage, the cause of the failed strike. For &#39;FeeInvoiceOutsideTolerance&#39;: feeCode, feeName, periodEnd (the payable date ending the period), accrualValuationPoint, currency, accrual, invoice, difference (invoice less accrual), differencePercent, tolerancePercent, toleranceFloor, tolerance (the larger of the percentage of the accrual and the floor), toleranceProperty and transactionIds. For &#39;FeeInvoiceNotChecked&#39;: feeCode, feeName, reason (AccrualNotFound, CurrencyMismatch or ToleranceUnreadable), transactionIds, and the figures it was found on. | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.ValuationPointDiagnostic;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Message = "example Message";
@jakarta.annotation.Nullable Map<String, String> Details = new Map<String, String>();


ValuationPointDiagnostic valuationPointDiagnosticInstance = new ValuationPointDiagnostic()
    .Type(Type)
    .Message(Message)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
