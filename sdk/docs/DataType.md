# com.finbourne.lusid.model.DataType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeValueRange** | **String** | The available values are: Open, Closed | [default to String]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**valueType** | **String** | The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText | [default to String]
**acceptableValues** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**unitSchema** | **String** | The available values are: NoUnits, Basic, Iso4217Currency | [optional] [default to String]
**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) |  | [optional] [default to List<IUnitDefinitionDto>]
**referenceData** | [**ReferenceData**](ReferenceData.md) |  | [optional] [default to ReferenceData]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DataType;
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
ReferenceData ReferenceData = new ReferenceData();
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DataType dataTypeInstance = new DataType()
    .TypeValueRange(TypeValueRange)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .ValueType(ValueType)
    .AcceptableValues(AcceptableValues)
    .UnitSchema(UnitSchema)
    .AcceptableUnits(AcceptableUnits)
    .ReferenceData(ReferenceData)
    .Version(Version)
    .Href(Href)
    .StagedModifications(StagedModifications)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
