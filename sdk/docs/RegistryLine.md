# com.finbourne.lusid.model.RegistryLine
A line of a portfolio's registry: a partner register line with the fields of a holding row and its capital  balances. Registry lines are never holdings, so a line here is absent from the portfolio's holdings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentScope** | **String** | The scope in which the line&#39;s capital-interest instrument is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the capital-interest instrument of the line. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the line. These will be from the &#39;Instrument&#39; or &#39;Holding&#39; domain; the capital balances are available as &#39;Holding/system&#39; properties when requested by key. | [optional] [default to Map<String, Property>]
**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. | [default to String]
**holdingTypeName** | **String** | The decoded type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The number of units of the line, one per open line. | [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** | The number of settled units of the line. | [default to java.math.BigDecimal]
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**currency** | **String** | The commitment currency of the line. | [optional] [default to String]
**holdingId** | **Long** | A single identifier for the line within the portfolio, constructed from the LusidInstrumentId, sub-holding keys and currency. | [optional] [default to Long]
**investorRecordId** | **String** | The identifier of the investor record the line belongs to, as the register shows it. | [default to String]
**commitmentLineId** | **String** | The identifier of the commitment (register) line, as its capital-interest instrument declares it. | [default to String]
**committed** | **java.math.BigDecimal** | The committed capital, in the commitment currency. | [default to java.math.BigDecimal]
**uncalledCommitment** | **java.math.BigDecimal** | The commitment not yet called, in the commitment currency. | [default to java.math.BigDecimal]
**paidIn** | **java.math.BigDecimal** | The capital paid in, in the commitment currency. | [default to java.math.BigDecimal]
**returned** | **java.math.BigDecimal** | The capital returned, in the commitment currency. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | The returned capital that may be recalled, in the commitment currency. | [default to java.math.BigDecimal]
**unfunded** | **java.math.BigDecimal** | The unfunded commitment: the uncalled commitment plus the recallable capital, in the commitment currency. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.RegistryLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String InstrumentUid = "example InstrumentUid";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String HoldingType = "example HoldingType";
@jakarta.annotation.Nullable String HoldingTypeName = "example HoldingTypeName";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal SettledUnits = new java.math.BigDecimal("100.00");
CurrencyAndAmount Cost = new CurrencyAndAmount();
CurrencyAndAmount CostPortfolioCcy = new CurrencyAndAmount();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable Long HoldingId = new Long("100.00");
String InvestorRecordId = "example InvestorRecordId";
String CommitmentLineId = "example CommitmentLineId";
java.math.BigDecimal Committed = new java.math.BigDecimal("100.00");
java.math.BigDecimal UncalledCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal PaidIn = new java.math.BigDecimal("100.00");
java.math.BigDecimal Returned = new java.math.BigDecimal("100.00");
java.math.BigDecimal Recallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal Unfunded = new java.math.BigDecimal("100.00");


RegistryLine registryLineInstance = new RegistryLine()
    .PortfolioId(PortfolioId)
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .SubHoldingKeys(SubHoldingKeys)
    .Properties(Properties)
    .HoldingType(HoldingType)
    .HoldingTypeName(HoldingTypeName)
    .Units(Units)
    .SettledUnits(SettledUnits)
    .Cost(Cost)
    .CostPortfolioCcy(CostPortfolioCcy)
    .Currency(Currency)
    .HoldingId(HoldingId)
    .InvestorRecordId(InvestorRecordId)
    .CommitmentLineId(CommitmentLineId)
    .Committed(Committed)
    .UncalledCommitment(UncalledCommitment)
    .PaidIn(PaidIn)
    .Returned(Returned)
    .Recallable(Recallable)
    .Unfunded(Unfunded);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
