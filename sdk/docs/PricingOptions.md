
# PricingOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelSelection** | [**ModelSelection**](ModelSelection.md) | The default model and pricing library to use if no others specified |  [optional]
**useInstrumentTypeToDeterminePricer** | **Boolean** | If true then use the instrument type to set the default instrument pricer  This applies where no more specific set of overrides are provided on a per-vendor and instrument basis. |  [optional]
**allowAnyInstrumentsWithSecUidToPriceOffLookup** | **Boolean** | By default, one would not expect to price and exotic instrument, i.e. an instrument with a complicated  instrument definition simply through looking up a price as there should be a better way of evaluating it.  To override that behaviour and allow lookup for a price from the instrument identifier(s), set this to true. |  [optional]
**allowPartiallySuccessfulEvaluation** | **Boolean** | If true then a failure in task evaluation doesn&#39;t cause overall failure.  results will be returned where they succeeded and annotation elsewhere |  [optional]



