# com.finbourne.lusid.model.AllocationEventNoticePartner
The partner a notice is addressed to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record identifier of the partner. | [default to String]
**displayName** | **String** | The display name of the partner. | [optional] [default to String]
**commitment** | **java.math.BigDecimal** | The partner&#39;s total commitment. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationEventNoticePartner;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
java.math.BigDecimal Commitment = new java.math.BigDecimal("100.00");


AllocationEventNoticePartner allocationEventNoticePartnerInstance = new AllocationEventNoticePartner()
    .InvestorRecordId(InvestorRecordId)
    .DisplayName(DisplayName)
    .Commitment(Commitment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
