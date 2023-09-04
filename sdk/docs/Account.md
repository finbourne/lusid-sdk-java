

# Account

An account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code given for the account. |  |
|**description** | **String** | The description for the account. |  [optional] |
|**type** | **String** | The account type. Can have the values: Asset/Liabilities/Income/Expense/Capital/Revenue. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The account status. Can be Active, Inactive or Deleted. Defaults to Active. The available values are: Active, Inactive, Deleted |  |
|**control** | **String** | This allows users to specify whether this a protected account that prevents direct manual journal adjustment. Can have the values: System/ManualIt will default to “Manual”. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Account properties to add to the account. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |
| DELETED | &quot;Deleted&quot; |



