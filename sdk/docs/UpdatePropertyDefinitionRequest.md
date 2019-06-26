
# UpdatePropertyDefinitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property. | 
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Controls how the property&#39;s values can change over time. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the property. |  [optional]


<a name="LifeTimeEnum"></a>
## Enum: LifeTimeEnum
Name | Value
---- | -----
PERPETUAL | &quot;Perpetual&quot;
TIMEVARIANT | &quot;TimeVariant&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LABEL | &quot;Label&quot;
METRIC | &quot;Metric&quot;
INFORMATION | &quot;Information&quot;



