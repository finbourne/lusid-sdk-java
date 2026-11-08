# com.finbourne.lusid.model.RealisedGainLossMatchedLot
The lot a realised chargeable-gains leg was matched against: its cost in the portfolio currency, the date of the  acquisition that opened it and its chargeable-gains role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**role** | **String** | Available values: DayLot, Section104Pool, Holding1982, Holding1965, FutureAcquisition. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RealisedGainLossMatchedLot;
import java.util.*;
import java.lang.System;
import java.net.URI;

CurrencyAndAmount OriginalCost = new CurrencyAndAmount();
@jakarta.annotation.Nullable OffsetDateTime PurchaseDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Role = "example Role";


RealisedGainLossMatchedLot realisedGainLossMatchedLotInstance = new RealisedGainLossMatchedLot()
    .OriginalCost(OriginalCost)
    .PurchaseDate(PurchaseDate)
    .Role(Role);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
