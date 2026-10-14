# com.finbourne.lusid.model.WhtParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**whtConfig** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taxCountry** | **String** | The holder&#39;s country of tax residence, matched against the taxCountry field of the rate datasets. | [default to String]
**profileType** | **String** | The holder&#39;s tax profile, matched against the profileType field of the rate datasets. | [default to String]

```java
import com.finbourne.lusid.model.WhtParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId WhtConfig = new ResourceId();
String TaxCountry = "example TaxCountry";
String ProfileType = "example ProfileType";


WhtParameters whtParametersInstance = new WhtParameters()
    .WhtConfig(WhtConfig)
    .TaxCountry(TaxCountry)
    .ProfileType(ProfileType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
