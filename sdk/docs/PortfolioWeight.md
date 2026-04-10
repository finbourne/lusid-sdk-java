# com.finbourne.lusid.model.PortfolioWeight
Represents a portfolio and its target allocation weight.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**weight** | **java.math.BigDecimal** | The relative weight of the Portfolio compared to the other Portfolios specified, used to determine the allocation split between Portfolios when there are no Orders within the Block to allocate to. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PortfolioWeight;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");


PortfolioWeight portfolioWeightInstance = new PortfolioWeight()
    .PortfolioId(PortfolioId)
    .Weight(Weight);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
