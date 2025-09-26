# com.finbourne.lusid.model.ResponseMetaData
Metadata related to an api response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of meta data information being provided | [optional] [default to String]
**description** | **String** | The description of what occured for this specific piece of meta data | [optional] [default to String]
**identifierType** | **String** | The type of the listed identifiers | [optional] [default to String]
**identifiers** | **List&lt;String&gt;** | The related identifiers that were impacted by this event | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ResponseMetaData;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String IdentifierType = "example IdentifierType";
@jakarta.annotation.Nullable List<String> Identifiers = new List<String>();


ResponseMetaData responseMetaDataInstance = new ResponseMetaData()
    .Type(Type)
    .Description(Description)
    .IdentifierType(IdentifierType)
    .Identifiers(Identifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
