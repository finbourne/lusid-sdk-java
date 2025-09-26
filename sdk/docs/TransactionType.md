# com.finbourne.lusid.model.TransactionType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List&lt;TransactionTypeAlias&gt;**](TransactionTypeAlias.md) | List of transaction types that map to this specific transaction configuration | [default to List<TransactionTypeAlias>]
**movements** | [**List&lt;TransactionTypeMovement&gt;**](TransactionTypeMovement.md) | Movement data for the transaction type | [default to List<TransactionTypeMovement>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties attached to the transaction type | [optional] [default to Map<String, PerpetualProperty>]
**calculations** | [**List&lt;TransactionTypeCalculation&gt;**](TransactionTypeCalculation.md) | Calculations to be performed for the transaction type | [optional] [default to List<TransactionTypeCalculation>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransactionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionTypeAlias> Aliases = new List<TransactionTypeAlias>();
List<TransactionTypeMovement> Movements = new List<TransactionTypeMovement>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable List<TransactionTypeCalculation> Calculations = new List<TransactionTypeCalculation>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransactionType transactionTypeInstance = new TransactionType()
    .Aliases(Aliases)
    .Movements(Movements)
    .Properties(Properties)
    .Calculations(Calculations)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
