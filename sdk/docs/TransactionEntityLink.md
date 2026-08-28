# com.finbourne.lusid.model.TransactionEntityLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | Available values: Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, PortfolioGroup, Person, Order, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, FundStructure, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, TaskDefinition, Workflow, IdentifierDefinition, SettlementInstruction, TransactionFeeType, PaymentInstruction, Transfer. | [default to String]
**entityIdName** | **String** |  | [default to String]
**entityIdValue** | **String** |  | [default to String]
**restrictEditing** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.lusid.model.TransactionEntityLink;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
String EntityIdName = "example EntityIdName";
String EntityIdValue = "example EntityIdValue";
Boolean RestrictEditing = true;


TransactionEntityLink transactionEntityLinkInstance = new TransactionEntityLink()
    .EntityType(EntityType)
    .EntityIdName(EntityIdName)
    .EntityIdValue(EntityIdValue)
    .RestrictEditing(RestrictEditing);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
