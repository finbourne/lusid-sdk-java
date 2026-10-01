# com.finbourne.lusid.model.FundStructureEdge
A link from one member of a Fund Structure to another, and how that link is held.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The node code of the member that holds the link: the investor or the owner. | [default to String]
**to** | [**FundStructureEdgeTarget**](FundStructureEdgeTarget.md) |  | [default to FundStructureEdgeTarget]
**linkageType** | **String** | How the link is held. DedicatedShareClass (the default) means the source invests into a share class of the target; DirectEquityInstrument, GPInterest, LPInterest and CarryInterest mean the source holds that interest in the target through the instrument in viaInstrumentId. Available values: DedicatedShareClass, DirectEquityInstrument, GPInterest, LPInterest, CarryInterest. | [optional] [default to String]
**viaInstrumentId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**sharingPercentage** | **java.math.BigDecimal** | The holder&#39;s ILPA sharing percentage in the target member, adjusted for transfers and equalisation but not reduced by ordinary distributions. Between 0 and 1 inclusive; the percentages declared into any one member must sum to no more than 1. Defaults to 1 (sole ownership) when not supplied. A value of 0 records a full exit: keep the edge and set it to 0 from the date the interest ended, so that the change in percentage from one version of the structure to the next tells the P&amp;L flow what was disposed of. Each disposal or acquisition trade of the holder&#39;s needs its own version of the structure, effective on that trade&#39;s date: proceeds received on a date with no change in percentage are taken as a distribution on the retained interest, not a disposal. A change in percentage with no trade of the holder&#39;s on its date takes effect at the holder&#39;s next transaction on the member or period close, whichever comes first. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FundStructureEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

String From = "example From";
FundStructureEdgeTarget To = new FundStructureEdgeTarget();
@jakarta.annotation.Nullable String LinkageType = "example LinkageType";
ResourceId ViaInstrumentId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal SharingPercentage = new java.math.BigDecimal("100.00");


FundStructureEdge fundStructureEdgeInstance = new FundStructureEdge()
    .From(From)
    .To(To)
    .LinkageType(LinkageType)
    .ViaInstrumentId(ViaInstrumentId)
    .SharingPercentage(SharingPercentage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
