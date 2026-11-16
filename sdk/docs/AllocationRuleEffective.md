# com.finbourne.lusid.model.AllocationRuleEffective
What a rule's pools actually use once the defaults are applied. Read-only: derived on the way out and ignored on  the way in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basis** | **String** | The basis the bucket&#39;s fund-level pools are shared on. Available values: CommittedCapital, PaidInCapital. | [default to String]
**exemption** | **String** | The register flag that sits partners out of the bucket&#39;s pools. Available values: None, FeeExempt, ExpenseExempt. | [default to String]
**reportRow** | **String** | The capital account row the bucket&#39;s allocations land on, derived from the character. Available values: NetOperatingIncome, ManagementFeesGross, RealisedGainLoss, UnrealisedGainLoss. | [optional] [default to String]
**basisLevel** | **String** | Which level of the basis precedence decided the basis. Available values: Rule, CharacterDefault, BuiltIn. | [default to String]

```java
import com.finbourne.lusid.model.AllocationRuleEffective;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Basis = "example Basis";
String Exemption = "example Exemption";
@jakarta.annotation.Nullable String ReportRow = "example ReportRow";
String BasisLevel = "example BasisLevel";


AllocationRuleEffective allocationRuleEffectiveInstance = new AllocationRuleEffective()
    .Basis(Basis)
    .Exemption(Exemption)
    .ReportRow(ReportRow)
    .BasisLevel(BasisLevel);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
