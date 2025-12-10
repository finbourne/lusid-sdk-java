# com.finbourne.lusid.model.OpaqueMarketData
A representation of an un-built piece of complex market data, to allow for passing through  to the vendor library for building.  The market data will usually be in some standard form such as XML or Json, representing a curve or surface.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | **String** | The document as a string. | [default to String]
**format** | **String** | What format is the document stored in, e.g. Xml.  Supported string (enumeration) values are: [Unknown, Xml, Json, Csv]. | [default to String]
**name** | **String** | Internal name of document. This is not used for search, it is simply a designator that helps identify the document  and could be anything (filename, ftp address or similar) | [default to String]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.OpaqueMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Document = "example Document";
String Format = "example Format";
String Name = "example Name";
@jakarta.annotation.Nullable String Lineage = "example Lineage";
Version Version = new Version();


OpaqueMarketData opaqueMarketDataInstance = new OpaqueMarketData()
    .Document(Document)
    .Format(Format)
    .Name(Name)
    .Lineage(Lineage)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
