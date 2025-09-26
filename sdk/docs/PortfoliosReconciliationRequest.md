# com.finbourne.lusid.model.PortfoliosReconciliationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**PortfolioReconciliationRequest**](PortfolioReconciliationRequest.md) |  | [default to PortfolioReconciliationRequest]
**right** | [**PortfolioReconciliationRequest**](PortfolioReconciliationRequest.md) |  | [default to PortfolioReconciliationRequest]
**instrumentPropertyKeys** | **List&lt;String&gt;** | Instrument properties to be included with any identified breaks. These properties will be in the effective and AsAt dates of the left portfolio | [default to List<String>]

```java
import com.finbourne.lusid.model.PortfoliosReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

PortfolioReconciliationRequest Left = new PortfolioReconciliationRequest();
PortfolioReconciliationRequest Right = new PortfolioReconciliationRequest();
List<String> InstrumentPropertyKeys = new List<String>();


PortfoliosReconciliationRequest portfoliosReconciliationRequestInstance = new PortfoliosReconciliationRequest()
    .Left(Left)
    .Right(Right)
    .InstrumentPropertyKeys(InstrumentPropertyKeys);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
