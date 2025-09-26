# com.finbourne.lusid.model.PropertyReferenceDataValue
The ReferenceData relevant to the property. The ReferenceData is taken from the DataType on the PropertyDefinition that defines the Property.  Only ReferenceData where the ReferenceData value matches the Property value is included.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stringValue** | **String** |  | [optional] [default to String]
**numericValue** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PropertyReferenceDataValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String StringValue = "example StringValue";
@jakarta.annotation.Nullable java.math.BigDecimal NumericValue = new java.math.BigDecimal("100.00");


PropertyReferenceDataValue propertyReferenceDataValueInstance = new PropertyReferenceDataValue()
    .StringValue(StringValue)
    .NumericValue(NumericValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
