# com.finbourne.lusid.model.ConsentGrantedElection
Election to grant consent to the proposed action (CONY), optionally in return for a consent fee.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**consentFeePrice** | **java.math.BigDecimal** | Optional. The consent fee paid per unit for granting consent. | [optional] [default to java.math.BigDecimal]
**consentFeeCurrency** | **String** | Optional. Currency of the consent fee. Required if a consent fee price is provided. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ConsentGrantedElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;
@jakarta.annotation.Nullable java.math.BigDecimal ConsentFeePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConsentFeeCurrency = "example ConsentFeeCurrency";


ConsentGrantedElection consentGrantedElectionInstance = new ConsentGrantedElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen)
    .ConsentFeePrice(ConsentFeePrice)
    .ConsentFeeCurrency(ConsentFeeCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
