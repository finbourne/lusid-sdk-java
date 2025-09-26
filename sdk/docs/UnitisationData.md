# com.finbourne.lusid.model.UnitisationData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharesInIssue** | **java.math.BigDecimal** | The number of shares in issue at a valuation point. | [default to java.math.BigDecimal]
**unitPrice** | **java.math.BigDecimal** | The price of one unit of the share class at a valuation point. | [default to java.math.BigDecimal]
**netDealingUnits** | **java.math.BigDecimal** | The net dealing in units for the share class at a valuation point. This could be the sum of negative redemptions (in units) and positive subscriptions (in units). | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.UnitisationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal SharesInIssue = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnitPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal NetDealingUnits = new java.math.BigDecimal("100.00");


UnitisationData unitisationDataInstance = new UnitisationData()
    .SharesInIssue(SharesInIssue)
    .UnitPrice(UnitPrice)
    .NetDealingUnits(NetDealingUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
