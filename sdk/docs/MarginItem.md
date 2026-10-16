# com.finbourne.lusid.model.MarginItem
One margin arrangement under an agreement, either variation or initial.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The stable key that margin calls and custodian accounts refer to this item by. Unique across the agreement&#39;s variation and initial margin. | [default to String]
**tradeFilter** | **String** | A filter selecting the trades this item covers. Required where the agreement has more than one margin item. | [optional] [default to String]
**settlement** | **String** | Whether margin is settled (Settled) or collateralised (Collateral). Optional. Available values: Collateral, Settled. | [optional] [default to String]
**legalMechanism** | **String** | How title to posted collateral is held. One of TitleTransfer or SecurityInterest. Optional. Available values: TitleTransfer, SecurityInterest. | [optional] [default to String]
**wePost** | [**PartyTerms**](PartyTerms.md) |  | [default to PartyTerms]
**theyPost** | [**PartyTerms**](PartyTerms.md) |  | [default to PartyTerms]
**eligibleCollateral** | [**EligibleCollateralReferences**](EligibleCollateralReferences.md) |  | [optional] [default to EligibleCollateralReferences]
**calculation** | [**MarginCalculation**](MarginCalculation.md) |  | [default to MarginCalculation]
**marginAccounts** | [**MarginAccounts**](MarginAccounts.md) |  | [optional] [default to MarginAccounts]

```java
import com.finbourne.lusid.model.MarginItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String TradeFilter = "example TradeFilter";
@jakarta.annotation.Nullable String Settlement = "example Settlement";
@jakarta.annotation.Nullable String LegalMechanism = "example LegalMechanism";
PartyTerms WePost = new PartyTerms();
PartyTerms TheyPost = new PartyTerms();
EligibleCollateralReferences EligibleCollateral = new EligibleCollateralReferences();
MarginCalculation Calculation = new MarginCalculation();
MarginAccounts MarginAccounts = new MarginAccounts();


MarginItem marginItemInstance = new MarginItem()
    .Code(Code)
    .TradeFilter(TradeFilter)
    .Settlement(Settlement)
    .LegalMechanism(LegalMechanism)
    .WePost(WePost)
    .TheyPost(TheyPost)
    .EligibleCollateral(EligibleCollateral)
    .Calculation(Calculation)
    .MarginAccounts(MarginAccounts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
