# com.finbourne.lusid.model.UpdateCheckDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Check Definition. | [default to String]
**description** | **String** | A description for the Check Definition. | [default to String]
**datasetSchema** | [**CheckDefinitionDatasetSchema**](CheckDefinitionDatasetSchema.md) |  | [optional] [default to CheckDefinitionDatasetSchema]
**ruleSets** | [**List&lt;UpdateCheckDefinitionRuleSet&gt;**](UpdateCheckDefinitionRuleSet.md) | A collection of rule sets for the Check Definition. | [default to List<UpdateCheckDefinitionRuleSet>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Check Definition. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.UpdateCheckDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String Description = "example Description";
CheckDefinitionDatasetSchema DatasetSchema = new CheckDefinitionDatasetSchema();
List<UpdateCheckDefinitionRuleSet> RuleSets = new List<UpdateCheckDefinitionRuleSet>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


UpdateCheckDefinitionRequest updateCheckDefinitionRequestInstance = new UpdateCheckDefinitionRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .DatasetSchema(DatasetSchema)
    .RuleSets(RuleSets)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
