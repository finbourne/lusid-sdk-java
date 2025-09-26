# com.finbourne.lusid.model.Person

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the Person | [optional] [default to String]
**description** | **String** | The description of the Person | [optional] [default to String]
**href** | [**URI**](URI.md) | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**lusidPersonId** | **String** | The unique LUSID Person Identifier of the Person. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Person. | [optional] [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Person. There can be multiple properties associated with a property key. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Person. | [optional] [default to List<Relationship>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Person;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String LusidPersonId = "example LusidPersonId";
@jakarta.annotation.Nullable Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Relationship> Relationships = new List<Relationship>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Person personInstance = new Person()
    .DisplayName(DisplayName)
    .Description(Description)
    .Href(Href)
    .LusidPersonId(LusidPersonId)
    .Identifiers(Identifiers)
    .Properties(Properties)
    .Relationships(Relationships)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
