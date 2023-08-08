

# CashDependency

For indicating a dependency upon a currency.  E.g. A Bond will declare a CashDependency for its domestic currency.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The Currency that is depended upon. |  |
|**date** | **OffsetDateTime** | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. |  |



