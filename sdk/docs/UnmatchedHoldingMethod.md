# com.finbourne.lusid.model.UnmatchedHoldingMethod
When holdings adjustments are specified for a single effective date,  any holdings for the portfolio not included in the adjustments are  adjusted according to this value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UnmatchedHoldingMethod** | [**String**](.md) | **When holdings adjustments are specified for a single effective date,  any holdings for the portfolio not included in the adjustments are  adjusted according to this value.** | [default to String]

```java
import com.finbourne.lusid.model.UnmatchedHoldingMethod;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of UnmatchedHoldingMethod:
UnmatchedHoldingMethod method = UnmatchedHoldingMethod.POSITIONTOZERO;
UnmatchedHoldingMethod method = UnmatchedHoldingMethod.KEEPTHESAME;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
