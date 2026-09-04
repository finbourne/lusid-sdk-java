# com.finbourne.lusid.model.PreferredShareAllOfIdentifiers
External market codes and identifiers for the share, e.g. its ISIN. A series is mastered once  per distinct security and shared across every holder.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentId** | **String** |  | [optional] [default to String]
**isin** | **String** |  | [optional] [default to String]
**sedol** | **String** |  | [optional] [default to String]
**cusip** | **String** |  | [optional] [default to String]
**clientInternal** | **String** |  | [optional] [default to String]
**figi** | **String** |  | [optional] [default to String]
**RIC** | **String** |  | [optional] [default to String]
**quotePermId** | **String** |  | [optional] [default to String]
**reDCode** | **String** |  | [optional] [default to String]
**bbGId** | **String** |  | [optional] [default to String]
**icECode** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.PreferredShareAllOfIdentifiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LusidInstrumentId = "example LusidInstrumentId";
String Isin = "example Isin";
String Sedol = "example Sedol";
String Cusip = "example Cusip";
String ClientInternal = "example ClientInternal";
String Figi = "example Figi";
String RIC = "example RIC";
String QuotePermId = "example QuotePermId";
String ReDCode = "example ReDCode";
String BbGId = "example BbGId";
String IcECode = "example IcECode";


PreferredShareAllOfIdentifiers preferredShareAllOfIdentifiersInstance = new PreferredShareAllOfIdentifiers()
    .LusidInstrumentId(LusidInstrumentId)
    .Isin(Isin)
    .Sedol(Sedol)
    .Cusip(Cusip)
    .ClientInternal(ClientInternal)
    .Figi(Figi)
    .RIC(RIC)
    .QuotePermId(QuotePermId)
    .ReDCode(ReDCode)
    .BbGId(BbGId)
    .IcECode(IcECode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
