
# PutGroupBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Group name. | 
**by_invitation_only** | **kotlin.Boolean** | Only invited accounts can join in. | 
**privacy_type** | [**inline**](#Privacy_typeEnum) | Which accounts can join in. | 
**authority_type** | [**inline**](#Authority_typeEnum) | Which accounts can manage a group. | 


<a name="Privacy_typeEnum"></a>
## Enum: privacy_type
Name | Value
---- | -----
privacy_type | everyone, follows, followers, friends


<a name="Authority_typeEnum"></a>
## Enum: authority_type
Name | Value
---- | -----
authority_type | owner, member



