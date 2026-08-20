# com.finbourne.lusid.model.ResultAxisDefinition
Describes one labelled axis of a matrix-shaped result (Result1D/Result2D), so consumers can  tell what the labels on that axis mean without opening each value.  A Result1D has a single Y axis; a Result2D has a Y (row) and an X (column) axis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**axis** | **String** | Which axis of the result this describes: \&quot;Y\&quot; labels the rows (the only axis of a Result1D,  serialized as labelsY on the value); \&quot;X\&quot; labels the columns of a Result2D (labelsX). | [optional] [default to String]
**name** | **String** | The display name of the axis, e.g. \&quot;Bucket\&quot; or \&quot;Expiry\&quot;. | [optional] [default to String]
**labelType** | **String** | What kind of value the axis labels are drawn from, e.g. \&quot;Tenor\&quot;, \&quot;Date\&quot; or \&quot;Strike\&quot;.  Consumers can switch rendering on well-known values and fall back to showing labels verbatim. | [optional] [default to String]
**description** | **String** | What the axis means for this result. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ResultAxisDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Axis = "example Axis";
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String LabelType = "example LabelType";
@jakarta.annotation.Nullable String Description = "example Description";


ResultAxisDefinition resultAxisDefinitionInstance = new ResultAxisDefinition()
    .Axis(Axis)
    .Name(Name)
    .LabelType(LabelType)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
