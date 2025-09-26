# com.finbourne.lusid.model.GroupReconciliationResultStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countNew** | **Integer** | The number of comparison results of resultStatus \&quot;New\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkNew** | [**Link**](Link.md) |  | [default to Link]
**countConfirmed** | **Integer** | The number of comparison results of resultStatus \&quot;Confirmed\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkConfirmed** | [**Link**](Link.md) |  | [default to Link]
**countChanged** | **Integer** | The number of comparison results of resultStatus \&quot;Changed\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkChanged** | [**Link**](Link.md) |  | [default to Link]

```java
import com.finbourne.lusid.model.GroupReconciliationResultStatuses;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer CountNew = new Integer("100.00");
Link LinkNew = new Link();
Integer CountConfirmed = new Integer("100.00");
Link LinkConfirmed = new Link();
Integer CountChanged = new Integer("100.00");
Link LinkChanged = new Link();


GroupReconciliationResultStatuses groupReconciliationResultStatusesInstance = new GroupReconciliationResultStatuses()
    .CountNew(CountNew)
    .LinkNew(LinkNew)
    .CountConfirmed(CountConfirmed)
    .LinkConfirmed(LinkConfirmed)
    .CountChanged(CountChanged)
    .LinkChanged(LinkChanged);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
