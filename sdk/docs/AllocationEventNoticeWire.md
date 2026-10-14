# com.finbourne.lusid.model.AllocationEventNoticeWire
Wire instructions for the payment a notice asks for or announces, from the investor record's payment  instructions. Absent when the investor record holds none.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **String** | The name of the bank. | [optional] [default to String]
**accountName** | **String** | The name on the account. | [optional] [default to String]
**accountNumber** | **String** | The account number or IBAN. | [optional] [default to String]
**bic** | **String** | The bank identifier code. | [optional] [default to String]
**reference** | **String** | The payment reference. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventNoticeWire;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String BankName = "example BankName";
@jakarta.annotation.Nullable String AccountName = "example AccountName";
@jakarta.annotation.Nullable String AccountNumber = "example AccountNumber";
@jakarta.annotation.Nullable String Bic = "example Bic";
@jakarta.annotation.Nullable String Reference = "example Reference";


AllocationEventNoticeWire allocationEventNoticeWireInstance = new AllocationEventNoticeWire()
    .BankName(BankName)
    .AccountName(AccountName)
    .AccountNumber(AccountNumber)
    .Bic(Bic)
    .Reference(Reference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
