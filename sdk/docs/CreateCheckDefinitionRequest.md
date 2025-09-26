# com.finbourne.lusid.model.CreateCheckDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Check Definition. | [default to String]
**description** | **String** | A description for the Check Definition. | [default to String]
**datasetSchema** | [**CheckDefinitionDatasetSchema**](CheckDefinitionDatasetSchema.md) |  | [optional] [default to CheckDefinitionDatasetSchema]
**ruleSets** | [**List&lt;CheckDefinitionRuleSet&gt;**](CheckDefinitionRuleSet.md) | A collection of rule sets for the Check Definition. | [default to List<CheckDefinitionRuleSet>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Check Definition. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.CreateCheckDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String Description = "example Description";
CheckDefinitionDatasetSchema DatasetSchema = new CheckDefinitionDatasetSchema();
List<CheckDefinitionRuleSet> RuleSets = new List<CheckDefinitionRuleSet>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


CreateCheckDefinitionRequest createCheckDefinitionRequestInstance = new CreateCheckDefinitionRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .DatasetSchema(DatasetSchema)
    .RuleSets(RuleSets)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
