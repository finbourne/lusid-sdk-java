# com.finbourne.lusid.model.FundStructureEdge
A link from one member of a Fund Structure to another, and how that link is held.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The node code of the member that holds the link: the investor or the owner. | [default to String]
**to** | [**FundStructureEdgeTarget**](FundStructureEdgeTarget.md) |  | [default to FundStructureEdgeTarget]
**linkageType** | **String** | How the link is held. DedicatedShareClass (the default) means the source invests into a share class of the target; DirectEquityInstrument, GPInterest, LPInterest and CarryInterest mean the source holds that interest in the target through the instrument in viaInstrumentId. Available values: DedicatedShareClass, DirectEquityInstrument, GPInterest, LPInterest, CarryInterest. | [optional] [default to String]
**viaInstrumentId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.FundStructureEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

String From = "example From";
FundStructureEdgeTarget To = new FundStructureEdgeTarget();
@jakarta.annotation.Nullable String LinkageType = "example LinkageType";
ResourceId ViaInstrumentId = new ResourceId();


FundStructureEdge fundStructureEdgeInstance = new FundStructureEdge()
    .From(From)
    .To(To)
    .LinkageType(LinkageType)
    .ViaInstrumentId(ViaInstrumentId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
