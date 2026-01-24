# com.finbourne.lusid.model.PostCloseActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity, possible values are: * &#x60;PortfolioTransaction&#x60;, * &#x60;Instrument&#x60;, * &#x60;InstrumentEvent&#x60;, * &#x60;InstrumentEventInstruction&#x60;, * &#x60;PortfolioSettlementInstruction&#x60;, and, * &#x60;Quote&#x60;. | [default to String]
**entityUniqueId** | **String** | The entity unique ID. The expected format for each entity is: | entityType | entityUniqueId | |----------------------------------|---------------------------------------------------| | &#x60;PortfolioTransaction&#x60; | &#x60;portfolioUniqueId_transactionId&#x60; | | &#x60;Instrument&#x60; | &#x60;instrumentUniqueId&#x60; | | &#x60;InstrumentEvent&#x60; | &#x60;corporateActionSourceUniqueId_instrumentEventId&#x60; | | &#x60;InstrumentEventInstruction&#x60; | &#x60;portfolioUniqueId_instructionId&#x60; | | &#x60;PortfolioSettlementInstruction&#x60; | &#x60;portfolioUniqueId_settlementInstructionId&#x60; | | &#x60;Quote&#x60; | &#x60;quoteSeriesUniqueId_quoteSeriesInstrumentId&#x60; | | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The &#x60;AsAt&#x60; time of the event that needs to be added to the closed period. | [default to OffsetDateTime]
**effectiveAt** | **String** | The &#x60;EffectiveAt&#x60; time of the event that need to be added to the closed period. This can be a date or cut label. Only applicable for &#x60;Quote&#x60; post-close activities. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PostCloseActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
String EntityUniqueId = "example EntityUniqueId";
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String EffectiveAt = "example EffectiveAt";


PostCloseActivity postCloseActivityInstance = new PostCloseActivity()
    .EntityType(EntityType)
    .EntityUniqueId(EntityUniqueId)
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
