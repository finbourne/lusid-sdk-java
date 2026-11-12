# com.finbourne.lusid.model.FundPartnerUnfundedReconciliationWarning
A soft warning on an unfunded commitment statement: the statement is still produced, with a caveat.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The warning. PeriodStartsBeforeAdmission: the period opens before the partner was admitted, so the opening balances are zero and the admission commitment is counted as a commitment change. | [default to String]
**admittedOn** | [**OffsetDateTime**](OffsetDateTime.md) | For PeriodStartsBeforeAdmission, the date the partner was admitted to the fund. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.FundPartnerUnfundedReconciliationWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable OffsetDateTime AdmittedOn = OffsetDateTime.now();


FundPartnerUnfundedReconciliationWarning fundPartnerUnfundedReconciliationWarningInstance = new FundPartnerUnfundedReconciliationWarning()
    .Code(Code)
    .AdmittedOn(AdmittedOn);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
