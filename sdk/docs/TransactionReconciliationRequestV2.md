

# TransactionReconciliationRequestV2

Specification for the reconciliation request. Left and Right hand sides are constructed. Each consists of transactions from a portfolio  The results of this can then be compared to each other.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**left** | [**AggregatedTransactionsRequest**](AggregatedTransactionsRequest.md) |  |  |
|**right** | [**AggregatedTransactionsRequest**](AggregatedTransactionsRequest.md) |  |  |
|**leftToRightMapping** | [**List&lt;ReconciliationLeftRightAddressKeyPair&gt;**](ReconciliationLeftRightAddressKeyPair.md) | The mapping from property keys requested by left aggregation to property keys on right hand side |  [optional] |
|**comparisonRules** | [**List&lt;ReconciliationRule&gt;**](ReconciliationRule.md) | The set of rules to be used in comparing values. These are the rules that determine what constitutes a match.  The simplest is obviously an exact one-for-one comparison, but tolerances on numerical or date time values and  case-insensitive string comparison are supported amongst other types. |  [optional] |
|**preserveKeys** | **List&lt;String&gt;** | List of keys to preserve (from rhs) in the diff. Used in conjunction with filtering/grouping.  If two values are equal, for a given key then the value is elided from the results. Setting it here  will preserve it (takes the values from the RHS and puts it into the line by line results). |  [optional] |



