# com.finbourne.lusid.model.CustomDataModel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataModelSummary** | [**DataModelSummary**](DataModelSummary.md) |  | [optional] [default to DataModelSummary]
**inherited** | [**CustomDataModelCriteria**](CustomDataModelCriteria.md) |  | [optional] [default to CustomDataModelCriteria]
**incremental** | [**CustomDataModelCriteria**](CustomDataModelCriteria.md) |  | [optional] [default to CustomDataModelCriteria]
**applied** | [**CustomDataModelCriteria**](CustomDataModelCriteria.md) |  | [optional] [default to CustomDataModelCriteria]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.CustomDataModel;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataModelSummary DataModelSummary = new DataModelSummary();
CustomDataModelCriteria Inherited = new CustomDataModelCriteria();
CustomDataModelCriteria Incremental = new CustomDataModelCriteria();
CustomDataModelCriteria Applied = new CustomDataModelCriteria();
Version Version = new Version();


CustomDataModel customDataModelInstance = new CustomDataModel()
    .DataModelSummary(DataModelSummary)
    .Inherited(Inherited)
    .Incremental(Incremental)
    .Applied(Applied)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
