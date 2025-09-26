# com.finbourne.lusid.model.IUnitDefinitionDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schema** | **String** | The available values are: NoUnits, Basic, Iso4217Currency | [optional] [default to String]
**code** | **String** |  | [optional] [readonly] [default to String]
**displayName** | **String** |  | [optional] [readonly] [default to String]
**description** | **String** |  | [optional] [readonly] [default to String]

```java
import com.finbourne.lusid.model.IUnitDefinitionDto;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Schema = "example Schema";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


IUnitDefinitionDto iUnitDefinitionDtoInstance = new IUnitDefinitionDto()
    .Schema(Schema)
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
