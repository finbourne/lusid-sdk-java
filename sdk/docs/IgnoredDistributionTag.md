# com.finbourne.lusid.model.IgnoredDistributionTag
A distribution character tag the run did not pool by, on one account's lines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glCode** | **String** | The general ledger account of the tagged lines. | [default to String]
**lineCount** | **Integer** | How many of the account&#39;s lines carried the ignored tag. | [default to Integer]
**amount** | **java.math.BigDecimal** | The journal amount of the tagged lines, debits positive. | [default to java.math.BigDecimal]
**reason** | **String** | Why the tag was ignored. Available values: NotPnlLine (the tagged line is not a profit and loss line, such as the cash leg of a tagged journal), CapabilityForbidden (the fund&#39;s DistributionCharacterSource capability is Forbidden, so characters come from buckets alone). | [default to String]

```java
import com.finbourne.lusid.model.IgnoredDistributionTag;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GlCode = "example GlCode";
Integer LineCount = new Integer("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Reason = "example Reason";


IgnoredDistributionTag ignoredDistributionTagInstance = new IgnoredDistributionTag()
    .GlCode(GlCode)
    .LineCount(LineCount)
    .Amount(Amount)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
