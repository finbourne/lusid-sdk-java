# com.finbourne.lusid.model.DateAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**irregular** | **Boolean** |  | [default to Boolean]
**irregularSession** | **Boolean** |  | [default to Boolean]
**newHours** | **Boolean** |  | [default to Boolean]
**activity** | **String** |  | [optional] [default to String]
**firstOpen** | **String** |  | [optional] [default to String]
**lastOpen** | **String** |  | [optional] [default to String]
**firstClose** | **String** |  | [optional] [default to String]
**lastClose** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.DateAttributes;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Irregular = true;
Boolean IrregularSession = true;
Boolean NewHours = true;
@jakarta.annotation.Nullable String Activity = "example Activity";
@jakarta.annotation.Nullable String FirstOpen = "example FirstOpen";
@jakarta.annotation.Nullable String LastOpen = "example LastOpen";
@jakarta.annotation.Nullable String FirstClose = "example FirstClose";
@jakarta.annotation.Nullable String LastClose = "example LastClose";


DateAttributes dateAttributesInstance = new DateAttributes()
    .Irregular(Irregular)
    .IrregularSession(IrregularSession)
    .NewHours(NewHours)
    .Activity(Activity)
    .FirstOpen(FirstOpen)
    .LastOpen(LastOpen)
    .FirstClose(FirstClose)
    .LastClose(LastClose);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
