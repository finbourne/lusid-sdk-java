

# ChangeItem

Information about a change to a field / property.  At least one of 'PreviousValue' or 'NewValue' will be set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the field or property that has been changed. | 
**previousValue** | **String** | The previous value for this field / property. |  [optional]
**newValue** | **String** | The new value for this field / property. |  [optional]
**effectiveFrom** | **OffsetDateTime** | The market data time, i.e. the time to run the change from. |  [optional]
**effectiveUntil** | **OffsetDateTime** | The market data time, i.e. the time to run the change until. |  [optional]



