# com.finbourne.lusid.model.DerivationFormulaExplainRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity for which the derived property or partial formula is to be resolved against. | [default to String]
**scope** | **String** | (Optional) The scope that entity exists in. If no scope is provided, the default scope for the entity type will be used. | [optional] [default to String]
**code** | **String** | (Optional) The code of the entity, to be provided for entities that support scope/code retrieval. If no code or identifier is provided, the logical evaluation tree without resolved values is returned. | [optional] [default to String]
**identifier** | **Map&lt;String, String&gt;** | (Optional). An identifier key/value pair that uniquely identifies the entity to explain the derived property for. This can be either an instrument identifier, or an identifier property. If no code or identifier is provided, the logical evaluation tree without resolved values is returned. | [optional] [default to Map<String, String>]
**propertyKey** | **String** | (Optional) The key of the derived property to get an explanation for. This takes the format {domain}/{scope}/{code}. One of either property key or partial formula must be provided. | [optional] [default to String]
**partialFormula** | **String** | (Optional) A partial derivation formula to get an explanation for. Can be provided in lieu of a property key. One of either property key or partial formula must be provided. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DerivationFormulaExplainRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable Map<String, String> Identifier = new Map<String, String>();
@jakarta.annotation.Nullable String PropertyKey = "example PropertyKey";
@jakarta.annotation.Nullable String PartialFormula = "example PartialFormula";


DerivationFormulaExplainRequest derivationFormulaExplainRequestInstance = new DerivationFormulaExplainRequest()
    .EntityType(EntityType)
    .Scope(Scope)
    .Code(Code)
    .Identifier(Identifier)
    .PropertyKey(PropertyKey)
    .PartialFormula(PartialFormula);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
