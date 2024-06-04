

# BondConversionEntry

Information required to specify a conversion event for a convertible bond.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | The date at which the bond can be converted |  [optional] |
|**denomination** | **java.math.BigDecimal** | The number of shares to be issued on conversion will be equal to the denomination of the  bond divided by the conversion price.  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. |  [optional] |
|**price** | **java.math.BigDecimal** | The conversion price  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. |  [optional] |
|**ratio** | **java.math.BigDecimal** | The number of common shares received at the time of conversion for each convertible bond  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. |  [optional] |



