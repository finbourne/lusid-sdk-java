# com.finbourne.lusid.model.LoanFacilityTaxLotAllocation
Contract-level state for a single tax lot on a single contract. These values live on the contract holding.     Each allocation names its own contract rather than being grouped under one, so the event carries a flat  list. A tax lot holding a balance on two contracts appears twice, once per contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**taxLotId** | **String** | The tax lot being set, identified by the transaction id of the trade that opened it. | [default to String]
**balance** | **java.math.BigDecimal** | The desired settled balance for this tax lot on this contract, in the contract&#39;s own currency. This  replaces the pro-rata balance that the opening trade derived from the global facility state, which is  how a non-pro-rata position is expressed. | [default to java.math.BigDecimal]
**balanceInFacilityCcy** | **java.math.BigDecimal** | The desired balance expressed in the facility currency. Required when the contract currency differs  from the facility currency, and defaults to Balance otherwise. | [optional] [default to java.math.BigDecimal]
**accruedInterest** | **java.math.BigDecimal** | Interest accrued on this tax lot&#39;s balance on this contract, as at the start of the event&#39;s date, in  the contract&#39;s own currency. Distinct from the facility&#39;s own accrual on its undrawn amount - the two  are summed to give the accrued interest reported against the holding.     Omit it and the lot&#39;s accrual is left as it is, so a migrated lot accrues from its own trade date. | [optional] [default to java.math.BigDecimal]
**pikAccruedInterest** | **java.math.BigDecimal** | Payment-in-kind interest accrued on this tax lot, as at the start of the event&#39;s date, for a contract  carrying a PIK schedule. Tracked separately from cash-settled accrual and never derived. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.LoanFacilityTaxLotAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ContractDetails ContractDetails = new ContractDetails();
String TaxLotId = "example TaxLotId";
java.math.BigDecimal Balance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal BalanceInFacilityCcy = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AccruedInterest = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PikAccruedInterest = new java.math.BigDecimal("100.00");


LoanFacilityTaxLotAllocation loanFacilityTaxLotAllocationInstance = new LoanFacilityTaxLotAllocation()
    .ContractDetails(ContractDetails)
    .TaxLotId(TaxLotId)
    .Balance(Balance)
    .BalanceInFacilityCcy(BalanceInFacilityCcy)
    .AccruedInterest(AccruedInterest)
    .PikAccruedInterest(PikAccruedInterest);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
