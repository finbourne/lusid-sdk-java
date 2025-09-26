# com.finbourne.lusid.model.BasketIdentifier
Descriptive information that describes a particular basket of instruments. Most commonly required with a CDS Index or similarly defined instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | Index set, e.g. iTraxx or CDX. | [default to String]
**name** | **String** | The index name within the set, e.g. \&quot;MAIN\&quot; or \&quot;Crossover\&quot;. | [default to String]
**region** | **String** | Applicable geographic country or region. Typically something like \&quot;Europe\&quot;, \&quot;Asia ex-Japan\&quot;, \&quot;Japan\&quot; or \&quot;Australia\&quot;. | [default to String]
**seriesId** | **Integer** | The series identifier. | [default to Integer]

```java
import com.finbourne.lusid.model.BasketIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Index = "example Index";
String Name = "example Name";
String Region = "example Region";
Integer SeriesId = new Integer("100.00");


BasketIdentifier basketIdentifierInstance = new BasketIdentifier()
    .Index(Index)
    .Name(Name)
    .Region(Region)
    .SeriesId(SeriesId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
