# CalendarsApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBusinessDaysToDate**](CalendarsApi.md#addBusinessDaysToDate) | **POST** /api/calendars/businessday/{scope}/add | [EARLY ACCESS] AddBusinessDaysToDate: Adds the requested number of Business Days to the provided date.
[**addDateToCalendar**](CalendarsApi.md#addDateToCalendar) | **PUT** /api/calendars/generic/{scope}/{code}/dates | [EARLY ACCESS] AddDateToCalendar: Add a date to a calendar
[**createCalendar**](CalendarsApi.md#createCalendar) | **POST** /api/calendars/generic | [EARLY ACCESS] CreateCalendar: Create a calendar in its generic form
[**deleteCalendar**](CalendarsApi.md#deleteCalendar) | **DELETE** /api/calendars/generic/{scope}/{code} | [EARLY ACCESS] DeleteCalendar: Delete a calendar
[**deleteDateFromCalendar**](CalendarsApi.md#deleteDateFromCalendar) | **DELETE** /api/calendars/generic/{scope}/{code}/dates/{dateId} | [EARLY ACCESS] DeleteDateFromCalendar: Remove a date from a calendar
[**generateSchedule**](CalendarsApi.md#generateSchedule) | **POST** /api/calendars/schedule/{scope} | [EARLY ACCESS] GenerateSchedule: Generate an ordered schedule of dates.
[**getCalendar**](CalendarsApi.md#getCalendar) | **GET** /api/calendars/generic/{scope}/{code} | [EARLY ACCESS] GetCalendar: Get a calendar in its generic form
[**getDates**](CalendarsApi.md#getDates) | **GET** /api/calendars/generic/{scope}/{code}/dates | [EARLY ACCESS] GetDates: Get dates for a specific calendar
[**isBusinessDateTime**](CalendarsApi.md#isBusinessDateTime) | **GET** /api/calendars/businessday/{scope}/{code} | [EARLY ACCESS] IsBusinessDateTime: Check whether a DateTime is a \&quot;Business DateTime\&quot;
[**listCalendars**](CalendarsApi.md#listCalendars) | **GET** /api/calendars/generic | [EARLY ACCESS] ListCalendars: List Calendars
[**listCalendarsInScope**](CalendarsApi.md#listCalendarsInScope) | **GET** /api/calendars/generic/{scope} | [EARLY ACCESS] ListCalendarsInScope: List all calenders in a specified scope
[**updateCalendar**](CalendarsApi.md#updateCalendar) | **POST** /api/calendars/generic/{scope}/{code} | [EARLY ACCESS] UpdateCalendar: Update a calendar


<a name="addBusinessDaysToDate"></a>
# **addBusinessDaysToDate**
> AddBusinessDaysToDateResponse addBusinessDaysToDate(scope, addBusinessDaysToDateRequest)

[EARLY ACCESS] AddBusinessDaysToDate: Adds the requested number of Business Days to the provided date.

A Business day is defined as a point in time that:      * Does not represent a day in the calendar&#39;s weekend      * Does not represent a day in the calendar&#39;s list of holidays (e.g. Christmas Day in the UK)                 All dates specified must be UTC and the upper bound of a calendar is not inclusive                 e.g. From: 2020-12-24-00-00-00:       Adding 3 business days returns 2020-12-30, assuming Saturday and Sunday are weekends, and the 25th and 28th are holidays.       Adding -2 business days returns 2020-12-22 under the same assumptions.                If the provided number of days to add is zero, returns a failure.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope within which to search for the calendars
    AddBusinessDaysToDateRequest addBusinessDaysToDateRequest = new AddBusinessDaysToDateRequest(); // AddBusinessDaysToDateRequest | Request Details: start date, number of days to add (which can be negative, but not zero), calendar codes and optionally an AsAt date for searching the calendar store
    try {
      AddBusinessDaysToDateResponse result = apiInstance.addBusinessDaysToDate(scope, addBusinessDaysToDateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#addBusinessDaysToDate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope within which to search for the calendars |
 **addBusinessDaysToDateRequest** | [**AddBusinessDaysToDateRequest**](AddBusinessDaysToDateRequest.md)| Request Details: start date, number of days to add (which can be negative, but not zero), calendar codes and optionally an AsAt date for searching the calendar store |

### Return type

[**AddBusinessDaysToDateResponse**](AddBusinessDaysToDateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The business day that is a number of business days after the given date as determined by the given calendar codes |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="addDateToCalendar"></a>
# **addDateToCalendar**
> CalendarDate addDateToCalendar(scope, code, createDateRequest)

[EARLY ACCESS] AddDateToCalendar: Add a date to a calendar

Add an event to the calendar. These Events can be a maximum of 24 hours and must be specified in UTC.  A local date will be calculated by the system and applied to the calendar before processing.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendar
    String code = "code_example"; // String | Code of the calendar
    CreateDateRequest createDateRequest = new CreateDateRequest(); // CreateDateRequest | Add date to calendar request
    try {
      CalendarDate result = apiInstance.addDateToCalendar(scope, code, createDateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#addDateToCalendar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendar |
 **code** | **String**| Code of the calendar |
 **createDateRequest** | [**CreateDateRequest**](CreateDateRequest.md)| Add date to calendar request |

### Return type

[**CalendarDate**](CalendarDate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The created date |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createCalendar"></a>
# **createCalendar**
> Calendar createCalendar(createCalendarRequest)

[EARLY ACCESS] CreateCalendar: Create a calendar in its generic form

Create a calendar in a generic form which can be used to store date events.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    CreateCalendarRequest createCalendarRequest = new CreateCalendarRequest(); // CreateCalendarRequest | A request to create the calendar
    try {
      Calendar result = apiInstance.createCalendar(createCalendarRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#createCalendar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCalendarRequest** | [**CreateCalendarRequest**](CreateCalendarRequest.md)| A request to create the calendar |

### Return type

[**Calendar**](Calendar.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The created calendar |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteCalendar"></a>
# **deleteCalendar**
> Calendar deleteCalendar(scope, code)

[EARLY ACCESS] DeleteCalendar: Delete a calendar

Delete a calendar and all of its respective dates

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendar
    String code = "code_example"; // String | Code of the calendar
    try {
      Calendar result = apiInstance.deleteCalendar(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#deleteCalendar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendar |
 **code** | **String**| Code of the calendar |

### Return type

[**Calendar**](Calendar.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The deleted calendar |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteDateFromCalendar"></a>
# **deleteDateFromCalendar**
> CalendarDate deleteDateFromCalendar(scope, code, dateId)

[EARLY ACCESS] DeleteDateFromCalendar: Remove a date from a calendar

Remove a date from a calendar.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendar
    String code = "code_example"; // String | Code of the calendar
    String dateId = "dateId_example"; // String | Identifier of the date to be removed
    try {
      CalendarDate result = apiInstance.deleteDateFromCalendar(scope, code, dateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#deleteDateFromCalendar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendar |
 **code** | **String**| Code of the calendar |
 **dateId** | **String**| Identifier of the date to be removed |

### Return type

[**CalendarDate**](CalendarDate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The deleted date |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="generateSchedule"></a>
# **generateSchedule**
> List&lt;OffsetDateTime&gt; generateSchedule(scope, valuationSchedule, asAt)

[EARLY ACCESS] GenerateSchedule: Generate an ordered schedule of dates.

Returns an ordered array of dates. The dates will only fall on business  days as defined by the scope and calendar codes in the valuation schedule.                Valuations are made at a frequency defined by the valuation schedule&#39;s tenor, e.g. every day (\&quot;1D\&quot;),  every other week (\&quot;2W\&quot;) etc. These dates will be adjusted onto business days as defined by the schedule&#39;s  rollConvention.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendars to use
    ValuationSchedule valuationSchedule = new ValuationSchedule(); // ValuationSchedule | The ValuationSchedule to generate schedule dates from
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional AsAt for searching the calendar store. Defaults to Latest.
    try {
      List<OffsetDateTime> result = apiInstance.generateSchedule(scope, valuationSchedule, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#generateSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendars to use |
 **valuationSchedule** | [**ValuationSchedule**](ValuationSchedule.md)| The ValuationSchedule to generate schedule dates from |
 **asAt** | **OffsetDateTime**| Optional AsAt for searching the calendar store. Defaults to Latest. | [optional]

### Return type

[**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of dates in chronological order. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getCalendar"></a>
# **getCalendar**
> Calendar getCalendar(scope, code, propertyKeys, asAt)

[EARLY ACCESS] GetCalendar: Get a calendar in its generic form

Retrieve a generic calendar by a specific ID at a point in AsAt time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendar identifier
    String code = "code_example"; // String | Code of the calendar identifier
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Calendar\" domain to decorate onto the calendar,               These take the format {domain}/{scope}/{code} e.g. \"Calendar/System/Name\".
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the calendar
    try {
      Calendar result = apiInstance.getCalendar(scope, code, propertyKeys, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#getCalendar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendar identifier |
 **code** | **String**| Code of the calendar identifier |
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Calendar\&quot; domain to decorate onto the calendar,               These take the format {domain}/{scope}/{code} e.g. \&quot;Calendar/System/Name\&quot;. | [optional]
 **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the calendar | [optional]

### Return type

[**Calendar**](Calendar.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested calendar |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getDates"></a>
# **getDates**
> ResourceListOfCalendarDate getDates(scope, code, fromEffectiveAt, toEffectiveAt, asAt, idFilter)

[EARLY ACCESS] GetDates: Get dates for a specific calendar

Get dates from a specific calendar within a specific window of effective time, at a point in AsAt time.  Providing an id filter can further refine the results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendar
    String code = "code_example"; // String | Code of the calendar
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | Where the effective window of dates should begin from
    String toEffectiveAt = "toEffectiveAt_example"; // String | Where the effective window of dates should end
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | AsAt the dates should be retrieved at
    List<String> idFilter = Arrays.asList(); // List<String> | An additional filter that will filter dates based on their identifer
    try {
      ResourceListOfCalendarDate result = apiInstance.getDates(scope, code, fromEffectiveAt, toEffectiveAt, asAt, idFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#getDates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendar |
 **code** | **String**| Code of the calendar |
 **fromEffectiveAt** | **String**| Where the effective window of dates should begin from | [optional]
 **toEffectiveAt** | **String**| Where the effective window of dates should end | [optional]
 **asAt** | **OffsetDateTime**| AsAt the dates should be retrieved at | [optional]
 **idFilter** | [**List&lt;String&gt;**](String.md)| An additional filter that will filter dates based on their identifer | [optional]

### Return type

[**ResourceListOfCalendarDate**](ResourceListOfCalendarDate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested date |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="isBusinessDateTime"></a>
# **isBusinessDateTime**
> IsBusinessDayResponse isBusinessDateTime(dateTime, scope, code, asAt)

[EARLY ACCESS] IsBusinessDateTime: Check whether a DateTime is a \&quot;Business DateTime\&quot;

A Business DateTime is defined as a point in time that:      * Does not represent a day that overlaps with the calendars WeekendMask      * If the calendar is a \&quot;Holiday Calendar\&quot; Does not overlap with any dates in the calendar      * If the calendar is a \&quot;TradingHours Calendar\&quot; Does overlap with a date in the calendar                All dates specified must be UTC and the upper bound of a calendar is not inclusive   e.g. From: 2020-12-25-00-00-00        To: 2020-12-26-00-00-00  IsBusinessDay(2020-12-26-00-00-00) &#x3D;&#x3D; false

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    OffsetDateTime dateTime = OffsetDateTime.now(); // OffsetDateTime | DateTime to check - This DateTime must be UTC
    String scope = "scope_example"; // String | Scope of the calendar
    String code = "code_example"; // String | Code of the calendar
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | AsAt for the request
    try {
      IsBusinessDayResponse result = apiInstance.isBusinessDateTime(dateTime, scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#isBusinessDateTime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTime** | **OffsetDateTime**| DateTime to check - This DateTime must be UTC |
 **scope** | **String**| Scope of the calendar |
 **code** | **String**| Code of the calendar |
 **asAt** | **OffsetDateTime**| AsAt for the request | [optional]

### Return type

[**IsBusinessDayResponse**](IsBusinessDayResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Whether or not the requested DateTime is a BusinessDay or not |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listCalendars"></a>
# **listCalendars**
> PagedResourceListOfCalendar listCalendars(asAt, page, limit, propertyKeys, filter)

[EARLY ACCESS] ListCalendars: List Calendars

List calendars at a point in AsAt time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the calendars
    String page = "page_example"; // String | The pagination token to use to continue listing calendars from a previous call to list calendars.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Calendar\" domain to decorate onto the calendar,               These take the format {domain}/{scope}/{code} e.g. \"Calendar/System/Name\".
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfCalendar result = apiInstance.listCalendars(asAt, page, limit, propertyKeys, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#listCalendars");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the calendars | [optional]
 **page** | **String**| The pagination token to use to continue listing calendars from a previous call to list calendars.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Calendar\&quot; domain to decorate onto the calendar,               These take the format {domain}/{scope}/{code} e.g. \&quot;Calendar/System/Name\&quot;. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**PagedResourceListOfCalendar**](PagedResourceListOfCalendar.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List Calendars |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listCalendarsInScope"></a>
# **listCalendarsInScope**
> PagedResourceListOfCalendar listCalendarsInScope(scope, asAt, page, start, limit, propertyKeys, filter)

[EARLY ACCESS] ListCalendarsInScope: List all calenders in a specified scope

List calendars in a Scope at a point in AsAt time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the calendars
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the calendars
    String page = "page_example"; // String | The pagination token to use to continue listing calendars from a previous call to list calendars.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Calendar\" domain to decorate onto the calendar,               These take the format {domain}/{scope}/{code} e.g. \"Calendar/System/Name\".
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfCalendar result = apiInstance.listCalendarsInScope(scope, asAt, page, start, limit, propertyKeys, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#listCalendarsInScope");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the calendars |
 **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the calendars | [optional]
 **page** | **String**| The pagination token to use to continue listing calendars from a previous call to list calendars.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Calendar\&quot; domain to decorate onto the calendar,               These take the format {domain}/{scope}/{code} e.g. \&quot;Calendar/System/Name\&quot;. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**PagedResourceListOfCalendar**](PagedResourceListOfCalendar.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Calendars in the requested scope |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updateCalendar"></a>
# **updateCalendar**
> Calendar updateCalendar(scope, code, updateCalendarRequest)

[EARLY ACCESS] UpdateCalendar: Update a calendar

Update the calendars WeekendMask, SourceProvider or Properties

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CalendarsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CalendarsApi apiInstance = new CalendarsApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the request
    String code = "code_example"; // String | Code of the request
    UpdateCalendarRequest updateCalendarRequest = new UpdateCalendarRequest(); // UpdateCalendarRequest | The new state of the calendar
    try {
      Calendar result = apiInstance.updateCalendar(scope, code, updateCalendarRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarsApi#updateCalendar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the request |
 **code** | **String**| Code of the request |
 **updateCalendarRequest** | [**UpdateCalendarRequest**](UpdateCalendarRequest.md)| The new state of the calendar |

### Return type

[**Calendar**](Calendar.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated calendar |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

