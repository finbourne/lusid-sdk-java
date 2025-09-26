# com.finbourne.lusid.model.PortfolioResultDataKeyRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplier** | **String** | the result resource supplier (where the data comes from) | [default to String]
**dataScope** | **String** | which is the scope in which the data should be found | [default to String]
**documentCode** | **String** | document code that defines which document is desired | [default to String]
**quoteInterval** | **String** | Shorthand for the time interval used to select result data. This must be a dot-separated string   specifying a start and end date, for example &#39;5D.0D&#39; to look back 5 days from today (0 days ago). | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt predicate specification. | [optional] [default to OffsetDateTime]
**portfolioCode** | **String** |  | [optional] [default to String]
**portfolioScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.PortfolioResultDataKeyRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Supplier = "example Supplier";
String DataScope = "example DataScope";
String DocumentCode = "example DocumentCode";
@jakarta.annotation.Nullable String QuoteInterval = "example QuoteInterval";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
@jakarta.annotation.Nullable String PortfolioScope = "example PortfolioScope";


PortfolioResultDataKeyRule portfolioResultDataKeyRuleInstance = new PortfolioResultDataKeyRule()
    .Supplier(Supplier)
    .DataScope(DataScope)
    .DocumentCode(DocumentCode)
    .QuoteInterval(QuoteInterval)
    .AsAt(AsAt)
    .PortfolioCode(PortfolioCode)
    .PortfolioScope(PortfolioScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
