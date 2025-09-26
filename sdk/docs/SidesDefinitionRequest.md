# com.finbourne.lusid.model.SidesDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | A unique label identifying the side definition. | [default to String]
**sideRequest** | [**SideDefinitionRequest**](SideDefinitionRequest.md) |  | [default to SideDefinitionRequest]

```java
import com.finbourne.lusid.model.SidesDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Side = "example Side";
SideDefinitionRequest SideRequest = new SideDefinitionRequest();


SidesDefinitionRequest sidesDefinitionRequestInstance = new SidesDefinitionRequest()
    .Side(Side)
    .SideRequest(SideRequest);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
