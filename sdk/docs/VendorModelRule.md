# com.finbourne.lusid.model.VendorModelRule
A rule that identifies the set of preferences to be used for a given library, model and instrument type.  There can be many such rules, though only the first found for a given combination would be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplier** | **String** | The available values are: Lusid, RefinitivQps, RefinitivTracsWeb, VolMaster, IsdaCds, YieldBook, LusidCalc | [default to String]
**modelName** | **String** | The vendor library model name | [default to String]
**instrumentType** | **String** | The vendor library instrument type | [default to String]
**parameters** | **String** | THIS FIELD IS DEPRECATED - use ModelOptions  The set of opaque model parameters, provided as a Json object, that is a string object which will internally be converted to a dictionary of string to object.  Note that this is not intended as the final form of this object. It will be replaced with a more structured object as the set of parameters that are possible is  better understood. | [optional] [default to String]
**modelOptions** | [**ModelOptions**](ModelOptions.md) |  | [optional] [default to ModelOptions]
**instrumentId** | **String** | This field should generally not be required. It indicates a specific case where there is a particular need to make a rule apply to only a single instrument  specified by an identifier on that instrument such as its LUID. One particular example would be to control the behaviour of a look-through portfolio scaling  methodology, such as where there is a mixture of indices and credit-debit portfolios where scaling on the sum of valuation would be deemed incorrectly for one  set but desired in general. | [optional] [default to String]
**addressKeyFilters** | [**List&lt;AddressKeyFilter&gt;**](AddressKeyFilter.md) | Condition for model selection. If a condition is satisfied the default model for valuation is overridden (for that instrument). | [optional] [default to List<AddressKeyFilter>]

```java
import com.finbourne.lusid.model.VendorModelRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Supplier = "example Supplier";
String ModelName = "example ModelName";
String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String Parameters = "example Parameters";
ModelOptions ModelOptions = new ModelOptions();
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable List<AddressKeyFilter> AddressKeyFilters = new List<AddressKeyFilter>();


VendorModelRule vendorModelRuleInstance = new VendorModelRule()
    .Supplier(Supplier)
    .ModelName(ModelName)
    .InstrumentType(InstrumentType)
    .Parameters(Parameters)
    .ModelOptions(ModelOptions)
    .InstrumentId(InstrumentId)
    .AddressKeyFilters(AddressKeyFilters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
