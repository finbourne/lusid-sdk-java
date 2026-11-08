# com.finbourne.lusid.model.EligibleCollateralRow
One class of eligible collateral and how it is valued, as stored on a schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The stable key the row is referred to by. Unique within the schedule. | [default to String]
**description** | **String** | A description of the row. Optional. | [optional] [default to String]
**selector** | [**EligibleCollateralAssetSelector**](EligibleCollateralAssetSelector.md) |  | [default to EligibleCollateralAssetSelector]
**valuationPercentage** | **java.math.BigDecimal** | The fraction of an asset&#39;s value that is accepted as collateral, for example 0.95 for 95%. Greater than 0 and at most 1. | [default to java.math.BigDecimal]
**fxHaircut** | **java.math.BigDecimal** | The further fraction deducted when the asset&#39;s currency is not the agreement&#39;s base currency, so that the effective valuation percentage is ValuationPercentage - FxHaircut. At least 0 and less than the valuationPercentage. Not allowed for a BaseCurrencyCash selector. Optional. | [optional] [default to java.math.BigDecimal]
**minResidualMaturityYears** | **java.math.BigDecimal** | The inclusive lower bound of the residual maturity in years that the row applies to. Only allowed for an Instrument selector. Optional. | [optional] [default to java.math.BigDecimal]
**maxResidualMaturityYears** | **java.math.BigDecimal** | The exclusive upper bound of the residual maturity in years that the row applies to. Only allowed for an Instrument selector. Optional. | [optional] [default to java.math.BigDecimal]
**concentrationGroup** | **String** | The group the row&#39;s assets count towards for a concentration limit, for example &#39;sovereign&#39; or &#39;issuer&#39;. Rows naming the same group share one limit. Required when a concentrationLimit is set. Optional. | [optional] [default to String]
**concentrationLimit** | **java.math.BigDecimal** | The largest fraction of the collateral held plus the call that assets of the row&#39;s concentration group may make up, for example 0.3 for 30%. Greater than 0 and at most 1. Required when a concentrationGroup is set. Optional. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.EligibleCollateralRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
EligibleCollateralAssetSelector Selector = new EligibleCollateralAssetSelector();
java.math.BigDecimal ValuationPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FxHaircut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinResidualMaturityYears = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MaxResidualMaturityYears = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConcentrationGroup = "example ConcentrationGroup";
@jakarta.annotation.Nullable java.math.BigDecimal ConcentrationLimit = new java.math.BigDecimal("100.00");


EligibleCollateralRow eligibleCollateralRowInstance = new EligibleCollateralRow()
    .Code(Code)
    .Description(Description)
    .Selector(Selector)
    .ValuationPercentage(ValuationPercentage)
    .FxHaircut(FxHaircut)
    .MinResidualMaturityYears(MinResidualMaturityYears)
    .MaxResidualMaturityYears(MaxResidualMaturityYears)
    .ConcentrationGroup(ConcentrationGroup)
    .ConcentrationLimit(ConcentrationLimit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
