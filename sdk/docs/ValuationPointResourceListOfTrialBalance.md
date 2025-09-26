# com.finbourne.lusid.model.ValuationPointResourceListOfTrialBalance
ResourceList with extra header fields used by the various ValuationPoint endpoints for returning additional context related to the list of results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startValuationPoint** | [**DiaryEntry**](DiaryEntry.md) |  | [optional] [default to DiaryEntry]
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;TrialBalance&gt;**](TrialBalance.md) |  | [default to List<TrialBalance>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ValuationPointResourceListOfTrialBalance;
import java.util.*;
import java.lang.System;
import java.net.URI;

DiaryEntry StartValuationPoint = new DiaryEntry();
Version Version = new Version();
List<TrialBalance> Values = new List<TrialBalance>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ValuationPointResourceListOfTrialBalance valuationPointResourceListOfTrialBalanceInstance = new ValuationPointResourceListOfTrialBalance()
    .StartValuationPoint(StartValuationPoint)
    .Version(Version)
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
