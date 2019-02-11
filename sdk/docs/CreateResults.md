
# CreateResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **String** | The data that should be stored in the results cube. |  [optional]
**scope** | **String** | The scope of the data to be stored. |  [optional]
**key** | **String** | The key is a unique point in &#39;run&#39; space. For a given scope and time point, one would wish to  identify a unique result set for a given recipe. In essence, this key is the unique identifier for the tuple (recipe,portfolios)  However, that only matters when one is trying to use it automatically to retrieve them.  A question becomes whether we would wish to store groups of protfolio results together, or only single ones.  Also, whether we would accept uploading of groups and then split them apart. |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date for which the results should be stored. |  [optional]
**format** | [**FormatEnum**](#FormatEnum) | The format in which the results are stored/structured. |  [optional]


<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
DATAREADER | &quot;DataReader&quot;
PORTFOLIO | &quot;Portfolio&quot;



