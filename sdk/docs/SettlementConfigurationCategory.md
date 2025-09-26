# com.finbourne.lusid.model.SettlementConfigurationCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **String** | The method of settlement for the movements of the relevant type(s). Allowed values: &#39;Automatic&#39; and &#39;Instructed&#39;. A value of &#39;Instructed&#39; means that such movements can only be settled with a SettlementInstruction. A value of &#39;Automatic&#39; means that such movements will settle automatically but a SettlementInstruction will still override automatic settlement. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SettlementConfigurationCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Method = "example Method";


SettlementConfigurationCategory settlementConfigurationCategoryInstance = new SettlementConfigurationCategory()
    .Method(Method);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
