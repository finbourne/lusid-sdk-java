# com.finbourne.lusid.model.InvestorIdentifier
Identification of an Investor on the LUSID API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorType** | **String** | The type of the investor of the Investor Record. Can be either a Person, LegalEntity or Nominee. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Single identifier that should target the desired person or legal entity | [optional] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.InvestorIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorType = "example InvestorType";
@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();


InvestorIdentifier investorIdentifierInstance = new InvestorIdentifier()
    .InvestorType(InvestorType)
    .Identifiers(Identifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
