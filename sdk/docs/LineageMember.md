# com.finbourne.lusid.model.LineageMember

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | Index to demonstrate position of lineage member in overall lineage | [default to Integer]
**label** | **String** | Label of the step corresponding to this lineage member | [default to String]
**subLabel** | **String** | SubLabel of the step corresponding to this lineage member | [default to String]
**infoType** | **String** | Optional. Type of Information | [optional] [default to String]
**information** | **String** | Optional. Information for the step corresponding to this lineage member, of type InfoType | [optional] [default to String]

```java
import com.finbourne.lusid.model.LineageMember;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Index = new Integer("100.00");
String Label = "example Label";
String SubLabel = "example SubLabel";
@jakarta.annotation.Nullable String InfoType = "example InfoType";
@jakarta.annotation.Nullable String Information = "example Information";


LineageMember lineageMemberInstance = new LineageMember()
    .Index(Index)
    .Label(Label)
    .SubLabel(SubLabel)
    .InfoType(InfoType)
    .Information(Information);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
