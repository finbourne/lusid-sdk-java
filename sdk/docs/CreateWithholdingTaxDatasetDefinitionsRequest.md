# com.finbourne.lusid.model.CreateWithholdingTaxDatasetDefinitionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anomalyDataset** | [**CreateWithholdingTaxDataset**](CreateWithholdingTaxDataset.md) |  | [default to CreateWithholdingTaxDataset]
**mainDataset** | [**CreateWithholdingTaxDataset**](CreateWithholdingTaxDataset.md) |  | [default to CreateWithholdingTaxDataset]

```java
import com.finbourne.lusid.model.CreateWithholdingTaxDatasetDefinitionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CreateWithholdingTaxDataset AnomalyDataset = new CreateWithholdingTaxDataset();
CreateWithholdingTaxDataset MainDataset = new CreateWithholdingTaxDataset();


CreateWithholdingTaxDatasetDefinitionsRequest createWithholdingTaxDatasetDefinitionsRequestInstance = new CreateWithholdingTaxDatasetDefinitionsRequest()
    .AnomalyDataset(AnomalyDataset)
    .MainDataset(MainDataset);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
