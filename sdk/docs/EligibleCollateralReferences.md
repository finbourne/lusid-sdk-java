# com.finbourne.lusid.model.EligibleCollateralReferences
The eligible collateral schedule each party's posting is checked against.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wePost** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**theyPost** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.EligibleCollateralReferences;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId WePost = new ResourceId();
ResourceId TheyPost = new ResourceId();


EligibleCollateralReferences eligibleCollateralReferencesInstance = new EligibleCollateralReferences()
    .WePost(WePost)
    .TheyPost(TheyPost);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
