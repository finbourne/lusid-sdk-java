# com.finbourne.lusid.model.PartnershipTypeDifference
A transaction type a fund's portfolios resolve whose register deltas are not its contract, whose sides its scope does not define, or whose line legs lack the option that books them into the registry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The source the transaction type is defined in. | [default to String]
**type** | **String** | The transaction type. | [default to String]
**scope** | **String** | The transaction type scope the fund&#39;s portfolio resolves the type in. | [default to String]
**expected** | [**List&lt;PackRegisterDelta&gt;**](PackRegisterDelta.md) | The register balance deltas the pack&#39;s contract expects of the type. | [default to List<PackRegisterDelta>]
**actual** | [**List&lt;RegisterDeltaMovement&gt;**](RegisterDeltaMovement.md) | The register balance deltas the type&#39;s movements carry, each named by its movement. | [default to List<RegisterDeltaMovement>]
**missingSides** | **List&lt;String&gt;** | The sides the type&#39;s movements book through that the fund&#39;s transaction type scope does not define, so the type cannot be booked there; empty when every side is defined. | [default to List<String>]
**missingOptions** | [**List&lt;MissingMovementOption&gt;**](MissingMovementOption.md) | The movement options the type&#39;s line legs must carry to book the register and do not, each named by its movement. A leg that moves a register balance, or books the line&#39;s units and cost, without the &#39;Registry&#39; option books into the portfolio&#39;s holdings, where the register never looks; empty when every line leg carries it. | [default to List<MissingMovementOption>]

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
List<MissingMovementOption> MissingOptions = new List<MissingMovementOption>();


PartnershipTypeDifference partnershipTypeDifferenceInstance = new PartnershipTypeDifference()
    .Source(Source)
    .Type(Type)
    .Scope(Scope)
    .Expected(Expected)
    .Actual(Actual)
    .MissingSides(MissingSides)
    .MissingOptions(MissingOptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
