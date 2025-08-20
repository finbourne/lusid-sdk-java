

# ReconciliationLine

In evaluating a left and right hand side holding or valuation set, two data records result. These are then compared based on a set of rules. This results in either a match or failure to match. If there is a match both left and right will be present, otherwise one will not. A difference will be present if a match was calculated. The options used in comparison may result in elision of results where an exact or tolerable match is made.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**left** | **Map&lt;String, Object&gt;** | Left hand side of the comparison |  [optional] |
|**right** | **Map&lt;String, Object&gt;** | Right hand side of the comparison |  [optional] |
|**difference** | **Map&lt;String, Object&gt;** | Difference between LHS and RHS of comparison |  [optional] |
|**resultComparison** | **Map&lt;String, Object&gt;** | The logical or semantic description of the difference, e.g. \&quot;Matches\&quot; or \&quot;MatchesWithTolerance\&quot; or \&quot;Failed\&quot;. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


