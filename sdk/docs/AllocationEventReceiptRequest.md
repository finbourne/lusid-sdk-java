# com.finbourne.lusid.model.AllocationEventReceiptRequest
The request used to record cash received from an investor against a booked capital call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the cash came from. | [default to String]
**amount** | **java.math.BigDecimal** | The cash the partner sent, as sent and before any bank charge: in the payment currency if one is given and otherwise in the event currency. | [default to java.math.BigDecimal]
**receiptDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was received. | [default to OffsetDateTime]
**paymentCurrency** | **String** | The ISO 4217 code of the currency the cash arrived in, when it differs from the event currency. | [optional] [default to String]
**paymentFxRate** | **java.math.BigDecimal** | The rate the payment was converted at, as units of event currency per unit of payment currency. Required with a payment currency. | [optional] [default to java.math.BigDecimal]
**noticeFxRate** | **java.math.BigDecimal** | The rate the call was noticed at in the payment currency, in the same terms as the payment FX rate. With one, only the rate&#39;s effect on the payment is an FX difference; without one a payment converting to less than the call is simply short. Only with a payment currency. | [optional] [default to java.math.BigDecimal]
**bankCharge** | **java.math.BigDecimal** | Any bank charge deducted from the cash before it arrived, in the event currency. | [optional] [default to java.math.BigDecimal]
**bankChargeBearer** | **String** | Who bears the bank charge: Partner leaves it outstanding on the investor, Fund books it as a fund expense. Defaults to the map&#39;s policy. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventReceiptRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
OffsetDateTime ReceiptDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String PaymentCurrency = "example PaymentCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal PaymentFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NoticeFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal BankCharge = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BankChargeBearer = "example BankChargeBearer";


AllocationEventReceiptRequest allocationEventReceiptRequestInstance = new AllocationEventReceiptRequest()
    .InvestorRecordId(InvestorRecordId)
    .Amount(Amount)
    .ReceiptDate(ReceiptDate)
    .PaymentCurrency(PaymentCurrency)
    .PaymentFxRate(PaymentFxRate)
    .NoticeFxRate(NoticeFxRate)
    .BankCharge(BankCharge)
    .BankChargeBearer(BankChargeBearer);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
