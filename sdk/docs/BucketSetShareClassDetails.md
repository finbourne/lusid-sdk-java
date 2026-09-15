# com.finbourne.lusid.model.BucketSetShareClassDetails
Identifying detail for the share class a bucket set node is for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier for the share class&#39; instrument. Absent where the instrument has not been resolved. | [optional] [default to String]
**instrumentScope** | **String** | The scope in which the share class instrument lies. Absent where the instrument has not been resolved. | [optional] [default to String]
**shortCode** | **String** | The unique code within the fund for the share class. | [default to String]
**domCurrency** | **String** | The domestic currency declared for the share class. | [optional] [default to String]
**instrumentActive** | **Boolean** | Whether the share class&#39; instrument is active. | [default to Boolean]

```java
import com.finbourne.lusid.model.BucketSetShareClassDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String ShortCode = "example ShortCode";
@jakarta.annotation.Nullable String DomCurrency = "example DomCurrency";
Boolean InstrumentActive = true;


BucketSetShareClassDetails bucketSetShareClassDetailsInstance = new BucketSetShareClassDetails()
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .ShortCode(ShortCode)
    .DomCurrency(DomCurrency)
    .InstrumentActive(InstrumentActive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
