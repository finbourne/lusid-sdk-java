# com.finbourne.lusid.model.PropertyFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The key that uniquely identifies a queryable address in Lusid. | [optional] [default to String]
**operator** | **String** | The available values are: Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, In | [optional] [default to String]
**right** | **Object** |  | [optional] [default to Object]
**rightOperandType** | **String** | The available values are: Absolute, Property | [optional] [default to String]

```java
import com.finbourne.lusid.model.PropertyFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Left = "example Left";
String Operator = "example Operator";
@jakarta.annotation.Nullable Object String RightOperandType = "example RightOperandType";


PropertyFilter propertyFilterInstance = new PropertyFilter()
    .Left(Left)
    .Operator(Operator)
    .Right(Right)
    .RightOperandType(RightOperandType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
