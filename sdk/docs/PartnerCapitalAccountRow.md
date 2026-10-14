# com.finbourne.lusid.model.PartnerCapitalAccountRow
One row of the capital account statement with its quarter-, year- and inception-to-date amounts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowType** | **String** | The row type: BeginningCapital, Contributions, Distributions, TransfersIn, TransfersOut, NetOperatingIncome, ManagementFeesGross, ManagementFeeOffsets, RealisedGainLoss, UnrealisedGainLoss, CarriedInterest or EndingCapital. | [default to String]
**qtd** | **java.math.BigDecimal** | The quarter-to-date amount for the row. | [default to java.math.BigDecimal]
**ytd** | **java.math.BigDecimal** | The year-to-date amount for the row. | [default to java.math.BigDecimal]
**itd** | **java.math.BigDecimal** | The inception-to-date amount for the row. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerCapitalAccountRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RowType = "example RowType";
java.math.BigDecimal Qtd = new java.math.BigDecimal("100.00");
java.math.BigDecimal Ytd = new java.math.BigDecimal("100.00");
java.math.BigDecimal Itd = new java.math.BigDecimal("100.00");


PartnerCapitalAccountRow partnerCapitalAccountRowInstance = new PartnerCapitalAccountRow()
    .RowType(RowType)
    .Qtd(Qtd)
    .Ytd(Ytd)
    .Itd(Itd);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
