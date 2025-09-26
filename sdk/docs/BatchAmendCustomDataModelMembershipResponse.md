# com.finbourne.lusid.model.BatchAmendCustomDataModelMembershipResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, MembershipAmendmentResponse&gt;**](MembershipAmendmentResponse.md) |  | [optional] [default to Map<String, MembershipAmendmentResponse>]
**staged** | [**Map&lt;String, MembershipAmendmentResponse&gt;**](MembershipAmendmentResponse.md) |  | [optional] [default to Map<String, MembershipAmendmentResponse>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) |  | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) |  | [optional] [default to Map<String, List<ResponseMetaData>>]

```java
import com.finbourne.lusid.model.BatchAmendCustomDataModelMembershipResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, MembershipAmendmentResponse> Values = new Map<String, MembershipAmendmentResponse>();
@jakarta.annotation.Nullable Map<String, MembershipAmendmentResponse> Staged = new Map<String, MembershipAmendmentResponse>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();


BatchAmendCustomDataModelMembershipResponse batchAmendCustomDataModelMembershipResponseInstance = new BatchAmendCustomDataModelMembershipResponse()
    .Values(Values)
    .Staged(Staged)
    .Failed(Failed)
    .Metadata(Metadata);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
