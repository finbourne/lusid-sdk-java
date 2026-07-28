# com.finbourne.lusid.model.PaymentDetailsSeriesIdentifiers
The two hardcoded series identifier keys that uniquely identify a Payment Details data series.  The currency value must match the top-level currency field on the Payment Instruction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentType** | **String** | The type of payment series. One of \&quot;Dividend\&quot;, \&quot;Fee\&quot;, \&quot;Rebate\&quot;, \&quot;Redemption\&quot;, \&quot;Subscription\&quot;. | [default to String]
**currency** | **String** | ISO 4217 currency code identifying the currency-specific series row. Must match the top-level currency field. | [default to String]
**custodianAccountScope** | **String** | Optional. The scope of the custodian account on the portfolio. Only permitted when the applicable entity is a Portfolio. | [optional] [default to String]
**custodianAccountCode** | **String** | Optional. The code of the custodian account on the portfolio. Only permitted when the applicable entity is a Portfolio. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PaymentDetailsSeriesIdentifiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PaymentType = "example PaymentType";
String Currency = "example Currency";
@jakarta.annotation.Nullable String CustodianAccountScope = "example CustodianAccountScope";
@jakarta.annotation.Nullable String CustodianAccountCode = "example CustodianAccountCode";


PaymentDetailsSeriesIdentifiers paymentDetailsSeriesIdentifiersInstance = new PaymentDetailsSeriesIdentifiers()
    .PaymentType(PaymentType)
    .Currency(Currency)
    .CustodianAccountScope(CustodianAccountScope)
    .CustodianAccountCode(CustodianAccountCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
