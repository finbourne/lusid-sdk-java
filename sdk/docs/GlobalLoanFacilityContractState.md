# com.finbourne.lusid.model.GlobalLoanFacilityContractState
The desired global state of a single FlexibleLoan contract. Balances are global - across all investors -  rather than investor specific.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**balance** | **java.math.BigDecimal** | The desired global balance for this contract, in the contract&#39;s own currency. Must be non-negative. | [default to java.math.BigDecimal]
**balanceInFacilityCcy** | **java.math.BigDecimal** | The desired global balance expressed in the facility currency. Required when the contract currency  differs from the facility currency, and defaults to Balance otherwise. | [optional] [default to java.math.BigDecimal]
**agencyFxRate** | **java.math.BigDecimal** | The agency FX rate converting contract currency to facility currency. Required when the contract  currency differs from the facility currency. When omitted it is derived from the two balances where  possible, and otherwise defaults to 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.GlobalLoanFacilityContractState;
import java.util.*;
import java.lang.System;
import java.net.URI;

ContractDetails ContractDetails = new ContractDetails();
java.math.BigDecimal Balance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal BalanceInFacilityCcy = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AgencyFxRate = new java.math.BigDecimal("100.00");


GlobalLoanFacilityContractState globalLoanFacilityContractStateInstance = new GlobalLoanFacilityContractState()
    .ContractDetails(ContractDetails)
    .Balance(Balance)
    .BalanceInFacilityCcy(BalanceInFacilityCcy)
    .AgencyFxRate(AgencyFxRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
