# com.finbourne.lusid.model.TransactionEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The link to the transaction entity. | [default to URI]
**entityUniqueId** | **String** | The unique id of the transaction, combining the portfolio and transaction identifiers. | [default to String]
**asAtVersionNumber** | **Integer** | The version number of the transaction entity at the requested asAt. | [optional] [default to Integer]
**status** | **String** | The status of the transaction entity. &#39;Prevailing&#39; when the transaction exists — including a cancelled transaction, whose cancellation is reflected in its own status rather than here; &#39;Deleted&#39; when the transaction&#39;s portfolio has been deleted; &#39;DoesNotExist&#39; when the transaction does not yet exist (e.g. staged creation preview). Available values: Prevailing, Deleted, DoesNotExist. | [default to String]
**asAtDeleted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the portfolio (and by extension, the transaction) was deleted. | [optional] [default to OffsetDateTime]
**userIdDeleted** | **String** | The unique id of the user who deleted the portfolio. | [optional] [default to String]
**requestIdDeleted** | **String** | The unique request id of the command that deleted the portfolio. | [optional] [default to String]
**prevailingPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**prevailingInputTransaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**deletedPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**deletedInputTransaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**previewedStatus** | **String** | The status of the transaction after the staged modification is applied. Always &#39;Prevailing&#39; for transaction previews. Available values: Prevailing, Deleted, DoesNotExist. | [optional] [default to String]
**previewedPortfolio** | [**PortfolioWithoutHref**](PortfolioWithoutHref.md) |  | [optional] [default to PortfolioWithoutHref]
**previewedInputTransaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransactionEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

URI Href = URI.create("http://example.com/Href");
String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable Integer AsAtVersionNumber = new Integer("100.00");
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtDeleted = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdDeleted = "example UserIdDeleted";
@jakarta.annotation.Nullable String RequestIdDeleted = "example RequestIdDeleted";
PortfolioWithoutHref PrevailingPortfolio = new PortfolioWithoutHref();
Transaction PrevailingInputTransaction = new Transaction();
PortfolioWithoutHref DeletedPortfolio = new PortfolioWithoutHref();
Transaction DeletedInputTransaction = new Transaction();
@jakarta.annotation.Nullable String PreviewedStatus = "example PreviewedStatus";
PortfolioWithoutHref PreviewedPortfolio = new PortfolioWithoutHref();
Transaction PreviewedInputTransaction = new Transaction();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransactionEntity transactionEntityInstance = new TransactionEntity()
    .Href(Href)
    .EntityUniqueId(EntityUniqueId)
    .AsAtVersionNumber(AsAtVersionNumber)
    .Status(Status)
    .AsAtDeleted(AsAtDeleted)
    .UserIdDeleted(UserIdDeleted)
    .RequestIdDeleted(RequestIdDeleted)
    .PrevailingPortfolio(PrevailingPortfolio)
    .PrevailingInputTransaction(PrevailingInputTransaction)
    .DeletedPortfolio(DeletedPortfolio)
    .DeletedInputTransaction(DeletedInputTransaction)
    .PreviewedStatus(PreviewedStatus)
    .PreviewedPortfolio(PreviewedPortfolio)
    .PreviewedInputTransaction(PreviewedInputTransaction)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
