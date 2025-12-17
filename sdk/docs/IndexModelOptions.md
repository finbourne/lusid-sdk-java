# com.finbourne.lusid.model.IndexModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioScaling** | **String** | The available values are: Sum, AbsoluteSum, Unity | [default to String]
**lookthroughPortfolioRelationshipId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.IndexModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PortfolioScaling = "example PortfolioScaling";
ResourceId LookthroughPortfolioRelationshipId = new ResourceId();


IndexModelOptions indexModelOptionsInstance = new IndexModelOptions()
    .PortfolioScaling(PortfolioScaling)
    .LookthroughPortfolioRelationshipId(LookthroughPortfolioRelationshipId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
