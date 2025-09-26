# com.finbourne.lusid.model.GeneralLedgerProfileResponse
A General Ledger Profile Definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**generalLedgerProfileCode** | **String** | The unique code for the General Ledger Profile | [default to String]
**displayName** | **String** | The name of the General Ledger Profile | [default to String]
**description** | **String** | A description for the General Ledger Profile | [optional] [default to String]
**generalLedgerProfileMappings** | [**List&lt;GeneralLedgerProfileMapping&gt;**](GeneralLedgerProfileMapping.md) | Rules for mapping Account or property values to aggregation pattern definitions | [default to List<GeneralLedgerProfileMapping>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GeneralLedgerProfileResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId ChartOfAccountsId = new ResourceId();
String GeneralLedgerProfileCode = "example GeneralLedgerProfileCode";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<GeneralLedgerProfileMapping> GeneralLedgerProfileMappings = new List<GeneralLedgerProfileMapping>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GeneralLedgerProfileResponse generalLedgerProfileResponseInstance = new GeneralLedgerProfileResponse()
    .Href(Href)
    .ChartOfAccountsId(ChartOfAccountsId)
    .GeneralLedgerProfileCode(GeneralLedgerProfileCode)
    .DisplayName(DisplayName)
    .Description(Description)
    .GeneralLedgerProfileMappings(GeneralLedgerProfileMappings)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
