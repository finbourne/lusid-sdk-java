# com.finbourne.lusid.model.PortfolioHolding
A list of holdings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the holding&#39;s instrument is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; or &#39;Holding&#39; domain. | [optional] [default to Map<String, Property>]
**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. | [default to String]
**units** | **java.math.BigDecimal** | The total number of units of the holding. | [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** | The total number of settled units of the holding. | [default to java.math.BigDecimal]
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**transaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**currency** | **String** | The holding currency. | [optional] [default to String]
**holdingTypeName** | **String** | The decoded type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc. | [optional] [default to String]
**holdingId** | **Long** | A single identifier for the holding within the portfolio. The holdingId is constructed from the LusidInstrumentId, sub-holding keys and currrency and is unique within the portfolio. | [optional] [default to Long]
**notionalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**amortisedCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**amortisedCostPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**variationMargin** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**variationMarginPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**settlementSchedule** | [**List&lt;SettlementSchedule&gt;**](SettlementSchedule.md) | Where no. of days ahead has been specified, future dated settlements will be captured here. | [optional] [default to List<SettlementSchedule>]
**currentFace** | **java.math.BigDecimal** | Current face value of the holding. | [optional] [default to java.math.BigDecimal]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**unsettledUnits** | **java.math.BigDecimal** | The number of unsettled units for the holding. | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** | The number of unsettled units for the holding that are beyond their contractual settlement date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PortfolioHolding;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String InstrumentUid = "example InstrumentUid";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String HoldingType = "example HoldingType";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal SettledUnits = new java.math.BigDecimal("100.00");
CurrencyAndAmount Cost = new CurrencyAndAmount();
CurrencyAndAmount CostPortfolioCcy = new CurrencyAndAmount();
Transaction Transaction = new Transaction();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String HoldingTypeName = "example HoldingTypeName";
@jakarta.annotation.Nullable Long HoldingId = new Long("100.00");
CurrencyAndAmount NotionalCost = new CurrencyAndAmount();
CurrencyAndAmount AmortisedCost = new CurrencyAndAmount();
CurrencyAndAmount AmortisedCostPortfolioCcy = new CurrencyAndAmount();
CurrencyAndAmount VariationMargin = new CurrencyAndAmount();
CurrencyAndAmount VariationMarginPortfolioCcy = new CurrencyAndAmount();
@jakarta.annotation.Nullable List<SettlementSchedule> SettlementSchedule = new List<SettlementSchedule>();
@jakarta.annotation.Nullable java.math.BigDecimal CurrentFace = new java.math.BigDecimal("100.00");
ResourceId CustodianAccountId = new ResourceId();
java.math.BigDecimal UnsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal OverdueUnits = new java.math.BigDecimal("100.00");


PortfolioHolding portfolioHoldingInstance = new PortfolioHolding()
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .SubHoldingKeys(SubHoldingKeys)
    .Properties(Properties)
    .HoldingType(HoldingType)
    .Units(Units)
    .SettledUnits(SettledUnits)
    .Cost(Cost)
    .CostPortfolioCcy(CostPortfolioCcy)
    .Transaction(Transaction)
    .Currency(Currency)
    .HoldingTypeName(HoldingTypeName)
    .HoldingId(HoldingId)
    .NotionalCost(NotionalCost)
    .AmortisedCost(AmortisedCost)
    .AmortisedCostPortfolioCcy(AmortisedCostPortfolioCcy)
    .VariationMargin(VariationMargin)
    .VariationMarginPortfolioCcy(VariationMarginPortfolioCcy)
    .SettlementSchedule(SettlementSchedule)
    .CurrentFace(CurrentFace)
    .CustodianAccountId(CustodianAccountId)
    .UnsettledUnits(UnsettledUnits)
    .OverdueUnits(OverdueUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
