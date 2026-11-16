# com.finbourne.lusid.model.TaxReturnDisposalRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**disposalDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the disposal. | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The units disposed of. | [optional] [default to java.math.BigDecimal]
**cost** | **java.math.BigDecimal** | The allowable cost of the units disposed of. | [optional] [default to java.math.BigDecimal]
**indexationAllowanceTaken** | **java.math.BigDecimal** | The indexation allowance deducted when arriving at the chargeable gain. | [optional] [default to java.math.BigDecimal]
**chargeableGain** | **java.math.BigDecimal** | The chargeable gain or allowable loss on the disposal, negative for a loss. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxReturnDisposalRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
OffsetDateTime DisposalDate = OffsetDateTime.now();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal Cost = new java.math.BigDecimal("100.00");
java.math.BigDecimal IndexationAllowanceTaken = new java.math.BigDecimal("100.00");
java.math.BigDecimal ChargeableGain = new java.math.BigDecimal("100.00");


TaxReturnDisposalRow taxReturnDisposalRowInstance = new TaxReturnDisposalRow()
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .PortfolioCode(PortfolioCode)
    .DisposalDate(DisposalDate)
    .Units(Units)
    .Cost(Cost)
    .IndexationAllowanceTaken(IndexationAllowanceTaken)
    .ChargeableGain(ChargeableGain);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
