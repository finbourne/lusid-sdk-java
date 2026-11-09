# com.finbourne.lusid.model.TaxClassificationInputs
The instrument static the decision tree reads. A missing flag is a missing input, not a false.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loanRelationshipAsset** | **Boolean** | Whether the instrument is a loan relationship asset. | [optional] [default to Boolean]
**indexLinkedGilt** | **Boolean** | Whether the instrument is an index-linked gilt. | [optional] [default to Boolean]
**chargeableAsset** | **Boolean** | Whether disposals of the instrument give rise to chargeable gains. | [optional] [default to Boolean]
**cisNonTransparent** | **Boolean** | Whether the instrument is a non-transparent collective investment scheme. | [optional] [default to Boolean]
**cisTransparent** | **Boolean** | Whether the instrument is a transparent collective investment scheme. | [optional] [default to Boolean]
**derivative** | **Boolean** | Whether the instrument is a derivative contract. | [optional] [default to Boolean]
**derivativeFinancialFuture** | **Boolean** | Whether the derivative is a financial future or option within the chargeable gains rules. | [optional] [default to Boolean]
**derivativePooledSecurity** | **Boolean** | Whether the derivative is pooled as a security. | [optional] [default to Boolean]
**privateEquity** | **Boolean** | Whether the instrument is a private equity holding. | [optional] [default to Boolean]
**realEstate** | **Boolean** | Whether the instrument is a real estate holding. | [optional] [default to Boolean]
**qualifyingInvestmentsPercent** | **java.math.BigDecimal** | The percentage of the scheme&#39;s assets that are qualifying (non-equity) investments; more than 60 percent makes the scheme a bond fund. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxClassificationInputs;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Boolean LoanRelationshipAsset = true;
@jakarta.annotation.Nullable Boolean IndexLinkedGilt = true;
@jakarta.annotation.Nullable Boolean ChargeableAsset = true;
@jakarta.annotation.Nullable Boolean CisNonTransparent = true;
@jakarta.annotation.Nullable Boolean CisTransparent = true;
@jakarta.annotation.Nullable Boolean Derivative = true;
@jakarta.annotation.Nullable Boolean DerivativeFinancialFuture = true;
@jakarta.annotation.Nullable Boolean DerivativePooledSecurity = true;
@jakarta.annotation.Nullable Boolean PrivateEquity = true;
@jakarta.annotation.Nullable Boolean RealEstate = true;
@jakarta.annotation.Nullable java.math.BigDecimal QualifyingInvestmentsPercent = new java.math.BigDecimal("100.00");


TaxClassificationInputs taxClassificationInputsInstance = new TaxClassificationInputs()
    .LoanRelationshipAsset(LoanRelationshipAsset)
    .IndexLinkedGilt(IndexLinkedGilt)
    .ChargeableAsset(ChargeableAsset)
    .CisNonTransparent(CisNonTransparent)
    .CisTransparent(CisTransparent)
    .Derivative(Derivative)
    .DerivativeFinancialFuture(DerivativeFinancialFuture)
    .DerivativePooledSecurity(DerivativePooledSecurity)
    .PrivateEquity(PrivateEquity)
    .RealEstate(RealEstate)
    .QualifyingInvestmentsPercent(QualifyingInvestmentsPercent);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
