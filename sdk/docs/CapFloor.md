# com.finbourne.lusid.model.CapFloor
LUSID representation of Cap, Floor, or Collar.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capFloorType** | **String** | Determine if it&#39;s CAP, FLOOR, or COLLAR.    Supported string (enumeration) values are: [Cap, Floor, Collar]. | [default to String]
**capStrike** | **java.math.BigDecimal** | Strike rate of the Cap. | [optional] [default to java.math.BigDecimal]
**floorStrike** | **java.math.BigDecimal** | Strike rate of the Floor. | [optional] [default to java.math.BigDecimal]
**includeFirstCaplet** | **Boolean** | Include first caplet flag. | [default to Boolean]
**underlyingFloatingLeg** | [**FloatingLeg**](FloatingLeg.md) |  | [default to FloatingLeg]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven equity swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.CapFloor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CapFloorType = "example CapFloorType";
@jakarta.annotation.Nullable java.math.BigDecimal CapStrike = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FloorStrike = new java.math.BigDecimal("100.00");
Boolean IncludeFirstCaplet = true;
FloatingLeg UnderlyingFloatingLeg = new FloatingLeg();
@jakarta.annotation.Nullable List<AdditionalPayment> AdditionalPayments = new List<AdditionalPayment>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


CapFloor capFloorInstance = new CapFloor()
    .CapFloorType(CapFloorType)
    .CapStrike(CapStrike)
    .FloorStrike(FloorStrike)
    .IncludeFirstCaplet(IncludeFirstCaplet)
    .UnderlyingFloatingLeg(UnderlyingFloatingLeg)
    .AdditionalPayments(AdditionalPayments)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
