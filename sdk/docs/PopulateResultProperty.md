# com.finbourne.lusid.model.PopulateResultProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property the formula populates. Must be an existing, single-valued property in the RecResult domain, and may appear only once. | [default to String]
**formula** | **String** | The formula whose value populates the property; a null value means the property has no value. | [default to String]
**overwriteManualEditsOnReRun** | **Boolean** | Whether a value edited since the property was last populated is replaced. Defaults to false, so manual edits are kept. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.PopulateResultProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
String Formula = "example Formula";
@jakarta.annotation.Nullable Boolean OverwriteManualEditsOnReRun = true;


PopulateResultProperty populateResultPropertyInstance = new PopulateResultProperty()
    .PropertyKey(PropertyKey)
    .Formula(Formula)
    .OverwriteManualEditsOnReRun(OverwriteManualEditsOnReRun);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
