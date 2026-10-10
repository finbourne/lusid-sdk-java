# com.finbourne.lusid.model.UnitisationData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharesInIssue** | **java.math.BigDecimal** | The number of shares in issue at a valuation point. | [default to java.math.BigDecimal]
**unitPrice** | **java.math.BigDecimal** | The price of one unit of the share class at a valuation point. | [default to java.math.BigDecimal]
**netDealingUnits** | **java.math.BigDecimal** | The net dealing in units for the share class at a valuation point. This could be the sum of negative redemptions (in units) and positive subscriptions (in units). | [default to java.math.BigDecimal]
**bidPrice** | **java.math.BigDecimal** | The price of one unit of the share class on the bid side at a valuation point: the class&#39;s NAV with the fund&#39;s holdings marked at their bid prices. Equal to the unit price when the fund is struck on the bid. Absent when a holding&#39;s bid could not be priced. | [optional] [default to java.math.BigDecimal]
**offerPrice** | **java.math.BigDecimal** | The price of one unit of the share class on the offer side at a valuation point: the class&#39;s NAV with the fund&#39;s holdings marked at their ask prices. Equal to the unit price when the fund is struck on the ask. Absent when a holding&#39;s ask could not be priced. | [optional] [default to java.math.BigDecimal]
**bidPriceIncNdc** | **java.math.BigDecimal** | The bid price of one unit of the share class less the class&#39;s share of the notional dealing costs of selling the fund&#39;s holdings, at a valuation point. Absent when the NAV type has no notional dealing cost table. | [optional] [default to java.math.BigDecimal]
**offerPriceIncNdc** | **java.math.BigDecimal** | The offer price of one unit of the share class plus the class&#39;s share of the notional dealing costs of buying the fund&#39;s holdings, at a valuation point. Absent when the NAV type has no notional dealing cost table. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.UnitisationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal SharesInIssue = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnitPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal NetDealingUnits = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal BidPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OfferPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal BidPriceIncNdc = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OfferPriceIncNdc = new java.math.BigDecimal("100.00");


UnitisationData unitisationDataInstance = new UnitisationData()
    .SharesInIssue(SharesInIssue)
    .UnitPrice(UnitPrice)
    .NetDealingUnits(NetDealingUnits)
    .BidPrice(BidPrice)
    .OfferPrice(OfferPrice)
    .BidPriceIncNdc(BidPriceIncNdc)
    .OfferPriceIncNdc(OfferPriceIncNdc);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
