# com.finbourne.lusid.model.ConfigurationRecipe
The Configuration or Calculation Recipe controls how LUSID processes a given request.  This can be used to change where market data used in pricing is loaded from and in what order, or which model is used to  price a given instrument as well as how aggregation will process the produced results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used when updating or inserting the Configuration Recipe. | [default to String]
**code** | **String** | User given string name (code) to identify the recipe. | [default to String]
**market** | [**MarketContext**](MarketContext.md) |  | [optional] [default to MarketContext]
**pricing** | [**PricingContext**](PricingContext.md) |  | [optional] [default to PricingContext]
**aggregation** | [**AggregationContext**](AggregationContext.md) |  | [optional] [default to AggregationContext]
**description** | **String** | User can assign a description to understand more humanly the recipe. | [optional] [default to String]
**holding** | [**HoldingContext**](HoldingContext.md) |  | [optional] [default to HoldingContext]
**translation** | [**TranslationContext**](TranslationContext.md) |  | [optional] [default to TranslationContext]

```java
import com.finbourne.lusid.model.ConfigurationRecipe;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
MarketContext Market = new MarketContext();
PricingContext Pricing = new PricingContext();
AggregationContext Aggregation = new AggregationContext();
@jakarta.annotation.Nullable String Description = "example Description";
HoldingContext Holding = new HoldingContext();
TranslationContext Translation = new TranslationContext();


ConfigurationRecipe configurationRecipeInstance = new ConfigurationRecipe()
    .Scope(Scope)
    .Code(Code)
    .Market(Market)
    .Pricing(Pricing)
    .Aggregation(Aggregation)
    .Description(Description)
    .Holding(Holding)
    .Translation(Translation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
