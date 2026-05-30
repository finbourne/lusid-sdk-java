# com.finbourne.lusid.model.UpdateValuationPointRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | Unique code for the Valuation Point. | [default to String]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**applyClearDown** | **Boolean** | Defaults to null. Set to true if you want the closed period to have the clear down applied. | [optional] [default to Boolean]
**updateInclusionDateNavAdjustments** | **Boolean** | Defaults to null. Set to true if you have the required licence and want the InclusionDate property values to be used to determine whether items should be automatically included in the post close activities. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.UpdateValuationPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ValuationPointCode = "example ValuationPointCode";
@jakarta.annotation.Nullable String Variant = "example Variant";
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable Boolean ApplyClearDown = true;
@jakarta.annotation.Nullable Boolean UpdateInclusionDateNavAdjustments = true;


UpdateValuationPointRequest updateValuationPointRequestInstance = new UpdateValuationPointRequest()
    .ValuationPointCode(ValuationPointCode)
    .Variant(Variant)
    .Name(Name)
    .Properties(Properties)
    .ApplyClearDown(ApplyClearDown)
    .UpdateInclusionDateNavAdjustments(UpdateInclusionDateNavAdjustments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
