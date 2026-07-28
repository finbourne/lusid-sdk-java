# com.finbourne.lusid.model.PaymentDetailsReference
A pointer to a Payment Details relational dataset series for a payor or payee entity.  No PII is stored here — bank account details are resolved at read time from the referenced series.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesScope** | **String** | The scope of the relational datapoint. May differ from the scope of the dataset definition. | [default to String]
**applicableEntity** | [**PaymentDetailsApplicableEntity**](PaymentDetailsApplicableEntity.md) |  | [default to PaymentDetailsApplicableEntity]
**seriesIdentifiers** | [**PaymentDetailsSeriesIdentifiers**](PaymentDetailsSeriesIdentifiers.md) |  | [default to PaymentDetailsSeriesIdentifiers]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PaymentDetailsReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SeriesScope = "example SeriesScope";
PaymentDetailsApplicableEntity ApplicableEntity = new PaymentDetailsApplicableEntity();
PaymentDetailsSeriesIdentifiers SeriesIdentifiers = new PaymentDetailsSeriesIdentifiers();
OffsetDateTime EffectiveDate = OffsetDateTime.now();
OffsetDateTime AsAtDate = OffsetDateTime.now();


PaymentDetailsReference paymentDetailsReferenceInstance = new PaymentDetailsReference()
    .SeriesScope(SeriesScope)
    .ApplicableEntity(ApplicableEntity)
    .SeriesIdentifiers(SeriesIdentifiers)
    .EffectiveDate(EffectiveDate)
    .AsAtDate(AsAtDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
