# com.finbourne.lusid.model.FxForwardModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forwardRateObservableType** | **String** | The available values are: ForwardPoints, ForwardRate, RatesCurve, FxForwardCurve, Invalid | [default to String]
**discountingMethod** | **String** | The available values are: Standard, ConstantTimeValueOfMoney, Invalid | [default to String]
**convertToReportCcy** | **Boolean** | Convert all FX flows to the report currency  By setting this all FX forwards will be priced using Forward Curves that have Report Currency as the base. | [default to Boolean]

```java
import com.finbourne.lusid.model.FxForwardModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ForwardRateObservableType = "example ForwardRateObservableType";
String DiscountingMethod = "example DiscountingMethod";
Boolean ConvertToReportCcy = true;


FxForwardModelOptions fxForwardModelOptionsInstance = new FxForwardModelOptions()
    .ForwardRateObservableType(ForwardRateObservableType)
    .DiscountingMethod(DiscountingMethod)
    .ConvertToReportCcy(ConvertToReportCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
