
# VendorModelRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplier** | [**SupplierEnum**](#SupplierEnum) | The vendor library supplier | 
**modelName** | **String** | The vendor library model name | 
**instrumentType** | **String** | The vendor library instrument type | 
**parameters** | **String** | The set of opaque model parameters, provided as a Json object, that is a string object which will internally be converted to a dictionary of string to object.  Note that this is not intended as the final form of this object. It will be replaced with a more structured object as the set of parameters that are possible is  better understood. | 


<a name="SupplierEnum"></a>
## Enum: SupplierEnum
Name | Value
---- | -----
LUSID | &quot;Lusid&quot;
REUTERSEIKON | &quot;ReutersEikon&quot;
REUTERSTRACSWEB | &quot;ReutersTracsWeb&quot;



