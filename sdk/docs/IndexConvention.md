# com.finbourne.lusid.model.IndexConvention
A set of conventions that describe the conventions for calculation of payments made on rates interbank lending and similar.  Based on ISDA 2006 conventions and similar documentation. Please see the knowledge base for further documentation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixingReference** | **String** | The reference rate name for fixings. | [default to String]
**publicationDayLag** | **Integer** | Number of days between spot and publication of the rate. | [default to Integer]
**paymentTenor** | **String** | The tenor of the payment. For an OIS index this is always 1 day. For other indices, e.g. LIBOR it will have a variable tenor typically between 1 day and 1 year.    For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to String]
**dayCountConvention** | **String** | when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year  and difference between them.  For more information on day counts, see [knowledge base article KA-01798](https://support.lusid.com/knowledgebase/article/KA-01798)     Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365]. | [default to String]
**currency** | **String** | Currency of the index convention. | [default to String]
**indexName** | **String** | The name of the index for which this represents the conventions of.  For instance, \&quot;SOFR\&quot;, \&quot;LIBOR\&quot;, \&quot;EURIBOR\&quot;, etc.  Defaults to \&quot;INDEX\&quot; if not specified. | [optional] [default to String]
**scope** | **String** | The scope used when updating or inserting the convention. | [optional] [default to String]
**code** | **String** | The code of the convention. | [optional] [default to String]

```java
import com.finbourne.lusid.model.IndexConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FixingReference = "example FixingReference";
Integer PublicationDayLag = new Integer("100.00");
String PaymentTenor = "example PaymentTenor";
String DayCountConvention = "example DayCountConvention";
String Currency = "example Currency";
@jakarta.annotation.Nullable String IndexName = "example IndexName";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";


IndexConvention indexConventionInstance = new IndexConvention()
    .FixingReference(FixingReference)
    .PublicationDayLag(PublicationDayLag)
    .PaymentTenor(PaymentTenor)
    .DayCountConvention(DayCountConvention)
    .Currency(Currency)
    .IndexName(IndexName)
    .Scope(Scope)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
