# com.finbourne.lusid.model.SubscriptionDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**timelineId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**addressKeys** | **List&lt;String&gt;** | The set of addresses the subscriber wishes to receive. | [optional] [default to List<String>]
**byTaxLots** | **Boolean** |  | [optional] [default to Boolean]
**subscriptionType** | **String** | The kind of data the subscription streams (holdings or transactions), defaulting to holdings.  Address keys and byTaxLots are not valid for a transactions subscription. Available values: Holdings, Transactions. | [optional] [default to String]
**startEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**endEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.SubscriptionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId PortfolioId = new ResourceId();
ResourceId TimelineId = new ResourceId();
@jakarta.annotation.Nullable List<String> AddressKeys = new List<String>();
Boolean ByTaxLots = true;
@jakarta.annotation.Nullable String SubscriptionType = "example SubscriptionType";
@jakarta.annotation.Nullable OffsetDateTime StartEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndEffectiveAt = OffsetDateTime.now();


SubscriptionDefinition subscriptionDefinitionInstance = new SubscriptionDefinition()
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .PortfolioId(PortfolioId)
    .TimelineId(TimelineId)
    .AddressKeys(AddressKeys)
    .ByTaxLots(ByTaxLots)
    .SubscriptionType(SubscriptionType)
    .StartEffectiveAt(StartEffectiveAt)
    .EndEffectiveAt(EndEffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
