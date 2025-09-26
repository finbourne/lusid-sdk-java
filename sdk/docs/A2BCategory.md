# com.finbourne.lusid.model.A2BCategory
A2B Category - one of the five major categories in the A2BDataRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingCurrency** | [**A2BBreakdown**](A2BBreakdown.md) |  | [optional] [default to A2BBreakdown]
**portfolioCurrency** | [**A2BBreakdown**](A2BBreakdown.md) |  | [optional] [default to A2BBreakdown]

```java
import com.finbourne.lusid.model.A2BCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

A2BBreakdown HoldingCurrency = new A2BBreakdown();
A2BBreakdown PortfolioCurrency = new A2BBreakdown();


A2BCategory a2BCategoryInstance = new A2BCategory()
    .HoldingCurrency(HoldingCurrency)
    .PortfolioCurrency(PortfolioCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
