
# PutGroupBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Group name. |  [optional]
**by_invitation_only** | **kotlin.Boolean** | Only invited accounts can join in. |  [optional]
**privacy_type** | [**inline**](#Privacy_typeEnum) | Which accounts can join in. |  [optional]
**authority_type** | [**inline**](#Authority_typeEnum) | Which accounts can manage this group. |  [optional]


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



