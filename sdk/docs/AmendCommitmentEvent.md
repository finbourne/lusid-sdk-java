# com.finbourne.lusid.model.AmendCommitmentEvent
Amends the total committed capital of a CapitalInterest. The component says whether the amount raises  ('Commitment') or lowers ('Release') the commitment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the commitment amendment takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount the total commitment is amended by. Must not be negative: the component decides whether  it raises or lowers the commitment. | [default to java.math.BigDecimal]
**component** | **String** | The component of the commitment the amendment is recorded under: &#39;Commitment&#39; for a commitment made  or upsized, which raises the commitment by the amount, or &#39;Release&#39; for committed capital released,  which lowers it by the amount. Optional; when absent the amount raises the commitment. Available values: Commitment, Release. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AmendCommitmentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Component = "example Component";


AmendCommitmentEvent amendCommitmentEventInstance = new AmendCommitmentEvent()
    .Date(Date)
    .Amount(Amount)
    .Component(Component);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
