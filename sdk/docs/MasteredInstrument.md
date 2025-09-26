# com.finbourne.lusid.model.MasteredInstrument
LUSID representation of a reference to another instrument that has already been upserted (Mastered)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | Dictionary of identifiers of the mastered instrument | [default to Map<String, String>]
**masteredDomCcy** | **String** | DomCcy of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredInstrumentType** | **String** | Type of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredLusidInstrumentId** | **String** | Luid of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredName** | **String** | Name of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredScope** | **String** | Scope of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredAssetClass** | **String** | Asset class of the underlying mastered instrument - read only field    Supported string (enumeration) values are: [InterestRates, FX, Inflation, Equities, Credit, Commodities, Money].  Defaults to \&quot;Unknown\&quot; if not set. | [optional] [readonly] [default to String]

```java
import com.finbourne.lusid.model.MasteredInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable String MasteredDomCcy = "example MasteredDomCcy";
@jakarta.annotation.Nullable String MasteredInstrumentType = "example MasteredInstrumentType";
@jakarta.annotation.Nullable String MasteredLusidInstrumentId = "example MasteredLusidInstrumentId";
@jakarta.annotation.Nullable String MasteredName = "example MasteredName";
@jakarta.annotation.Nullable String MasteredScope = "example MasteredScope";
@jakarta.annotation.Nullable String MasteredAssetClass = "example MasteredAssetClass";


MasteredInstrument masteredInstrumentInstance = new MasteredInstrument()
    .Identifiers(Identifiers)
    .MasteredDomCcy(MasteredDomCcy)
    .MasteredInstrumentType(MasteredInstrumentType)
    .MasteredLusidInstrumentId(MasteredLusidInstrumentId)
    .MasteredName(MasteredName)
    .MasteredScope(MasteredScope)
    .MasteredAssetClass(MasteredAssetClass);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
