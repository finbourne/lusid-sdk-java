# com.finbourne.lusid.model.BucketSetDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**navTypes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**unitised** | **Boolean** |  | [default to Boolean]
**buckets** | [**List&lt;BucketDefinition&gt;**](BucketDefinition.md) |  | [default to List<BucketDefinition>]

```java
import com.finbourne.lusid.model.BucketSetDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable List<String> NavTypes = new List<String>();
Boolean Unitised = true;
List<BucketDefinition> Buckets = new List<BucketDefinition>();


BucketSetDefinition bucketSetDefinitionInstance = new BucketSetDefinition()
    .Code(Code)
    .DisplayName(DisplayName)
    .NavTypes(NavTypes)
    .Unitised(Unitised)
    .Buckets(Buckets);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
