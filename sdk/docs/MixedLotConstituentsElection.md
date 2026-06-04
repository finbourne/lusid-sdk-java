# com.finbourne.lusid.model.MixedLotConstituentsElection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** |  | [default to String]
**isDefault** | **Boolean** |  | [optional] [default to Boolean]
**isChosen** | **Boolean** |  | [optional] [default to Boolean]
**securitiesConstituents** | [**List&lt;SecurityOfferConstituent&gt;**](SecurityOfferConstituent.md) |  | [optional] [default to List<SecurityOfferConstituent>]
**cashConstituents** | [**List&lt;CashOfferConstituent&gt;**](CashOfferConstituent.md) |  | [optional] [default to List<CashOfferConstituent>]
**costFactor** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.MixedLotConstituentsElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;
@jakarta.annotation.Nullable List<SecurityOfferConstituent> SecuritiesConstituents = new List<SecurityOfferConstituent>();
@jakarta.annotation.Nullable List<CashOfferConstituent> CashConstituents = new List<CashOfferConstituent>();
@jakarta.annotation.Nullable java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");


MixedLotConstituentsElection mixedLotConstituentsElectionInstance = new MixedLotConstituentsElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen)
    .SecuritiesConstituents(SecuritiesConstituents)
    .CashConstituents(CashConstituents)
    .CostFactor(CostFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
