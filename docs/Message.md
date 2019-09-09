
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**channelId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**messageType** | [**inline**](#MessageTypeEnum) |  | 
**message** | **kotlin.String** |  |  [optional]
**medium** | [**Medium**](Medium.md) |  |  [optional]
**user** | [**User**](User.md) |  | 
**unread** | **kotlin.Boolean** |  | 
**userCount** | **kotlin.Long** |  | 
**readUserCount** | **kotlin.Long** |  | 
**warning** | **kotlin.Boolean** |  | 
**rejected** | **kotlin.Boolean** |  | 
**postedAt** | **kotlin.Long** |  | 
**next** | **kotlin.Long** |  | 


<a name="MessageTypeEnum"></a>
## Enum: messageType
Name | Value
---- | -----
messageType | text, medium, stamp, invited, joined, left



