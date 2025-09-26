# com.finbourne.lusid.model.CounterpartyRiskInformation
In the event that the legal entity is a counterparty to an OTC transaction  (as signatory to a counterparty agreement such as an ISDA 2002 Master Agreement),  this information would be needed for calculations  such as Credit-Valuation-Adjustments and Debit-Valuation-Adjustments (CVA, DVA, XVA etc).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryOfRisk** | **String** | The country to which one would naturally ascribe risk, typically the legal entity&#39;s country of registration. This can be used to infer funding currency and related market data in the absence of a specific preference. | [default to String]
**creditRatings** | [**List&lt;CreditRating&gt;**](CreditRating.md) |  | [default to List<CreditRating>]
**industryClassifiers** | [**List&lt;IndustryClassifier&gt;**](IndustryClassifier.md) |  | [default to List<IndustryClassifier>]

```java
import com.finbourne.lusid.model.CounterpartyRiskInformation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CountryOfRisk = "example CountryOfRisk";
List<CreditRating> CreditRatings = new List<CreditRating>();
List<IndustryClassifier> IndustryClassifiers = new List<IndustryClassifier>();


CounterpartyRiskInformation counterpartyRiskInformationInstance = new CounterpartyRiskInformation()
    .CountryOfRisk(CountryOfRisk)
    .CreditRatings(CreditRatings)
    .IndustryClassifiers(IndustryClassifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
