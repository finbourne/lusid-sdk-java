# com.finbourne.lusid.model.Touch
Touch class for exotic FxOption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**direction** | **String** | Supported string (enumeration) values are: [Down, Up]. | [default to String]
**level** | **java.math.BigDecimal** | Trigger level, which the underlying should (or should not) cross/touch. | [default to java.math.BigDecimal]
**monitoring** | **String** | Supported string (enumeration) values are: [European, Bermudan, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**type** | **String** | Supported string (enumeration) values are: [Touch, Notouch]. | [default to String]

```java
import com.finbourne.lusid.model.Touch;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Direction = "example Direction";
java.math.BigDecimal Level = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Monitoring = "example Monitoring";
String Type = "example Type";


Touch touchInstance = new Touch()
    .Direction(Direction)
    .Level(Level)
    .Monitoring(Monitoring)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
