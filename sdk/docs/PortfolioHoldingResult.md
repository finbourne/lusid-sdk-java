# com.finbourne.lusid.model.PortfolioHoldingResult
Represents holding details for a data quality check result, where LusidEntityResult represents a scope-and-code  or identifier-addressed entity. A holding has no scope and code of its own, so it is identified by the portfolio  it came from plus what distinguishes it within that portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity. Always \&quot;Holding\&quot;. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp for the holding | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective-at timestamp for the holding | [optional] [default to OffsetDateTime]
**sourcePortfolioScope** | **String** | The scope of the portfolio this holding came from | [optional] [default to String]
**sourcePortfolioCode** | **String** | The code of the portfolio this holding came from | [optional] [default to String]
**sourcePortfolioEntityUniqueId** | **String** | The unique identifier of the portfolio this holding came from | [optional] [default to String]
**sourcePortfolioDisplayName** | **String** | The display name of the portfolio this holding came from | [optional] [default to String]
**holdingId** | **String** | The holding&#39;s identifier within its portfolio | [optional] [default to String]
**taxlotId** | **String** | The tax lot identifier, where the holding was expanded to tax lots. Null otherwise. | [optional] [default to String]
**subEntityId** | **String** | Identifies the holding to the derived property explain API: the holding id on its own, or the holding id  and tax lot id colon-separated where a tax lot is present. | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument identifier of the instrument held | [optional] [default to String]
**instrumentDisplayName** | **String** | The name of the instrument held | [optional] [default to String]
**holdingTypeName** | **String** | The kind of holding, e.g. Position, Balance | [optional] [default to String]
**currency** | **String** | The currency of the holding | [optional] [default to String]

```java
import com.finbourne.lusid.model.PortfolioHoldingResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EntityType = "example EntityType";
OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String SourcePortfolioScope = "example SourcePortfolioScope";
@jakarta.annotation.Nullable String SourcePortfolioCode = "example SourcePortfolioCode";
@jakarta.annotation.Nullable String SourcePortfolioEntityUniqueId = "example SourcePortfolioEntityUniqueId";
@jakarta.annotation.Nullable String SourcePortfolioDisplayName = "example SourcePortfolioDisplayName";
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String TaxlotId = "example TaxlotId";
@jakarta.annotation.Nullable String SubEntityId = "example SubEntityId";
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentDisplayName = "example InstrumentDisplayName";
@jakarta.annotation.Nullable String HoldingTypeName = "example HoldingTypeName";
@jakarta.annotation.Nullable String Currency = "example Currency";


PortfolioHoldingResult portfolioHoldingResultInstance = new PortfolioHoldingResult()
    .EntityType(EntityType)
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt)
    .SourcePortfolioScope(SourcePortfolioScope)
    .SourcePortfolioCode(SourcePortfolioCode)
    .SourcePortfolioEntityUniqueId(SourcePortfolioEntityUniqueId)
    .SourcePortfolioDisplayName(SourcePortfolioDisplayName)
    .HoldingId(HoldingId)
    .TaxlotId(TaxlotId)
    .SubEntityId(SubEntityId)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentDisplayName(InstrumentDisplayName)
    .HoldingTypeName(HoldingTypeName)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
