# com.finbourne.lusid.model.FlowConventionName
Representation of an abstract definition of a flow convention set consisting of currency, tenor and an index name (arbitrary string but likely something like \"IBOR\").

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency of the flow convention name. | [default to String]
**indexName** | **String** | The index, if present, that is required. e.g. \&quot;IBOR\&quot;, \&quot;OIS\&quot; or \&quot;SONIA\&quot;. | [optional] [default to String]
**tenor** | **String** | Tenor for the convention name.    For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to String]

```java
import com.finbourne.lusid.model.FlowConventionName;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
@jakarta.annotation.Nullable String IndexName = "example IndexName";
String Tenor = "example Tenor";


FlowConventionName flowConventionNameInstance = new FlowConventionName()
    .Currency(Currency)
    .IndexName(IndexName)
    .Tenor(Tenor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
