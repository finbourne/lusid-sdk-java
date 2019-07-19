

# UpsertInstrumentPropertyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentId** | **String** | The unique Lusid Instrument Identifier (LUID) of the instrument to update or insert properties on. | 
**properties** | [**List&lt;Property&gt;**](Property.md) | Set of unique instrument properties and associated values to store with the instrument. Each property must be from the &#39;Instrument&#39; domain. |  [optional]
**deletedProperties** | [**List&lt;DeleteInstrumentPropertyRequest&gt;**](DeleteInstrumentPropertyRequest.md) | Set of unique instrument properties to delete from the instrument. |  [optional]



