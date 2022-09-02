

# CapFloor

LUSID representation of Cap, Floor, or Collar.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capFloorType** | **String** | Determine if it&#39;s CAP, FLOOR, or COLLAR.    Supported string (enumeration) values are: [Cap, Floor, Collar]. | 
**capStrike** | **java.math.BigDecimal** | Strike rate of the Cap. | 
**floorStrike** | **java.math.BigDecimal** | Strike rate of the Floor. | 
**includeFirstCaplet** | **Boolean** | Include first caplet flag. | 
**underlyingFloatingLeg** | [**FloatingLeg**](FloatingLeg.md) |  | 



