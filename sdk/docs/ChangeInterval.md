# com.finbourne.lusid.model.ChangeInterval
Defines a change that occured for an entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The date/time of the change. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique identifier of the user that made the change. | [optional] [default to String]
**requestIdModified** | **String** | The unique identifier of the request that the changes were part of. | [optional] [default to String]
**reasonModified** | **String** | The reason for an entity modification. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The version number for the entity (the entity was created at version 1). This may refer to the version number of a changed related entity, not a change for the entity itself. | [optional] [default to Integer]
**stagedModificationIdModified** | **String** | The id of the staged modification that was approved. Will be null if the change didn&#39;t come from a staged modification. | [optional] [default to String]
**action** | **String** | The action performed on the field. | [optional] [default to String]
**attributeName** | **String** | The name of the field or property that has been changed. | [optional] [default to String]
**previousValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**newValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**effectiveRange** | [**EffectiveRange**](EffectiveRange.md) |  | [optional] [default to EffectiveRange]

```java
import com.finbourne.lusid.model.ChangeInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAtModified = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdModified = "example UserIdModified";
@jakarta.annotation.Nullable String RequestIdModified = "example RequestIdModified";
@jakarta.annotation.Nullable String ReasonModified = "example ReasonModified";
Integer AsAtVersionNumber = new Integer("100.00");
@jakarta.annotation.Nullable String StagedModificationIdModified = "example StagedModificationIdModified";
@jakarta.annotation.Nullable String Action = "example Action";
@jakarta.annotation.Nullable String AttributeName = "example AttributeName";
PropertyValue PreviousValue = new PropertyValue();
PropertyValue NewValue = new PropertyValue();
EffectiveRange EffectiveRange = new EffectiveRange();


ChangeInterval changeIntervalInstance = new ChangeInterval()
    .AsAtModified(AsAtModified)
    .UserIdModified(UserIdModified)
    .RequestIdModified(RequestIdModified)
    .ReasonModified(ReasonModified)
    .AsAtVersionNumber(AsAtVersionNumber)
    .StagedModificationIdModified(StagedModificationIdModified)
    .Action(Action)
    .AttributeName(AttributeName)
    .PreviousValue(PreviousValue)
    .NewValue(NewValue)
    .EffectiveRange(EffectiveRange);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
