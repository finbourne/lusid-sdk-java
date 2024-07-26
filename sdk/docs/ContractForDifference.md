

# ContractForDifference

LUSID representation of a Contract for Difference.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the CFD. |  |
|**maturityDate** | **OffsetDateTime** | The maturity date for the CFD. If CFDType is Futures, this should be set to be the maturity date of the underlying  future. If CFDType is Cash, this should not be set. |  [optional] |
|**code** | **String** | The code of the underlying. |  |
|**contractSize** | **java.math.BigDecimal** | The size of the CFD contract, this should represent the total number of stocks that the CFD represents. |  |
|**payCcy** | **String** | The currency that this CFD pays out, this can be different to the UnderlyingCcy. |  |
|**referenceRate** | **java.math.BigDecimal** | The reference rate of the CFD, this can be set to 0 but not negative values.  This field is optional, if not set it will default to 0. |  [optional] |
|**type** | **String** | The type of CFD.    Supported string (enumeration) values are: [Cash, Futures]. |  |
|**underlyingCcy** | **String** | The currency of the underlying |  |
|**underlyingIdentifier** | **String** | External market codes and identifiers for the CFD, e.g. RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode]. |  |
|**lotSize** | **Integer** | CFD LotSize, the minimum number of shares that can be bought or sold at once.  Optional, if set must be non-negative, if not set defaults to 1. |  [optional] |



