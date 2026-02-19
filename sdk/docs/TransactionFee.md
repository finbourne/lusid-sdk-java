# com.finbourne.lusid.model.TransactionFee

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** | The display name of the transaction fee. | [optional] [default to String]
**description** | **String** | A description of the transaction fee. | [optional] [default to String]
**calculation** | [**FeeCalculationRequest**](FeeCalculationRequest.md) |  | [optional] [default to FeeCalculationRequest]
**conditions** | **List&lt;String&gt;** | The conditions that the transaction must meet in order for the fee to be applied. | [optional] [default to List<String>]
**capitalised** | **String** | Specifies whether the fee should be capitalised, not capitalised or conditionally capitalised. | [optional] [default to String]
**capitalisationCondition** | **String** | If the fee Capitalisation is Conditional, this condition determines whether the fee is capitalised, when applied to the transaction. | [optional] [default to String]
**txnPropertyKey** | **String** | The property key to which the fee value will be applied and decorated onto the transaction. Must be in the &#39;Transaction&#39; property domain. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the transaction fee. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**isActive** | **Boolean** | Indicates whether the transaction fee is currently active and should be applied to transactions. Optional when creating a transaction fee, defaults to true, if a value is not provided. | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransactionFee;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
FeeCalculationRequest Calculation = new FeeCalculationRequest();
@jakarta.annotation.Nullable List<String> Conditions = new List<String>();
@jakarta.annotation.Nullable String Capitalised = "example Capitalised";
@jakarta.annotation.Nullable String CapitalisationCondition = "example CapitalisationCondition";
@jakarta.annotation.Nullable String TxnPropertyKey = "example TxnPropertyKey";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Boolean IsActive = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransactionFee transactionFeeInstance = new TransactionFee()
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Calculation(Calculation)
    .Conditions(Conditions)
    .Capitalised(Capitalised)
    .CapitalisationCondition(CapitalisationCondition)
    .TxnPropertyKey(TxnPropertyKey)
    .Properties(Properties)
    .Version(Version)
    .Href(Href)
    .IsActive(IsActive)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
