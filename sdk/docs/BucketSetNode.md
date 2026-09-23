# com.finbourne.lusid.model.BucketSetNode
One node within a bucket set result: the fund aggregate or a single share class. Both carry NAV and buckets; the  capital ratio, the unit counts and the per-unit values belong to share class nodes and are omitted on the fund node.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeType** | **String** | The kind of node: the fund aggregate or a single share class. Available values: Fund, Class. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class this node is for. Omitted on the fund node. | [optional] [default to String]
**nav** | **java.math.BigDecimal** | The net asset value at this node, in the fund currency. | [optional] [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The share class&#39;s capital ratio (its share of the fund NAV). Omitted on the fund node. | [optional] [default to java.math.BigDecimal]
**buckets** | [**List&lt;BucketSetResultBucket&gt;**](BucketSetResultBucket.md) | The buckets on this node, each with its period movement and cumulative values. | [default to List<BucketSetResultBucket>]
**perUnitValue** | **java.math.BigDecimal** | The share class&#39;s NAV per unit in issue, in the fund currency, rounded to the share class&#39;s PricePrecision (left unrounded where the share class declares none). Omitted on the fund node, for a share class that is not unitised, and for a unitised share class with no units in issue to divide by (SharesInIssue is then reported as zero). The dealing price - in the share class currency, with its instrument&#39;s rounding convention applied - is on the share class breakdown&#39;s unitisation data. | [optional] [default to java.math.BigDecimal]
**sharesInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the end of the period. Omitted on the fund node and for a share class that is not unitised. | [optional] [default to java.math.BigDecimal]
**previousPerUnitValue** | **java.math.BigDecimal** | The share class&#39;s NAV per unit at the previous valuation point, on the same basis as PerUnitValue. Omitted on the fund node, for a share class that is not unitised, and where the share class had no units in issue at the previous valuation point (including the fund&#39;s first valuation point). | [optional] [default to java.math.BigDecimal]
**previousSharesInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the start of the period. Omitted on the fund node and for a share class that is not unitised; zero at the fund&#39;s first valuation point. | [optional] [default to java.math.BigDecimal]
**label** | **String** | A display label for the node: the fund&#39;s display name on the fund node, the share class&#39;s name on a share class node. | [optional] [default to String]
**previousNav** | **java.math.BigDecimal** | The net asset value this node carried at the previous valuation point, in the fund currency. Zero at the fund&#39;s first valuation point. | [optional] [default to java.math.BigDecimal]
**netDealingUnits** | **java.math.BigDecimal** | The net units dealt for the share class over the period, so that the shares in issue are the previous shares in issue plus this. Omitted on the fund node and where the bucket set is not unitised. | [optional] [default to java.math.BigDecimal]
**shareClassDetails** | [**BucketSetShareClassDetails**](BucketSetShareClassDetails.md) |  | [optional] [default to BucketSetShareClassDetails]
**navShareClassCurrency** | **java.math.BigDecimal** | The node&#39;s net asset value restated in the share class&#39; own currency, at the rate this node publishes. Set only on share class nodes. | [optional] [default to java.math.BigDecimal]
**shareClassToFundFxRate** | **java.math.BigDecimal** | The fx rate from the share class currency to the fund currency at this valuation point. Nav and the bucket values are in the fund currency, so divide by this rate to restate them in the share class currency. Set only on share class nodes. | [optional] [default to java.math.BigDecimal]
**previousNavShareClassCurrency** | **java.math.BigDecimal** | The net asset value in the share class&#39; currency at the previous valuation point, as that point published it, at the rate that point struck. Zero at the fund&#39;s first valuation point. Absent (rather than zero) if the previous valuation point predates this field. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BucketSetNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NodeType = "example NodeType";
@jakarta.annotation.Nullable String ShareClassShortCode = "example ShareClassShortCode";
@jakarta.annotation.Nullable java.math.BigDecimal Nav = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CapitalRatio = new java.math.BigDecimal("100.00");
List<BucketSetResultBucket> Buckets = new List<BucketSetResultBucket>();
@jakarta.annotation.Nullable java.math.BigDecimal PerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal SharesInIssue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousPerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousSharesInIssue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Label = "example Label";
@jakarta.annotation.Nullable java.math.BigDecimal PreviousNav = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NetDealingUnits = new java.math.BigDecimal("100.00");
BucketSetShareClassDetails ShareClassDetails = new BucketSetShareClassDetails();
@jakarta.annotation.Nullable java.math.BigDecimal NavShareClassCurrency = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ShareClassToFundFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousNavShareClassCurrency = new java.math.BigDecimal("100.00");


BucketSetNode bucketSetNodeInstance = new BucketSetNode()
    .NodeType(NodeType)
    .ShareClassShortCode(ShareClassShortCode)
    .Nav(Nav)
    .CapitalRatio(CapitalRatio)
    .Buckets(Buckets)
    .PerUnitValue(PerUnitValue)
    .SharesInIssue(SharesInIssue)
    .PreviousPerUnitValue(PreviousPerUnitValue)
    .PreviousSharesInIssue(PreviousSharesInIssue)
    .Label(Label)
    .PreviousNav(PreviousNav)
    .NetDealingUnits(NetDealingUnits)
    .ShareClassDetails(ShareClassDetails)
    .NavShareClassCurrency(NavShareClassCurrency)
    .ShareClassToFundFxRate(ShareClassToFundFxRate)
    .PreviousNavShareClassCurrency(PreviousNavShareClassCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
