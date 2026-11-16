# com.finbourne.lusid.model.PartnershipAllocationProblem
Why the period cannot be allocated to the partners as it stands. The read reports it; the allocation run and the  acceptance refuse with the same failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The problem. Available values: AllocationRulesNotConfigured, UnbucketedPnl, UnknownDistributionCharacter. | [default to String]
**message** | **String** | What is wrong and what to change, naming the accounts, amounts and values concerned. | [default to String]

```java
import com.finbourne.lusid.model.PartnershipAllocationProblem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Message = "example Message";


PartnershipAllocationProblem partnershipAllocationProblemInstance = new PartnershipAllocationProblem()
    .Code(Code)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
