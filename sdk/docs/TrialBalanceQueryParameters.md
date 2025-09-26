# com.finbourne.lusid.model.TrialBalanceQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**dateMode** | **String** | The mode of calculation of the trial balance. The available values are: ActivityDate, AccountingDate. | [optional] [default to String]
**generalLedgerProfileCode** | **String** | The optional code of a general ledger profile used to decorate trial balance with levels. | [optional] [default to String]
**propertyKeys** | **List&lt;String&gt;** | A list of property keys from the &#39;Account&#39; domain to decorate onto the trial balance. | [optional] [default to List<String>]
**excludeCleardownModule** | **Boolean** | By deafult this flag is set to false, if this is set to true, no cleardown module will be applied to the trial balance. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.TrialBalanceQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry Start = new DateOrDiaryEntry();
DateOrDiaryEntry End = new DateOrDiaryEntry();
@jakarta.annotation.Nullable String DateMode = "example DateMode";
@jakarta.annotation.Nullable String GeneralLedgerProfileCode = "example GeneralLedgerProfileCode";
@jakarta.annotation.Nullable List<String> PropertyKeys = new List<String>();
Boolean ExcludeCleardownModule = true;


TrialBalanceQueryParameters trialBalanceQueryParametersInstance = new TrialBalanceQueryParameters()
    .Start(Start)
    .End(End)
    .DateMode(DateMode)
    .GeneralLedgerProfileCode(GeneralLedgerProfileCode)
    .PropertyKeys(PropertyKeys)
    .ExcludeCleardownModule(ExcludeCleardownModule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
