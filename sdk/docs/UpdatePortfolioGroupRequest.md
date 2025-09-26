# com.finbourne.lusid.model.UpdatePortfolioGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | A long form description of the portfolio group. | [optional] [default to String]

```java
import com.finbourne.lusid.model.UpdatePortfolioGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


UpdatePortfolioGroupRequest updatePortfolioGroupRequestInstance = new UpdatePortfolioGroupRequest()
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
