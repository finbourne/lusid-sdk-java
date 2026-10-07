# com.finbourne.lusid.model.FundStructureNode
A node in a Fund Structure, representing a Fund and its role within the structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeCode** | **String** | A unique identifier for this node within the Fund Structure. | [default to String]
**fundScope** | **String** | The scope of the Fund referenced by this node. | [default to String]
**fundCode** | **String** | The code of the Fund referenced by this node. | [default to String]
**role** | **String** | The role of this node within the structure. Must be one of the acceptable values of the structure&#39;s role data type. | [default to String]
**allocationBasis** | [**FundStructureAllocationBasis**](FundStructureAllocationBasis.md) |  | [optional] [default to FundStructureAllocationBasis]
**pnlFlowMode** | **String** | How profit and loss reaches this member from the members it holds. EquityPickup (the default) revalues the position in each held member; BucketFlowThrough receives one line per economic bucket, tagged with its origin; TransactionFlowThrough receives every line, tagged with its origin and path. Available values: EquityPickup, BucketFlowThrough, TransactionFlowThrough. | [optional] [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**driftMateriality** | [**FundStructureDriftMateriality**](FundStructureDriftMateriality.md) |  | [optional] [default to FundStructureDriftMateriality]

```java
import com.finbourne.lusid.model.FundStructureNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NodeCode = "example NodeCode";
String FundScope = "example FundScope";
String FundCode = "example FundCode";
String Role = "example Role";
FundStructureAllocationBasis AllocationBasis = new FundStructureAllocationBasis();
@jakarta.annotation.Nullable String PnlFlowMode = "example PnlFlowMode";
ResourceId AllocationMapId = new ResourceId();
FundStructureDriftMateriality DriftMateriality = new FundStructureDriftMateriality();


FundStructureNode fundStructureNodeInstance = new FundStructureNode()
    .NodeCode(NodeCode)
    .FundScope(FundScope)
    .FundCode(FundCode)
    .Role(Role)
    .AllocationBasis(AllocationBasis)
    .PnlFlowMode(PnlFlowMode)
    .AllocationMapId(AllocationMapId)
    .DriftMateriality(DriftMateriality);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
