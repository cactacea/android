
# PutFeedBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **kotlin.String** | A feed message will be posted. | 
**mediumIds** | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Medium identifiers of attached. |  [optional]
**tags** | **kotlin.Array&lt;kotlin.String&gt;** | Tags of feed. |  [optional]
**privacyType** | [**inline**](#PrivacyTypeEnum) | Channel privacy type. | 
**contentWarning** | **kotlin.Boolean** | Content warning. | 
**expiration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Expiration of a feed. |  [optional]


<a name="PrivacyTypeEnum"></a>
## Enum: privacyType
Name | Value
---- | -----
privacyType | everyone, followers, friends, self



