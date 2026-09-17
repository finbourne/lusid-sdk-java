# com.finbourne.lusid.model.VirtualTransactionOverrideRecord
The overrides and suppressions stored against a single instrument event in a single portfolio, together  with their statuses as resolved against the requested portfolio's currently generated virtual  transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** | The identifier of the instrument event this record is stored against. | [optional] [default to String]
**sourcePortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**overrides** | [**Map&lt;String, OverrideEntryResponse&gt;**](OverrideEntryResponse.md) | The overrides stored in this record, keyed by the virtual transaction id being overridden as it appears in the portfolio holding the record. | [optional] [default to Map<String, OverrideEntryResponse>]
**suppressions** | [**Map&lt;String, SuppressionEntryResponse&gt;**](SuppressionEntryResponse.md) | The suppressions stored in this record, keyed by the virtual transaction id being suppressed as it appears in the portfolio holding the record. | [optional] [default to Map<String, SuppressionEntryResponse>]
**overrideMatchStatus** | **String** | Whether every override and suppression entry in this record still matches a virtual transaction the event currently generates. Available values: Matched, Orphaned. | [optional] [default to String]
**overrideApplicationStatus** | **String** | Whether all, some, or none of this record&#39;s override and suppression entries are currently applied. Available values: Full, Partial, Orphaned. | [optional] [default to String]
**cancelActive** | **Boolean** | True when an active event-level Cancel instruction also exists for this instrument event, taking precedence over the entries in this record. | [optional] [default to Boolean]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.VirtualTransactionOverrideRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentEventId = "example InstrumentEventId";
ResourceId SourcePortfolioId = new ResourceId();
@jakarta.annotation.Nullable Map<String, OverrideEntryResponse> Overrides = new Map<String, OverrideEntryResponse>();
@jakarta.annotation.Nullable Map<String, SuppressionEntryResponse> Suppressions = new Map<String, SuppressionEntryResponse>();
@jakarta.annotation.Nullable String OverrideMatchStatus = "example OverrideMatchStatus";
@jakarta.annotation.Nullable String OverrideApplicationStatus = "example OverrideApplicationStatus";
@jakarta.annotation.Nullable Boolean CancelActive = true;
Version Version = new Version();


VirtualTransactionOverrideRecord virtualTransactionOverrideRecordInstance = new VirtualTransactionOverrideRecord()
    .InstrumentEventId(InstrumentEventId)
    .SourcePortfolioId(SourcePortfolioId)
    .Overrides(Overrides)
    .Suppressions(Suppressions)
    .OverrideMatchStatus(OverrideMatchStatus)
    .OverrideApplicationStatus(OverrideApplicationStatus)
    .CancelActive(CancelActive)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
