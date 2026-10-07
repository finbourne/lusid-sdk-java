# com.finbourne.lusid.model.InvestorLoanFacilityReinitialisationEvent
Sets one investor's loan-facility position at tax lot granularity - contract balances, accrued interest and  cost - on lots a trade has already opened, where those are not simply the pro-rata share the trade derived  from the facility's global state. Every figure is an absolute target, not a delta.     Tax lot ids are only unique within a portfolio, and the event lives on a corporate action source that  several portfolios can share, so it names the portfolio it corrects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractAllocations** | [**List&lt;LoanFacilityTaxLotAllocation&gt;**](LoanFacilityTaxLotAllocation.md) | Investor-level state per contract per tax lot - the balance, and the accrued interest on it where  that is stated rather than derived. Each entry names its own contract, so a tax lot holding a balance  on two contracts appears twice. May be omitted for a fully undrawn lot named in TaxLotStates. | [optional] [default to List<LoanFacilityTaxLotAllocation>]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Effective date of the reinitialisation. The tax lots it names must already have been opened, and  settled, by a trade dated no later than this. | [optional] [default to OffsetDateTime]
**portfolioScope** | **String** | Scope of the portfolio whose lots the event corrects. | [default to String]
**portfolioCode** | **String** | Code of the portfolio whose lots the event corrects. | [default to String]
**taxLotStates** | [**List&lt;LoanFacilityTaxLotState&gt;**](LoanFacilityTaxLotState.md) | Facility-level state per tax lot - cost, and the facility&#39;s own accrual on its undrawn amount. Keyed  on the tax lot alone, so a lot holding balances on several contracts has one entry here and one  ContractAllocation per contract. | [optional] [default to List<LoanFacilityTaxLotState>]

```java
import com.finbourne.lusid.model.InvestorLoanFacilityReinitialisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<LoanFacilityTaxLotAllocation> ContractAllocations = new List<LoanFacilityTaxLotAllocation>();
OffsetDateTime Date = OffsetDateTime.now();
String PortfolioScope = "example PortfolioScope";
String PortfolioCode = "example PortfolioCode";
@jakarta.annotation.Nullable List<LoanFacilityTaxLotState> TaxLotStates = new List<LoanFacilityTaxLotState>();


InvestorLoanFacilityReinitialisationEvent investorLoanFacilityReinitialisationEventInstance = new InvestorLoanFacilityReinitialisationEvent()
    .ContractAllocations(ContractAllocations)
    .Date(Date)
    .PortfolioScope(PortfolioScope)
    .PortfolioCode(PortfolioCode)
    .TaxLotStates(TaxLotStates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
