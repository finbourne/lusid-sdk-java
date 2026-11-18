# com.finbourne.lusid.model.PackTypeContract
The register deltas a transaction type must carry for the partner register to read right.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type the contract is for. | [default to String]
**requiredDeltas** | [**List&lt;PackRegisterDelta&gt;**](PackRegisterDelta.md) | The register balance deltas the type must carry, counted with repeats. | [default to List<PackRegisterDelta>]
**optionalDeltas** | [**List&lt;PackRegisterDelta&gt;**](PackRegisterDelta.md) | The register balance deltas the type may carry, each at most once, in the direction given and from the source given. | [default to List<PackRegisterDelta>]

```java
import com.finbourne.lusid.model.PackTypeContract;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
List<PackRegisterDelta> RequiredDeltas = new List<PackRegisterDelta>();
List<PackRegisterDelta> OptionalDeltas = new List<PackRegisterDelta>();


PackTypeContract packTypeContractInstance = new PackTypeContract()
    .Type(Type)
    .RequiredDeltas(RequiredDeltas)
    .OptionalDeltas(OptionalDeltas);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
