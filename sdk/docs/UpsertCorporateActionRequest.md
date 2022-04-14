

# UpsertCorporateActionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionCode** | **String** | The unique identifier of this corporate action | 
**description** | **String** | The description of the corporate action. |  [optional]
**announcementDate** | **OffsetDateTime** | The announcement date of the corporate action | 
**exDate** | **OffsetDateTime** | The ex date of the corporate action | 
**recordDate** | **OffsetDateTime** | The record date of the corporate action | 
**paymentDate** | **OffsetDateTime** | The payment date of the corporate action | 
**transitions** | [**List&lt;CorporateActionTransitionRequest&gt;**](CorporateActionTransitionRequest.md) | The transitions that result from this corporate action | 



