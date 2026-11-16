# com.finbourne.lusid.model.PartnerCapitalAccountRow
One row of the capital account statement with its quarter-, year- and inception-to-date amounts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowType** | **String** | The row type: BeginningCapital, Contributions, Distributions, TransfersIn, TransfersOut, NetOperatingIncome, ManagementFeesGross, ManagementFeeOffsets, RealisedGainLoss, UnrealisedGainLoss, CarriedInterest or EndingCapital. | [default to String]
**qtd** | **java.math.BigDecimal** | The quarter-to-date amount for the row. | [default to java.math.BigDecimal]
**ytd** | **java.math.BigDecimal** | The year-to-date amount for the row. | [default to java.math.BigDecimal]
**itd** | **java.math.BigDecimal** | The inception-to-date amount for the row. | [default to java.math.BigDecimal]
**details** | [**List&lt;PartnerCapitalAccountRowDetail&gt;**](PartnerCapitalAccountRowDetail.md) | Labelled parts of the row&#39;s total, each already included in the row&#39;s columns. Tax withheld from a distribution on the partner&#39;s behalf is counted as distributed and shown here as its own entry against the distribution it was withheld on. Empty for a row with nothing to break out. | [optional] [default to List<PartnerCapitalAccountRowDetail>]

```java
import com.finbourne.lusid.model.PartnerCapitalAccountRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RowType = "example RowType";
java.math.BigDecimal Qtd = new java.math.BigDecimal("100.00");
java.math.BigDecimal Ytd = new java.math.BigDecimal("100.00");
java.math.BigDecimal Itd = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<PartnerCapitalAccountRowDetail> Details = new List<PartnerCapitalAccountRowDetail>();


PartnerCapitalAccountRow partnerCapitalAccountRowInstance = new PartnerCapitalAccountRow()
    .RowType(RowType)
    .Qtd(Qtd)
    .Ytd(Ytd)
    .Itd(Itd)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
