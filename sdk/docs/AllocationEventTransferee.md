# com.finbourne.lusid.model.AllocationEventTransferee
A transferee a Transfer's booking gives a line: the line, and the investment account it is opened under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The transferee&#39;s investor record, as the leg names it. | [optional] [default to String]
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**lineId** | **String** | The commitment line opened for the transferee. | [optional] [default to String]
**line** | **String** | What happens to the line: Open when a booking would open it, Opened when this booking opened it. | [optional] [default to String]
**investmentAccountScope** | **String** | The scope of the investment account the line is opened under: the fund&#39;s. | [optional] [default to String]
**investmentAccountIdentifierType** | **String** | The type of the investment account&#39;s identifier, as a property key. An account a transfer opens is identified by InvestmentAccount/system/TransfereeAccountId. | [optional] [default to String]
**investmentAccountIdentifierValue** | **String** | The value of the investment account&#39;s identifier. An account a transfer opens has the value &#39;{fundCode}-{investor record LUID}&#39;, so a retry or a concurrent transfer finds the same account. | [optional] [default to String]
**investmentAccount** | **String** | What happens to the investment account: Existing when the transferee already holds it, Create when a booking would open it, Created when this booking opened it. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventTransferee;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
ResourceId FundId = new ResourceId();
@jakarta.annotation.Nullable String LineId = "example LineId";
@jakarta.annotation.Nullable String Line = "example Line";
@jakarta.annotation.Nullable String InvestmentAccountScope = "example InvestmentAccountScope";
@jakarta.annotation.Nullable String InvestmentAccountIdentifierType = "example InvestmentAccountIdentifierType";
@jakarta.annotation.Nullable String InvestmentAccountIdentifierValue = "example InvestmentAccountIdentifierValue";
@jakarta.annotation.Nullable String InvestmentAccount = "example InvestmentAccount";


AllocationEventTransferee allocationEventTransfereeInstance = new AllocationEventTransferee()
    .InvestorRecordId(InvestorRecordId)
    .FundId(FundId)
    .LineId(LineId)
    .Line(Line)
    .InvestmentAccountScope(InvestmentAccountScope)
    .InvestmentAccountIdentifierType(InvestmentAccountIdentifierType)
    .InvestmentAccountIdentifierValue(InvestmentAccountIdentifierValue)
    .InvestmentAccount(InvestmentAccount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
