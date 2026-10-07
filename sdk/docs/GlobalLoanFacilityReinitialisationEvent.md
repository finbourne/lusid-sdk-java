# com.finbourne.lusid.model.GlobalLoanFacilityReinitialisationEvent
Sets the global state of a LoanFacility - its commitment and the balance of each of its contracts - so that  an existing book can be migrated onto LUSID without replaying the credit events that would otherwise have  built that state up from inception.     A loan facility keeps global state shared by every investor, and that state is only ever built through  movements, so it cannot be declared through SetHoldings the way a self-contained holding can. Every later  event scales against this global state, so it has to be correct before anything else is booked.     This event carries no investor-level data. Investor positions are set separately by an  InvestorLoanFacilityReinitialisationEvent, keeping the shared facility and the individual position apart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractStates** | [**List&lt;GlobalLoanFacilityContractState&gt;**](GlobalLoanFacilityContractState.md) | The desired global state of each contract under the facility. At least one contract is expected. | [default to List<GlobalLoanFacilityContractState>]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Effective date of the reinitialisation. | [optional] [default to OffsetDateTime]
**globalCommitment** | **java.math.BigDecimal** | The desired total commitment of the facility, in the facility currency. Must be positive. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.GlobalLoanFacilityReinitialisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<GlobalLoanFacilityContractState> ContractStates = new List<GlobalLoanFacilityContractState>();
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal GlobalCommitment = new java.math.BigDecimal("100.00");


GlobalLoanFacilityReinitialisationEvent globalLoanFacilityReinitialisationEventInstance = new GlobalLoanFacilityReinitialisationEvent()
    .ContractStates(ContractStates)
    .Date(Date)
    .GlobalCommitment(GlobalCommitment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
