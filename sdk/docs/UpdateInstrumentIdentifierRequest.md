# com.finbourne.lusid.model.UpdateInstrumentIdentifierRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The allowable instrument identifier to update, insert or remove e.g. &#39;Figi&#39;. | [default to String]
**value** | **String** | The new value of the allowable instrument identifier. If unspecified the identifier will be removed from the instrument. | [optional] [default to String]
**effectiveAt** | **String** | The effective datetime from which the identifier should be updated, inserted or removed. Defaults to the current LUSID system datetime if not specified. | [optional] [default to String]

```java
import com.finbourne.lusid.model.UpdateInstrumentIdentifierRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String Value = "example Value";
@jakarta.annotation.Nullable String EffectiveAt = "example EffectiveAt";


UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequestInstance = new UpdateInstrumentIdentifierRequest()
    .Type(Type)
    .Value(Value)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
