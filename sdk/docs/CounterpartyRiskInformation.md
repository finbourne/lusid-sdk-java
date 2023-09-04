

# CounterpartyRiskInformation

In the event that the legal entity is a counterparty to an OTC transaction  (as signatory to a counterparty agreement such as an ISDA 2002 Master Agreement),  this information would be needed for calculations  such as Credit-Valuation-Adjustments and Debit-Valuation-Adjustments (CVA, DVA, XVA etc).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryOfRisk** | **String** | The country to which one would naturally ascribe risk, typically the legal entity&#39;s country of registration. This can be used to infer funding currency and related market data in the absence of a specific preference. |  |
|**creditRatings** | [**List&lt;CreditRating&gt;**](CreditRating.md) |  |  |
|**industryClassifiers** | [**List&lt;IndustryClassifier&gt;**](IndustryClassifier.md) |  |  |



