# com.finbourne.lusid.model.SettlementProblem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** | The id of the problematic settlement instruction. Combined with the portfolio id this uniquely identifies a settlement instruction | [default to String]
**category** | **String** | The category this instruction belongs to | [default to String]
**status** | **String** | The status of the settlement instruction. Possible values are &#39;Invalid&#39; or &#39;Rejected&#39;. | [default to String]

```java
import com.finbourne.lusid.model.SettlementProblem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SettlementInstructionId = "example SettlementInstructionId";
String Category = "example Category";
String Status = "example Status";


SettlementProblem settlementProblemInstance = new SettlementProblem()
    .SettlementInstructionId(SettlementInstructionId)
    .Category(Category)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
