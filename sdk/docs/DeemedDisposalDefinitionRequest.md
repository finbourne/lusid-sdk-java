# com.finbourne.lusid.model.DeemedDisposalDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** | The name of the deemed disposal definition. | [default to String]
**description** | **String** | The description of the deemed disposal definition. | [optional] [default to String]
**filter** | **String** | Selects the holdings the definition deems disposed of and re-acquired at market value at a valuation point. Written in the holding filter grammar of the portfolio cash flow endpoints (holdingType, holdingTypeName, instrumentUid, instrumentScope, units, settledUnits, unsettledUnits, overdueUnits, currentFace, cost.amount, cost.currency, costPortfolioCcy.amount, custodianAccountId, custodianAccount, subHoldingKeys[...] and properties[...]), for example \&quot;holdingType eq &#39;B&#39; and cost.currency eq &#39;USD&#39;\&quot;, with the additional system field &#39;InNavTypeBaseCurrency&#39; (true when the holding is in the NAV type&#39;s base currency). The GetHoldings fields &#39;currency&#39; and &#39;transaction&#39; are not accepted. | [default to String]

```java
import com.finbourne.lusid.model.DeemedDisposalDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Filter = "example Filter";


DeemedDisposalDefinitionRequest deemedDisposalDefinitionRequestInstance = new DeemedDisposalDefinitionRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Filter(Filter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
