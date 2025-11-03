# com.finbourne.lusid.model.UpdateRelationalDatasetDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A user-friendly display name for the relational dataset definition. | [default to String]
**description** | **String** | A detailed description of the relational dataset definition and its purpose. | [optional] [default to String]
**applicableEntityTypes** | [**ApplicableEntityTypes**](ApplicableEntityTypes.md) |  | [optional] [default to ApplicableEntityTypes]

```java
import com.finbourne.lusid.model.UpdateRelationalDatasetDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ApplicableEntityTypes ApplicableEntityTypes = new ApplicableEntityTypes();


UpdateRelationalDatasetDetails updateRelationalDatasetDetailsInstance = new UpdateRelationalDatasetDetails()
    .DisplayName(DisplayName)
    .Description(Description)
    .ApplicableEntityTypes(ApplicableEntityTypes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
