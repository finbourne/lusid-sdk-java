# com.finbourne.lusid.model.QueryableKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKey** | **String** | The address that is the query to be made into the system. e.g. a Valuation/PV or Instrument/MaturityDate | [default to String]
**description** | **String** | What does the information that is being queried by the address mean. What is the address for. | [optional] [default to String]
**displayName** | **String** | The suggested name that the user would wish to put on to the returned information for visualisation in preference to the address. | [default to String]
**type** | **String** | Financially meaningful results can be presented as either simple flat types or more complex expanded types. This field gives the type of the more complex representation.  For example, the present value (PV) of a holding could be represented either as a simple decimal (with currency implied) or as a decimal-currency pair. In this example, the type returned in this field would be \&quot;Result0D\&quot;, the decimal-currency pair. | [default to String]
**flattenedType** | **String** | Financially meaningful results can be presented as either simple flat types or more complex expanded types. This field gives the type of the simpler representation.  For example, the present value (PV) of a holding could be represented either as a simple decimal (with currency implied) or as a decimal-currency pair. In this example, the type returned in this field would be \&quot;Decimal\&quot;. | [default to String]
**holdingQuantityScaling** | **String** | Is the data scaled when it is for, e.g. a holding in an instrument. A key example would be the difference between price and PV. The present value of an instrument would scale with the quantity held. The price would be that for a hypothetical unit of that instrument, typically associated with the contract size. | [default to String]
**supportedUsages** | **List&lt;String&gt;** | The types of queries that support this key. | [default to List<String>]
**supportedOperations** | **List&lt;String&gt;** | When performing an aggregation operation, what column type operations can be performed on the data. For example, it makes sense to sum decimals but not strings. Either can be counted. With more complex types, e.g. ResultValues, operations may be linked to a semantic meaning such as the currency of the result. In such cases the operations may be supported but context specific. For example, it makes sense to sum PVs in a single currency but not when the currency is different. In such cases, an error would result (it being assumed that no fx rates for currency conversion were implicit in the context). | [default to List<String>]
**lifeCycleStatus** | **String** | Within an API where an item can be accessed through an address or property, there is an associated status that determines whether the item is stable or likely to change. This status is one of [Experimental, Beta, EAP, Prod, Deprecated]. If the item is deprecated it will be removed on or after the associated DateTime RemovalDate field. That field will not otherwise be set. | [default to String]
**removalDate** | [**OffsetDateTime**](OffsetDateTime.md) | If the life cycle status is set to deprecated then this will be populated with the date on or after which removal of the address query will happen | [optional] [default to OffsetDateTime]
**applicableOptions** | [**Map&lt;String, AddressKeyOptionDefinition&gt;**](AddressKeyOptionDefinition.md) | A mapping from option names to the definition that the corresponding option value must match. | [optional] [default to Map<String, AddressKeyOptionDefinition>]
**derivationFormula** | **String** | Derivation formula for when the for when the query key represents a DerivedValuation property. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryableKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AddressKey = "example AddressKey";
@jakarta.annotation.Nullable String Description = "example Description";
String DisplayName = "example DisplayName";
String Type = "example Type";
String FlattenedType = "example FlattenedType";
String HoldingQuantityScaling = "example HoldingQuantityScaling";
List<String> SupportedUsages = new List<String>();
List<String> SupportedOperations = new List<String>();
String LifeCycleStatus = "example LifeCycleStatus";
@jakarta.annotation.Nullable OffsetDateTime RemovalDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, AddressKeyOptionDefinition> ApplicableOptions = new Map<String, AddressKeyOptionDefinition>();
@jakarta.annotation.Nullable String DerivationFormula = "example DerivationFormula";


QueryableKey queryableKeyInstance = new QueryableKey()
    .AddressKey(AddressKey)
    .Description(Description)
    .DisplayName(DisplayName)
    .Type(Type)
    .FlattenedType(FlattenedType)
    .HoldingQuantityScaling(HoldingQuantityScaling)
    .SupportedUsages(SupportedUsages)
    .SupportedOperations(SupportedOperations)
    .LifeCycleStatus(LifeCycleStatus)
    .RemovalDate(RemovalDate)
    .ApplicableOptions(ApplicableOptions)
    .DerivationFormula(DerivationFormula);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
