# com.finbourne.lusid.model.TransactionTypeDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the TransactionType was resolved. If the portfolio has a TransactionTypeScope, this will have been used. Otherwise the default scope will have been used. | [default to String]
**source** | **String** | The source in which the TransactionType was resolved. | [default to String]
**type** | **String** | The resolved TransactionType. More information on TransactionType resolution can be found at https://support.lusid.com/docs/how-does-lusid-resolve-transactions-to-transaction-types | [default to String]
**movementConditionMatches** | [**List&lt;MovementConditionMatch&gt;**](MovementConditionMatch.md) | One entry for each movement on the resolved TransactionType, in the order the movements are configured, recording whether that movement&#39;s condition was satisfied by this transaction. Empty for transaction versions that generate no movements, such as cancelled and amended versions. | [optional] [default to List<MovementConditionMatch>]

```java
import com.finbourne.lusid.model.TransactionTypeDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Source = "example Source";
String Type = "example Type";
@jakarta.annotation.Nullable List<MovementConditionMatch> MovementConditionMatches = new List<MovementConditionMatch>();


TransactionTypeDetails transactionTypeDetailsInstance = new TransactionTypeDetails()
    .Scope(Scope)
    .Source(Source)
    .Type(Type)
    .MovementConditionMatches(MovementConditionMatches);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
