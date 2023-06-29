

# CdsFlowConventions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rollFrequency** | **String** | The frequency at which the reference bonds are updated, this defaults to 6M, but can be 3M, exp for historically issued products |  [optional]
**currency** | **String** | Currency of the flow convention. | 
**paymentFrequency** | **String** | When generating a multiperiod flow, or when the maturity of the flow is not given but the start date is,  the tenor is the time-step from the anchor-date to the nominal maturity of the flow prior to any adjustment. | 
**dayCountConvention** | **String** | when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year  and difference between them.  For more information on day counts, see [knowledge base article KA-01798](https://support.lusid.com/knowledgebase/article/KA-01798)                Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM]. | 
**rollConvention** | **String** | For backward compatibility, this can either specify a business day convention or a roll convention. If the business  day convention is provided using the BusinessDayConvention property, this must be a valid roll convention.                When used as a roll convention:  The conventions specifying the rule used to generate dates in a schedule.    Supported string (enumeration) values are: [None, EndOfMonth, IMM, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30].                When in backward compatible mode:  Supported string (enumeration) values are: [NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, EndOfMonth, EOM, EndOfMonthPrevious, EOMP, EndOfMonthFollowing, EOMF, HalfMonthModifiedFollowing]. | 
**paymentCalendars** | **List&lt;String&gt;** | An array of strings denoting holiday calendars that apply to generation of payment schedules. | 
**resetCalendars** | **List&lt;String&gt;** | An array of strings denoting holiday calendars that apply to generation of reset schedules. | 
**settleDays** | **Integer** | Number of Good Business Days between the trade date and the effective or settlement date of the instrument. | 
**resetDays** | **Integer** | The number of Good Business Days between determination and payment of reset. | 
**businessDayConvention** | **String** | When generating a set of dates, what convention should be used for adjusting dates that coincide with a non-business day.    Supported string (enumeration) values are: [NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest]. |  [optional]
**scope** | **String** | The scope used when updating or inserting the convention. |  [optional]
**code** | **String** | The code of the convention. |  [optional]



