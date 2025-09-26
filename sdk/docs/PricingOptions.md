# com.finbourne.lusid.model.PricingOptions
Options for controlling the default aspects and behaviour of the pricing engine.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelSelection** | [**ModelSelection**](ModelSelection.md) |  | [optional] [default to ModelSelection]
**useInstrumentTypeToDeterminePricer** | **Boolean** | If true then use the instrument type to set the default instrument pricer  This applies where no more specific set of overrides are provided on a per-vendor and instrument basis. | [optional] [default to Boolean]
**allowAnyInstrumentsWithSecUidToPriceOffLookup** | **Boolean** | By default, one would not expect to price and exotic instrument, i.e. an instrument with a complicated  instrument definition simply through looking up a price as there should be a better way of evaluating it.  To override that behaviour and allow lookup for a price from the instrument identifier(s), set this to true. | [optional] [default to Boolean]
**allowPartiallySuccessfulEvaluation** | **Boolean** | If true then a failure in task evaluation doesn&#39;t cause overall failure.  results will be returned where they succeeded and annotation elsewhere | [optional] [default to Boolean]
**produceSeparateResultForLinearOtcLegs** | **Boolean** | If true (default), when pricing an Fx-Forward or Interest Rate Swap, Future and other linearly separable products, product two results, one for each leg  rather than a single line result with the amalgamated/summed pv from both legs. | [optional] [default to Boolean]
**enableUseOfCachedUnitResults** | **Boolean** | If true, when pricing using a model or for an instrument that supports use of intermediate cached-results, use them.  Default is that this caching is turned off. | [optional] [default to Boolean]
**windowValuationOnInstrumentStartEnd** | **Boolean** | If true, when valuing an instrument outside the period where it is &#39;alive&#39; (the start-maturity window) it will return a valuation of zero | [optional] [default to Boolean]
**removeContingentCashflowsInPaymentDiary** | **Boolean** | When creating a payment diary, should contingent cash payments (e.g. from exercise of a swaption into a swap) be included or not.  i.e. Is exercise or default being assumed to happen or not. | [optional] [default to Boolean]
**useChildSubHoldingKeysForPortfolioExpansion** | **Boolean** | Should fund constituents inherit subholding keys from the parent subholding keyb | [optional] [default to Boolean]
**validateDomesticAndQuoteCurrenciesAreConsistent** | **Boolean** | Do we validate that the instrument domestic currency matches the quote currency (unless unknown/zzz) when using lookup pricing. | [optional] [default to Boolean]
**mbsValuationUsingHoldingCurrentFace** | **Boolean** |  | [optional] [default to Boolean]
**convertSrsCashFlowsToPortfolioCurrency** | **Boolean** | In the case upserted structured result store (SRS) cashflows are not   in the portfolio currency, set this parameter to True to convert said  cashflows into the portfolio currency. By default, this flag is set   to False and Lusid will not do any FX conversion.    Please note that FX conversion is dependent on the data available in  the quote store - ensure that all relevant FX quotes have been loaded  for cashflow currency conversion. | [optional] [default to Boolean]
**conservedQuantityForLookthroughExpansion** | **String** | When performing lookthrough portfolio expansion with ScalingMethodology set to \&quot;Sum\&quot; or \&quot;AbsoluteSum\&quot;,  the quantity specified here will be conserved and apportioned to lookthrough constituents.  For example, an equal-weighting index with 100 constituents can be modelled as a reference portfolio with 1% weights on each equity.  When expanding a $9000 holding of that index into its constituents while conserving PV, we end up with $90 of each equity.  The number of units of each equity held is then implied.  Note that conservation of one quantity may imply non-conservation of others, especially when some constituents are OTCs.     Allowed values are: \&quot;PV\&quot; (default), \&quot;Exposure\&quot;. | [optional] [default to String]
**returnZeroPv** | [**ReturnZeroPvOptions**](ReturnZeroPvOptions.md) |  | [optional] [default to ReturnZeroPvOptions]
**enableLegLevelInferenceForCustomSrsColumns** | **Boolean** | When enabled, allows inference between leg-level and  instrument-level data during portfolio valuation. If  data is missing at one level, it may be inferred from  the other level. For example, missing leg-level data   may be inferred from existing leg-level and instrument-  level data when ProduceSeparateResultForLinearOtcLegs  is enabled, and vice versa. Explicitly provided data  always takes precedence. | [optional] [default to Boolean]
**useInstrumentScaleFactorAsDefault** | **Boolean** | When enabled, priceScaleFactor defined at the instrument level will  be used in the absence of quote scaleFactor when resolving quotes. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.PricingOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

ModelSelection ModelSelection = new ModelSelection();
Boolean UseInstrumentTypeToDeterminePricer = true;
Boolean AllowAnyInstrumentsWithSecUidToPriceOffLookup = true;
Boolean AllowPartiallySuccessfulEvaluation = true;
Boolean ProduceSeparateResultForLinearOtcLegs = true;
Boolean EnableUseOfCachedUnitResults = true;
Boolean WindowValuationOnInstrumentStartEnd = true;
Boolean RemoveContingentCashflowsInPaymentDiary = true;
Boolean UseChildSubHoldingKeysForPortfolioExpansion = true;
Boolean ValidateDomesticAndQuoteCurrenciesAreConsistent = true;
Boolean MbsValuationUsingHoldingCurrentFace = true;
Boolean ConvertSrsCashFlowsToPortfolioCurrency = true;
@jakarta.annotation.Nullable String ConservedQuantityForLookthroughExpansion = "example ConservedQuantityForLookthroughExpansion";
ReturnZeroPvOptions ReturnZeroPv = new ReturnZeroPvOptions();
Boolean EnableLegLevelInferenceForCustomSrsColumns = true;
Boolean UseInstrumentScaleFactorAsDefault = true;


PricingOptions pricingOptionsInstance = new PricingOptions()
    .ModelSelection(ModelSelection)
    .UseInstrumentTypeToDeterminePricer(UseInstrumentTypeToDeterminePricer)
    .AllowAnyInstrumentsWithSecUidToPriceOffLookup(AllowAnyInstrumentsWithSecUidToPriceOffLookup)
    .AllowPartiallySuccessfulEvaluation(AllowPartiallySuccessfulEvaluation)
    .ProduceSeparateResultForLinearOtcLegs(ProduceSeparateResultForLinearOtcLegs)
    .EnableUseOfCachedUnitResults(EnableUseOfCachedUnitResults)
    .WindowValuationOnInstrumentStartEnd(WindowValuationOnInstrumentStartEnd)
    .RemoveContingentCashflowsInPaymentDiary(RemoveContingentCashflowsInPaymentDiary)
    .UseChildSubHoldingKeysForPortfolioExpansion(UseChildSubHoldingKeysForPortfolioExpansion)
    .ValidateDomesticAndQuoteCurrenciesAreConsistent(ValidateDomesticAndQuoteCurrenciesAreConsistent)
    .MbsValuationUsingHoldingCurrentFace(MbsValuationUsingHoldingCurrentFace)
    .ConvertSrsCashFlowsToPortfolioCurrency(ConvertSrsCashFlowsToPortfolioCurrency)
    .ConservedQuantityForLookthroughExpansion(ConservedQuantityForLookthroughExpansion)
    .ReturnZeroPv(ReturnZeroPv)
    .EnableLegLevelInferenceForCustomSrsColumns(EnableLegLevelInferenceForCustomSrsColumns)
    .UseInstrumentScaleFactorAsDefault(UseInstrumentScaleFactorAsDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
