# com.finbourne.lusid.model.ShareClassBreakdown
The Valuation Point Data for a Share Class on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backOut** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for the Valuation Point where data points have been &#39;backed out&#39;. | [default to Map<String, ShareClassAmount>]
**dealing** | [**ShareClassDealingBreakdown**](ShareClassDealingBreakdown.md) |  | [default to ShareClassDealingBreakdown]
**pnL** | [**ShareClassPnlBreakdown**](ShareClassPnlBreakdown.md) |  | [default to ShareClassPnlBreakdown]
**gav** | [**ShareClassAmount**](ShareClassAmount.md) |  | [default to ShareClassAmount]
**fees** | [**Map&lt;String, FeeAccrual&gt;**](FeeAccrual.md) | Bucket of detail for any &#39;Fees&#39; that have been charged in the selected period. | [default to Map<String, FeeAccrual>]
**nav** | [**ShareClassAmount**](ShareClassAmount.md) |  | [default to ShareClassAmount]
**unitisation** | [**UnitisationData**](UnitisationData.md) |  | [optional] [default to UnitisationData]
**miscellaneous** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Not used directly by the LUSID engines but serves as a holding area for any custom derived data points that may be useful in, for example, fee calculations). | [optional] [default to Map<String, ShareClassAmount>]
**shareClassToFundFxRate** | **java.math.BigDecimal** | The fx rate from the Share Class currency to the fund currency at this valuation point. | [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The proportion of the fund&#39;s adjusted beginning equity (ie: the sum of the previous NAV and the net dealing) that is invested in the share class. | [default to java.math.BigDecimal]
**previousShareClassBreakdown** | [**PreviousShareClassBreakdown**](PreviousShareClassBreakdown.md) |  | [default to PreviousShareClassBreakdown]

```java
import com.finbourne.lusid.model.ShareClassBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> BackOut = new Map<String, ShareClassAmount>();
ShareClassDealingBreakdown Dealing = new ShareClassDealingBreakdown();
ShareClassPnlBreakdown PnL = new ShareClassPnlBreakdown();
ShareClassAmount Gav = new ShareClassAmount();
Map<String, FeeAccrual> Fees = new Map<String, FeeAccrual>();
ShareClassAmount Nav = new ShareClassAmount();
UnitisationData Unitisation = new UnitisationData();
@jakarta.annotation.Nullable Map<String, ShareClassAmount> Miscellaneous = new Map<String, ShareClassAmount>();
java.math.BigDecimal ShareClassToFundFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal CapitalRatio = new java.math.BigDecimal("100.00");
PreviousShareClassBreakdown PreviousShareClassBreakdown = new PreviousShareClassBreakdown();


ShareClassBreakdown shareClassBreakdownInstance = new ShareClassBreakdown()
    .BackOut(BackOut)
    .Dealing(Dealing)
    .PnL(PnL)
    .Gav(Gav)
    .Fees(Fees)
    .Nav(Nav)
    .Unitisation(Unitisation)
    .Miscellaneous(Miscellaneous)
    .ShareClassToFundFxRate(ShareClassToFundFxRate)
    .CapitalRatio(CapitalRatio)
    .PreviousShareClassBreakdown(PreviousShareClassBreakdown);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
