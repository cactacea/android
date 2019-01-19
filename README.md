# io.swagger.client - Kotlin client library for Cactacea backend API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**block**](docs/AccountsApi.md#block) | **POST** /accounts/{id}/blocks | Block a account
*AccountsApi* | [**findDetail**](docs/AccountsApi.md#finddetail) | **GET** /accounts/{id} | Get information about a account
*AccountsApi* | [**findFeeds**](docs/AccountsApi.md#findfeeds) | **GET** /accounts/{id}/feeds | Get feeds list a account posted
*AccountsApi* | [**findFollowers**](docs/AccountsApi.md#findfollowers) | **GET** /accounts/{id}/followers | Get accounts list a account is followed by
*AccountsApi* | [**findFollowing**](docs/AccountsApi.md#findfollowing) | **GET** /accounts/{id}/following | Get accounts list a account following
*AccountsApi* | [**findFriends**](docs/AccountsApi.md#findfriends) | **GET** /accounts/{id}/friends | Get a account's friends list
*AccountsApi* | [**findGroup**](docs/AccountsApi.md#findgroup) | **GET** /accounts/{id}/group | Get a direct message group to a account
*AccountsApi* | [**findGroups**](docs/AccountsApi.md#findgroups) | **GET** /accounts/{id}/groups | Get groups list a account groupJoined
*AccountsApi* | [**findLikes**](docs/AccountsApi.md#findlikes) | **GET** /accounts/{id}/likes | Get account's liked feeds
*AccountsApi* | [**findStatus**](docs/AccountsApi.md#findstatus) | **GET** /accounts/{id}/status | Get account on
*AccountsApi* | [**follow**](docs/AccountsApi.md#follow) | **POST** /accounts/{id}/follow | Follow a account
*AccountsApi* | [**invite**](docs/AccountsApi.md#invite) | **POST** /accounts/{accountId}/groups/{groupId}/invitations | Create a groupInvitation to a account
*AccountsApi* | [**join**](docs/AccountsApi.md#join) | **POST** /accounts/{accountId}/groups/{groupId}/join | Join a account in a group
*AccountsApi* | [**leave**](docs/AccountsApi.md#leave) | **POST** /accounts/{accountId}/groups/{groupId}/leave | Leave a account from a group
*AccountsApi* | [**mute**](docs/AccountsApi.md#mute) | **POST** /accounts/{id}/mutes | Mute a account
*AccountsApi* | [**report**](docs/AccountsApi.md#report) | **POST** /accounts/{id}/reports | Report a account
*AccountsApi* | [**request**](docs/AccountsApi.md#request) | **POST** /accounts/{id}/requests | Create a friend request to a account
*AccountsApi* | [**unblock**](docs/AccountsApi.md#unblock) | **DELETE** /accounts/{id}/blocks | Unblock a account
*AccountsApi* | [**unfollow**](docs/AccountsApi.md#unfollow) | **DELETE** /accounts/{id}/follow | UnFollow a account
*AccountsApi* | [**unfriend**](docs/AccountsApi.md#unfriend) | **DELETE** /accounts/{id}/friends | Remove friendship to a account
*AccountsApi* | [**unmute**](docs/AccountsApi.md#unmute) | **DELETE** /accounts/{id}/mutes | Unmute a account
*AccountsApi* | [**unrequest**](docs/AccountsApi.md#unrequest) | **DELETE** /accounts/{id}/requests | Remove a friend request to a account
*AccountsApi* | [**updateDisplayName**](docs/AccountsApi.md#updatedisplayname) | **PUT** /accounts/{id}/display_name | Change display name to session account
*BlocksApi* | [**findBlockingAccounts**](docs/BlocksApi.md#findblockingaccounts) | **GET** /session/blocks | Get blocking accounts list
*CommentLikesApi* | [**findLikes**](docs/CommentLikesApi.md#findlikes) | **GET** /comments/{id}/likes | Get accounts list who liked on a comment
*CommentLikesApi* | [**like**](docs/CommentLikesApi.md#like) | **POST** /comments/{id}/likes | Set a like on a comment
*CommentLikesApi* | [**unlike**](docs/CommentLikesApi.md#unlike) | **DELETE** /comments/{id}/likes | Remove a like on a comment
*CommentsApi* | [**delete**](docs/CommentsApi.md#delete) | **DELETE** /comments/{id} | Remove a comment
*CommentsApi* | [**findComment**](docs/CommentsApi.md#findcomment) | **GET** /comments/{id} | Get basic information about a comment
*CommentsApi* | [**findComments**](docs/CommentsApi.md#findcomments) | **GET** /comments | Search comments
*CommentsApi* | [**post**](docs/CommentsApi.md#post) | **POST** /comments | Create a comment on a feed
*CommentsApi* | [**report**](docs/CommentsApi.md#report) | **POST** /comments/{id}/reports | Report a comment
*FeedLikesApi* | [**findLikes**](docs/FeedLikesApi.md#findlikes) | **GET** /feeds/{id}/likes | Get accounts list who set a like to a feed
*FeedLikesApi* | [**like**](docs/FeedLikesApi.md#like) | **POST** /feeds/{id}/likes | Set a like on a feed
*FeedLikesApi* | [**unlike**](docs/FeedLikesApi.md#unlike) | **DELETE** /feeds/{id}/likes | Remove a like on a feed
*FeedsApi* | [**delete**](docs/FeedsApi.md#delete) | **DELETE** /feeds/{id} | Delete a feed
*FeedsApi* | [**findFeed**](docs/FeedsApi.md#findfeed) | **GET** /feeds/{id} | Get basic information about a feed
*FeedsApi* | [**findFeeds**](docs/FeedsApi.md#findfeeds) | **GET** /feeds | Search feeds
*FeedsApi* | [**post**](docs/FeedsApi.md#post) | **POST** /feeds | Post a feed
*FeedsApi* | [**report**](docs/FeedsApi.md#report) | **POST** /feeds/{id}/reports | Report a feed
*FeedsApi* | [**update**](docs/FeedsApi.md#update) | **PUT** /feeds/{id} | Update a feed
*FriendRequestsApi* | [**accept**](docs/FriendRequestsApi.md#accept) | **POST** /requests/{id}/accept | Accept a friend request
*FriendRequestsApi* | [**reject**](docs/FriendRequestsApi.md#reject) | **POST** /requests/{id}/reject | Reject a friend request
*GroupsApi* | [**create**](docs/GroupsApi.md#create) | **POST** /groups | Create a group
*GroupsApi* | [**delete**](docs/GroupsApi.md#delete) | **DELETE** /groups/{id} | Hide a group and delete all messages
*GroupsApi* | [**findAccounts**](docs/GroupsApi.md#findaccounts) | **GET** /groups/{id}/accounts | Get accounts list of a group
*GroupsApi* | [**findGroup**](docs/GroupsApi.md#findgroup) | **GET** /groups/{id} | Get basic information about a group
*GroupsApi* | [**findGroups**](docs/GroupsApi.md#findgroups) | **GET** /groups | Search groups
*GroupsApi* | [**hide**](docs/GroupsApi.md#hide) | **POST** /groups/{id}/hides | Hide a group
*GroupsApi* | [**join**](docs/GroupsApi.md#join) | **POST** /groups/{id}/join | Join to a group,
*GroupsApi* | [**leave**](docs/GroupsApi.md#leave) | **POST** /groups/{id}/leave | Leave from a group
*GroupsApi* | [**report**](docs/GroupsApi.md#report) | **POST** /groups/{id}/reports | Report a group
*GroupsApi* | [**show**](docs/GroupsApi.md#show) | **DELETE** /groups/{id}/hides | Show a group
*GroupsApi* | [**update**](docs/GroupsApi.md#update) | **PUT** /groups/{id} | Update a group
*InvitationsApi* | [**accept**](docs/InvitationsApi.md#accept) | **POST** /invitations/{id}/accept | Accept a groupInvitation
*InvitationsApi* | [**create**](docs/InvitationsApi.md#create) | **POST** /groups/{id}/invitations | Post a groupInvitation to some accounts
*InvitationsApi* | [**reject**](docs/InvitationsApi.md#reject) | **POST** /invitations/{id}/reject | Reject a groupInvitation
*MediumsApi* | [**delete**](docs/MediumsApi.md#delete) | **DELETE** /mediums/{id} | Delete a medium
*MediumsApi* | [**findMedium**](docs/MediumsApi.md#findmedium) | **GET** /mediums/:* | Get a medium
*MediumsApi* | [**upload**](docs/MediumsApi.md#upload) | **POST** /mediums | Upload a medium
*MessagesApi* | [**delete**](docs/MessagesApi.md#delete) | **DELETE** /messages | Delete messages form a group
*MessagesApi* | [**findMessages**](docs/MessagesApi.md#findmessages) | **GET** /messages | Search messages
*MessagesApi* | [**postMedium**](docs/MessagesApi.md#postmedium) | **POST** /messages/medium | Send a medium to a group
*MessagesApi* | [**postText**](docs/MessagesApi.md#posttext) | **POST** /messages/text | Send a text to a group
*SessionApi* | [**deleteProfileImage**](docs/SessionApi.md#deleteprofileimage) | **DELETE** /session/profile_image | Remove the profile image
*SessionApi* | [**existAccountName**](docs/SessionApi.md#existaccountname) | **GET** /session/account_name/{accountName} | Confirm account name exist
*SessionApi* | [**findAccounts**](docs/SessionApi.md#findaccounts) | **GET** /session/accounts | Search accounts
*SessionApi* | [**findFeeds**](docs/SessionApi.md#findfeeds) | **GET** /session/feeds | Get feeds list session account posted
*SessionApi* | [**findFollowers**](docs/SessionApi.md#findfollowers) | **GET** /session/followers | Get accounts list session account is followed by
*SessionApi* | [**findFollowing**](docs/SessionApi.md#findfollowing) | **GET** /session/following | Get accounts list session account followed
*SessionApi* | [**findFriendRequests**](docs/SessionApi.md#findfriendrequests) | **GET** /session/requests | Get friend requests list session account created or received
*SessionApi* | [**findFriends**](docs/SessionApi.md#findfriends) | **GET** /session/friends | Get friends list
*SessionApi* | [**findGroupInvitations**](docs/SessionApi.md#findgroupinvitations) | **GET** /session/invitations | Get invitations list session account received
*SessionApi* | [**findGroups**](docs/SessionApi.md#findgroups) | **GET** /session/groups | Get groups list session account groupJoined
*SessionApi* | [**findHiddenGroups**](docs/SessionApi.md#findhiddengroups) | **GET** /session/hides | Get hidden groups list session account groupJoined
*SessionApi* | [**findLikes**](docs/SessionApi.md#findlikes) | **GET** /session/likes | Get feeds list session account set a like
*SessionApi* | [**findMutingAccounts**](docs/SessionApi.md#findmutingaccounts) | **GET** /session/mutes | Get accounts list session account muted
*SessionApi* | [**findSession**](docs/SessionApi.md#findsession) | **GET** /session | Get basic information about session account
*SessionApi* | [**signOut**](docs/SessionApi.md#signout) | **DELETE** /session | Sign out
*SessionApi* | [**updateAccountName**](docs/SessionApi.md#updateaccountname) | **PUT** /session/account_name | Update the account name
*SessionApi* | [**updatePassword**](docs/SessionApi.md#updatepassword) | **PUT** /session/password | Update the password
*SessionApi* | [**updateProfile**](docs/SessionApi.md#updateprofile) | **PUT** /session/profile | Update the profile
*SessionApi* | [**updateProfileImage**](docs/SessionApi.md#updateprofileimage) | **PUT** /session/profile_image | Update the profile image
*SessionsApi* | [**signIn**](docs/SessionsApi.md#signin) | **GET** /sessions | Sign in
*SessionsApi* | [**signUp**](docs/SessionsApi.md#signup) | **POST** /sessions | Sign up
*SettingsApi* | [**findPushNotificationSettings**](docs/SettingsApi.md#findpushnotificationsettings) | **GET** /session/push_notification | Get push notification settings
*SettingsApi* | [**updateDeviceStatus**](docs/SettingsApi.md#updatedevicestatus) | **POST** /session/status | Update device status
*SettingsApi* | [**updatePushNotificationSettings**](docs/SettingsApi.md#updatepushnotificationsettings) | **PUT** /session/push_notification | Update ths push notification settings
*SettingsApi* | [**updatePushToken**](docs/SettingsApi.md#updatepushtoken) | **POST** /session/push_token | Update device push token
*SystemApi* | [**pingGet**](docs/SystemApi.md#pingget) | **GET** /ping | Health checking


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.github.cactacea.backend.Account](docs/Account.md)
 - [io.github.cactacea.backend.AccountDetail](docs/AccountDetail.md)
 - [io.github.cactacea.backend.AccountId](docs/AccountId.md)
 - [io.github.cactacea.backend.AccountNameNotExists](docs/AccountNameNotExists.md)
 - [io.github.cactacea.backend.AccountStatus](docs/AccountStatus.md)
 - [io.github.cactacea.backend.Authentication](docs/Authentication.md)
 - [io.github.cactacea.backend.CactaceaError](docs/CactaceaError.md)
 - [io.github.cactacea.backend.CactaceaErrors](docs/CactaceaErrors.md)
 - [io.github.cactacea.backend.Comment](docs/Comment.md)
 - [io.github.cactacea.backend.CommentCreated](docs/CommentCreated.md)
 - [io.github.cactacea.backend.CommentId](docs/CommentId.md)
 - [io.github.cactacea.backend.DeleteMessagesBody](docs/DeleteMessagesBody.md)
 - [io.github.cactacea.backend.Feed](docs/Feed.md)
 - [io.github.cactacea.backend.FeedCreated](docs/FeedCreated.md)
 - [io.github.cactacea.backend.FeedId](docs/FeedId.md)
 - [io.github.cactacea.backend.FriendRequest](docs/FriendRequest.md)
 - [io.github.cactacea.backend.FriendRequestCreated](docs/FriendRequestCreated.md)
 - [io.github.cactacea.backend.FriendRequestId](docs/FriendRequestId.md)
 - [io.github.cactacea.backend.Group](docs/Group.md)
 - [io.github.cactacea.backend.GroupCreated](docs/GroupCreated.md)
 - [io.github.cactacea.backend.GroupId](docs/GroupId.md)
 - [io.github.cactacea.backend.GroupInvitation](docs/GroupInvitation.md)
 - [io.github.cactacea.backend.GroupInvitationId](docs/GroupInvitationId.md)
 - [io.github.cactacea.backend.InvitationCreated](docs/InvitationCreated.md)
 - [io.github.cactacea.backend.Medium](docs/Medium.md)
 - [io.github.cactacea.backend.MediumCreated](docs/MediumCreated.md)
 - [io.github.cactacea.backend.MediumId](docs/MediumId.md)
 - [io.github.cactacea.backend.Message](docs/Message.md)
 - [io.github.cactacea.backend.PostAccountReportBody](docs/PostAccountReportBody.md)
 - [io.github.cactacea.backend.PostActiveStatusBody](docs/PostActiveStatusBody.md)
 - [io.github.cactacea.backend.PostCommentBody](docs/PostCommentBody.md)
 - [io.github.cactacea.backend.PostCommentReportBody](docs/PostCommentReportBody.md)
 - [io.github.cactacea.backend.PostDevicePushTokenBody](docs/PostDevicePushTokenBody.md)
 - [io.github.cactacea.backend.PostFeedBody](docs/PostFeedBody.md)
 - [io.github.cactacea.backend.PostFeedReportBody](docs/PostFeedReportBody.md)
 - [io.github.cactacea.backend.PostGroupBody](docs/PostGroupBody.md)
 - [io.github.cactacea.backend.PostGroupReportBody](docs/PostGroupReportBody.md)
 - [io.github.cactacea.backend.PostInvitationAccountsBody](docs/PostInvitationAccountsBody.md)
 - [io.github.cactacea.backend.PostMediumBody](docs/PostMediumBody.md)
 - [io.github.cactacea.backend.PostSignUpBody](docs/PostSignUpBody.md)
 - [io.github.cactacea.backend.PostTextBody](docs/PostTextBody.md)
 - [io.github.cactacea.backend.PushNotificationSetting](docs/PushNotificationSetting.md)
 - [io.github.cactacea.backend.PutAccountDisplayNameBody](docs/PutAccountDisplayNameBody.md)
 - [io.github.cactacea.backend.PutFeedBody](docs/PutFeedBody.md)
 - [io.github.cactacea.backend.PutGroupBody](docs/PutGroupBody.md)
 - [io.github.cactacea.backend.PutNotificationSettingBody](docs/PutNotificationSettingBody.md)
 - [io.github.cactacea.backend.PutSessionAccountNameBody](docs/PutSessionAccountNameBody.md)
 - [io.github.cactacea.backend.PutSessionPasswordBody](docs/PutSessionPasswordBody.md)
 - [io.github.cactacea.backend.PutSessionProfileBody](docs/PutSessionProfileBody.md)
 - [io.github.cactacea.backend.PutSessionProfileImageBody](docs/PutSessionProfileImageBody.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header

<a name="authorization"></a>
### authorization

- **Type**: API key
- **API key parameter name**: X-AUTHORIZATION
- **Location**: HTTP header

<a name="cactacea_auth"></a>
### cactacea_auth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: http://localhost:9000/oauth2/authorization
- **Scopes**: 
  - messages: to post and delete messages on a user&#39;s behalf
  - feed_likes: to like and unlike feed on a user’s behalf
  - follower_list: to read the list of followers and followed-by users
  - groups: to create and delete groups on a user&#39;s behalf
  - relationships: to following and unfollow accounts on a user’s behalf
  - reports: to report account, feed, group and comment on a user’s behalf
  - group_invitations: to create, delete, accept and reject invitations on a user&#39;s behalf
  - media: to create and delete media on a user’s behalf
  - comment_likes: to like and unlike comment on a user’s behalf
  - basic: to read a user’s profile info and media
  - friend_requests: to create and delete friend request on a user’s behalf
  - feeds: to post and delete feeds on a user’s behalf
  - comments: to post and delete comments on a user’s behalf

