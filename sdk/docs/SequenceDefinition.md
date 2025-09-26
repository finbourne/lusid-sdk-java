# com.finbourne.lusid.model.SequenceDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**increment** | **Long** | The Resource Id of the sequence definition | [default to Long]
**minValue** | **Long** | The minimum value of the sequence | [default to Long]
**maxValue** | **Long** | The maximum value of the sequence | [default to Long]
**start** | **Long** | The start value of the sequence | [default to Long]
**value** | **Long** | The last used value of the sequence | [optional] [default to Long]
**cycle** | **Boolean** | Indicates if the sequence would start from minimun value once it reaches maximum value. If set to false, a failure would return if the sequence reaches maximum value. | [default to Boolean]
**pattern** | **String** | The pattern to be used to generate next values in the sequence. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.SequenceDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
Long Increment = new Long("100.00");
Long MinValue = new Long("100.00");
Long MaxValue = new Long("100.00");
Long Start = new Long("100.00");
@jakarta.annotation.Nullable Long Value = new Long("100.00");
Boolean Cycle = true;
@jakarta.annotation.Nullable String Pattern = "example Pattern";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


SequenceDefinition sequenceDefinitionInstance = new SequenceDefinition()
    .Id(Id)
    .Increment(Increment)
    .MinValue(MinValue)
    .MaxValue(MaxValue)
    .Start(Start)
    .Value(Value)
    .Cycle(Cycle)
    .Pattern(Pattern)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
