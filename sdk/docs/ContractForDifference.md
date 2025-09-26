# com.finbourne.lusid.model.ContractForDifference
LUSID representation of a Contract for Difference.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the CFD. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date for the CFD. If CFDType is Futures, this should be set to be the maturity date of the underlying  future. If CFDType is Cash, this should not be set. | [optional] [default to OffsetDateTime]
**code** | **String** | The code of the underlying. | [optional] [default to String]
**contractSize** | **java.math.BigDecimal** | The size of the CFD contract, this should represent the total number of stocks that the CFD represents.   This field is optional, if not set it will default to 1. | [optional] [default to java.math.BigDecimal]
**payCcy** | **String** | The currency that this CFD pays out, this can be different to the UnderlyingCcy. | [default to String]
**referenceRate** | **java.math.BigDecimal** | The reference rate of the CFD, this can be set to 0 but not negative values.  This field is optional, if not set it will default to 0. | [optional] [default to java.math.BigDecimal]
**type** | **String** | The type of CFD.    Supported string (enumeration) values are: [Cash, Futures]. | [default to String]
**underlyingCcy** | **String** | The currency of the underlying | [optional] [default to String]
**underlyingIdentifier** | **String** | External market codes and identifiers for the CFD, e.g. RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode]. | [optional] [default to String]
**lotSize** | **Integer** | CFD LotSize, the minimum number of shares that can be bought or sold at once.  Optional, if set must be non-negative, if not set defaults to 1. | [optional] [default to Integer]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.ContractForDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Code = "example Code";
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
String PayCcy = "example PayCcy";
java.math.BigDecimal ReferenceRate = new java.math.BigDecimal("100.00");
String Type = "example Type";
@jakarta.annotation.Nullable String UnderlyingCcy = "example UnderlyingCcy";
@jakarta.annotation.Nullable String UnderlyingIdentifier = "example UnderlyingIdentifier";
Integer LotSize = new Integer("100.00");
LusidInstrument Underlying = new LusidInstrument();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


ContractForDifference contractForDifferenceInstance = new ContractForDifference()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .Code(Code)
    .ContractSize(ContractSize)
    .PayCcy(PayCcy)
    .ReferenceRate(ReferenceRate)
    .Type(Type)
    .UnderlyingCcy(UnderlyingCcy)
    .UnderlyingIdentifier(UnderlyingIdentifier)
    .LotSize(LotSize)
    .Underlying(Underlying)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
