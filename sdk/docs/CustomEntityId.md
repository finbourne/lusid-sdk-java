

# CustomEntityId


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifierScope** | **String** | The scope the identifier resides in (the scope of the identifier property definition). |  |
|**identifierType** | **String** | What the identifier represents (the code of the identifier property definition). |  |
|**identifierValue** | **String** | The value of the identifier for this entity. |  |
|**effectiveFrom** | **OffsetDateTime** | The effective datetime from which the identifier is valid. |  [optional] |
|**effectiveUntil** | **OffsetDateTime** | The effective datetime until which the identifier is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the identifier. |  [optional] |



