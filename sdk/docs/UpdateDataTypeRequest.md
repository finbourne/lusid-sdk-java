# com.finbourne.lusid.model.UpdateDataTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the data type. | [optional] [default to String]
**description** | **String** | The description of the data type. | [optional] [default to String]
**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies when the type value range is &#39;Closed&#39;; it is ignored on write and returned as null for &#39;Open&#39; data types. If reference data is supplied on a &#39;Closed&#39; data type and this field is omitted, the acceptable values are derived from the reference data values. | [optional] [default to List<String>]
**acceptableUnits** | [**List&lt;UpdateUnitRequest&gt;**](UpdateUnitRequest.md) | The definitions of the acceptable units. | [optional] [default to List<UpdateUnitRequest>]

```java
import com.finbourne.lusid.model.UpdateDataTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> AcceptableValues = new List<String>();
@jakarta.annotation.Nullable List<UpdateUnitRequest> AcceptableUnits = new List<UpdateUnitRequest>();


UpdateDataTypeRequest updateDataTypeRequestInstance = new UpdateDataTypeRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .AcceptableValues(AcceptableValues)
    .AcceptableUnits(AcceptableUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
