# com.finbourne.lusid.model.FeeDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeCode** | **String** |  | [default to String]
**basis** | **String** | Available values: CommittedCapital, InvestedCapital, NetInvestedCapital, Nav. | [default to String]
**rate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**tiers** | [**List&lt;FeeSizeTier&gt;**](FeeSizeTier.md) |  | [optional] [default to List<FeeSizeTier>]
**dayCountConvention** | **String** |  | [optional] [default to String]
**stepDown** | [**FeeStepDown**](FeeStepDown.md) |  | [optional] [default to FeeStepDown]
**offsetPercentage** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**waiverPercentage** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FeeDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FeeCode = "example FeeCode";
String Basis = "example Basis";
@jakarta.annotation.Nullable java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<FeeSizeTier> Tiers = new List<FeeSizeTier>();
@jakarta.annotation.Nullable String DayCountConvention = "example DayCountConvention";
FeeStepDown StepDown = new FeeStepDown();
@jakarta.annotation.Nullable java.math.BigDecimal OffsetPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal WaiverPercentage = new java.math.BigDecimal("100.00");


FeeDefinition feeDefinitionInstance = new FeeDefinition()
    .FeeCode(FeeCode)
    .Basis(Basis)
    .Rate(Rate)
    .Tiers(Tiers)
    .DayCountConvention(DayCountConvention)
    .StepDown(StepDown)
    .OffsetPercentage(OffsetPercentage)
    .WaiverPercentage(WaiverPercentage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
