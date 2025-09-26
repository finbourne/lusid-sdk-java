# com.finbourne.lusid.model.InvestmentPortfolioIdentifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Investment Portfolio, unique within the Investment Account | [default to String]
**scope** | **String** | The scope of the Investment Portfolio. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The code identifier of the Investment Portfolio. | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.InvestmentPortfolioIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Scope = "example Scope";
Map<String, String> Identifiers = new Map<String, String>();


InvestmentPortfolioIdentifier investmentPortfolioIdentifierInstance = new InvestmentPortfolioIdentifier()
    .Key(Key)
    .Scope(Scope)
    .Identifiers(Identifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
