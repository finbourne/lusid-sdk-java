# com.finbourne.lusid.model.TemplateField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** |  | [default to String]
**specificity** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**type** | **String** |  | [default to String]
**availability** | **String** |  | [default to String]
**usage** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.lusid.model.TemplateField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
String Specificity = "example Specificity";
String Description = "example Description";
String Type = "example Type";
String Availability = "example Availability";
List<String> Usage = new List<String>();


TemplateField templateFieldInstance = new TemplateField()
    .FieldName(FieldName)
    .Specificity(Specificity)
    .Description(Description)
    .Type(Type)
    .Availability(Availability)
    .Usage(Usage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
