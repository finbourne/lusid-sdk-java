# com.finbourne.lusid.model.AborRequest
The request used to create an Abor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Abor. | [default to String]
**displayName** | **String** | The name of the Abor. | [default to String]
**description** | **String** | The description for the Abor. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. Note: These must all have the same base currency. | [default to List<PortfolioEntityId>]
**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.AborRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<PortfolioEntityId> PortfolioIds = new List<PortfolioEntityId>();
ResourceId AborConfigurationId = new ResourceId();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


AborRequest aborRequestInstance = new AborRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .PortfolioIds(PortfolioIds)
    .AborConfigurationId(AborConfigurationId)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
