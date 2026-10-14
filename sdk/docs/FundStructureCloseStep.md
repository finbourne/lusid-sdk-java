# com.finbourne.lusid.model.FundStructureCloseStep
One member's step in a fund structure close.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberShortCode** | **String** | The node code of the member in the structure. | [default to String]
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**step** | **Integer** | The position of the member in the close order. | [default to Integer]
**status** | **String** | What happened to the member. Available values: Finalised, AlreadyFinal, Failed, Skipped. | [default to String]
**failure** | **String** | The failure that stopped the member finalising, if any. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundStructureCloseStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MemberShortCode = "example MemberShortCode";
ResourceId Fund = new ResourceId();
Integer Step = new Integer("100.00");
String Status = "example Status";
@jakarta.annotation.Nullable String Failure = "example Failure";


FundStructureCloseStep fundStructureCloseStepInstance = new FundStructureCloseStep()
    .MemberShortCode(MemberShortCode)
    .Fund(Fund)
    .Step(Step)
    .Status(Status)
    .Failure(Failure);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
