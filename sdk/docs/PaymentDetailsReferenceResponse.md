# com.finbourne.lusid.model.PaymentDetailsReferenceResponse
Response representation of a Payment Details reference. Extends the request shape with  a system-populated relational dataset definition identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**seriesScope** | **String** | The scope of the relational datapoint. May differ from the scope of the dataset definition. | [default to String]
**applicableEntity** | [**PaymentDetailsApplicableEntity**](PaymentDetailsApplicableEntity.md) |  | [default to PaymentDetailsApplicableEntity]
**seriesIdentifiers** | [**PaymentDetailsSeriesIdentifiers**](PaymentDetailsSeriesIdentifiers.md) |  | [default to PaymentDetailsSeriesIdentifiers]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PaymentDetailsReferenceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RelationalDatasetDefinitionId = new ResourceId();
String SeriesScope = "example SeriesScope";
PaymentDetailsApplicableEntity ApplicableEntity = new PaymentDetailsApplicableEntity();
PaymentDetailsSeriesIdentifiers SeriesIdentifiers = new PaymentDetailsSeriesIdentifiers();
OffsetDateTime EffectiveDate = OffsetDateTime.now();
OffsetDateTime AsAtDate = OffsetDateTime.now();


PaymentDetailsReferenceResponse paymentDetailsReferenceResponseInstance = new PaymentDetailsReferenceResponse()
    .RelationalDatasetDefinitionId(RelationalDatasetDefinitionId)
    .SeriesScope(SeriesScope)
    .ApplicableEntity(ApplicableEntity)
    .SeriesIdentifiers(SeriesIdentifiers)
    .EffectiveDate(EffectiveDate)
    .AsAtDate(AsAtDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
