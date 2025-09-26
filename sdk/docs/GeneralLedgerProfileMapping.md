# com.finbourne.lusid.model.GeneralLedgerProfileMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mappingFilter** | **String** | The filter syntax for the Mapping filter. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax | [default to String]
**levels** | **List&lt;String&gt;** | References fields and properties on the associated Journal Entry Line and graph of associated objects. | [default to List<String>]

```java
import com.finbourne.lusid.model.GeneralLedgerProfileMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MappingFilter = "example MappingFilter";
List<String> Levels = new List<String>();


GeneralLedgerProfileMapping generalLedgerProfileMappingInstance = new GeneralLedgerProfileMapping()
    .MappingFilter(MappingFilter)
    .Levels(Levels);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
