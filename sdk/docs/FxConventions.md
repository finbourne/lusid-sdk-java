# com.finbourne.lusid.model.FxConventions
The conventions for the calculation of FX fixings, where the fixing rate is expected to be the amount of  DomCcy per unit of FgnCcy.  As an example, assume the required fixing is the WM/R 4pm mid closing rate for the USD amount per 1 EUR.  This is published with RIC EURUSDFIXM=WM, which would be the FixingReference, with FgnCcy EUR and DomCcy USD.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fgnCcy** | **String** | The foreign currency | [default to String]
**domCcy** | **String** | The domestic currency | [default to String]
**fixingReference** | **String** | The reference name used to find the desired quote | [default to String]

```java
import com.finbourne.lusid.model.FxConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FgnCcy = "example FgnCcy";
String DomCcy = "example DomCcy";
String FixingReference = "example FixingReference";


FxConventions fxConventionsInstance = new FxConventions()
    .FgnCcy(FgnCcy)
    .DomCcy(DomCcy)
    .FixingReference(FixingReference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
