# com.finbourne.lusid.model.FundRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Fund. | [default to String]
**displayName** | **String** | The name of the Fund. | [optional] [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**aborId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [optional] [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39; | [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**yearEndDate** | [**DayMonth**](DayMonth.md) |  | [default to DayMonth]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.FundRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId FundConfigurationId = new ResourceId();
ResourceId AborId = new ResourceId();
@jakarta.annotation.Nullable List<String> ShareClassInstrumentScopes = new List<String>();
@jakarta.annotation.Nullable List<InstrumentResolutionDetail> ShareClassInstruments = new List<InstrumentResolutionDetail>();
String Type = "example Type";
OffsetDateTime InceptionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer DecimalPlaces = new Integer("100.00");
DayMonth YearEndDate = new DayMonth();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


FundRequest fundRequestInstance = new FundRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .FundConfigurationId(FundConfigurationId)
    .AborId(AborId)
    .ShareClassInstrumentScopes(ShareClassInstrumentScopes)
    .ShareClassInstruments(ShareClassInstruments)
    .Type(Type)
    .InceptionDate(InceptionDate)
    .DecimalPlaces(DecimalPlaces)
    .YearEndDate(YearEndDate)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
