# com.finbourne.lusid.model.AccountedComplexMarketData
The Valuation Point complex market data response for a Fund, including the origin of the complex market data relative to the Valuation Point period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexMarketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [optional] [default to ComplexMarketData]
**valuationPointOrigin** | **String** | Designates if the complex market data was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added, OriginalAndAdded. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point code, only for complex market data added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant code, only for complex market data added as part of a Complex Close action. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AccountedComplexMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplexMarketData ComplexMarketData = new ComplexMarketData();
@jakarta.annotation.Nullable String ValuationPointOrigin = "example ValuationPointOrigin";
@jakarta.annotation.Nullable String AddedOriginValuationPointCode = "example AddedOriginValuationPointCode";
@jakarta.annotation.Nullable String AddedOriginValuationPointVariantCode = "example AddedOriginValuationPointVariantCode";


AccountedComplexMarketData accountedComplexMarketDataInstance = new AccountedComplexMarketData()
    .ComplexMarketData(ComplexMarketData)
    .ValuationPointOrigin(ValuationPointOrigin)
    .AddedOriginValuationPointCode(AddedOriginValuationPointCode)
    .AddedOriginValuationPointVariantCode(AddedOriginValuationPointVariantCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
