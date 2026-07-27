# com.finbourne.lusid.model.ToBeAnnounced
LUSID representation of a TBA (To Be Announced) forward contract for generic agency mortgage-backed securities.  Valued as Quantity x Price via EOD quote lookup; carries no coupon cashflows, accrual or factor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The trade inception date of the TBA. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date of the TBA (e.g. the agency&#39;s announced settlement date for the month). | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the TBA. | [default to String]
**agency** | **String** | The issuing agency of the underlying generic collateral, e.g. \&quot;FNMA\&quot;, \&quot;FHLMC\&quot;, \&quot;GNMA\&quot;.  Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. | [optional] [default to String]
**coupon** | **java.math.BigDecimal** | The stated coupon rate of the underlying generic collateral, e.g. 3.0, 4.5.  Note this property does not impact valuation - there are no coupon cash flows on the TBA itself.  From a LUSID analytics perspective, it is purely informational. | [optional] [default to java.math.BigDecimal]
**tenor** | **String** | The tenor of the underlying generic collateral, e.g. \&quot;30Y\&quot;, \&quot;15Y\&quot;.  Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. | [optional] [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.lusid.model.ToBeAnnounced;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable String Agency = "example Agency";
@jakarta.annotation.Nullable java.math.BigDecimal Coupon = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Tenor = "example Tenor";
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
TradingConventions TradingConventions = new TradingConventions();


ToBeAnnounced toBeAnnouncedInstance = new ToBeAnnounced()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .Agency(Agency)
    .Coupon(Coupon)
    .Tenor(Tenor)
    .TimeZoneConventions(TimeZoneConventions)
    .TradingConventions(TradingConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
