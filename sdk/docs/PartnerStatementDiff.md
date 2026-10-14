# com.finbourne.lusid.model.PartnerStatementDiff
The differences between two of a partner's statements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statementId** | **String** | The identifier of the statement. | [default to String]
**againstStatementId** | **String** | The identifier of the statement to compare against. | [default to String]
**identical** | **Boolean** | Whether the two statements carry the same figures. | [default to Boolean]
**differences** | [**List&lt;PartnerStatementLineDifference&gt;**](PartnerStatementLineDifference.md) | The figures that differ between the two statements. | [default to List<PartnerStatementLineDifference>]

```java
import com.finbourne.lusid.model.PartnerStatementDiff;
import java.util.*;
import java.lang.System;
import java.net.URI;

String StatementId = "example StatementId";
String AgainstStatementId = "example AgainstStatementId";
Boolean Identical = true;
List<PartnerStatementLineDifference> Differences = new List<PartnerStatementLineDifference>();


PartnerStatementDiff partnerStatementDiffInstance = new PartnerStatementDiff()
    .StatementId(StatementId)
    .AgainstStatementId(AgainstStatementId)
    .Identical(Identical)
    .Differences(Differences);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
