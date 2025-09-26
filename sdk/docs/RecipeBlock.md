# com.finbourne.lusid.model.RecipeBlock
An atomic operation used in Recipe composer to compose a Configuration Recipe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**RecipeValue**](RecipeValue.md) |  | [optional] [default to RecipeValue]
**path** | **String** | Path of the Value that the operation is to be performed on. | [optional] [default to String]
**op** | **String** | Operation to be performed on the part of the value. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecipeBlock;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecipeValue Value = new RecipeValue();
@jakarta.annotation.Nullable String Path = "example Path";
@jakarta.annotation.Nullable String Op = "example Op";


RecipeBlock recipeBlockInstance = new RecipeBlock()
    .Value(Value)
    .Path(Path)
    .Op(Op);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
