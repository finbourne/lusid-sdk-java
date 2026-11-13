# com.finbourne.lusid.model.TaxProvisionMovement
The movement in a fund's deferred tax provision between the previous valuation point and this one,  split into the realised gains crystallised in the period, the change in the unrealised position,  the effect of a change in the applied rate and the offset from losses brought forward.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**realised** | **java.math.BigDecimal** | The part of the movement that is due to gains realised in the period. | [default to java.math.BigDecimal]
**unrealisedChange** | **java.math.BigDecimal** | The part of the movement that is due to the change in the unrealised position. | [default to java.math.BigDecimal]
**rateChange** | **java.math.BigDecimal** | The part of the movement that is due to a change in the applied rate. | [default to java.math.BigDecimal]
**lossOffset** | **java.math.BigDecimal** | The part of the movement that is due to losses brought forward being offset against gains. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxProvisionMovement;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Realised = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnrealisedChange = new java.math.BigDecimal("100.00");
java.math.BigDecimal RateChange = new java.math.BigDecimal("100.00");
java.math.BigDecimal LossOffset = new java.math.BigDecimal("100.00");


TaxProvisionMovement taxProvisionMovementInstance = new TaxProvisionMovement()
    .Realised(Realised)
    .UnrealisedChange(UnrealisedChange)
    .RateChange(RateChange)
    .LossOffset(LossOffset);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
