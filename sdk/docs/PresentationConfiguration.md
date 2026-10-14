# com.finbourne.lusid.model.PresentationConfiguration
How partner capital is presented on statements and the valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contributionsReceivableNetted** | **Boolean** |  | [optional] [default to Boolean]
**separateNoticeDueReceiptDates** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.PresentationConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Boolean ContributionsReceivableNetted = true;
@jakarta.annotation.Nullable Boolean SeparateNoticeDueReceiptDates = true;


PresentationConfiguration presentationConfigurationInstance = new PresentationConfiguration()
    .ContributionsReceivableNetted(ContributionsReceivableNetted)
    .SeparateNoticeDueReceiptDates(SeparateNoticeDueReceiptDates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
