

# CreatePropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property will be created in. |  [optional]
**scope** | **String** | The scope that the property will be created in. | 
**code** | **String** | The code that the property will be created with. Together with the domain and  scope this uniquely identifies the property. | 
**valueRequired** | **Boolean** | Whether or not a value is always required for this property. |  [optional]
**displayName** | **String** | The display name of the property. | 
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | 
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Controls how the property&#39;s values can change over time. |  [optional]



## Enum: DomainEnum

Name | Value
---- | -----
TRANSACTION | &quot;Transaction&quot;
PORTFOLIO | &quot;Portfolio&quot;
HOLDING | &quot;Holding&quot;
REFERENCEHOLDING | &quot;ReferenceHolding&quot;
TRANSACTIONCONFIGURATION | &quot;TransactionConfiguration&quot;
INSTRUMENT | &quot;Instrument&quot;
CUTLABELDEFINITION | &quot;CutLabelDefinition&quot;
ANALYTIC | &quot;Analytic&quot;



## Enum: LifeTimeEnum

Name | Value
---- | -----
PERPETUAL | &quot;Perpetual&quot;
TIMEVARIANT | &quot;TimeVariant&quot;



