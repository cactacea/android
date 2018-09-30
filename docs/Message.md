
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**messageType** | [**inline**](#MessageTypeEnum) |  | 
**message** | **kotlin.String** |  |  [optional]
**medium** | [**Medium**](Medium.md) |  |  [optional]
**by** | [**Account**](Account.md) |  | 
**account** | [**Account**](Account.md) |  |  [optional]
**unread** | **kotlin.Boolean** |  | 
**accountCount** | **kotlin.Long** |  | 
**readAccountCount** | **kotlin.Long** |  | 
**contentWarning** | **kotlin.Boolean** |  | 
**contentDeleted** | **kotlin.Boolean** |  | 
**postedAt** | **kotlin.Long** |  | 


<a name="MessageTypeEnum"></a>
## Enum: messageType
Name | Value
---- | -----
messageType | text, medium, stamp, invitation, joined, left



