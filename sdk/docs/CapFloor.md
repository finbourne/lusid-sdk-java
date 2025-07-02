

# CapFloor

LUSID representation of Cap, Floor, or Collar.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**capFloorType** | **String** | Determine if it&#39;s CAP, FLOOR, or COLLAR.    Supported string (enumeration) values are: [Cap, Floor, Collar]. |  |
|**capStrike** | **java.math.BigDecimal** | Strike rate of the Cap. |  [optional] |
|**floorStrike** | **java.math.BigDecimal** | Strike rate of the Floor. |  [optional] |
|**includeFirstCaplet** | **Boolean** | Include first caplet flag. |  |
|**underlyingFloatingLeg** | [**FloatingLeg**](FloatingLeg.md) |  |  |
|**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven equity swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


