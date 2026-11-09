# com.finbourne.lusid.model.TaxClassification
The UK life-company tax classification of one instrument at one effective and asAt point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**luid** | **String** | The LUSID instrument identifier of the classified instrument. | [default to String]
**instrumentName** | **String** | The name of the classified instrument. | [optional] [default to String]
**instrumentType** | **String** | The LUSID instrument type of the classified instrument, where known. | [optional] [default to String]
**withinBlagab** | **Boolean** | Whether the instrument is held within the basic life assurance and general annuity business of the fund. Absent when the input has not been set. | [optional] [default to Boolean]
**inputs** | [**TaxClassificationInputs**](TaxClassificationInputs.md) |  | [default to TaxClassificationInputs]
**treatmentOverride** | **String** | The user-supplied treatment leaf that replaces the system-derived one, if any. Available values: OutsideBlagab, LoanRelationship, IndexLinkedGilt, PrivateEquity, RealEstate, FinancialFuture, PooledDerivative, DerivativeProfitAndLoss, NonTransparentScheme, BondFund, TransparentScheme, StandardEquity, Exempt. | [optional] [default to String]
**leaf** | **String** | The treatment leaf the decision tree arrived at. Absent when the instrument could not be classified. Available values: OutsideBlagab, LoanRelationship, IndexLinkedGilt, PrivateEquity, RealEstate, FinancialFuture, PooledDerivative, DerivativeProfitAndLoss, NonTransparentScheme, BondFund, TransparentScheme, StandardEquity, Exempt. | [optional] [default to String]
**treatment** | **String** | The tax treatment class implied by the leaf: ChargeableGains, LoanRelationship, Excluded or Unclassified. Available values: ChargeableGains, LoanRelationship, Excluded, Unclassified. | [default to String]
**status** | **String** | Classified, Overridden, Rejected or Unclassified. Available values: Classified, Overridden, Rejected, Unclassified. | [default to String]
**source** | **String** | Whether the leaf came from the System decision tree or a User override. Available values: System, User. | [default to String]
**ruleFired** | **String** | The name of the decision-tree rule that produced the leaf. | [default to String]
**trace** | [**List&lt;TaxClassificationDecisionStep&gt;**](TaxClassificationDecisionStep.md) | The ordered questions the decision tree asked and the answers it took, for audit. | [optional] [default to List<TaxClassificationDecisionStep>]
**exception** | [**TaxClassificationException**](TaxClassificationException.md) |  | [optional] [default to TaxClassificationException]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date the classification was evaluated at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the classification was evaluated at. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TaxClassification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String Luid = "example Luid";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable Boolean WithinBlagab = true;
TaxClassificationInputs Inputs = new TaxClassificationInputs();
@jakarta.annotation.Nullable String TreatmentOverride = "example TreatmentOverride";
@jakarta.annotation.Nullable String Leaf = "example Leaf";
String Treatment = "example Treatment";
String Status = "example Status";
String Source = "example Source";
String RuleFired = "example RuleFired";
@jakarta.annotation.Nullable List<TaxClassificationDecisionStep> Trace = new List<TaxClassificationDecisionStep>();
TaxClassificationException Exception = new TaxClassificationException();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TaxClassification taxClassificationInstance = new TaxClassification()
    .Href(Href)
    .Luid(Luid)
    .InstrumentName(InstrumentName)
    .InstrumentType(InstrumentType)
    .WithinBlagab(WithinBlagab)
    .Inputs(Inputs)
    .TreatmentOverride(TreatmentOverride)
    .Leaf(Leaf)
    .Treatment(Treatment)
    .Status(Status)
    .Source(Source)
    .RuleFired(RuleFired)
    .Trace(Trace)
    .Exception(Exception)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
