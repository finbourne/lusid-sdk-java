# com.finbourne.lusid.model.WithholdingTaxDatasetDefinitions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anomalyDataset** | [**WithholdingTaxDataset**](WithholdingTaxDataset.md) |  | [default to WithholdingTaxDataset]
**mainDataset** | [**WithholdingTaxDataset**](WithholdingTaxDataset.md) |  | [default to WithholdingTaxDataset]

```java
import com.finbourne.lusid.model.WithholdingTaxDatasetDefinitions;
import java.util.*;
import java.lang.System;
import java.net.URI;

WithholdingTaxDataset AnomalyDataset = new WithholdingTaxDataset();
WithholdingTaxDataset MainDataset = new WithholdingTaxDataset();


WithholdingTaxDatasetDefinitions withholdingTaxDatasetDefinitionsInstance = new WithholdingTaxDatasetDefinitions()
    .AnomalyDataset(AnomalyDataset)
    .MainDataset(MainDataset);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
