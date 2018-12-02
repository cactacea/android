
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**messageType** | [**inline**](#MessageTypeEnum) |  | 
**message** | **kotlin.String** |  |  [optional]
**medium** | [**Medium**](Medium.md) |  |  [optional]
**account** | [**Account**](Account.md) |  |  [optional]
**unread** | **kotlin.Boolean** |  | 
**accountCount** | **kotlin.Long** |  | 
**readAccountCount** | **kotlin.Long** |  | 
**contentWarning** | **kotlin.Boolean** |  | 
**contentDeleted** | **kotlin.Boolean** |  | 
**postedAt** | **kotlin.Long** |  | 
**next** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]


<a name="MessageTypeEnum"></a>
## Enum: messageType
Name | Value
---- | -----
messageType | text, medium, stamp, invitation, joined, left



