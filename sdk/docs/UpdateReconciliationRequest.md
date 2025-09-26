# com.finbourne.lusid.model.UpdateReconciliationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the scheduled reconciliation | [optional] [default to String]
**description** | **String** | A description of the scheduled reconciliation | [optional] [default to String]
**isPortfolioGroup** | **Boolean** | Specifies whether reconciliation is between portfolios or portfolio groups | [optional] [default to Boolean]
**left** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**right** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactions** | [**ReconciliationTransactions**](ReconciliationTransactions.md) |  | [optional] [default to ReconciliationTransactions]
**positions** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**valuations** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Reconciliation properties | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.UpdateReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean IsPortfolioGroup = true;
ResourceId Left = new ResourceId();
ResourceId Right = new ResourceId();
ReconciliationTransactions Transactions = new ReconciliationTransactions();
ReconciliationConfiguration Positions = new ReconciliationConfiguration();
ReconciliationConfiguration Valuations = new ReconciliationConfiguration();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


UpdateReconciliationRequest updateReconciliationRequestInstance = new UpdateReconciliationRequest()
    .Name(Name)
    .Description(Description)
    .IsPortfolioGroup(IsPortfolioGroup)
    .Left(Left)
    .Right(Right)
    .Transactions(Transactions)
    .Positions(Positions)
    .Valuations(Valuations)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
