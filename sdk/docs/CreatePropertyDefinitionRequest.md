
# CreatePropertyDefinitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | [**DomainEnum**](#DomainEnum) |  |  [optional]
**scope** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**valueRequired** | **Boolean** |  |  [optional]
**displayName** | **String** |  |  [optional]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="DomainEnum"></a>
## Enum: DomainEnum
Name | Value
---- | -----
TRADE | &quot;Trade&quot;
PORTFOLIO | &quot;Portfolio&quot;
SECURITY | &quot;Security&quot;
HOLDING | &quot;Holding&quot;
REFERENCEHOLDING | &quot;ReferenceHolding&quot;
TXNTYPE | &quot;TxnType&quot;
INSTRUMENT | &quot;Instrument&quot;


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



