# com.finbourne.lusid.model.Bucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotId** | **String** | The identifier of the tax lot this bucket is for. | [optional] [default to String]
**movementName** | **String** | The name of the movement. | [optional] [default to String]
**holdingType** | **String** | The type of the holding. | [optional] [default to String]
**economicBucket** | **String** | The economic bucket. | [optional] [default to String]
**economicBucketComponent** | **String** | The economic bucket component. | [optional] [default to String]
**economicBucketVariant** | **String** | The economic bucket component. | [optional] [default to String]
**holdingSign** | **String** | The holding sign. | [optional] [default to String]
**local** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**base** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**units** | **java.math.BigDecimal** | The units. | [optional] [default to java.math.BigDecimal]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activity date of the bucket. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.Bucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String TaxLotId = "example TaxLotId";
@jakarta.annotation.Nullable String MovementName = "example MovementName";
@jakarta.annotation.Nullable String HoldingType = "example HoldingType";
@jakarta.annotation.Nullable String EconomicBucket = "example EconomicBucket";
@jakarta.annotation.Nullable String EconomicBucketComponent = "example EconomicBucketComponent";
@jakarta.annotation.Nullable String EconomicBucketVariant = "example EconomicBucketVariant";
@jakarta.annotation.Nullable String HoldingSign = "example HoldingSign";
CurrencyAndAmount Local = new CurrencyAndAmount();
CurrencyAndAmount Base = new CurrencyAndAmount();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
OffsetDateTime ActivityDate = OffsetDateTime.now();


Bucket bucketInstance = new Bucket()
    .TaxLotId(TaxLotId)
    .MovementName(MovementName)
    .HoldingType(HoldingType)
    .EconomicBucket(EconomicBucket)
    .EconomicBucketComponent(EconomicBucketComponent)
    .EconomicBucketVariant(EconomicBucketVariant)
    .HoldingSign(HoldingSign)
    .Local(Local)
    .Base(Base)
    .Units(Units)
    .ActivityDate(ActivityDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
