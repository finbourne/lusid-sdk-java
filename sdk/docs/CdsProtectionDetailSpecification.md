# com.finbourne.lusid.model.CdsProtectionDetailSpecification
CDSs generally conform to fairly standard definitions, but can be tweaked in a number of different ways.  This class gathers a number of common features which may deviate. These will default to the market standard when  no overrides are provided.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seniority** | **String** | The seniority level of the CDS.  Supported string (enumeration) values are: [SNR, SUB, JRSUBUT2, PREFT1, SECDOM, SNRFOR, SUBLT2].  Defaults to \&quot;SUB\&quot; if not set. | [optional] [default to String]
**restructuringType** | **String** | The restructuring clause.  Supported string (enumeration) values are: [CR, MR, MM, XR]. Defaults to \&quot;MM\&quot; if not set. | [optional] [default to String]
**protectStartDay** | **Boolean** | Does the protection leg pay out in the case of default on the start date. Defaults to true if not set. | [optional] [default to Boolean]
**payAccruedInterestOnDefault** | **Boolean** | Should accrued interest on the premium leg be paid if a credit event occurs. Defaults to true if not set. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CdsProtectionDetailSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Seniority = "example Seniority";
@jakarta.annotation.Nullable String RestructuringType = "example RestructuringType";
Boolean ProtectStartDay = true;
Boolean PayAccruedInterestOnDefault = true;


CdsProtectionDetailSpecification cdsProtectionDetailSpecificationInstance = new CdsProtectionDetailSpecification()
    .Seniority(Seniority)
    .RestructuringType(RestructuringType)
    .ProtectStartDay(ProtectStartDay)
    .PayAccruedInterestOnDefault(PayAccruedInterestOnDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
