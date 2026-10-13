# com.finbourne.lusid.model.AllocationPostingFundLine
One transaction a booking writes on the fund's own books.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the posting: the booking reference, investor record, commitment line, component and side. | [optional] [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionType** | **String** | The transaction type written on the fund side, for instance PA.ContributionCalled. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount posted, in the event currency. | [optional] [default to java.math.BigDecimal]
**component** | **String** | The component of the event the posting carries. | [optional] [default to String]
**investorRecordId** | **String** | The investor record the posting is for. | [optional] [default to String]
**viaVehicle** | **String** | The vehicle the investor&#39;s share reached the fund through, when it did not come direct. | [optional] [default to String]
**admissionVehicle** | **String** | The vehicle the investor was admitted to. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationPostingFundLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
ResourceId Portfolio = new ResourceId();
@jakarta.annotation.Nullable String TransactionType = "example TransactionType";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Component = "example Component";
@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
@jakarta.annotation.Nullable String ViaVehicle = "example ViaVehicle";
@jakarta.annotation.Nullable String AdmissionVehicle = "example AdmissionVehicle";


AllocationPostingFundLine allocationPostingFundLineInstance = new AllocationPostingFundLine()
    .Id(Id)
    .Portfolio(Portfolio)
    .TransactionType(TransactionType)
    .Amount(Amount)
    .Component(Component)
    .InvestorRecordId(InvestorRecordId)
    .ViaVehicle(ViaVehicle)
    .AdmissionVehicle(AdmissionVehicle);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
