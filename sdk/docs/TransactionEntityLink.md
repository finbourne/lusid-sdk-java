# com.finbourne.lusid.model.TransactionEntityLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, FundStructure, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType, PaymentInstruction, Transfer, RecDefinition, RecResult, JournalEntry. | [default to String]
**entityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**restrictEditing** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.lusid.model.TransactionEntityLink;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
Map<String, String> EntityId = new Map<String, String>();
Boolean RestrictEditing = true;


TransactionEntityLink transactionEntityLinkInstance = new TransactionEntityLink()
    .EntityType(EntityType)
    .EntityId(EntityId)
    .RestrictEditing(RestrictEditing);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
