

# RelativeDateOffset

Defines a date offset which is relative to some anchor date.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**days** | **Integer** | The number of days to add to the anchor date. |  |
|**businessDayConvention** | **String** | The adjustment type to apply to dates that fall upon a non-business day, e.g. modified following or following.    Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest]. |  |
|**dayType** | **String** | Indicates if consideration is given to whether a day is a good business day or not when calculating the offset date.    Supported string (enumeration) values are: [Business, Calendar]. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


