# com.finbourne.lusid.model.DeemedDisposal
Settings for the deemed disposal a NAV type books at period close. When enabled, the in-scope holdings are  treated as sold and immediately re-acquired at market value, realising their unrealised gain against the  chosen cost base.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Whether the Nav Type books a deemed disposal at period close. When true, in-scope holdings are treated as sold and immediately re-acquired at market value, realising their unrealised gain. | [default to Boolean]
**costBase** | **String** | The cost the deemed disposal realises against: Book or Tax. Defaults to Book. Book: rebases book cost to base value and posts the movement as realised FX; it moves the portfolio&#39;s cost, so it is only valid on the primary Nav Type. Tax: writes a tax cost equal to market value and spreads the deemed gain since the prior tax cost. Available values: Book, Tax. | [optional] [default to String]
**holdingsFilter** | **String** | An optional filter selecting which holdings are deemed disposed of at period close. Omit it for the cost base&#39;s default: under Book, every non-base-currency monetary item (cash, receivables, payables, accruals). Tax has no default yet, so set a filter. | [optional] [default to String]
**transactionTypeCode** | **String** | An optional transaction type, in the Nav Type&#39;s transaction type scope, that the deemed disposal transactions are booked with. Omit it to use the domain default deemed disposal transaction type. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DeemedDisposal;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Enabled = true;
@jakarta.annotation.Nullable String CostBase = "example CostBase";
@jakarta.annotation.Nullable String HoldingsFilter = "example HoldingsFilter";
@jakarta.annotation.Nullable String TransactionTypeCode = "example TransactionTypeCode";


DeemedDisposal deemedDisposalInstance = new DeemedDisposal()
    .Enabled(Enabled)
    .CostBase(CostBase)
    .HoldingsFilter(HoldingsFilter)
    .TransactionTypeCode(TransactionTypeCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
