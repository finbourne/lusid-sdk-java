# com.finbourne.lusid.model.ComplianceKeyUsed
A key a holding contributed to the rule: the key, the role(s) it played in the rule, the holding's own value for  it, and which bag the value was read from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [default to String]
**roles** | **List&lt;String&gt;** |  | [default to List<String>]
**value** | **Object** | This holding&#39;s own value for the key. Polymorphic: a number for a result or metric property, a label string for  a label property, or a string for a related property. | [optional] [default to Object]
**source** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.ComplianceKeyUsed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
List<String> Roles = new List<String>();
@jakarta.annotation.Nullable Object String Source = "example Source";


ComplianceKeyUsed complianceKeyUsedInstance = new ComplianceKeyUsed()
    .Key(Key)
    .Roles(Roles)
    .Value(Value)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
