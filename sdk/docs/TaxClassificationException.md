# com.finbourne.lusid.model.TaxClassificationException
Why an instrument could not be classified, or a flip of the qualifying-investments test a reviewer must see.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | MissingInputs, ConflictingSetup, ConflictingOverride or QualifyingInvestmentsCrossing. Available values: MissingInputs, ConflictingSetup, ConflictingOverride, QualifyingInvestmentsCrossing. | [default to String]
**code** | **String** | The stable code of the exception, for filtering and routing. | [default to String]
**message** | **String** | A description of why the instrument could not be classified or why the crossing was raised. | [default to String]

```java
import com.finbourne.lusid.model.TaxClassificationException;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Kind = "example Kind";
String Code = "example Code";
String Message = "example Message";


TaxClassificationException taxClassificationExceptionInstance = new TaxClassificationException()
    .Kind(Kind)
    .Code(Code)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
