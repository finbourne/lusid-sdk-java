# com.finbourne.lusid.model.FundTaxExceptionItem
A tax exception row seen across funds, so the fund and the owning life-company entity travel with it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**id** | **String** | An identifier stable within a response, built from the category, portfolio and instrument. | [default to String]
**category** | **String** | The kind of exception: UnmatchedDisposal, NegativePool, MissingValuation or UnclassifiedInstrument. | [default to String]
**severity** | **String** | Error when the exception blocks the tax computation, Warning when it casts doubt on it. | [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrument** | **String** | The LUSID unique identifier of the instrument the exception was raised against. | [optional] [default to String]
**message** | **String** | A description of the exception. | [default to String]
**raisedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the exception was observed at. | [default to OffsetDateTime]
**taxAtStake** | **java.math.BigDecimal** | The tax effect, in the Fund&#39;s base currency, of the position or gain the exception blocks, at the Fund&#39;s configured rate. Absent when the rate or the exposure is not known. | [optional] [default to java.math.BigDecimal]
**rootCause** | [**TaxExceptionRootCause**](TaxExceptionRootCause.md) |  | [optional] [default to TaxExceptionRootCause]

```java
import com.finbourne.lusid.model.FundTaxExceptionItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Client = new ResourceId();
ResourceId Fund = new ResourceId();
String Id = "example Id";
String Category = "example Category";
String Severity = "example Severity";
ResourceId Portfolio = new ResourceId();
@jakarta.annotation.Nullable String Instrument = "example Instrument";
String Message = "example Message";
OffsetDateTime RaisedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal TaxAtStake = new java.math.BigDecimal("100.00");
TaxExceptionRootCause RootCause = new TaxExceptionRootCause();


FundTaxExceptionItem fundTaxExceptionItemInstance = new FundTaxExceptionItem()
    .Client(Client)
    .Fund(Fund)
    .Id(Id)
    .Category(Category)
    .Severity(Severity)
    .Portfolio(Portfolio)
    .Instrument(Instrument)
    .Message(Message)
    .RaisedAt(RaisedAt)
    .TaxAtStake(TaxAtStake)
    .RootCause(RootCause);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
