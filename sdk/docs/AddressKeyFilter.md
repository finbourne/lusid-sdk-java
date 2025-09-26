# com.finbourne.lusid.model.AddressKeyFilter
Class specifying a filtering operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | Address for the value in the row | [optional] [default to String]
**operator** | **String** | What sort of comparison is the filter performing. Can be either \&quot;eq\&quot; for equals or \&quot;neq\&quot; for not equals. | [optional] [default to String]
**right** | [**ResultValue**](ResultValue.md) |  | [optional] [default to ResultValue]

```java
import com.finbourne.lusid.model.AddressKeyFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Left = "example Left";
@jakarta.annotation.Nullable String Operator = "example Operator";
ResultValue Right = new ResultValue();


AddressKeyFilter addressKeyFilterInstance = new AddressKeyFilter()
    .Left(Left)
    .Operator(Operator)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
