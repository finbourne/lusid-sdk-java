

# GroupByStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | The label of the compliance step |  |
|**groupedParameters** | **Map&lt;String, List&lt;ComplianceTemplateParameter&gt;&gt;** | Parameters required for the step. Some step types group parameters to differentiate between, for example, hard limit and warning threshold parameters |  |
|**complianceStepType** | [**ComplianceStepTypeEnum**](#ComplianceStepTypeEnum) | . The available values are: FilterStep, GroupByStep, GroupFilterStep, BranchStep, RecombineStep |  |



## Enum: ComplianceStepTypeEnum

| Name | Value |
|---- | -----|
| FILTERSTEP | &quot;FilterStep&quot; |
| GROUPBYSTEP | &quot;GroupByStep&quot; |
| GROUPFILTERSTEP | &quot;GroupFilterStep&quot; |
| BRANCHSTEP | &quot;BranchStep&quot; |
| RECOMBINESTEP | &quot;RecombineStep&quot; |



