# com.finbourne.lusid.model.ModelSelection
The combination of a library to use and a model in that library that defines which pricing code will evaluate instruments  having a particular type/class. This allows us to control the model type and library for a given instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**library** | **String** | The available values are: Lusid, RefinitivQps, RefinitivTracsWeb, VolMaster, IsdaCds, YieldBook, LusidCalc | [default to String]
**model** | **String** | The available values are: SimpleStatic, Discounting, VendorDefault, BlackScholes, ConstantTimeValueOfMoney, Bachelier, ForwardWithPoints, ForwardWithPointsUndiscounted, ForwardSpecifiedRate, ForwardSpecifiedRateUndiscounted, IndexNav, IndexPrice, InlinedIndex, ForwardFromCurve, ForwardFromCurveUndiscounted, BlackScholesDigital, BjerksundStensland1993, BondLookupPricer, FlexibleLoanPricer, CdsLookupPricer, LoanFacilityPricer, OverrideOnlyPricer | [default to String]

```java
import com.finbourne.lusid.model.ModelSelection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Library = "example Library";
String Model = "example Model";


ModelSelection modelSelectionInstance = new ModelSelection()
    .Library(Library)
    .Model(Model);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
