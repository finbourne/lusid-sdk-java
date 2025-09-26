# com.finbourne.lusid.model.DataTypeSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeValueRange** | **String** | Indicates the range of data acceptable by a data type. The available values are: Open, Closed | [default to String]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The display name of the data type. | [default to String]
**description** | **String** | The description of the data type. | [default to String]
**valueType** | **String** | The expected type of the values. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText | [default to String]
**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies to &#39;open&#39; value type range. | [optional] [default to List<String>]
**unitSchema** | **String** | The schema of the data type&#39;s units. The available values are: NoUnits, Basic, Iso4217Currency | [optional] [default to String]
**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) | The definitions of the acceptable units. | [optional] [default to List<IUnitDefinitionDto>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.DataTypeSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TypeValueRange = "example TypeValueRange";
ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String Description = "example Description";
String ValueType = "example ValueType";
@jakarta.annotation.Nullable List<String> AcceptableValues = new List<String>();
String UnitSchema = "example UnitSchema";
@jakarta.annotation.Nullable List<IUnitDefinitionDto> AcceptableUnits = new List<IUnitDefinitionDto>();
Version Version = new Version();


DataTypeSummary dataTypeSummaryInstance = new DataTypeSummary()
    .TypeValueRange(TypeValueRange)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .ValueType(ValueType)
    .AcceptableValues(AcceptableValues)
    .UnitSchema(UnitSchema)
    .AcceptableUnits(AcceptableUnits)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
