# com.finbourne.lusid.model.BucketDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**filterExpression** | **String** |  | [default to String]
**bucketType** | **String** | Available values: Dealing, PnL, Fees, BalanceSheet, Misc. | [default to String]
**unitised** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.BucketDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketId = "example BucketId";
String DisplayName = "example DisplayName";
String FilterExpression = "example FilterExpression";
String BucketType = "example BucketType";
@jakarta.annotation.Nullable Boolean Unitised = true;


BucketDefinition bucketDefinitionInstance = new BucketDefinition()
    .BucketId(BucketId)
    .DisplayName(DisplayName)
    .FilterExpression(FilterExpression)
    .BucketType(BucketType)
    .Unitised(Unitised);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
