# com.finbourne.lusid.model.TaxDeemedDisposalsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**disposals** | [**List&lt;TaxDeemedDisposalResponse&gt;**](TaxDeemedDisposalResponse.md) | The deemed disposals at the end of the period. | [optional] [default to List<TaxDeemedDisposalResponse>]
**vintages** | [**List&lt;TaxReturnVintage&gt;**](TaxReturnVintage.md) | The deemed-disposal vintages, one per period, that feed line D. | [optional] [default to List<TaxReturnVintage>]
**matrix** | [**List&lt;TaxReturnSpreadInstalment&gt;**](TaxReturnSpreadInstalment.md) | The seven-period spreading matrix for the vintages. | [optional] [default to List<TaxReturnSpreadInstalment>]

```java
import com.finbourne.lusid.model.TaxDeemedDisposalsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
TaxAccountingPeriod Period = new TaxAccountingPeriod();
@jakarta.annotation.Nullable List<TaxDeemedDisposalResponse> Disposals = new List<TaxDeemedDisposalResponse>();
@jakarta.annotation.Nullable List<TaxReturnVintage> Vintages = new List<TaxReturnVintage>();
@jakarta.annotation.Nullable List<TaxReturnSpreadInstalment> Matrix = new List<TaxReturnSpreadInstalment>();


TaxDeemedDisposalsResponse taxDeemedDisposalsResponseInstance = new TaxDeemedDisposalsResponse()
    .FundId(FundId)
    .Period(Period)
    .Disposals(Disposals)
    .Vintages(Vintages)
    .Matrix(Matrix);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
