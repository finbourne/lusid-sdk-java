# com.finbourne.lusid.model.StructuredResultData
An item of structured result data that is to be inserted into Lusid. This will typically be a Json or Xml document that  contains a set of result data appropriate to a specific entity such as an instrument or potentially an index.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentFormat** | **String** | The format of the accompanying document. | [default to String]
**version** | **String** | The semantic version of the document format; MAJOR.MINOR.PATCH | [optional] [default to String]
**name** | **String** | The name or description for the document | [optional] [default to String]
**document** | **String** | The document that will be stored (or retrieved) and which describes a unit result data entity such as a set of prices or yields | [default to String]
**dataMapKey** | [**DataMapKey**](DataMapKey.md) |  | [optional] [default to DataMapKey]

```java
import com.finbourne.lusid.model.StructuredResultData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DocumentFormat = "example DocumentFormat";
@jakarta.annotation.Nullable String Version = "example Version";
@jakarta.annotation.Nullable String Name = "example Name";
String Document = "example Document";
DataMapKey DataMapKey = new DataMapKey();


StructuredResultData structuredResultDataInstance = new StructuredResultData()
    .DocumentFormat(DocumentFormat)
    .Version(Version)
    .Name(Name)
    .Document(Document)
    .DataMapKey(DataMapKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
