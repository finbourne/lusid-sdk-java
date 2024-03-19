

# FxSwap

LUSID representation of an FX Swap. Composed of two FX Forwards.     This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | FarDomesticLeg | Cash flows in the domestic currency for the far forward. |  | 2 | FarForeignLeg | Cash flows in the foreign currency for the far forward (not present for non-deliverable forwards). |  | 3 | NearDomesticLeg | Cash flows in the domestic currency for the near forward. |  | 4 | NearForeignLeg | Cash flows in the foreign currency for the near forward (not present for non-deliverable forwards). |

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nearFxForward** | [**FxForward**](FxForward.md) |  |  |
|**farFxForward** | [**FxForward**](FxForward.md) |  |  |
|**notionalSymmetry** | **String** | The NotionalSymmetry allows for even and uneven FxSwaps to be supported.  An even FxSwap is one where the near and far fx forwards have the same notional value on at least one of the  legs. An uneven FxSwap is one where near and far fx forwards don&#39;t have the same notional on both the  domestic and foreign legs.  By default NotionalSymmetry will be set as even.    Supported string (enumeration) values are: [Even, Uneven]. |  [optional] |



