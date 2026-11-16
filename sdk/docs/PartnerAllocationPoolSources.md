# com.finbourne.lusid.model.PartnerAllocationPoolSources
The amount reaching a pool by each route: its bucket's lines, lines tagged with its character and lines allocated  directly to one partner.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **java.math.BigDecimal** | The amount reaching the pool from the lines its bucket&#39;s rule placed. | [default to java.math.BigDecimal]
**lineTag** | **java.math.BigDecimal** | The amount reaching the pool from lines tagged with its character. | [default to java.math.BigDecimal]
**direct** | **java.math.BigDecimal** | The amount reaching the pool from lines allocated directly to one partner. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerAllocationPoolSources;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Bucket = new java.math.BigDecimal("100.00");
java.math.BigDecimal LineTag = new java.math.BigDecimal("100.00");
java.math.BigDecimal Direct = new java.math.BigDecimal("100.00");


PartnerAllocationPoolSources partnerAllocationPoolSourcesInstance = new PartnerAllocationPoolSources()
    .Bucket(Bucket)
    .LineTag(LineTag)
    .Direct(Direct);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
