# com.finbourne.lusid.model.ComplianceRuleContribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrument** | **String** | The LUSID instrument identifier (LUID) of the instrument for this contribution. | [default to String]
**instrumentType** | **String** | Optional. The economic type of the instrument for this contribution. | [optional] [default to String]
**holdingType** | **String** | Optional. The holding type of this contribution. | [optional] [default to String]
**holdingId** | **String** | Optional. The internal holding identifier encoding the detail of what the holding includes. | [optional] [default to String]
**heldBy** | **String** | Optional. Where this holding sits relative to the rule&#39;s benchmark: portfolio, benchmark or both.  Meaningful only for benchmark-relative rules. | [optional] [default to String]
**keysUsed** | [**List&lt;ComplianceKeyUsed&gt;**](ComplianceKeyUsed.md) | The keys this holding contributed to the rule: each key the rule read (plus the portfolio NAV key), with the  role(s) it played, the holding&#39;s own value for it, and which bag the value came from. | [default to List<ComplianceKeyUsed>]

```java
import com.finbourne.lusid.model.ComplianceRuleContribution;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
ResourceId OrderId = new ResourceId();
String Instrument = "example Instrument";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String HoldingType = "example HoldingType";
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String HeldBy = "example HeldBy";
List<ComplianceKeyUsed> KeysUsed = new List<ComplianceKeyUsed>();


ComplianceRuleContribution complianceRuleContributionInstance = new ComplianceRuleContribution()
    .PortfolioId(PortfolioId)
    .OrderId(OrderId)
    .Instrument(Instrument)
    .InstrumentType(InstrumentType)
    .HoldingType(HoldingType)
    .HoldingId(HoldingId)
    .HeldBy(HeldBy)
    .KeysUsed(KeysUsed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
