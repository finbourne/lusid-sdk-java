# com.finbourne.lusid.model.SeriesConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** |  | [default to String]
**seriesLaunchPrice** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**distributionSeriesSelection** | **String** | Available values: ProRataByNav, FIFO, SpecifiedSeries. | [optional] [default to String]
**dealLinkedSeries** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.SeriesConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ShareClassShortCode = "example ShareClassShortCode";
@jakarta.annotation.Nullable java.math.BigDecimal SeriesLaunchPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String DistributionSeriesSelection = "example DistributionSeriesSelection";
@jakarta.annotation.Nullable Boolean DealLinkedSeries = true;


SeriesConfiguration seriesConfigurationInstance = new SeriesConfiguration()
    .ShareClassShortCode(ShareClassShortCode)
    .SeriesLaunchPrice(SeriesLaunchPrice)
    .DistributionSeriesSelection(DistributionSeriesSelection)
    .DealLinkedSeries(DealLinkedSeries);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
