# com.finbourne.lusid.model.IndustryClassifier
Object describing a particular industry classifier,  which comprises a classification code and the name of the classification system to which the code belongs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classificationSystemName** | **String** | The name of the classification system to which the classification code belongs (e.g. GICS). | [default to String]
**classificationCode** | **String** | The specific industry classification code assigned to the legal entity. | [default to String]

```java
import com.finbourne.lusid.model.IndustryClassifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ClassificationSystemName = "example ClassificationSystemName";
String ClassificationCode = "example ClassificationCode";


IndustryClassifier industryClassifierInstance = new IndustryClassifier()
    .ClassificationSystemName(ClassificationSystemName)
    .ClassificationCode(ClassificationCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
