# com.finbourne.lusid.model.DerivationFormulaExplainRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity for which the derived property or partial formula is to be resolved against. | [default to String]
**scope** | **String** | The scope that entity exists in. If no scope is provided, the default scope for the entity type will be used. | [optional] [default to String]
**identifier** | **Map&lt;String, String&gt;** | An identifier key/value pair that uniquely identifies the entity to explain the derived property for. This can be either an instrument identifier, an identifier property, or a scope/code identifier which take the format {entityType}/default/code : {identifier}. If no identifiers are provided, the logical evaluation tree without resolved values is returned. | [optional] [default to Map<String, String>]
**propertyKey** | **String** | The key of the derived property to explain. This takes the format {domain}/{scope}/{code}. | [optional] [default to String]
**partialFormula** | **String** | A partial derivation formula to explain. Can be provided in lieu of a property key. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DerivationFormulaExplainRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable Map<String, String> Identifier = new Map<String, String>();
@jakarta.annotation.Nullable String PropertyKey = "example PropertyKey";
@jakarta.annotation.Nullable String PartialFormula = "example PartialFormula";


DerivationFormulaExplainRequest derivationFormulaExplainRequestInstance = new DerivationFormulaExplainRequest()
    .EntityType(EntityType)
    .Scope(Scope)
    .Identifier(Identifier)
    .PropertyKey(PropertyKey)
    .PartialFormula(PartialFormula);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
