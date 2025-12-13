# com.finbourne.lusid.model.DataModelSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]
**description** | **String** | A description for the Custom Data Model. | [optional] [default to String]
**entityType** | **String** | The entity type that the Custom Data Model binds to. | [default to String]
**type** | **String** | Either Root or Leaf or Intermediate. | [default to String]
**precedence** | **Integer** | Where in the hierarchy this model sits. | [default to Integer]
**parent** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**children** | [**List&lt;DataModelSummary&gt;**](DataModelSummary.md) | Child Custom Data Models that will inherit from this data model. | [default to List<DataModelSummary>]

```java
import com.finbourne.lusid.model.DataModelSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String EntityType = "example EntityType";
String Type = "example Type";
Integer Precedence = new Integer("100.00");
ResourceId Parent = new ResourceId();
List<DataModelSummary> Children = new List<DataModelSummary>();


DataModelSummary dataModelSummaryInstance = new DataModelSummary()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .EntityType(EntityType)
    .Type(Type)
    .Precedence(Precedence)
    .Parent(Parent)
    .Children(Children);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
