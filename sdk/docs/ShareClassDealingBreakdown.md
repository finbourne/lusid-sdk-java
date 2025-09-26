# com.finbourne.lusid.model.ShareClassDealingBreakdown
The breakdown of Dealing for a Share Class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classDealing** | [**Map&lt;String, ShareClassAmount&gt;**](ShareClassAmount.md) | Bucket of detail for any &#39;Dealing&#39; specific to the share class that has occured inside the queried period. | [default to Map<String, ShareClassAmount>]
**classDealingUnits** | [**Map&lt;String, Amount&gt;**](Amount.md) | Bucket of detail for any &#39;Dealing&#39; units specific to the share class that has occured inside the queried period. | [default to Map<String, Amount>]

```java
import com.finbourne.lusid.model.ShareClassDealingBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ShareClassAmount> ClassDealing = new Map<String, ShareClassAmount>();
Map<String, Amount> ClassDealingUnits = new Map<String, Amount>();


ShareClassDealingBreakdown shareClassDealingBreakdownInstance = new ShareClassDealingBreakdown()
    .ClassDealing(ClassDealing)
    .ClassDealingUnits(ClassDealingUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
