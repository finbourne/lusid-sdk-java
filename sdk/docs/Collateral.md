# com.finbourne.lusid.model.Collateral
Representation of the collateral of a repurchase agreement, along with related details of the agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyerReceivesCashflows** | **Boolean** | Does the buyer of the FlexibleRepo receive the cashflows from any collateral instruments, or do they get paid to the seller. | [default to Boolean]
**buyerReceivesCorporateActionPayments** | **Boolean** | Does the buyer of the FlexibleRepo receive any dividend or cash payments as the result of a corporate action  on any of the collateral instruments, or are these amounts paid to the seller.  Referred to as \&quot;manufactured payments\&quot; in the UK, and valid only under a repo with GMRA in Europe | [default to Boolean]
**collateralInstruments** | [**List&lt;CollateralInstrument&gt;**](CollateralInstrument.md) | List of any collateral instruments. | [optional] [default to List<CollateralInstrument>]
**collateralValue** | **java.math.BigDecimal** | Total value of the collateral before any margin or haircut applied.  Can be provided instead of PurchasePrice, so that PurchasePrice can be inferred from the CollateralValue and one of  Haircut or Margin. | [optional] [default to java.math.BigDecimal]
**deferManufacturedPayments** | **Boolean** | Indicates whether manufactured collateral payments are capitalised (i.e. deferred). Capitalised payments will  be deferred to the maturity date of the repo and if applicable interest will be accrued at the repo rate.  Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.Collateral;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean BuyerReceivesCashflows = true;
Boolean BuyerReceivesCorporateActionPayments = true;
@jakarta.annotation.Nullable List<CollateralInstrument> CollateralInstruments = new List<CollateralInstrument>();
@jakarta.annotation.Nullable java.math.BigDecimal CollateralValue = new java.math.BigDecimal("100.00");
Boolean DeferManufacturedPayments = true;


Collateral collateralInstance = new Collateral()
    .BuyerReceivesCashflows(BuyerReceivesCashflows)
    .BuyerReceivesCorporateActionPayments(BuyerReceivesCorporateActionPayments)
    .CollateralInstruments(CollateralInstruments)
    .CollateralValue(CollateralValue)
    .DeferManufacturedPayments(DeferManufacturedPayments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
