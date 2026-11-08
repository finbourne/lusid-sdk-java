# com.finbourne.lusid.model.RealisedGainLossChargeableGains
The UK chargeable-gains figures the engine worked for a realised-gain/loss leg: the chargeable gain, the  indexation allowance and the part of it taken, the proceeds the leg was worked on, both sides of the s.35  kink test on a 1982 holding, the basis and identification rule the leg was matched under, the lot it was  matched against, whether its transaction stands reversed, and the treatment applied. All amounts are in  the portfolio currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chargeableGain** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**indexationAllowance** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**indexationAllowanceTaken** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**proceeds** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**gainOnOriginalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**gainOnMarketValue1982** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**basis** | **String** | Available values: IndexedCost, MarketValue1982, OriginalCost, NilGain. | [optional] [default to String]
**matchRule** | **String** | Available values: SameDay, TenDay, Section210B, Section104Pool, Holding1982, Holding1965. | [optional] [default to String]
**matchedLot** | [**RealisedGainLossMatchedLot**](RealisedGainLossMatchedLot.md) |  | [optional] [default to RealisedGainLossMatchedLot]
**marketValue1965** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**reversed** | **Boolean** |  | [optional] [default to Boolean]
**taxTreatment** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.RealisedGainLossChargeableGains;
import java.util.*;
import java.lang.System;
import java.net.URI;

CurrencyAndAmount ChargeableGain = new CurrencyAndAmount();
CurrencyAndAmount IndexationAllowance = new CurrencyAndAmount();
CurrencyAndAmount IndexationAllowanceTaken = new CurrencyAndAmount();
CurrencyAndAmount Proceeds = new CurrencyAndAmount();
CurrencyAndAmount GainOnOriginalCost = new CurrencyAndAmount();
CurrencyAndAmount GainOnMarketValue1982 = new CurrencyAndAmount();
@jakarta.annotation.Nullable String Basis = "example Basis";
@jakarta.annotation.Nullable String MatchRule = "example MatchRule";
RealisedGainLossMatchedLot MatchedLot = new RealisedGainLossMatchedLot();
CurrencyAndAmount MarketValue1965 = new CurrencyAndAmount();
Boolean Reversed = true;
@jakarta.annotation.Nullable String TaxTreatment = "example TaxTreatment";


RealisedGainLossChargeableGains realisedGainLossChargeableGainsInstance = new RealisedGainLossChargeableGains()
    .ChargeableGain(ChargeableGain)
    .IndexationAllowance(IndexationAllowance)
    .IndexationAllowanceTaken(IndexationAllowanceTaken)
    .Proceeds(Proceeds)
    .GainOnOriginalCost(GainOnOriginalCost)
    .GainOnMarketValue1982(GainOnMarketValue1982)
    .Basis(Basis)
    .MatchRule(MatchRule)
    .MatchedLot(MatchedLot)
    .MarketValue1965(MarketValue1965)
    .Reversed(Reversed)
    .TaxTreatment(TaxTreatment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
