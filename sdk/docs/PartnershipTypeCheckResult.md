# com.finbourne.lusid.model.PartnershipTypeCheckResult
The outcome of checking a fund's transaction types against the type contract of its partnership configuration  pack: the pack checked against and every type whose register balance deltas are not its contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pack** | [**PartnershipConfigPack**](PartnershipConfigPack.md) |  | [default to PartnershipConfigPack]
**status** | **String** | The outcome of the check. Available values: Ok, Differences. | [default to String]
**differences** | [**List&lt;PartnershipTypeDifference&gt;**](PartnershipTypeDifference.md) | The transaction types whose register balance deltas are not their contract in the pack, or whose movements book through a side the fund&#39;s transaction type scope does not define; empty when the status is Ok. | [default to List<PartnershipTypeDifference>]

```java
import com.finbourne.lusid.model.PartnershipTypeCheckResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

PartnershipConfigPack Pack = new PartnershipConfigPack();
String Status = "example Status";
List<PartnershipTypeDifference> Differences = new List<PartnershipTypeDifference>();


PartnershipTypeCheckResult partnershipTypeCheckResultInstance = new PartnershipTypeCheckResult()
    .Pack(Pack)
    .Status(Status)
    .Differences(Differences);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
