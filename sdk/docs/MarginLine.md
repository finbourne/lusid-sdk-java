# com.finbourne.lusid.model.MarginLine
One holding's contribution to a margin call: its exposure, or its value as collateral.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run that produced the line. | [default to String]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**item** | **String** | The margin item the line falls under. Filterable. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingId** | **String** | The holding the line was valued from. | [optional] [default to String]
**custodianAccountScope** | **String** | The scope of the custodian account the holding sits in, when it has one. | [optional] [default to String]
**custodianAccountCode** | **String** | The code of the custodian account the holding sits in, when it has one. | [optional] [default to String]
**custodianAccountName** | **String** | The name of the custodian account, when it has one. | [optional] [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The identifiers of the instrument held. | [default to Map<String, String>]
**units** | **java.math.BigDecimal** | The units held. | [default to java.math.BigDecimal]
**pv** | **java.math.BigDecimal** | The present value of the holding in the agreement&#39;s base currency, when it contributes to exposure. | [optional] [default to java.math.BigDecimal]
**variationMargin** | **java.math.BigDecimal** | The holding&#39;s contribution to variation margin, when it contributes to exposure. | [optional] [default to java.math.BigDecimal]
**collateralValue** | **java.math.BigDecimal** | The holding&#39;s value as collateral after haircuts, when it is held as collateral. | [optional] [default to java.math.BigDecimal]
**initialMarginItem** | **String** | The initial-margin item the line falls under, when the holding matched one. Filterable. | [optional] [default to String]
**initialMargin** | **java.math.BigDecimal** | The holding&#39;s share of its netting set&#39;s initial margin, before the threshold, when it contributes to it. | [optional] [default to java.math.BigDecimal]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.MarginLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
ResourceId AgreementId = new ResourceId();
String Item = "example Item";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String CustodianAccountScope = "example CustodianAccountScope";
@jakarta.annotation.Nullable String CustodianAccountCode = "example CustodianAccountCode";
@jakarta.annotation.Nullable String CustodianAccountName = "example CustodianAccountName";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Pv = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal VariationMargin = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CollateralValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String InitialMarginItem = "example InitialMarginItem";
@jakarta.annotation.Nullable java.math.BigDecimal InitialMargin = new java.math.BigDecimal("100.00");
ResourceId Scenario = new ResourceId();


MarginLine marginLineInstance = new MarginLine()
    .RunId(RunId)
    .AgreementId(AgreementId)
    .Item(Item)
    .PortfolioId(PortfolioId)
    .HoldingId(HoldingId)
    .CustodianAccountScope(CustodianAccountScope)
    .CustodianAccountCode(CustodianAccountCode)
    .CustodianAccountName(CustodianAccountName)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Units(Units)
    .Pv(Pv)
    .VariationMargin(VariationMargin)
    .CollateralValue(CollateralValue)
    .InitialMarginItem(InitialMarginItem)
    .InitialMargin(InitialMargin)
    .Scenario(Scenario);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
