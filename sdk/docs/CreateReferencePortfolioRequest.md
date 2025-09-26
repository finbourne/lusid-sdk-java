# com.finbourne.lusid.model.CreateReferencePortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the reference portfolio. | [default to String]
**description** | **String** | A long form text description of the portfolio. | [optional] [default to String]
**code** | **String** | Unique identifier for the portfolio. | [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The original creation date, defaults to today if not specified when creating a portfolio. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Portfolio properties to add to the portfolio. | [optional] [default to Map<String, Property>]
**instrumentScopes** | **List&lt;String&gt;** | Instrument Scopes. | [optional] [default to List<String>]
**baseCurrency** | **String** | The base currency of the transaction portfolio in ISO 4217 currency code format. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateReferencePortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Code = "example Code";
@jakarta.annotation.Nullable OffsetDateTime Created = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";


CreateReferencePortfolioRequest createReferencePortfolioRequestInstance = new CreateReferencePortfolioRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Code(Code)
    .Created(Created)
    .Properties(Properties)
    .InstrumentScopes(InstrumentScopes)
    .BaseCurrency(BaseCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
