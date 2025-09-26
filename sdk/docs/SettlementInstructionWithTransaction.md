# com.finbourne.lusid.model.SettlementInstructionWithTransaction
A Settlement Instruction with its Matched Transaction (if any)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstruction** | [**TransactionSettlementInstruction**](TransactionSettlementInstruction.md) |  | [optional] [default to TransactionSettlementInstruction]
**matchedTransaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]

```java
import com.finbourne.lusid.model.SettlementInstructionWithTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

TransactionSettlementInstruction SettlementInstruction = new TransactionSettlementInstruction();
OutputTransaction MatchedTransaction = new OutputTransaction();


SettlementInstructionWithTransaction settlementInstructionWithTransactionInstance = new SettlementInstructionWithTransaction()
    .SettlementInstruction(SettlementInstruction)
    .MatchedTransaction(MatchedTransaction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
