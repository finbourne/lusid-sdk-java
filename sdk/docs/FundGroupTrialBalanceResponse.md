# com.finbourne.lusid.model.FundGroupTrialBalanceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundResults** | [**List&lt;FundGroupReportResult&gt;**](FundGroupReportResult.md) | One entry per fund and NAV type in the group: the valuation points reported, or the reason nothing was reported for it. | [optional] [default to List<FundGroupReportResult>]
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;FundGroupTrialBalance&gt;**](FundGroupTrialBalance.md) |  | [default to List<FundGroupTrialBalance>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FundGroupTrialBalanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<FundGroupReportResult> FundResults = new List<FundGroupReportResult>();
Version Version = new Version();
List<FundGroupTrialBalance> Values = new List<FundGroupTrialBalance>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FundGroupTrialBalanceResponse fundGroupTrialBalanceResponseInstance = new FundGroupTrialBalanceResponse()
    .FundResults(FundResults)
    .Version(Version)
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
