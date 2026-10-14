# com.finbourne.lusid.model.MarginSettlementLag
Business days between a margin call and settlement, by asset kind.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cash** | **Integer** | The business days between a cash margin call and settlement. | [default to Integer]
**securities** | **Integer** | The business days between a securities margin call and settlement. | [default to Integer]

```java
import com.finbourne.lusid.model.MarginSettlementLag;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Cash = new Integer("100.00");
Integer Securities = new Integer("100.00");


MarginSettlementLag marginSettlementLagInstance = new MarginSettlementLag()
    .Cash(Cash)
    .Securities(Securities);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
