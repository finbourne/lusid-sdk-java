# com.finbourne.lusid.model.CreateDataTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the data type will be created in. | [default to String]
**code** | **String** | The code of the data type. Together with the scope this uniquely defines the data type. | [default to String]
**typeValueRange** | **String** | Indicates the range of data acceptable by a data type. Available values: Open, Closed. | [default to String]
**displayName** | **String** | The display name of the data type. | [default to String]
**description** | **String** | The description of the data type. | [default to String]
**valueType** | **String** | The expected type of the values. Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [default to String]
**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies when the type value range is &#39;Closed&#39;; it is ignored on write and returned as null for &#39;Open&#39; data types. If reference data is supplied on a &#39;Closed&#39; data type and this field is omitted, the acceptable values are derived from the reference data values. | [optional] [default to List<String>]
**unitSchema** | **String** | The schema of the data type&#39;s units. Available values: NoUnits, Basic, Iso4217Currency. | [optional] [default to String]
**acceptableUnits** | [**List&lt;CreateUnitDefinition&gt;**](CreateUnitDefinition.md) | The definitions of the acceptable units. | [optional] [default to List<CreateUnitDefinition>]
**referenceData** | [**ReferenceData**](ReferenceData.md) |  | [optional] [default to ReferenceData]

```java
import com.finbourne.lusid.model.CreateDataTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String TypeValueRange = "example TypeValueRange";
String DisplayName = "example DisplayName";
String Description = "example Description";
String ValueType = "example ValueType";
@jakarta.annotation.Nullable List<String> AcceptableValues = new List<String>();
String UnitSchema = "example UnitSchema";
@jakarta.annotation.Nullable List<CreateUnitDefinition> AcceptableUnits = new List<CreateUnitDefinition>();
ReferenceData ReferenceData = new ReferenceData();


CreateDataTypeRequest createDataTypeRequestInstance = new CreateDataTypeRequest()
    .Scope(Scope)
    .Code(Code)
    .TypeValueRange(TypeValueRange)
    .DisplayName(DisplayName)
    .Description(Description)
    .ValueType(ValueType)
    .AcceptableValues(AcceptableValues)
    .UnitSchema(UnitSchema)
    .AcceptableUnits(AcceptableUnits)
    .ReferenceData(ReferenceData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
