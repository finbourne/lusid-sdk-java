# com.finbourne.lusid.model.PnlJournalEntryLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pnlBucket** | **String** | The Filter ID of the grouping used from the Fund Configuration PnL filters | [optional] [default to String]
**journalEntryLine** | [**JournalEntryLine**](JournalEntryLine.md) |  | [optional] [default to JournalEntryLine]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PnlJournalEntryLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String PnlBucket = "example PnlBucket";
JournalEntryLine JournalEntryLine = new JournalEntryLine();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PnlJournalEntryLine pnlJournalEntryLineInstance = new PnlJournalEntryLine()
    .PnlBucket(PnlBucket)
    .JournalEntryLine(JournalEntryLine)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
