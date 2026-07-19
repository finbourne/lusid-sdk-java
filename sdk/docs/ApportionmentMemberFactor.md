# com.finbourne.lusid.model.ApportionmentMemberFactor
One member share class's outcome within an apportionment result: the base value the method produced for it  and the resulting apportionment factor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberIdentifier** | **String** | The member share class&#39;s short code. | [default to String]
**fundScope** | **String** | The scope of the fund the member share class belongs to. | [optional] [default to String]
**fundCode** | **String** | The code of the fund the member share class belongs to. | [optional] [default to String]
**baseValue** | **java.math.BigDecimal** | The base value the method produced for the member, or null for the SetFactor method. | [optional] [default to java.math.BigDecimal]
**apportionmentFactor** | **java.math.BigDecimal** | The member&#39;s apportionment factor: its base value over the total across the group or fund. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ApportionmentMemberFactor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MemberIdentifier = "example MemberIdentifier";
@jakarta.annotation.Nullable String FundScope = "example FundScope";
@jakarta.annotation.Nullable String FundCode = "example FundCode";
@jakarta.annotation.Nullable java.math.BigDecimal BaseValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal ApportionmentFactor = new java.math.BigDecimal("100.00");


ApportionmentMemberFactor apportionmentMemberFactorInstance = new ApportionmentMemberFactor()
    .MemberIdentifier(MemberIdentifier)
    .FundScope(FundScope)
    .FundCode(FundCode)
    .BaseValue(BaseValue)
    .ApportionmentFactor(ApportionmentFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
