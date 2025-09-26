# com.finbourne.lusid.model.InstrumentEventConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionTemplateScopes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.InstrumentEventConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> TransactionTemplateScopes = new List<String>();
ResourceId RecipeId = new ResourceId();


InstrumentEventConfiguration instrumentEventConfigurationInstance = new InstrumentEventConfiguration()
    .TransactionTemplateScopes(TransactionTemplateScopes)
    .RecipeId(RecipeId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
