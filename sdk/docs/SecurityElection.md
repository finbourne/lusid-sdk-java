# com.finbourne.lusid.model.SecurityElection
Security election for Events that result in equity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**price** | **java.math.BigDecimal** | Price per unit of the security. At least one of UnitsRatio or Price must be provided.  Price must non-zero. | [optional] [default to java.math.BigDecimal]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [optional] [default to UnitsRatio]

```java
import com.finbourne.lusid.model.SecurityElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsChosen = true;
Boolean IsDefault = true;
@jakarta.annotation.Nullable java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
UnitsRatio UnitsRatio = new UnitsRatio();


SecurityElection securityElectionInstance = new SecurityElection()
    .ElectionKey(ElectionKey)
    .IsChosen(IsChosen)
    .IsDefault(IsDefault)
    .Price(Price)
    .UnitsRatio(UnitsRatio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
