# com.finbourne.lusid.model.FundStructureNode
A node in a Fund Structure, representing a Fund and its role within the structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeCode** | **String** | A unique identifier for this node within the Fund Structure. | [default to String]
**fundScope** | **String** | The scope of the Fund referenced by this node. | [default to String]
**fundCode** | **String** | The code of the Fund referenced by this node. | [default to String]
**role** | **String** | The role of this node within the structure. Available values: Master, Feeder. | [default to String]

```java
import com.finbourne.lusid.model.FundStructureNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NodeCode = "example NodeCode";
String FundScope = "example FundScope";
String FundCode = "example FundCode";
String Role = "example Role";


FundStructureNode fundStructureNodeInstance = new FundStructureNode()
    .NodeCode(NodeCode)
    .FundScope(FundScope)
    .FundCode(FundCode)
    .Role(Role);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
