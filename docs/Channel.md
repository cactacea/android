
# Channel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**name** | **kotlin.String** |  |  [optional]
**message** | [**Message**](Message.md) |  |  [optional]
**invitationOnly** | **kotlin.Boolean** |  | 
**privacyType** | [**inline**](#PrivacyTypeEnum) |  | 
**authorityType** | [**inline**](#AuthorityTypeEnum) |  | 
**userCount** | **kotlin.Long** |  | 
**lastPostedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**organizedAt** | **kotlin.Long** |  | 
**next** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]


<a name="PrivacyTypeEnum"></a>
## Enum: privacyType
Name | Value
---- | -----
privacyType | everyone, follows, followers, friends


<a name="AuthorityTypeEnum"></a>
## Enum: authorityType
Name | Value
---- | -----
authorityType | organizer, member



