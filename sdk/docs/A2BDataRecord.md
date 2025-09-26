# com.finbourne.lusid.model.A2BDataRecord
A2B Record - shows values on, and changes between two dates: A and B

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. | [optional] [default to String]
**instrumentScope** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [optional] [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**currency** | **String** | The holding currency. | [optional] [default to String]
**transactionId** | **String** | The unique identifier for the transaction. | [optional] [default to String]
**start** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**flows** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**gains** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**carry** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**end** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; domain. | [optional] [default to Map<String, Property>]
**groupId** | **String** | Arbitrary string that can be used to cross reference an entry in the A2B report with activity in the A2B-Movements. This should be used purely as a token. The content should not be relied upon. | [optional] [default to String]
**errors** | [**List&lt;ResponseMetaData&gt;**](ResponseMetaData.md) | Any errors with the record are reported here. | [optional] [default to List<ResponseMetaData>]

```java
import com.finbourne.lusid.model.A2BDataRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String HoldingType = "example HoldingType";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String InstrumentUid = "example InstrumentUid";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
A2BCategory Start = new A2BCategory();
A2BCategory Flows = new A2BCategory();
A2BCategory Gains = new A2BCategory();
A2BCategory Carry = new A2BCategory();
A2BCategory End = new A2BCategory();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable String GroupId = "example GroupId";
@jakarta.annotation.Nullable List<ResponseMetaData> Errors = new List<ResponseMetaData>();


A2BDataRecord a2BDataRecordInstance = new A2BDataRecord()
    .PortfolioId(PortfolioId)
    .HoldingType(HoldingType)
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .SubHoldingKeys(SubHoldingKeys)
    .Currency(Currency)
    .TransactionId(TransactionId)
    .Start(Start)
    .Flows(Flows)
    .Gains(Gains)
    .Carry(Carry)
    .End(End)
    .Properties(Properties)
    .GroupId(GroupId)
    .Errors(Errors);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
