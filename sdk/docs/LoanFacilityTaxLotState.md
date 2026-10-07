# com.finbourne.lusid.model.LoanFacilityTaxLotState
Facility-level state for a single tax lot. These values live on the facility holding rather than on any  contract holding, and are keyed on the tax lot alone - a lot holding balances on several contracts still  has one cost and one facility accrual.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotId** | **String** | The tax lot being set, identified by the transaction id of the trade that opened it. | [default to String]
**cost** | **java.math.BigDecimal** | The cost of this tax lot in the instrument&#39;s domestic currency, which for a loan facility is the  facility currency. Maps to Holding/Cost/Dom.     Stated rather than derived because loan facility cost is not units multiplied by price - it is the  funded balance at price plus the unfunded balance at price less par. A migrated lot whose real cost  came from several historical trades at different prices cannot be expressed by choosing one price on  the trade that opens it. Omit it to keep whatever cost that trade established. | [optional] [default to java.math.BigDecimal]
**costInPortfolioCcy** | **java.math.BigDecimal** | The cost of this tax lot in the portfolio currency. Maps to Holding/Cost/Pfolio, and is what makes  unrealised PnL exact across a currency boundary. Equals Cost multiplied by PortfolioFxRate. | [optional] [default to java.math.BigDecimal]
**portfolioFxRate** | **java.math.BigDecimal** | The FX rate from the facility currency to the portfolio currency at the time of the original trade.  One when the two currencies are the same. | [optional] [default to java.math.BigDecimal]
**facilityAccruedInterest** | **java.math.BigDecimal** | Accrued interest on the unfunded portion of the facility for this tax lot - the commitment fee. The  facility&#39;s own accrual, distinct from the accruals held against each contract, and already in the  facility currency. The two are summed to give the accrued interest reported against the holding.     Omit it and the lot&#39;s accrual is left as it is, so a migrated lot accrues from its own trade date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.LoanFacilityTaxLotState;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TaxLotId = "example TaxLotId";
@jakarta.annotation.Nullable java.math.BigDecimal Cost = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CostInPortfolioCcy = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PortfolioFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FacilityAccruedInterest = new java.math.BigDecimal("100.00");


LoanFacilityTaxLotState loanFacilityTaxLotStateInstance = new LoanFacilityTaxLotState()
    .TaxLotId(TaxLotId)
    .Cost(Cost)
    .CostInPortfolioCcy(CostInPortfolioCcy)
    .PortfolioFxRate(PortfolioFxRate)
    .FacilityAccruedInterest(FacilityAccruedInterest);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
