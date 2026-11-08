# com.finbourne.lusid.model.CollateralAllocationOverride
An asset and the units of it a user chooses to move for a margin call, validated against the agreement's  constraints as the allocation is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The LUSID instrument identifier of the asset to move, or CCY_ and the currency code for cash. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**units** | **java.math.BigDecimal** | The units to move. | [default to java.math.BigDecimal]
**custodianAccount** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.CollateralAllocationOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentId = "example InstrumentId";
ResourceId PortfolioId = new ResourceId();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
ResourceId CustodianAccount = new ResourceId();


CollateralAllocationOverride collateralAllocationOverrideInstance = new CollateralAllocationOverride()
    .InstrumentId(InstrumentId)
    .PortfolioId(PortfolioId)
    .Units(Units)
    .CustodianAccount(CustodianAccount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
