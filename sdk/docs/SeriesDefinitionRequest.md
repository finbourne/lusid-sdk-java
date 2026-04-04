# com.finbourne.lusid.model.SeriesDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassCode** | **String** | The code of the Share Class this Series belongs to. | [default to String]
**seriesDefinitions** | [**List&lt;SeriesDefinition&gt;**](SeriesDefinition.md) | The definitions of the Series to add to the Share Class. | [default to List<SeriesDefinition>]

```java
import com.finbourne.lusid.model.SeriesDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ShareClassCode = "example ShareClassCode";
List<SeriesDefinition> SeriesDefinitions = new List<SeriesDefinition>();


SeriesDefinitionRequest seriesDefinitionRequestInstance = new SeriesDefinitionRequest()
    .ShareClassCode(ShareClassCode)
    .SeriesDefinitions(SeriesDefinitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
