# com.finbourne.lusid.model.Mapping
Defines the rule set to be used to determine if entries should be considered as a match.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope for this mapping. | [default to String]
**code** | **String** | The code for this mapping. | [default to String]
**name** | **String** | The mapping name | [default to String]
**reconciliationType** | **String** | What type of reconciliation this mapping is for | [default to String]
**rules** | [**List&lt;MappingRule&gt;**](MappingRule.md) | The rules in this mapping, keyed by the left field/property name | [optional] [default to List<MappingRule>]

```java
import com.finbourne.lusid.model.Mapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String Name = "example Name";
String ReconciliationType = "example ReconciliationType";
@jakarta.annotation.Nullable List<MappingRule> Rules = new List<MappingRule>();


Mapping mappingInstance = new Mapping()
    .Scope(Scope)
    .Code(Code)
    .Name(Name)
    .ReconciliationType(ReconciliationType)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
