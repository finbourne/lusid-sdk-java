# com.finbourne.lusid.model.AccountedQuote
The Valuation Point quote response for a Fund, including the origin of the quote relative to the Valuation Point period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote** | [**Quote**](Quote.md) |  | [optional] [default to Quote]
**valuationPointOrigin** | **String** | Designates if the quote was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added, OriginalAndAdded. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point code, only for quotes added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant code, only for quotes added as part of a Complex Close action. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AccountedQuote;
import java.util.*;
import java.lang.System;
import java.net.URI;

Quote Quote = new Quote();
@jakarta.annotation.Nullable String ValuationPointOrigin = "example ValuationPointOrigin";
@jakarta.annotation.Nullable String AddedOriginValuationPointCode = "example AddedOriginValuationPointCode";
@jakarta.annotation.Nullable String AddedOriginValuationPointVariantCode = "example AddedOriginValuationPointVariantCode";


AccountedQuote accountedQuoteInstance = new AccountedQuote()
    .Quote(Quote)
    .ValuationPointOrigin(ValuationPointOrigin)
    .AddedOriginValuationPointCode(AddedOriginValuationPointCode)
    .AddedOriginValuationPointVariantCode(AddedOriginValuationPointVariantCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
