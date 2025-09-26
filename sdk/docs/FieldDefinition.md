# com.finbourne.lusid.model.FieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [default to String]
**isRequired** | **Boolean** |  | [default to Boolean]
**isUnique** | **Boolean** |  | [default to Boolean]
**valueType** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.FieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
Boolean IsRequired = true;
Boolean IsUnique = true;
@jakarta.annotation.Nullable String ValueType = "example ValueType";


FieldDefinition fieldDefinitionInstance = new FieldDefinition()
    .Key(Key)
    .IsRequired(IsRequired)
    .IsUnique(IsUnique)
    .ValueType(ValueType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
