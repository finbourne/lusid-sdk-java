# com.finbourne.lusid.model.ComplianceRuleContribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | The position of this contribution within the compliance run. | [default to Integer]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrument** | **String** | The LUSID instrument identifier (LUID) of the instrument for this contribution. | [default to String]
**instrumentType** | **String** | Optional. The economic type of the instrument for this contribution. | [optional] [default to String]
**holdingType** | **String** | Optional. The holding type of this contribution. | [optional] [default to String]
**holdingId** | **String** | Optional. The internal holding identifier encoding the detail of what the holding includes. | [optional] [default to String]
**resultValues** | **Map&lt;String, java.math.BigDecimal&gt;** | Dictionary of AddressKey (as string) and their corresponding decimal valuation results for this contribution. | [default to Map<String, java.math.BigDecimal>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Dictionary of PropertyKey (as string) and their corresponding property for this contribution. | [default to Map<String, Property>]
**relatedProperties** | **Map&lt;String, String&gt;** | Dictionary of related property keys (as string) and their string values, read from related entities across a relationship. | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.ComplianceRuleContribution;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Index = new Integer("100.00");
ResourceId PortfolioId = new ResourceId();
ResourceId OrderId = new ResourceId();
String Instrument = "example Instrument";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String HoldingType = "example HoldingType";
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
Map<String, java.math.BigDecimal> ResultValues = new Map<String, java.math.BigDecimal>();
Map<String, Property> Properties = new Map<String, Property>();
Map<String, String> RelatedProperties = new Map<String, String>();


ComplianceRuleContribution complianceRuleContributionInstance = new ComplianceRuleContribution()
    .Index(Index)
    .PortfolioId(PortfolioId)
    .OrderId(OrderId)
    .Instrument(Instrument)
    .InstrumentType(InstrumentType)
    .HoldingType(HoldingType)
    .HoldingId(HoldingId)
    .ResultValues(ResultValues)
    .Properties(Properties)
    .RelatedProperties(RelatedProperties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
