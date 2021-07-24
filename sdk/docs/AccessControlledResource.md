

# AccessControlledResource

A resource to which access can be controlled

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** | The application to which this resource belongs |  [optional]
**name** | **String** | The display name of the resource |  [optional]
**description** | **String** | The description of the resource | 
**actions** | [**List&lt;AccessControlledAction&gt;**](AccessControlledAction.md) | The actions acceptable for this type of resource | 
**identifierParts** | [**List&lt;IdentifierPartSchema&gt;**](IdentifierPartSchema.md) | The constituent parts of a valid identifier for this resource |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



