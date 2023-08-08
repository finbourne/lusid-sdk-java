

# PricingOptions

Options for controlling the default aspects and behaviour of the pricing engine.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelSelection** | [**ModelSelection**](ModelSelection.md) |  |  [optional] |
|**useInstrumentTypeToDeterminePricer** | **Boolean** | If true then use the instrument type to set the default instrument pricer  This applies where no more specific set of overrides are provided on a per-vendor and instrument basis. |  [optional] |
|**allowAnyInstrumentsWithSecUidToPriceOffLookup** | **Boolean** | By default, one would not expect to price and exotic instrument, i.e. an instrument with a complicated  instrument definition simply through looking up a price as there should be a better way of evaluating it.  To override that behaviour and allow lookup for a price from the instrument identifier(s), set this to true. |  [optional] |
|**allowPartiallySuccessfulEvaluation** | **Boolean** | If true then a failure in task evaluation doesn&#39;t cause overall failure.  results will be returned where they succeeded and annotation elsewhere |  [optional] |
|**produceSeparateResultForLinearOtcLegs** | **Boolean** | If true (default), when pricing an Fx-Forward or Interest Rate Swap, Future and other linearly separable products, product two results, one for each leg  rather than a single line result with the amalgamated/summed pv from both legs. |  [optional] |
|**enableUseOfCachedUnitResults** | **Boolean** | If true, when pricing using a model or for an instrument that supports use of intermediate cached-results, use them.  Default is that this caching is turned off. |  [optional] |
|**windowValuationOnInstrumentStartEnd** | **Boolean** | If true, when valuing an instrument outside the period where it is &#39;alive&#39; (the start-maturity window) it will return a valuation of zero |  [optional] |
|**removeContingentCashflowsInPaymentDiary** | **Boolean** | When creating a payment diary, should contingent cash payments (e.g. from exercise of a swaption into a swap) be included or not.  i.e. Is exercise or default being assumed to happen or not. |  [optional] |
|**useChildSubHoldingKeysForPortfolioExpansion** | **Boolean** | Should fund constituents inherit subholding keys from the parent subholding keyb |  [optional] |
|**validateDomesticAndQuoteCurrenciesAreConsistent** | **Boolean** | Do we validate that the instrument domestic currency matches the quote currency (unless unknown/zzz) when using lookup pricing. |  [optional] |
|**conservedQuantityForLookthroughExpansion** | **String** | When performing lookthrough portfolio expansion with ScalingMethodology set to \&quot;Sum\&quot; or \&quot;AbsoluteSum\&quot;,  the quantity specified here will be conserved and apportioned to lookthrough constituents.  For example, an equal-weighting index with 100 constituents can be modelled as a reference portfolio with 1% weights on each equity.  When expanding a $9000 holding of that index into its constituents while conserving PV, we end up with $90 of each equity.  The number of units of each equity held is then implied.  Note that conservation of one quantity may imply non-conservation of others, especially when some constituents are OTCs.                Allowed values are: \&quot;PV\&quot; (default), \&quot;Exposure\&quot;. |  [optional] |



