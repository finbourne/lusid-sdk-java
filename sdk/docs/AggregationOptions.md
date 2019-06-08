
# AggregationOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useAnsiLikeSyntax** | **Boolean** | Should the aggregation behave like ANSI Sql or MySql with respect to a conceptual request which is equivalent to \&quot;select a,sum(a) from results\&quot;;  ANSI Sql would report an error if a was not unique where MySql would simply view a,suma(a) as equivalent to firstof(a),sum(a). |  [optional]



