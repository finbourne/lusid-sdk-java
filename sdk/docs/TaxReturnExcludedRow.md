# com.finbourne.lusid.model.TaxReturnExcludedRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**reason** | **String** | Why the holding is outside the return. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxReturnExcludedRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
@jakarta.annotation.Nullable String Reason = "example Reason";


TaxReturnExcludedRow taxReturnExcludedRowInstance = new TaxReturnExcludedRow()
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .PortfolioCode(PortfolioCode)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
