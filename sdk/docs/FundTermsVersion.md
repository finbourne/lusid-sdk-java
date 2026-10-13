# com.finbourne.lusid.model.FundTermsVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**termsVersionId** | **String** |  | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**fees** | [**List&lt;FeeDefinition&gt;**](FeeDefinition.md) |  | [optional] [default to List<FeeDefinition>]
**carry** | [**CarryParameters**](CarryParameters.md) |  | [optional] [default to CarryParameters]
**recycling** | [**RecyclingTerms**](RecyclingTerms.md) |  | [optional] [default to RecyclingTerms]
**equalisation** | [**EqualisationTerms**](EqualisationTerms.md) |  | [optional] [default to EqualisationTerms]
**appliesFromClosingId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundTermsVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TermsVersionId = "example TermsVersionId";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable List<FeeDefinition> Fees = new List<FeeDefinition>();
CarryParameters Carry = new CarryParameters();
RecyclingTerms Recycling = new RecyclingTerms();
EqualisationTerms Equalisation = new EqualisationTerms();
@jakarta.annotation.Nullable String AppliesFromClosingId = "example AppliesFromClosingId";


FundTermsVersion fundTermsVersionInstance = new FundTermsVersion()
    .TermsVersionId(TermsVersionId)
    .EffectiveFrom(EffectiveFrom)
    .Fees(Fees)
    .Carry(Carry)
    .Recycling(Recycling)
    .Equalisation(Equalisation)
    .AppliesFromClosingId(AppliesFromClosingId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
