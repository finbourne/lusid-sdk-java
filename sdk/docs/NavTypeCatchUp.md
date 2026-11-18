# com.finbourne.lusid.model.NavTypeCatchUp
The number of valuation points the leader finalised while a follower NAV type was dormant (deactivated).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navTypeCode** | **String** | The code of the follower NAV type that was reactivated. | [default to String]
**catchUpCount** | **Integer** | The number of valuation points the leader finalised while this follower NAV type was dormant (deactivated). | [default to Integer]

```java
import com.finbourne.lusid.model.NavTypeCatchUp;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NavTypeCode = "example NavTypeCode";
Integer CatchUpCount = new Integer("100.00");


NavTypeCatchUp navTypeCatchUpInstance = new NavTypeCatchUp()
    .NavTypeCode(NavTypeCode)
    .CatchUpCount(CatchUpCount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
