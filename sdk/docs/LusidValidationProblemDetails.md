# com.finbourne.lusid.model.LusidValidationProblemDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**errorDetails** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) |  | [optional] [default to List<Map<String, String>>]
**code** | **Integer** |  | [default to Integer]
**errors** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  | [optional] [default to Map<String, List<String>>]
**type** | **String** |  | [optional] [default to String]
**title** | **String** |  | [optional] [default to String]
**status** | **Integer** |  | [optional] [default to Integer]
**detail** | **String** |  | [optional] [default to String]
**instance** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable List<Map<String, String>> ErrorDetails = new List<Map<String, String>>();
Integer Code = new Integer("100.00");
Map<String, List<String>> Errors = new Map<String, List<String>>();
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Title = "example Title";
@jakarta.annotation.Nullable Integer Status = new Integer("100.00");
@jakarta.annotation.Nullable String Detail = "example Detail";
@jakarta.annotation.Nullable String Instance = "example Instance";


LusidValidationProblemDetails lusidValidationProblemDetailsInstance = new LusidValidationProblemDetails()
    .Name(Name)
    .ErrorDetails(ErrorDetails)
    .Code(Code)
    .Errors(Errors)
    .Type(Type)
    .Title(Title)
    .Status(Status)
    .Detail(Detail)
    .Instance(Instance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
