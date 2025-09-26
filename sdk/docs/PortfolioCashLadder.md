# com.finbourne.lusid.model.PortfolioCashLadder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the cash-flows. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**records** | [**List&lt;CashLadderRecord&gt;**](CashLadderRecord.md) | A record of cash flows on a specific date. | [default to List<CashLadderRecord>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The records that could not be returned along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PortfolioCashLadder;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
List<CashLadderRecord> Records = new List<CashLadderRecord>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PortfolioCashLadder portfolioCashLadderInstance = new PortfolioCashLadder()
    .Currency(Currency)
    .SubHoldingKeys(SubHoldingKeys)
    .Records(Records)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
