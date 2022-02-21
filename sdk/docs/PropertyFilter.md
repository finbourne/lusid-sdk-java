

# PropertyFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The key that uniquely identifies a queryable address in Lusid. |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | The available values are: Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, In |  [optional]
**right** | **Object** |  |  [optional]
**rightOperandType** | [**RightOperandTypeEnum**](#RightOperandTypeEnum) | The available values are: Absolute, Property |  [optional]



## Enum: OperatorEnum

Name | Value
---- | -----
EQUALS | &quot;Equals&quot;
NOTEQUALS | &quot;NotEquals&quot;
GREATERTHAN | &quot;GreaterThan&quot;
GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot;
LESSTHAN | &quot;LessThan&quot;
LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot;
IN | &quot;In&quot;



## Enum: RightOperandTypeEnum

Name | Value
---- | -----
ABSOLUTE | &quot;Absolute&quot;
PROPERTY | &quot;Property&quot;



