# com.finbourne.lusid.model.MappedString

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftValue** | **String** |  | [optional] [default to String]
**rightValue** | **String** |  | [optional] [default to String]
**mappingDirection** | **String** |  | [optional] [default to String]
**isCaseSensitive** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.MappedString;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LeftValue = "example LeftValue";
@jakarta.annotation.Nullable String RightValue = "example RightValue";
@jakarta.annotation.Nullable String MappingDirection = "example MappingDirection";
Boolean IsCaseSensitive = true;


MappedString mappedStringInstance = new MappedString()
    .LeftValue(LeftValue)
    .RightValue(RightValue)
    .MappingDirection(MappingDirection)
    .IsCaseSensitive(IsCaseSensitive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
