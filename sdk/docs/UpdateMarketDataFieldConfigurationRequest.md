# com.finbourne.lusid.model.UpdateMarketDataFieldConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add** | [**MetadataFieldsToAdd**](MetadataFieldsToAdd.md) |  | [optional] [default to MetadataFieldsToAdd]
**update** | [**MetadataFieldsToUpdate**](MetadataFieldsToUpdate.md) |  | [optional] [default to MetadataFieldsToUpdate]
**remove** | [**MetadataFieldsToRemove**](MetadataFieldsToRemove.md) |  | [optional] [default to MetadataFieldsToRemove]

```java
import com.finbourne.lusid.model.UpdateMarketDataFieldConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

MetadataFieldsToAdd Add = new MetadataFieldsToAdd();
MetadataFieldsToUpdate Update = new MetadataFieldsToUpdate();
MetadataFieldsToRemove Remove = new MetadataFieldsToRemove();


UpdateMarketDataFieldConfigurationRequest updateMarketDataFieldConfigurationRequestInstance = new UpdateMarketDataFieldConfigurationRequest()
    .Add(Add)
    .Update(Update)
    .Remove(Remove);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
