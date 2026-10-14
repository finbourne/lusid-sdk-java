# com.finbourne.lusid.model.PartnerCapitalAccount
A partner's capital account statement (PCAP) over a reporting period, in the ILPA row order, with quarter-,  year- and inception-to-date columns and a memo block of commitment balances from the register.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record identifier of the partner. | [default to String]
**currency** | **String** | The currency the capital account is expressed in, being the fund&#39;s base currency. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive start of the reporting period. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive end of the reporting period. | [default to OffsetDateTime]
**status** | **String** | Whether the figures are an Estimate or Final. Figures are Final only once a valuation point covering the period end has been finalised. | [default to String]
**rows** | [**List&lt;PartnerCapitalAccountRow&gt;**](PartnerCapitalAccountRow.md) | The capital account rows, from beginning capital through to ending capital, each with quarter-to-date, year-to-date and inception-to-date columns. | [default to List<PartnerCapitalAccountRow>]
**memo** | [**PartnerCapitalAccountMemo**](PartnerCapitalAccountMemo.md) |  | [default to PartnerCapitalAccountMemo]
**foots** | **Boolean** | Whether the ending capital agrees across the quarter-to-date, year-to-date and inception-to-date columns within tolerance. | [default to Boolean]
**footingDifference** | **java.math.BigDecimal** | The largest difference between the ending capital of any two columns. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerCapitalAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
String InvestorRecordId = "example InvestorRecordId";
String Currency = "example Currency";
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
String Status = "example Status";
List<PartnerCapitalAccountRow> Rows = new List<PartnerCapitalAccountRow>();
PartnerCapitalAccountMemo Memo = new PartnerCapitalAccountMemo();
Boolean Foots = true;
java.math.BigDecimal FootingDifference = new java.math.BigDecimal("100.00");


PartnerCapitalAccount partnerCapitalAccountInstance = new PartnerCapitalAccount()
    .FundId(FundId)
    .InvestorRecordId(InvestorRecordId)
    .Currency(Currency)
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .Status(Status)
    .Rows(Rows)
    .Memo(Memo)
    .Foots(Foots)
    .FootingDifference(FootingDifference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
