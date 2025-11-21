# com.finbourne.lusid.model.PortfolioTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**portfolioScope** | **String** | The portfolio scope of the given entity | [default to String]
**portfolioCode** | **String** | The portfolio code of the given entity | [default to String]
**transactionId** | **String** | The transaction Id of the PortfolioTransaction being adjusted | [default to String]

```java
import com.finbourne.lusid.model.PortfolioTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAt = OffsetDateTime.now();
String PortfolioScope = "example PortfolioScope";
String PortfolioCode = "example PortfolioCode";
String TransactionId = "example TransactionId";


PortfolioTransaction portfolioTransactionInstance = new PortfolioTransaction()
    .AsAt(AsAt)
    .PortfolioScope(PortfolioScope)
    .PortfolioCode(PortfolioCode)
    .TransactionId(TransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
