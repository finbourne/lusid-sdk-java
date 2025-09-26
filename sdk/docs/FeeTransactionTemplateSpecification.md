# com.finbourne.lusid.model.FeeTransactionTemplateSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**specificationTypeName** | **String** |  | [default to String]
**supportedTemplateFields** | [**List&lt;TemplateField&gt;**](TemplateField.md) |  | [default to List<TemplateField>]

```java
import com.finbourne.lusid.model.FeeTransactionTemplateSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SpecificationTypeName = "example SpecificationTypeName";
List<TemplateField> SupportedTemplateFields = new List<TemplateField>();


FeeTransactionTemplateSpecification feeTransactionTemplateSpecificationInstance = new FeeTransactionTemplateSpecification()
    .SpecificationTypeName(SpecificationTypeName)
    .SupportedTemplateFields(SupportedTemplateFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
