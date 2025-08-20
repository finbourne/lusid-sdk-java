

# LoanFacilityContractRolloverEvent

Event for rolling over one or more FlexibleLoan contracts into one or more different FlexibleLoan contracts against the same facility.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Effective date of the event. |  [optional] |
|**rolloverConstituents** | [**List&lt;RolloverConstituent&gt;**](RolloverConstituent.md) | Source and target contracts of the rollover. That is, a set of contracts and their respective changes to balance Expect at least one contract to as the source of the rollover and at least one target contract. |  |
|**withInterest** | **Boolean** | If set to true, then active contracts whose balance is reduced by the rollover will have their accrued interest repaid pro rata to the balance reduction. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


