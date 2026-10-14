# com.finbourne.lusid.model.PartnerStatement
A partner's statement: the figures of their position on the fund over a period, fingerprinted so a later  statement can be compared against it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statementId** | **String** | The identifier of the statement. | [default to String]
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record the statement is for. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the statement period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the statement period, inclusive. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to produce the statement under. Defaults to the fund&#39;s primary NAV type. | [default to String]
**currency** | **String** | The currency of the statement. | [default to String]
**lines** | [**List&lt;PartnerStatementLine&gt;**](PartnerStatementLine.md) | The figures on the statement. | [default to List<PartnerStatementLine>]
**fingerprint** | **String** | A hash of the statement&#39;s content, so two statements can be told apart. | [default to String]
**producedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the statement was produced. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PartnerStatement;
import java.util.*;
import java.lang.System;
import java.net.URI;

String StatementId = "example StatementId";
ResourceId FundId = new ResourceId();
String InvestorRecordId = "example InvestorRecordId";
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
String NavTypeCode = "example NavTypeCode";
String Currency = "example Currency";
List<PartnerStatementLine> Lines = new List<PartnerStatementLine>();
String Fingerprint = "example Fingerprint";
OffsetDateTime ProducedAsAt = OffsetDateTime.now();


PartnerStatement partnerStatementInstance = new PartnerStatement()
    .StatementId(StatementId)
    .FundId(FundId)
    .InvestorRecordId(InvestorRecordId)
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .NavTypeCode(NavTypeCode)
    .Currency(Currency)
    .Lines(Lines)
    .Fingerprint(Fingerprint)
    .ProducedAsAt(ProducedAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
