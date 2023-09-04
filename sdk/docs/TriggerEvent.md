

# TriggerEvent

Definition of a trigger event.  This is an event that occurs on transformation of an option instrument being  triggered by a barrier/touch price level being hit by the underlying asset.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**level** | **java.math.BigDecimal** | The underlying price level that triggers the event |  |
|**triggerType** | **String** | The type of the trigger; valid options are Knock-In, Knock-Out, Touch or No-Touch |  |
|**triggerDirection** | **String** | The direction of the trigger; valid options are Up and Down |  |
|**triggerDate** | **OffsetDateTime** | The date the trigger happens at. |  |
|**maturityDate** | **OffsetDateTime** | The date the trigger takes effect. |  |



