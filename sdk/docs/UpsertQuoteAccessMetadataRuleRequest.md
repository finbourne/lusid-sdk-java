# com.finbourne.lusid.model.UpsertQuoteAccessMetadataRuleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**QuoteAccessMetadataRuleId**](QuoteAccessMetadataRuleId.md) |  | [default to QuoteAccessMetadataRuleId]
**metadata** | [**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md) | The access control metadata to assign to quotes that match the identifier | [default to Map<String, List<AccessMetadataValue>>]

```java
import com.finbourne.lusid.model.UpsertQuoteAccessMetadataRuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteAccessMetadataRuleId Id = new QuoteAccessMetadataRuleId();
Map<String, List<AccessMetadataValue>> Metadata = new Map<String, List<AccessMetadataValue>>();


UpsertQuoteAccessMetadataRuleRequest upsertQuoteAccessMetadataRuleRequestInstance = new UpsertQuoteAccessMetadataRuleRequest()
    .Id(Id)
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
