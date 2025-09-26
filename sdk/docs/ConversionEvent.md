# com.finbourne.lusid.model.ConversionEvent
Conversion Event (CONV) - Conversion of securities (generally convertible bonds or preferred shares) into  another form of securities (usually common shares) at a pre-stated price/ratio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required.  Date at which positions are struck at the end of the day to  note which parties will receive the relevant amount of  entitlement, due to be distributed on the PaymentDate. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required. Date on which the movement is due to take place (cash and/or securities). | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date/time that the account servicer has set as the deadline to respond,  with instructions, to an outstanding event. Not required. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date/time which the issuer or issuer&#39;s agent has set as the deadline to respond,  with an instruction, to an outstanding offer or privilege. Not required. | [optional] [default to OffsetDateTime]
**periodOfAction** | [**EventDateRange**](EventDateRange.md) |  | [optional] [default to EventDateRange]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. Not required.  If provided, must have FractionalUnitsCashCurrency too. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. Not required.  If provided, must have FractionalUnitsCashPrice too. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible security offers for this conversion event. There must be at most one election of this type.    If the ParticipationType is Mandatory:     This list must have exactly one election that is chosen and default.  CashAndSecurityOfferElections and CashOfferElections &lt;b&gt; must be null or empty&lt;/b&gt;.     If the ParticipationType is Voluntary:     This list can be empty,  so long as CashAndSecurityOfferElections or CashOfferElections  has at least one election. None of these elections have to be chosen or default. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible cash and security offers for this conversion event. There must be at most one election of this type.    If the ParticipationType is Mandatory:    This list &lt;b&gt; must be null or empty&lt;/b&gt;.    If the ParticipationType is Voluntary:    This list can be empty,  so long as SecurityOfferElections or CashOfferElections  has at least one election. None of these elections have to be chosen or default. | [optional] [default to List<CashAndSecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible cash offers for this conversion event. There must be at most one election of this type.    If the ParticipationType is Mandatory:    This list &lt;b&gt; must be null or empty&lt;/b&gt;.    If the ParticipationType is Voluntary:    This list can be empty,  so long as SecurityOfferElections or CashAndSecurityOfferElections  has at least one election. None of these elections have to be chosen or default. | [optional] [default to List<CashOfferElection>]

```java
import com.finbourne.lusid.model.ConversionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
EventDateRange PeriodOfAction = new EventDateRange();
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<CashAndSecurityOfferElection> CashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();


ConversionEvent conversionEventInstance = new ConversionEvent()
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .PeriodOfAction(PeriodOfAction)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .SecurityOfferElections(SecurityOfferElections)
    .CashAndSecurityOfferElections(CashAndSecurityOfferElections)
    .CashOfferElections(CashOfferElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
