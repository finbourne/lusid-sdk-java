

# BondConversionSchedule

A BondConversionSchedule object represents a class containing the  information required for the creation of convertible features in a ComplexBond

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifiers** | **Map&lt;String, String&gt;** | The market identifier(s) of the share that the bond converts to. The instrument  will not fail validation if no identifier is supplied. |  [optional] |
|**bondConversionEntries** | [**List&lt;BondConversionEntry&gt;**](BondConversionEntry.md) | The dates at which the bond may be converted and associated information required about the conversion. |  [optional] |
|**conversionTrigger** | **String** | Corporate event that triggers a conversion    Supported string (enumeration) values are: [NextEquityFinancing, IpoConversion, KnownDates, SoftCall]. |  |
|**deliveryType** | **String** | Is a conversion made into cash or into shares?    Supported string (enumeration) values are: [Cash, Physical]. |  [optional] |
|**exerciseType** | **String** | The exercise type of the conversion schedule (American or European).  For American type, the bond is convertible from a given exercise date until the next date in the schedule, or until it matures.  For European type, the bond is only convertible on the given exercise date.    Supported string (enumeration) values are: [European, Bermudan, American]. |  |
|**includesAccrued** | **Boolean** | Set this to true if a accrued interest is included in the conversion. Defaults to true. |  [optional] |
|**mandatoryConversion** | **Boolean** | Set this to true if a conversion is mandatory if the trigger occurs. Defaults to false. |  [optional] |
|**notificationPeriodEnd** | **OffsetDateTime** | The last day in the notification period for the conversion of the bond |  [optional] |
|**notificationPeriodStart** | **OffsetDateTime** | The first day in the notification period for the conversion of the bond |  [optional] |



