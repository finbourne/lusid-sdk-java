# com.finbourne.lusid.model.TaxCostRecordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioScope** | **String** | The scope of the portfolio the holding belongs to. | [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding belongs to. | [default to String]
**instrumentIdentifier** | **String** | The LUSID instrument identifier (LUID) of the holding the tax cost applies to. | [default to String]
**navTypeCode** | **String** | The code of the NAV type the tax cost applies to. Optional; omit for the fund&#39;s primary NAV type. | [optional] [default to String]
**taxCost** | **java.math.BigDecimal** | The tax cost of the holding at the effective period end, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**carriedForwardAmount** | **java.math.BigDecimal** | The amount carried forward into the next tax period, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**effectivePeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the tax period the record applies to. | [default to OffsetDateTime]
**sourceValuationPointId** | **String** | The identifier of the valuation point the record was derived from. Optional; omit for externally supplied records. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxCostRecordRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PortfolioScope = "example PortfolioScope";
String PortfolioCode = "example PortfolioCode";
String InstrumentIdentifier = "example InstrumentIdentifier";
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
java.math.BigDecimal TaxCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarriedForwardAmount = new java.math.BigDecimal("100.00");
OffsetDateTime EffectivePeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String SourceValuationPointId = "example SourceValuationPointId";


TaxCostRecordRequest taxCostRecordRequestInstance = new TaxCostRecordRequest()
    .PortfolioScope(PortfolioScope)
    .PortfolioCode(PortfolioCode)
    .InstrumentIdentifier(InstrumentIdentifier)
    .NavTypeCode(NavTypeCode)
    .TaxCost(TaxCost)
    .CarriedForwardAmount(CarriedForwardAmount)
    .EffectivePeriodEnd(EffectivePeriodEnd)
    .SourceValuationPointId(SourceValuationPointId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
