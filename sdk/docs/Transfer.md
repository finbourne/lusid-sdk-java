# com.finbourne.lusid.model.Transfer
A transfer and both of the transactions it booked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transferType** | **String** | The derived type of the transfer: &#39;Transfer&#39; when the position moves between portfolios, &#39;Switch&#39; when one instrument is exchanged for another within a portfolio, and &#39;Twitch&#39; when the position moves between portfolios and changes instrument at the same time. | [optional] [default to String]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**pricingMethod** | **String** | How the legs were priced: &#39;AtCost&#39; or &#39;AtPrice&#39;. | [optional] [default to String]
**taxLotStructure** | **String** | What happened to the tax lots of the outgoing position: &#39;Consolidate&#39; or &#39;Preserve&#39;. | [optional] [default to String]
**weightOut** | **java.math.BigDecimal** | The weighting factor recorded against the outgoing leg. | [optional] [default to java.math.BigDecimal]
**accountingMethod** | **String** | The accounting method recorded against the transfer. | [optional] [default to String]
**transactionOut** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**transactionIn** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties of the transfer, for the requested PropertyKeys. | [optional] [default to Map<String, Property>]
**href** | [**URI**](URI.md) | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Transfer;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TransferId = new ResourceId();
@jakarta.annotation.Nullable String TransferType = "example TransferType";
ResourceId PortfolioIdOut = new ResourceId();
ResourceId PortfolioIdIn = new ResourceId();
@jakarta.annotation.Nullable String PricingMethod = "example PricingMethod";
@jakarta.annotation.Nullable String TaxLotStructure = "example TaxLotStructure";
@jakarta.annotation.Nullable java.math.BigDecimal WeightOut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String AccountingMethod = "example AccountingMethod";
Transaction TransactionOut = new Transaction();
Transaction TransactionIn = new Transaction();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Transfer transferInstance = new Transfer()
    .TransferId(TransferId)
    .TransferType(TransferType)
    .PortfolioIdOut(PortfolioIdOut)
    .PortfolioIdIn(PortfolioIdIn)
    .PricingMethod(PricingMethod)
    .TaxLotStructure(TaxLotStructure)
    .WeightOut(WeightOut)
    .AccountingMethod(AccountingMethod)
    .TransactionOut(TransactionOut)
    .TransactionIn(TransactionIn)
    .Properties(Properties)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
