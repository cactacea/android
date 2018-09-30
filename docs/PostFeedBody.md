
# PostFeedBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **kotlin.String** | A feed message will be posted. |  [optional]
**medium_ids** | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Medium identifiers of attached. |  [optional]
**tags** | **kotlin.Array&lt;kotlin.String&gt;** | Tags of feed. |  [optional]
**privacy_type** | [**inline**](#Privacy_typeEnum) | Feed privacy type. |  [optional]
**content_warning** | **kotlin.Boolean** | Content warning. |  [optional]
**expiration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Expiration of a feed. |  [optional]


<a name="Privacy_typeEnum"></a>
## Enum: privacy_type
Name | Value
---- | -----
privacy_type | everyone, followers, friends, self



