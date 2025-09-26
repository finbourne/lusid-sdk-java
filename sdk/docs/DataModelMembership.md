# com.finbourne.lusid.model.DataModelMembership

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**membership** | [**List&lt;Membership&gt;**](Membership.md) | The collection of data models this entity is a member of. | [default to List<Membership>]
**currentModel** | [**MembershipAndStatus**](MembershipAndStatus.md) |  | [optional] [default to MembershipAndStatus]

```java
import com.finbourne.lusid.model.DataModelMembership;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<Membership> Membership = new List<Membership>();
MembershipAndStatus CurrentModel = new MembershipAndStatus();


DataModelMembership dataModelMembershipInstance = new DataModelMembership()
    .Membership(Membership)
    .CurrentModel(CurrentModel);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
