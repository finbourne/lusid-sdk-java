# com.finbourne.lusid.model.FundPartner
A register line of a partnership fund: one partner's commitment and its capital balances at an effective date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The identifier of the investor record this register line belongs to. | [default to String]
**displayName** | **String** | The display name of the partner. | [optional] [default to String]
**commitmentLineId** | **String** | The identifier of the commitment (register) line. | [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument identifier of the register line&#39;s capital-interest instrument. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**isVehicle** | **Boolean** | Whether the partner is a vehicle (for example a feeder or parallel fund) rather than an end investor. | [default to Boolean]
**partnerRole** | **String** | The role the partner plays in the partnership. Available values: LimitedPartner (the default), GeneralPartner, GPAffiliate, Employee, CarryVehicle. | [default to String]
**registerRole** | **String** | The role of the register line. Available values: GPRegister, LPInvestment (the default). | [default to String]
**commitmentCurrency** | **String** | The currency of the partner&#39;s commitment. | [default to String]
**balances** | [**FundPartnerBalances**](FundPartnerBalances.md) |  | [default to FundPartnerBalances]
**shareOfCommitments** | **java.math.BigDecimal** | The partner&#39;s committed capital as a decimal fraction of the fund&#39;s total commitments in the same commitment currency. | [default to java.math.BigDecimal]
**admittedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date the partner was admitted, being the date of their first commitment. | [optional] [default to OffsetDateTime]
**totals** | [**FundPartnersTotals**](FundPartnersTotals.md) |  | [default to FundPartnersTotals]

```java
import com.finbourne.lusid.model.FundPartner;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
String CommitmentLineId = "example CommitmentLineId";
String LusidInstrumentId = "example LusidInstrumentId";
ResourceId PortfolioId = new ResourceId();
Boolean IsVehicle = true;
String PartnerRole = "example PartnerRole";
String RegisterRole = "example RegisterRole";
String CommitmentCurrency = "example CommitmentCurrency";
FundPartnerBalances Balances = new FundPartnerBalances();
java.math.BigDecimal ShareOfCommitments = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime AdmittedOn = OffsetDateTime.now();
FundPartnersTotals Totals = new FundPartnersTotals();


FundPartner fundPartnerInstance = new FundPartner()
    .InvestorRecordId(InvestorRecordId)
    .DisplayName(DisplayName)
    .CommitmentLineId(CommitmentLineId)
    .LusidInstrumentId(LusidInstrumentId)
    .PortfolioId(PortfolioId)
    .IsVehicle(IsVehicle)
    .PartnerRole(PartnerRole)
    .RegisterRole(RegisterRole)
    .CommitmentCurrency(CommitmentCurrency)
    .Balances(Balances)
    .ShareOfCommitments(ShareOfCommitments)
    .AdmittedOn(AdmittedOn)
    .Totals(Totals);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
