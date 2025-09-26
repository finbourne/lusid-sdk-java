# com.finbourne.lusid.model.Alias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The property key, identifier type, or field to be replaced by an alias. | [default to String]
**attributeAlias** | **String** | The alias to replace the property key, identifier type, or field on the bound entity. | [default to String]

```java
import com.finbourne.lusid.model.Alias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AttributeName = "example AttributeName";
String AttributeAlias = "example AttributeAlias";


Alias aliasInstance = new Alias()
    .AttributeName(AttributeName)
    .AttributeAlias(AttributeAlias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
