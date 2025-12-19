# com.finbourne.lusid.model.JournalEntryLinesQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**variant** | **String** | Unique Variant for the given Valuation points. If not provided, defaults to empty string. | [optional] [default to String]
**dateMode** | **String** | The mode of calculation of the journal entry lines. The available values are: ActivityDate, AccountingDate. | [optional] [default to String]
**generalLedgerProfileCode** | **String** | The optional code of a general ledger profile used to decorate journal entry lines with levels. | [optional] [default to String]
**propertyKeys** | **List&lt;String&gt;** | A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39; domain to decorate onto the journal entry lines. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.JournalEntryLinesQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry Start = new DateOrDiaryEntry();
DateOrDiaryEntry End = new DateOrDiaryEntry();
@jakarta.annotation.Nullable String Variant = "example Variant";
@jakarta.annotation.Nullable String DateMode = "example DateMode";
@jakarta.annotation.Nullable String GeneralLedgerProfileCode = "example GeneralLedgerProfileCode";
@jakarta.annotation.Nullable List<String> PropertyKeys = new List<String>();


JournalEntryLinesQueryParameters journalEntryLinesQueryParametersInstance = new JournalEntryLinesQueryParameters()
    .Start(Start)
    .End(End)
    .Variant(Variant)
    .DateMode(DateMode)
    .GeneralLedgerProfileCode(GeneralLedgerProfileCode)
    .PropertyKeys(PropertyKeys);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
