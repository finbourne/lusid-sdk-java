# com.finbourne.lusid.model.ValuationPointResourceListOfFundCashStatementRow
ResourceList with extra header fields used by the various ValuationPoint endpoints for returning additional context related to the list of results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startValuationPoint** | [**DiaryEntry**](DiaryEntry.md) |  | [optional] [default to DiaryEntry]
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;FundCashStatementRow&gt;**](FundCashStatementRow.md) |  | [default to List<FundCashStatementRow>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ValuationPointResourceListOfFundCashStatementRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

DiaryEntry StartValuationPoint = new DiaryEntry();
Version Version = new Version();
List<FundCashStatementRow> Values = new List<FundCashStatementRow>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ValuationPointResourceListOfFundCashStatementRow valuationPointResourceListOfFundCashStatementRowInstance = new ValuationPointResourceListOfFundCashStatementRow()
    .StartValuationPoint(StartValuationPoint)
    .Version(Version)
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
