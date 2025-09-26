# com.finbourne.lusid.model.FlexibleRepoCollateralEvent
Definition of FlexibleRepoCollateralEvent which represents a single collateral transfer as part of a repo contract  modelled as a FlexibleRepo, either as part of the purchase leg or repurchase leg, or any early closure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which the transfer of units settles. This is a required field. | [optional] [default to OffsetDateTime]
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which the recipient of the collateral is entitled to the units being transferred. This is a required field. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount of collateral being transferred as part of the repo contract.  Signed to indicate direction of transfer. This is a required field. | [default to java.math.BigDecimal]
**collateralInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]

```java
import com.finbourne.lusid.model.FlexibleRepoCollateralEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime SettlementDate = OffsetDateTime.now();
OffsetDateTime EntitlementDate = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
NewInstrument CollateralInstrument = new NewInstrument();


FlexibleRepoCollateralEvent flexibleRepoCollateralEventInstance = new FlexibleRepoCollateralEvent()
    .SettlementDate(SettlementDate)
    .EntitlementDate(EntitlementDate)
    .Amount(Amount)
    .CollateralInstrument(CollateralInstrument);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
