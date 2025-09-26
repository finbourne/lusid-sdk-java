# com.finbourne.lusid.model.PricingContext
Pricing context node. In order to price an instrument a number of configuration parameters are required to determine which  (a) pricing model (ranging from a simple lookup of a market quote/price through to a Monte-Carlo simulation for the behaviour of its cashflows)  (b) vendor library (Lusid internal models or those provided through an external Vendor such as Refinitiv (proprietary) or QuantLib (open source)  are used in the pricing.    In conjunction with these there are a number of parameters that govern the behaviour of these models. For example, in pricing an Fx volatility  dependent product such as an Fx option, there are various parameters that affect model behaviour for the smile. In Lusid a distinction is made between  those which are understood natively and those which are only held for use with a given vendor-model combination. The problem is that, unlike market  quote data, there are few standards around model descriptions. Hence, apparently similar terminology can be mis-leading; for example in SABR models where  the basic parameters are agreed upon but most practical models have used an approximation with adjustments where the parameters can have wildly different meanings.  To avoid confusion or mis-behaviour in this area, where parameters are not understood to be interchangeable, they are only settable on a per-library per-model  basis, essentially as opaque data that will be given to the Vendor library \"verbatim\" but not used with any other.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelRules** | [**List&lt;VendorModelRule&gt;**](VendorModelRule.md) | The set of model rules that are available. There may be multiple rules for Vendors, but only one per model-instrument pair.  Which of these preference sets is used depends upon the model choice selection if specified, or failing that the global default model specification  in the options. | [optional] [default to List<VendorModelRule>]
**modelChoice** | [**Map&lt;String, ModelSelection&gt;**](ModelSelection.md) | The choice of which model selection (vendor library, pricing model) to use in evaluation of a given instrument type. | [optional] [default to Map<String, ModelSelection>]
**options** | [**PricingOptions**](PricingOptions.md) |  | [optional] [default to PricingOptions]
**resultDataRules** | [**List&lt;ResultKeyRule&gt;**](ResultKeyRule.md) | Set of rules that control querying of unit results either for direct queries into aggregation or for  overriding intermediate calculations. For example, a dirty price is made up from a clean price and the accrued interest.  One might consider overriding the accrued interest calculated by a model (perhaps one wants to match an external value or simply disagrees with the  calculated result) and use that in calculation of the dirty price. | [optional] [default to List<ResultKeyRule>]
**holdingPricingInfo** | [**HoldingPricingInfo**](HoldingPricingInfo.md) |  | [optional] [default to HoldingPricingInfo]
**accrualDefinition** | **String** | Determines which method to use for the calculation of accrued interest. Defaults to SOD. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PricingContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<VendorModelRule> ModelRules = new List<VendorModelRule>();
@jakarta.annotation.Nullable Map<String, ModelSelection> ModelChoice = new Map<String, ModelSelection>();
PricingOptions Options = new PricingOptions();
@jakarta.annotation.Nullable List<ResultKeyRule> ResultDataRules = new List<ResultKeyRule>();
HoldingPricingInfo HoldingPricingInfo = new HoldingPricingInfo();
@jakarta.annotation.Nullable String AccrualDefinition = "example AccrualDefinition";


PricingContext pricingContextInstance = new PricingContext()
    .ModelRules(ModelRules)
    .ModelChoice(ModelChoice)
    .Options(Options)
    .ResultDataRules(ResultDataRules)
    .HoldingPricingInfo(HoldingPricingInfo)
    .AccrualDefinition(AccrualDefinition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
