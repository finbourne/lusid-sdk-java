# com.finbourne.lusid.model.FundStructureCloseResult
The outcome of closing a fund structure: one step per member in the order they were closed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**structureId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**valuationPointCode** | **String** | The code of the valuation point to finalise on every member fund. | [default to String]
**steps** | [**List&lt;FundStructureCloseStep&gt;**](FundStructureCloseStep.md) | The finalisation of each member, in the order attempted. | [default to List<FundStructureCloseStep>]
**completed** | **Boolean** | Whether every member finalised. | [default to Boolean]

```java
import com.finbourne.lusid.model.FundStructureCloseResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId StructureId = new ResourceId();
String ValuationPointCode = "example ValuationPointCode";
List<FundStructureCloseStep> Steps = new List<FundStructureCloseStep>();
Boolean Completed = true;


FundStructureCloseResult fundStructureCloseResultInstance = new FundStructureCloseResult()
    .StructureId(StructureId)
    .ValuationPointCode(ValuationPointCode)
    .Steps(Steps)
    .Completed(Completed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
