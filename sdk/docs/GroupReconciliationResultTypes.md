# com.finbourne.lusid.model.GroupReconciliationResultTypes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countMatch** | **Integer** | The number of comparison results of resultType \&quot;Match\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkMatches** | [**Link**](Link.md) |  | [default to Link]
**countPartialMatch** | **Integer** | The number of comparison results of resultType \&quot;PartialMatch\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkPartialMatches** | [**Link**](Link.md) |  | [default to Link]
**countBreak** | **Integer** | The number of comparison results of resultType \&quot;Break\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkBreaks** | [**Link**](Link.md) |  | [default to Link]
**countResolved** | **Integer** | The number of comparison results of resultType \&quot;Resolved\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkResolved** | [**Link**](Link.md) |  | [default to Link]

```java
import com.finbourne.lusid.model.GroupReconciliationResultTypes;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer CountMatch = new Integer("100.00");
Link LinkMatches = new Link();
Integer CountPartialMatch = new Integer("100.00");
Link LinkPartialMatches = new Link();
Integer CountBreak = new Integer("100.00");
Link LinkBreaks = new Link();
Integer CountResolved = new Integer("100.00");
Link LinkResolved = new Link();


GroupReconciliationResultTypes groupReconciliationResultTypesInstance = new GroupReconciliationResultTypes()
    .CountMatch(CountMatch)
    .LinkMatches(LinkMatches)
    .CountPartialMatch(CountPartialMatch)
    .LinkPartialMatches(LinkPartialMatches)
    .CountBreak(CountBreak)
    .LinkBreaks(LinkBreaks)
    .CountResolved(CountResolved)
    .LinkResolved(LinkResolved);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
