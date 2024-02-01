

# Account

An account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the Account. |  |
|**description** | **String** | A description for the Account. |  [optional] |
|**type** | **String** | The Account type. Can have the values: Asset/Liabilities/Income/Expense/Capital/Revenue. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The Account status. Can be Active, Inactive or Deleted. Defaults to Active. The available values are: Active, Inactive, Deleted |  |
|**control** | **String** | This allows users to specify whether this a protected Account that prevents direct manual journal adjustment. Can have the values: System/ManualIt will default to “Manual”. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Account. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |
| DELETED | &quot;Deleted&quot; |



