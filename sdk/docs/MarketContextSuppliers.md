# com.finbourne.lusid.model.MarketContextSuppliers
It is possible to control which supplier is used for a given asset class.  This field is deprecated in favour of market data rules, which subsumes its functionality.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commodity** | **String** |  | [optional] [default to String]
**credit** | **String** |  | [optional] [default to String]
**equity** | **String** |  | [optional] [default to String]
**fx** | **String** |  | [optional] [default to String]
**rates** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarketContextSuppliers;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Commodity = "example Commodity";
String Credit = "example Credit";
String Equity = "example Equity";
String Fx = "example Fx";
String Rates = "example Rates";


MarketContextSuppliers marketContextSuppliersInstance = new MarketContextSuppliers()
    .Commodity(Commodity)
    .Credit(Credit)
    .Equity(Equity)
    .Fx(Fx)
    .Rates(Rates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
