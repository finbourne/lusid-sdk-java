# com.finbourne.lusid.model.WithholdingTaxValueSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension** | **String** | The name of the matching dimension this declaration populates, as it appears in the dataset field schema. A declaration naming a dimension neither dataset has is rejected. | [default to String]
**source** | **String** | The LUSID field the engine reads the dimension&#39;s value from, addressed in the same syntax used to filter results: a property key in the form Properties[{domain}/{scope}/{code}], such as Properties[Instrument/WithholdingTax/AssetClass] or Properties[Transaction/WithholdingTax/Custodian]; or the name of a field on the entity itself, such as Transaction.SettlementCurrency. | [default to String]

```java
import com.finbourne.lusid.model.WithholdingTaxValueSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Dimension = "example Dimension";
String Source = "example Source";


WithholdingTaxValueSource withholdingTaxValueSourceInstance = new WithholdingTaxValueSource()
    .Dimension(Dimension)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
