# com.finbourne.lusid.model.CreateSequenceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the sequence definition to create | [default to String]
**increment** | **Long** | The value to increment between each value in the sequence | [optional] [default to Long]
**minValue** | **Long** | The minimum value of the sequence | [optional] [default to Long]
**maxValue** | **Long** | The maximum value of the sequence | [optional] [default to Long]
**start** | **Long** | The start value of the sequence | [optional] [default to Long]
**cycle** | **Boolean** | Set to true to start the sequence over again when it reaches the end. Defaults to false if not provided. | [optional] [default to Boolean]
**pattern** | **String** | The pattern to be used to generate next values in the sequence. Defaults to null if not provided. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateSequenceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable Long Increment = new Long("100.00");
@jakarta.annotation.Nullable Long MinValue = new Long("100.00");
@jakarta.annotation.Nullable Long MaxValue = new Long("100.00");
@jakarta.annotation.Nullable Long Start = new Long("100.00");
Boolean Cycle = true;
@jakarta.annotation.Nullable String Pattern = "example Pattern";


CreateSequenceRequest createSequenceRequestInstance = new CreateSequenceRequest()
    .Code(Code)
    .Increment(Increment)
    .MinValue(MinValue)
    .MaxValue(MaxValue)
    .Start(Start)
    .Cycle(Cycle)
    .Pattern(Pattern);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
