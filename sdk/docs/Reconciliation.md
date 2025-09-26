# com.finbourne.lusid.model.Reconciliation
Representation of Reconciliation in LUSID Api

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ReconciliationId**](ReconciliationId.md) |  | [optional] [default to ReconciliationId]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**name** | **String** | The name of the scheduled reconciliation | [optional] [default to String]
**description** | **String** | A description of the scheduled reconciliation | [optional] [default to String]
**isPortfolioGroup** | **Boolean** | Specifies whether reconciliation is between portfolios or portfolio groups | [optional] [default to Boolean]
**left** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**right** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactions** | [**ReconciliationTransactions**](ReconciliationTransactions.md) |  | [optional] [default to ReconciliationTransactions]
**positions** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**valuations** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Reconciliation properties | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Reconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ReconciliationId Id = new ReconciliationId();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean IsPortfolioGroup = true;
ResourceId Left = new ResourceId();
ResourceId Right = new ResourceId();
ReconciliationTransactions Transactions = new ReconciliationTransactions();
ReconciliationConfiguration Positions = new ReconciliationConfiguration();
ReconciliationConfiguration Valuations = new ReconciliationConfiguration();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Reconciliation reconciliationInstance = new Reconciliation()
    .Id(Id)
    .Href(Href)
    .Name(Name)
    .Description(Description)
    .IsPortfolioGroup(IsPortfolioGroup)
    .Left(Left)
    .Right(Right)
    .Transactions(Transactions)
    .Positions(Positions)
    .Valuations(Valuations)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
