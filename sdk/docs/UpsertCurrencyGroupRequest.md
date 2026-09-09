# com.finbourne.lusid.model.UpsertCurrencyGroupRequest
Request body for creating or updating a currency group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the currency group. This uniquely identifies the currency group within the tenant. | [default to String]
**displayName** | **String** | The name of the currency group. | [default to String]
**description** | **String** | A description for the currency group. | [optional] [default to String]
**majorUnitCurrency** | **String** | The three-letter, case-sensitive currency code of the group&#39;s major unit, e.g. GBP for the sterling group. | [default to String]
**circulationDomain** | **String** | The domain in which the group&#39;s currencies circulate, e.g. an ISO 3166 country code. | [optional] [default to String]
**minorUnits** | [**List&lt;CurrencyGroupMinorUnit&gt;**](CurrencyGroupMinorUnit.md) | The minor unit currencies belonging to this currency group. | [optional] [default to List<CurrencyGroupMinorUnit>]

```java
import com.finbourne.lusid.model.UpsertCurrencyGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String MajorUnitCurrency = "example MajorUnitCurrency";
@jakarta.annotation.Nullable String CirculationDomain = "example CirculationDomain";
@jakarta.annotation.Nullable List<CurrencyGroupMinorUnit> MinorUnits = new List<CurrencyGroupMinorUnit>();


UpsertCurrencyGroupRequest upsertCurrencyGroupRequestInstance = new UpsertCurrencyGroupRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .MajorUnitCurrency(MajorUnitCurrency)
    .CirculationDomain(CirculationDomain)
    .MinorUnits(MinorUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
