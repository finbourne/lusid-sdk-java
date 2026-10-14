# com.finbourne.lusid.model.MarginCalculation
How the margin requirement for an item is calculated. The method field selects the method and the  remaining fields are the ones that method uses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **String** | The calculation method. One of NetMtm, Ccp, GmraExposure, GmslaRcv, HouseRules, Simm, RegulatoryGrid or CcpIngested. Available values: NetMtm, Ccp, GmraExposure, GmslaRcv, HouseRules, Simm, RegulatoryGrid, CcpIngested. | [default to String]
**exposureMethod** | **String** | For GmraExposure, the exposure method. One of Gmra2011A or Gmra2011B. Available values: Gmra2011A, Gmra2011B. | [optional] [default to String]
**repricingPermitted** | **Boolean** | For GmraExposure, whether repricing is permitted. | [optional] [default to Boolean]
**marginPercentage** | **java.math.BigDecimal** | For GmslaRcv, the margin percentage applied to the loan value. | [optional] [default to java.math.BigDecimal]
**lendingFeeBps** | **Integer** | For GmslaRcv, the lending fee in basis points. | [optional] [default to Integer]
**creditLine** | **java.math.BigDecimal** | For HouseRules, the credit line extended to the counterparty. | [optional] [default to java.math.BigDecimal]
**thresholdAllocation** | [**ThresholdAllocation**](ThresholdAllocation.md) |  | [optional] [default to ThresholdAllocation]
**ccp** | **String** | For CcpIngested, the name of the central counterparty. | [optional] [default to String]
**fcmAddOn** | **java.math.BigDecimal** | For CcpIngested, the add-on charged by the futures commission merchant. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.MarginCalculation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Method = "example Method";
@jakarta.annotation.Nullable String ExposureMethod = "example ExposureMethod";
@jakarta.annotation.Nullable Boolean RepricingPermitted = true;
@jakarta.annotation.Nullable java.math.BigDecimal MarginPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Integer LendingFeeBps = new Integer("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CreditLine = new java.math.BigDecimal("100.00");
ThresholdAllocation ThresholdAllocation = new ThresholdAllocation();
@jakarta.annotation.Nullable String Ccp = "example Ccp";
@jakarta.annotation.Nullable java.math.BigDecimal FcmAddOn = new java.math.BigDecimal("100.00");


MarginCalculation marginCalculationInstance = new MarginCalculation()
    .Method(Method)
    .ExposureMethod(ExposureMethod)
    .RepricingPermitted(RepricingPermitted)
    .MarginPercentage(MarginPercentage)
    .LendingFeeBps(LendingFeeBps)
    .CreditLine(CreditLine)
    .ThresholdAllocation(ThresholdAllocation)
    .Ccp(Ccp)
    .FcmAddOn(FcmAddOn);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
