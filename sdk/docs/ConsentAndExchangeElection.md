# com.finbourne.lusid.model.ConsentAndExchangeElection
Election to both grant consent and exchange the holding (CEXC), at a given units ratio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]

```java
import com.finbourne.lusid.model.ConsentAndExchangeElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;
UnitsRatio UnitsRatio = new UnitsRatio();


ConsentAndExchangeElection consentAndExchangeElectionInstance = new ConsentAndExchangeElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen)
    .UnitsRatio(UnitsRatio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
