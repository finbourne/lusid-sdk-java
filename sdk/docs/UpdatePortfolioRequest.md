# com.finbourne.lusid.model.UpdatePortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the transaction portfolio. | [default to String]
**description** | **String** | The description of the transaction portfolio. | [optional] [default to String]

```java
import com.finbourne.lusid.model.UpdatePortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


UpdatePortfolioRequest updatePortfolioRequestInstance = new UpdatePortfolioRequest()
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
