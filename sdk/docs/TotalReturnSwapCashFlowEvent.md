# com.finbourne.lusid.model.TotalReturnSwapCashFlowEvent
A scheduled exchange of a TotalReturnSwap: a funding-leg coupon or notional exchange, an asset income or  principal passed through on the asset leg, or a price-return reset of the asset leg. Component says  which. The amount is per unit of the swap as its cash flows are booked, signed negative when paid; it is  absent until the market data determining it has been published.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the holding must be held on to be entitled to the flow. Required. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the flow pays. Required. | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency the flow pays in. Required. | [default to String]
**component** | **String** | Which exchange of the swap the flow settles. Required.     Supported string (enumeration) values are: [FundingPayment, FundingNotional, AssetIncome, AssetPrincipal, PriceReturn]. | [default to String]
**flowType** | **String** | The type of the underlying cash flow the event settles. A component can gather several flow types  paying on one date (an asset-backed bond&#39;s coupon, interest deferral and interest shortfall are all  asset income), so the flow type is what tells them apart. Required.     Supported string (enumeration) values are: [Coupon, Notional, Premium, Principal, Protection, Cash, Dividend, Interest, PrincipalWriteOff, InterestDeferred, InterestShortfall, MarkToMarket, InterestInKind]. | [default to String]
**legIdentifier** | **String** | The leg the flow belongs to. Required.     Supported string (enumeration) values are: [AssetLeg, FundingLeg]. | [default to String]
**payReceive** | **String** | Whether the flow is paid or received from the holder&#39;s perspective. The amount is already signed  accordingly; this attributes an undetermined flow to its side. Required.     Supported string (enumeration) values are: [Pay, Receive]. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The signed amount per unit of the swap held on the ex date, negative when paid. Optional — absent  until determinable: a price-return reset needs its reset quotes, a floating funding payment its fixing. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TotalReturnSwapCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
String Component = "example Component";
String FlowType = "example FlowType";
String LegIdentifier = "example LegIdentifier";
String PayReceive = "example PayReceive";
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");


TotalReturnSwapCashFlowEvent totalReturnSwapCashFlowEventInstance = new TotalReturnSwapCashFlowEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .Component(Component)
    .FlowType(FlowType)
    .LegIdentifier(LegIdentifier)
    .PayReceive(PayReceive)
    .CashFlowPerUnit(CashFlowPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
