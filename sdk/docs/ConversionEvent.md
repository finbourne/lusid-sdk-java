

# ConversionEvent

Conversion Event (CONV) - Conversion of securities (generally convertible bonds or preferred shares) into  another form of securities (usually common shares) at a pre-stated price/ratio.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordDate** | **OffsetDateTime** | &lt;b&gt;Required.&lt;/b&gt;   Date at which positions are struck at the end of the day to   note which parties will receive the relevant amount of   entitlement, due to be distributed on the Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.PaymentDate. |  [optional] |
|**paymentDate** | **OffsetDateTime** | &lt;b&gt;Required.&lt;/b&gt; Date on which the movement is due to take place (cash and/or securities). |  [optional] |
|**newInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |
|**responseDeadlineDate** | **OffsetDateTime** | Date/time that the account servicer has set as the deadline to respond,  with instructions, to an outstanding event. Not required. |  [optional] |
|**marketDeadlineDate** | **OffsetDateTime** | Date/time which the issuer or issuer&#39;s agent has set as the deadline to respond,  with an instruction, to an outstanding offer or privilege. Not required. |  [optional] |
|**periodOfAction** | [**EventDateRange**](EventDateRange.md) |  |  [optional] |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. Not required.  If provided, must have Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.FractionalUnitsCashCurrency too. |  [optional] |
|**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. Not required.  If provided, must have Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.FractionalUnitsCashPrice too. |  [optional] |
|**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible security offers for this conversion event. There must be at most one election of this type.     If the Finbourne.LusidInstruments.Events.ParticipationType is Finbourne.LusidInstruments.Events.ParticipationType.Mandatory:     This list must have exactly one election that is chosen and default.  Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.CashAndSecurityOfferElections and Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.CashOfferElections&lt;b&gt; must be null or empty&lt;/b&gt;.     If the Finbourne.LusidInstruments.Events.ParticipationType is Finbourne.LusidInstruments.Events.ParticipationType.Voluntary:     This list can be empty,  so long as Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.CashAndSecurityOfferElections or Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.CashOfferElections  has at least one election. None of these elections have to be chosen or default.    |  [optional] |
|**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible cash and security offers for this conversion event. There must be at most one election of this type.     If the Finbourne.LusidInstruments.Events.ParticipationType is Finbourne.LusidInstruments.Events.ParticipationType.Mandatory:     This list &lt;b&gt; must be null or empty&lt;/b&gt;.     If the Finbourne.LusidInstruments.Events.ParticipationType is Finbourne.LusidInstruments.Events.ParticipationType.Voluntary:     This list can be empty,  so long as Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.SecurityOfferElections or Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.CashOfferElections  has at least one election. None of these elections have to be chosen or default.    |  [optional] |
|**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible cash offers for this conversion event. There must be at most one election of this type.     If the Finbourne.LusidInstruments.Events.ParticipationType is Finbourne.LusidInstruments.Events.ParticipationType.Mandatory:     This list &lt;b&gt; must be null or empty&lt;/b&gt;.     If the Finbourne.LusidInstruments.Events.ParticipationType is Finbourne.LusidInstruments.Events.ParticipationType.Voluntary:     This list can be empty,  so long as Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.SecurityOfferElections or Finbourne.WebApi.Interface.Dto.InstrumentEvents.ConversionEvent.CashAndSecurityOfferElections  has at least one election. None of these elections have to be chosen or default.    |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


