# com.finbourne.lusid.model.PartnershipTypeDifference
A transaction type a fund's portfolios resolve whose register deltas are not its contract, or whose sides its scope does not define.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The source the transaction type is defined in. | [default to String]
**type** | **String** | The transaction type. | [default to String]
**scope** | **String** | The transaction type scope the fund&#39;s portfolio resolves the type in. | [default to String]
**expected** | [**List&lt;PackRegisterDelta&gt;**](PackRegisterDelta.md) | The register balance deltas the pack&#39;s contract expects of the type. | [default to List<PackRegisterDelta>]
**actual** | [**List&lt;RegisterDeltaMovement&gt;**](RegisterDeltaMovement.md) | The register balance deltas the type&#39;s movements carry, each named by its movement. | [default to List<RegisterDeltaMovement>]
**missingSides** | **List&lt;String&gt;** | The sides the type&#39;s movements book through that the fund&#39;s transaction type scope does not define, so the type cannot be booked there; empty when every side is defined. | [default to List<String>]

```java
import com.finbourne.lusid.model.PartnershipTypeDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Source = "example Source";
String Type = "example Type";
String Scope = "example Scope";
List<PackRegisterDelta> Expected = new List<PackRegisterDelta>();
List<RegisterDeltaMovement> Actual = new List<RegisterDeltaMovement>();
List<String> MissingSides = new List<String>();


PartnershipTypeDifference partnershipTypeDifferenceInstance = new PartnershipTypeDifference()
    .Source(Source)
    .Type(Type)
    .Scope(Scope)
    .Expected(Expected)
    .Actual(Actual)
    .MissingSides(MissingSides);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
