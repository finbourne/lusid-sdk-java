# com.finbourne.lusid.model.PartnershipAccountingConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  | [default to Boolean]
**configPack** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**commitmentCurrencyPolicy** | **String** | Available values: FundCurrencyOnly, AllowLineCurrency. | [optional] [default to String]
**registerPortfolioGroup** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**capitalModel** | **String** | Available values: PartnershipCapitalAccounts, SeriesUnitised. | [optional] [default to String]
**capabilityOverrides** | [**List&lt;CapabilityOverride&gt;**](CapabilityOverride.md) |  | [optional] [default to List<CapabilityOverride>]
**series** | [**SeriesConfiguration**](SeriesConfiguration.md) |  | [optional] [default to SeriesConfiguration]
**effectiveCapabilities** | **Map&lt;String, String&gt;** | Derived on the way out; ignored on the way in. | [optional] [default to Map<String, String>]
**presentation** | [**PresentationConfiguration**](PresentationConfiguration.md) |  | [optional] [default to PresentationConfiguration]
**allocationBases** | [**List&lt;AllocationBasisRule&gt;**](AllocationBasisRule.md) |  | [optional] [default to List<AllocationBasisRule>]

```java
import com.finbourne.lusid.model.PartnershipAccountingConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Enabled = true;
ResourceId ConfigPack = new ResourceId();
@jakarta.annotation.Nullable String CommitmentCurrencyPolicy = "example CommitmentCurrencyPolicy";
ResourceId RegisterPortfolioGroup = new ResourceId();
@jakarta.annotation.Nullable String CapitalModel = "example CapitalModel";
@jakarta.annotation.Nullable List<CapabilityOverride> CapabilityOverrides = new List<CapabilityOverride>();
SeriesConfiguration Series = new SeriesConfiguration();
@jakarta.annotation.Nullable Map<String, String> EffectiveCapabilities = new Map<String, String>();
PresentationConfiguration Presentation = new PresentationConfiguration();
@jakarta.annotation.Nullable List<AllocationBasisRule> AllocationBases = new List<AllocationBasisRule>();


PartnershipAccountingConfiguration partnershipAccountingConfigurationInstance = new PartnershipAccountingConfiguration()
    .Enabled(Enabled)
    .ConfigPack(ConfigPack)
    .CommitmentCurrencyPolicy(CommitmentCurrencyPolicy)
    .RegisterPortfolioGroup(RegisterPortfolioGroup)
    .CapitalModel(CapitalModel)
    .CapabilityOverrides(CapabilityOverrides)
    .Series(Series)
    .EffectiveCapabilities(EffectiveCapabilities)
    .Presentation(Presentation)
    .AllocationBases(AllocationBases);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
