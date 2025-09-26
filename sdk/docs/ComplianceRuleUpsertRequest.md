# com.finbourne.lusid.model.ComplianceRuleUpsertRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**type** | **String** |  | [default to String]
**propertyKey** | **String** |  | [optional] [default to String]
**value** | **String** |  | [optional] [default to String]
**lowerBound** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**upperBound** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**schedule** | **String** |  | [default to String]
**hardRequirement** | **Boolean** |  | [default to Boolean]
**targetPortfolioIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**description** | **String** |  | [optional] [default to String]
**addressKey** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ComplianceRuleUpsertRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
String Type = "example Type";
@jakarta.annotation.Nullable String PropertyKey = "example PropertyKey";
@jakarta.annotation.Nullable String Value = "example Value";
java.math.BigDecimal LowerBound = new java.math.BigDecimal("100.00");
java.math.BigDecimal UpperBound = new java.math.BigDecimal("100.00");
String Schedule = "example Schedule";
Boolean HardRequirement = true;
List<ResourceId> TargetPortfolioIds = new List<ResourceId>();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String AddressKey = "example AddressKey";


ComplianceRuleUpsertRequest complianceRuleUpsertRequestInstance = new ComplianceRuleUpsertRequest()
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName)
    .Type(Type)
    .PropertyKey(PropertyKey)
    .Value(Value)
    .LowerBound(LowerBound)
    .UpperBound(UpperBound)
    .Schedule(Schedule)
    .HardRequirement(HardRequirement)
    .TargetPortfolioIds(TargetPortfolioIds)
    .Description(Description)
    .AddressKey(AddressKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
