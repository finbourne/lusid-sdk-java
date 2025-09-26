# com.finbourne.lusid.model.StagedModification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique Id for the staged modification | [optional] [default to String]
**asAtStaged** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which the modification was staged. | [optional] [default to OffsetDateTime]
**userIdStaged** | **String** | Id of the user who created the stage modification request. | [optional] [default to String]
**requestedIdStaged** | **String** | The Request Id that initiated this staged modification. | [optional] [default to String]
**requestReason** | **String** | The Request Reason from the context that initiated this staged modification. | [optional] [default to String]
**action** | **String** | Type of action of the staged modification, either create, update or delete. | [optional] [default to String]
**stagingRule** | [**StagedModificationStagingRule**](StagedModificationStagingRule.md) |  | [optional] [default to StagedModificationStagingRule]
**decisions** | [**List&lt;StagedModificationDecision&gt;**](StagedModificationDecision.md) | Object containing information relating to the decision on the staged modification. | [optional] [default to List<StagedModificationDecision>]
**decisionsCount** | **Integer** | Number of decisions made. | [optional] [default to Integer]
**status** | **String** | The status of the staged modification. | [optional] [default to String]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which the modification was closed by either rejection or approval. | [optional] [default to OffsetDateTime]
**entityType** | **String** | The type of the entity that the staged modification applies to. | [optional] [default to String]
**scope** | **String** | The scope of the entity that this staged modification applies to. | [optional] [default to String]
**entityUniqueId** | **String** | The unique Id of the entity the staged modification applies to. | [optional] [default to String]
**requestedChanges** | [**RequestedChanges**](RequestedChanges.md) |  | [optional] [default to RequestedChanges]
**entityHrefs** | [**StagedModificationsEntityHrefs**](StagedModificationsEntityHrefs.md) |  | [optional] [default to StagedModificationsEntityHrefs]
**displayName** | **String** | The display name of the entity the staged modification applies to. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.StagedModification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
OffsetDateTime AsAtStaged = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdStaged = "example UserIdStaged";
@jakarta.annotation.Nullable String RequestedIdStaged = "example RequestedIdStaged";
@jakarta.annotation.Nullable String RequestReason = "example RequestReason";
@jakarta.annotation.Nullable String Action = "example Action";
StagedModificationStagingRule StagingRule = new StagedModificationStagingRule();
@jakarta.annotation.Nullable List<StagedModificationDecision> Decisions = new List<StagedModificationDecision>();
Integer DecisionsCount = new Integer("100.00");
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtClosed = OffsetDateTime.now();
@jakarta.annotation.Nullable String EntityType = "example EntityType";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
RequestedChanges RequestedChanges = new RequestedChanges();
StagedModificationsEntityHrefs EntityHrefs = new StagedModificationsEntityHrefs();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


StagedModification stagedModificationInstance = new StagedModification()
    .Id(Id)
    .AsAtStaged(AsAtStaged)
    .UserIdStaged(UserIdStaged)
    .RequestedIdStaged(RequestedIdStaged)
    .RequestReason(RequestReason)
    .Action(Action)
    .StagingRule(StagingRule)
    .Decisions(Decisions)
    .DecisionsCount(DecisionsCount)
    .Status(Status)
    .AsAtClosed(AsAtClosed)
    .EntityType(EntityType)
    .Scope(Scope)
    .EntityUniqueId(EntityUniqueId)
    .RequestedChanges(RequestedChanges)
    .EntityHrefs(EntityHrefs)
    .DisplayName(DisplayName)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
