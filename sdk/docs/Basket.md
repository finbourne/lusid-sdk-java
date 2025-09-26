# com.finbourne.lusid.model.Basket
LUSID representation of a basket of instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basketName** | [**BasketIdentifier**](BasketIdentifier.md) |  | [default to BasketIdentifier]
**basketType** | **String** | What contents does the basket have. The validation will check that the instrument types contained match those expected.    Supported string (enumeration) values are: [Bonds, Credits, Equities, EquitySwap]. | [default to String]
**weightedInstruments** | [**WeightedInstruments**](WeightedInstruments.md) |  | [default to WeightedInstruments]

```java
import com.finbourne.lusid.model.Basket;
import java.util.*;
import java.lang.System;
import java.net.URI;

BasketIdentifier BasketName = new BasketIdentifier();
String BasketType = "example BasketType";
WeightedInstruments WeightedInstruments = new WeightedInstruments();


Basket basketInstance = new Basket()
    .BasketName(BasketName)
    .BasketType(BasketType)
    .WeightedInstruments(WeightedInstruments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
