# com.finbourne.lusid.model.FlexibleLoanPricerOptions
Model options for instruments of type flexibleDeposit and flexibleLoan when used on a standalone basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setCleanPVToZero** | **Boolean** | If set to true the CleanPV will be set to zero in valuations and PV will effectively just be the Accrual. | [default to Boolean]

```java
import com.finbourne.lusid.model.FlexibleLoanPricerOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean SetCleanPVToZero = true;


FlexibleLoanPricerOptions flexibleLoanPricerOptionsInstance = new FlexibleLoanPricerOptions()
    .SetCleanPVToZero(SetCleanPVToZero);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
