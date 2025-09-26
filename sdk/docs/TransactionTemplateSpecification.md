# com.finbourne.lusid.model.TransactionTemplateSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventType** | **String** |  | [default to String]
**supportedInstrumentTypes** | **List&lt;String&gt;** |  | [default to List<String>]
**supportedParticipationTypes** | **List&lt;String&gt;** |  | [default to List<String>]
**supportedElectionTypes** | [**List&lt;ElectionSpecification&gt;**](ElectionSpecification.md) |  | [default to List<ElectionSpecification>]
**supportedTemplateFields** | [**List&lt;TemplateField&gt;**](TemplateField.md) |  | [default to List<TemplateField>]
**eligibilityCalculation** | [**EligibilityCalculation**](EligibilityCalculation.md) |  | [default to EligibilityCalculation]

```java
import com.finbourne.lusid.model.TransactionTemplateSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentEventType = "example InstrumentEventType";
List<String> SupportedInstrumentTypes = new List<String>();
List<String> SupportedParticipationTypes = new List<String>();
List<ElectionSpecification> SupportedElectionTypes = new List<ElectionSpecification>();
List<TemplateField> SupportedTemplateFields = new List<TemplateField>();
EligibilityCalculation EligibilityCalculation = new EligibilityCalculation();


TransactionTemplateSpecification transactionTemplateSpecificationInstance = new TransactionTemplateSpecification()
    .InstrumentEventType(InstrumentEventType)
    .SupportedInstrumentTypes(SupportedInstrumentTypes)
    .SupportedParticipationTypes(SupportedParticipationTypes)
    .SupportedElectionTypes(SupportedElectionTypes)
    .SupportedTemplateFields(SupportedTemplateFields)
    .EligibilityCalculation(EligibilityCalculation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
