# com.finbourne.lusid.model.AddressDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the address key. | [optional] [default to String]
**type** | **String** | The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Result0D, Json | [optional] [default to String]
**description** | **String** | The description for this result. | [optional] [default to String]
**lifeCycleStatus** | **String** | What is the status of the address path. If it is not Production then it might be removed at some point in the future.  See the removal date for the likely timing of that if any. | [optional] [default to String]
**removalDate** | [**OffsetDateTime**](OffsetDateTime.md) | If the life-cycle status of the address is Deprecated then this is the date at which support of the address will be suspended.  After that date it will be removed at the earliest possible point subject to any specific contractual support and development constraints. | [optional] [default to OffsetDateTime]
**documentationLink** | **String** | Contains a link to the documentation for this AddressDefinition in KnowledgeBase. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AddressDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
String Type = "example Type";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String LifeCycleStatus = "example LifeCycleStatus";
@jakarta.annotation.Nullable OffsetDateTime RemovalDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String DocumentationLink = "example DocumentationLink";


AddressDefinition addressDefinitionInstance = new AddressDefinition()
    .DisplayName(DisplayName)
    .Type(Type)
    .Description(Description)
    .LifeCycleStatus(LifeCycleStatus)
    .RemovalDate(RemovalDate)
    .DocumentationLink(DocumentationLink);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
