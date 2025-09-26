# com.finbourne.lusid.model.UpsertInvestorRecordRequest
Request to create or update an investor record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investor Record lies. | [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investor Record. | [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investor Record. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investor Record | [default to String]
**description** | **String** | The description of the Investor Record | [optional] [default to String]
**investor** | [**InvestorIdentifier**](InvestorIdentifier.md) |  | [default to InvestorIdentifier]

```java
import com.finbourne.lusid.model.UpsertInvestorRecordRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
InvestorIdentifier Investor = new InvestorIdentifier();


UpsertInvestorRecordRequest upsertInvestorRecordRequestInstance = new UpsertInvestorRecordRequest()
    .Scope(Scope)
    .Identifiers(Identifiers)
    .Properties(Properties)
    .DisplayName(DisplayName)
    .Description(Description)
    .Investor(Investor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
