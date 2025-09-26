# com.finbourne.lusid.model.InstrumentEventInstructionsResponse
The collection of successfully upserted instructions, and the collection of failures for those instructions that could not be upserted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, InstrumentEventInstruction&gt;**](InstrumentEventInstruction.md) | The collection of successfully upserted instructions | [optional] [default to Map<String, InstrumentEventInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of error information for instructions that could not be upserted | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.lusid.model.InstrumentEventInstructionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, InstrumentEventInstruction> Values = new Map<String, InstrumentEventInstruction>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();


InstrumentEventInstructionsResponse instrumentEventInstructionsResponseInstance = new InstrumentEventInstructionsResponse()
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
