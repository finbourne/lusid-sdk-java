

# ComplianceRunInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **String** | The unique identifier of a compliance run |  |
|**instigatedAt** | **OffsetDateTime** | The time the compliance run was launched (e.g. button pressed). Currently it is also both the as at and effective at time in whichthe rule set and portfolio data (including any pending trades if the run is pretrade) is taken for the caluation, although it may be possible to run compliance for historical effective at and as at dates in the future. |  |
|**completedAt** | **OffsetDateTime** | The time the compliance run calculation was completed |  |
|**schedule** | **String** | Whether the compliance run was pre or post trade |  |
|**allRulesPassed** | **Boolean** | True if all rules passed, for all the portfolios they were assigned to |  |
|**hasResults** | **Boolean** | False when no results have been returned eg. when no rules exist |  |
|**asAt** | **OffsetDateTime** | Legacy AsAt time for backwards compatibility |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


