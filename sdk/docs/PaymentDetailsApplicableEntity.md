# com.finbourne.lusid.model.PaymentDetailsApplicableEntity
Identifies the LUSID entity that holds the payment details (e.g. an InvestorRecord or Portfolio).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the LUSID entity holding the payment details. e.g. \&quot;InvestorRecord\&quot;, \&quot;InvestmentAccount\&quot;, \&quot;Portfolio\&quot;. | [default to String]
**entityScope** | **String** | The scope of the entity. Optional — required depends on the entity type. | [optional] [default to String]
**identifierType** | **String** | The identifier type used to identify the entity. e.g. \&quot;lusidInvestmentAccountId\&quot;. | [default to String]
**identifierScope** | **String** | The scope of the identifier used to identify the entity. Optional — null for native LUSID identifiers such as code. | [optional] [default to String]
**identifierValue** | **String** | The identifier value for the entity. e.g. \&quot;LUID_00003DNL\&quot;. | [default to String]

```java
import com.finbourne.lusid.model.PaymentDetailsApplicableEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
@jakarta.annotation.Nullable String EntityScope = "example EntityScope";
String IdentifierType = "example IdentifierType";
@jakarta.annotation.Nullable String IdentifierScope = "example IdentifierScope";
String IdentifierValue = "example IdentifierValue";


PaymentDetailsApplicableEntity paymentDetailsApplicableEntityInstance = new PaymentDetailsApplicableEntity()
    .EntityType(EntityType)
    .EntityScope(EntityScope)
    .IdentifierType(IdentifierType)
    .IdentifierScope(IdentifierScope)
    .IdentifierValue(IdentifierValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
