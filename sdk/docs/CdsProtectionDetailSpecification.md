

# CdsProtectionDetailSpecification

CDSs generally conform to fairly standard definitions, but can be tweaked in a number of different ways.  This class gathers a number of common features which may deviate. These will default to the market standard when  no overrides are provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seniority** | **String** | The seniority level of the CDS.    Supported string (enumeration) values are: [SNR, SUB, JRSUBUT2, PREFT1, SECDOM, SNRFOR, SUBLT2]. |  |
|**restructuringType** | **String** | The restructuring clause.  Supported string (enumeration) values are: [CR, MR, MM, XR]. |  |
|**protectStartDay** | **Boolean** | Does the protection leg pay out in the case of default on the start date. |  |
|**payAccruedInterestOnDefault** | **Boolean** | Should accrued interest on the premium leg be paid if a credit event occurs. |  |



