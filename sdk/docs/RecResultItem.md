# com.finbourne.lusid.model.RecResultItem
An individual item that makes up (one side of) a rec result. Polymorphic by rec type / item type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemType** | **String** | The polymorphic item-type discriminator (e.g. SettlementActivity, Holding, Transaction). Available values: SettlementActivity, Holding, Transaction. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**ruleAndAttributeValues** | **Map&lt;String, String&gt;** | The core rule, aggregate rule and supplemental attribute values for the item, keyed by name. | [optional] [readonly] [default to Map<String, String>]

```java
import com.finbourne.lusid.model.RecResultItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ItemType = "example ItemType";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable Map<String, String> RuleAndAttributeValues = new Map<String, String>();


RecResultItem recResultItemInstance = new RecResultItem()
    .ItemType(ItemType)
    .PortfolioId(PortfolioId)
    .RuleAndAttributeValues(RuleAndAttributeValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
