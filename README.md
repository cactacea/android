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
*AccountsApi* | [**existAccountName**](docs/AccountsApi.md#existaccountname) | **GET** /account/{account_name} | Confirm account name exist
*AccountsApi* | [**findAccount**](docs/AccountsApi.md#findaccount) | **GET** /accounts/{id} | Get information about this account
*AccountsApi* | [**findAccountStatus**](docs/AccountsApi.md#findaccountstatus) | **GET** /accounts/{id}/status | Get account on
*AccountsApi* | [**findAccounts**](docs/AccountsApi.md#findaccounts) | **GET** /accounts | Search accounts
*AccountsApi* | [**reportAccount**](docs/AccountsApi.md#reportaccount) | **POST** /accounts/{id}/reports | Report this account
*AccountsApi* | [**updateDisplayName**](docs/AccountsApi.md#updatedisplayname) | **PUT** /accounts/{id}/display_name | Change display name to session account
*BlocksApi* | [**block**](docs/BlocksApi.md#block) | **POST** /accounts/{id}/blocks | Block a account
*BlocksApi* | [**findBlockingAccounts**](docs/BlocksApi.md#findblockingaccounts) | **GET** /session/blocks | Get blocking accounts list
*BlocksApi* | [**unblock**](docs/BlocksApi.md#unblock) | **DELETE** /accounts/{id}/blocks | Unblock a account
*CommentsApi* | [**deleteComment**](docs/CommentsApi.md#deletecomment) | **DELETE** /comments/{id} | Remove a comment
*CommentsApi* | [**findComment**](docs/CommentsApi.md#findcomment) | **GET** /comments/{id} | Get basic information about this comment
*CommentsApi* | [**findComments**](docs/CommentsApi.md#findcomments) | **GET** /comments | Search comments
*CommentsApi* | [**postComment**](docs/CommentsApi.md#postcomment) | **POST** /comments | Create a comment on a feed
*CommentsApi* | [**reportComment**](docs/CommentsApi.md#reportcomment) | **POST** /comments/{id}/reports | Report this comment
*FeedsApi* | [**deleteFeed**](docs/FeedsApi.md#deletefeed) | **DELETE** /feeds/{id} | Delete this feed
*FeedsApi* | [**findAccountFeeds**](docs/FeedsApi.md#findaccountfeeds) | **GET** /accounts/{id}/feeds | Get feeds list this account posted
*FeedsApi* | [**findAccountLikes**](docs/FeedsApi.md#findaccountlikes) | **GET** /accounts/{id}/likes | Get account's liked feeds
*FeedsApi* | [**findFeed**](docs/FeedsApi.md#findfeed) | **GET** /feeds/{id} | Get basic information about this feed
*FeedsApi* | [**findFeeds**](docs/FeedsApi.md#findfeeds) | **GET** /feeds | Search feeds
*FeedsApi* | [**postFeed**](docs/FeedsApi.md#postfeed) | **POST** /feeds | Post a feed
*FeedsApi* | [**reportFeed**](docs/FeedsApi.md#reportfeed) | **POST** /feeds/{id}/reports | Report this feed
*FeedsApi* | [**updateFeed**](docs/FeedsApi.md#updatefeed) | **PUT** /feeds/{id} | Update this feed
*FollowsApi* | [**findAccountFollowers**](docs/FollowsApi.md#findaccountfollowers) | **GET** /accounts/{id}/followers | Get accounts list this account is followed by
*FollowsApi* | [**findFollows**](docs/FollowsApi.md#findfollows) | **GET** /accounts/{id}/follows | Get accounts list this user followed
*FollowsApi* | [**follow**](docs/FollowsApi.md#follow) | **POST** /accounts/{id}/follows | Follow this account
*FollowsApi* | [**unfollow**](docs/FollowsApi.md#unfollow) | **DELETE** /accounts/{id}/follows | UnFollow this account
*FriendsApi* | [**deleteFriend**](docs/FriendsApi.md#deletefriend) | **DELETE** /accounts/{id}/friends | Remove friendship to this account
*FriendsApi* | [**findAccountFriends**](docs/FriendsApi.md#findaccountfriends) | **GET** /accounts/{id}/friends | Get this account's friends list
*GroupsApi* | [**createGroup**](docs/GroupsApi.md#creategroup) | **POST** /groups | Create a group
*GroupsApi* | [**deleteGroup**](docs/GroupsApi.md#deletegroup) | **DELETE** /groups/{id} | Hide this group and delete all messages
*GroupsApi* | [**findAccountGroup**](docs/GroupsApi.md#findaccountgroup) | **GET** /accounts/{id}/group | Get a direct message group to this account
*GroupsApi* | [**findAccountGroups**](docs/GroupsApi.md#findaccountgroups) | **GET** /accounts/{id}/groups | Get groups list this account joined
*GroupsApi* | [**findGroup**](docs/GroupsApi.md#findgroup) | **GET** /groups/{id} | Get basic information about this group
*GroupsApi* | [**findGroupAccounts**](docs/GroupsApi.md#findgroupaccounts) | **GET** /groups/{id}/accounts | Get accounts list of this group
*GroupsApi* | [**findGroups**](docs/GroupsApi.md#findgroups) | **GET** /groups | Search groups
*GroupsApi* | [**findSessionGroups**](docs/GroupsApi.md#findsessiongroups) | **GET** /session/groups | Get groups list session account joined
*GroupsApi* | [**findSessionHides**](docs/GroupsApi.md#findsessionhides) | **GET** /session/hides | Get hidden groups list session account joined
*GroupsApi* | [**hideGroup**](docs/GroupsApi.md#hidegroup) | **POST** /groups/{id}/hides | Hide this group
*GroupsApi* | [**joinAccountToGroup**](docs/GroupsApi.md#joinaccounttogroup) | **POST** /accounts/{account_id}/groups/{group_id}/join | Join this account in this group
*GroupsApi* | [**joinToGroup**](docs/GroupsApi.md#jointogroup) | **POST** /groups/{id}/join | Join to this group,
*GroupsApi* | [**leaveAccountFromGroup**](docs/GroupsApi.md#leaveaccountfromgroup) | **POST** /accounts/{account_id}/groups/{group_id}/leave | Leave this account from this group
*GroupsApi* | [**leaveFromGroup**](docs/GroupsApi.md#leavefromgroup) | **POST** /groups/{id}/leave | Leave from this group
*GroupsApi* | [**reportGroup**](docs/GroupsApi.md#reportgroup) | **POST** /groups/{id}/reports | Report this group
*GroupsApi* | [**showGroup**](docs/GroupsApi.md#showgroup) | **DELETE** /groups/{id}/hides | Show this group
*GroupsApi* | [**updateGroup**](docs/GroupsApi.md#updategroup) | **PUT** /groups/{id} | Update this group
*InvitationsApi* | [**acceptGroupInvitation**](docs/InvitationsApi.md#acceptgroupinvitation) | **POST** /invitations/{id}/accept | Accept a invitation
*InvitationsApi* | [**createGroupInvitationToAccount**](docs/InvitationsApi.md#creategroupinvitationtoaccount) | **POST** /accounts/{account_id}/groups/{group_id}/invitations | Create a invitation to this account
*InvitationsApi* | [**createGroupInvitationToAccounts**](docs/InvitationsApi.md#creategroupinvitationtoaccounts) | **POST** /groups/{id}/invitations | Post a invitation to some accounts
*InvitationsApi* | [**findSessionGroupInvitations**](docs/InvitationsApi.md#findsessiongroupinvitations) | **GET** /session/invitations | Get invitations list session account received
*InvitationsApi* | [**rejectGroupInvitation**](docs/InvitationsApi.md#rejectgroupinvitation) | **POST** /invitations/{id}/reject | Reject a invitation
*MediumsApi* | [**deleteMedium**](docs/MediumsApi.md#deletemedium) | **DELETE** /mediums/{id} | Delete this medium
*MediumsApi* | [**uploadMedium**](docs/MediumsApi.md#uploadmedium) | **POST** /mediums | Upload a medium
*MessagesApi* | [**deleteMessage**](docs/MessagesApi.md#deletemessage) | **DELETE** /messages | Delete messages form a group
*MessagesApi* | [**findMessages**](docs/MessagesApi.md#findmessages) | **GET** /messages | Search messages
*MessagesApi* | [**postMessage**](docs/MessagesApi.md#postmessage) | **POST** /messages | Post a message to a group
*MutesApi* | [**findSessionMutes**](docs/MutesApi.md#findsessionmutes) | **GET** /session/mutes | Get accounts list session account muted
*MutesApi* | [**muteAccount**](docs/MutesApi.md#muteaccount) | **POST** /accounts/{id}/mutes | Mute this account
*MutesApi* | [**unmuteAccount**](docs/MutesApi.md#unmuteaccount) | **DELETE** /accounts/{id}/mutes | UnMute this account
*RequestsApi* | [**accept**](docs/RequestsApi.md#accept) | **POST** /session/requests/{id}/accept | Accept a friend request
*RequestsApi* | [**createFriendRequest**](docs/RequestsApi.md#createfriendrequest) | **POST** /accounts/{id}/requests | Create a friend request to this account
*RequestsApi* | [**deleteRequest**](docs/RequestsApi.md#deleterequest) | **DELETE** /accounts/{id}/requests | Remove a friend request to this account
*RequestsApi* | [**findSessionFriendRequests**](docs/RequestsApi.md#findsessionfriendrequests) | **GET** /session/requests | Get friend requests list session account created or received
*RequestsApi* | [**reject**](docs/RequestsApi.md#reject) | **POST** /session/requests/{id}/reject | Reject a friend request
*SessionApi* | [**deleteSessionProfileImage**](docs/SessionApi.md#deletesessionprofileimage) | **DELETE** /session/profile_image | Remove the profile image
*SessionApi* | [**findSession**](docs/SessionApi.md#findsession) | **GET** /session | Get basic information about session account
*SessionApi* | [**findSessionFeeds**](docs/SessionApi.md#findsessionfeeds) | **GET** /session/feeds | Get feeds list session account posted
*SessionApi* | [**findSessionFollowers**](docs/SessionApi.md#findsessionfollowers) | **GET** /session/followers | Get accounts list session account is followed by
*SessionApi* | [**findSessionFollows**](docs/SessionApi.md#findsessionfollows) | **GET** /session/follows | Get accounts list session account followed
*SessionApi* | [**findSessionFriends**](docs/SessionApi.md#findsessionfriends) | **GET** /session/friends | Get friends list
*SessionApi* | [**findSessionLikes**](docs/SessionApi.md#findsessionlikes) | **GET** /session/likes | Get feeds list session account set a like
*SessionApi* | [**signOut**](docs/SessionApi.md#signout) | **DELETE** /session | Sign out
*SessionApi* | [**updateSessionAccountName**](docs/SessionApi.md#updatesessionaccountname) | **PUT** /session/account_name | Update the account name
*SessionApi* | [**updateSessionPassword**](docs/SessionApi.md#updatesessionpassword) | **PUT** /session/password | Update the password
*SessionApi* | [**updateSessionProfile**](docs/SessionApi.md#updatesessionprofile) | **PUT** /session/profile | Update the profile
*SessionApi* | [**updateSessionProfileImage**](docs/SessionApi.md#updatesessionprofileimage) | **PUT** /session/profile_image | Update the profile image
*SessionsApi* | [**signIn**](docs/SessionsApi.md#signin) | **GET** /sessions | Sign in
*SessionsApi* | [**signUp**](docs/SessionsApi.md#signup) | **POST** /sessions | Sign up
*SettingsApi* | [**findSessionPushNotificationSettings**](docs/SettingsApi.md#findsessionpushnotificationsettings) | **GET** /session/push_notification | Get this push notification settings
*SettingsApi* | [**updateSessionDeviceStatus**](docs/SettingsApi.md#updatesessiondevicestatus) | **POST** /session/status | Update device status
*SettingsApi* | [**updateSessionPushNotificationSettings**](docs/SettingsApi.md#updatesessionpushnotificationsettings) | **PUT** /session/push_notification | Update ths push notification settings
*SettingsApi* | [**updateSessionPushToken**](docs/SettingsApi.md#updatesessionpushtoken) | **POST** /session/push_token | Update device push token
*SocialAccountsApi* | [**connect**](docs/SocialAccountsApi.md#connect) | **POST** /social_accounts | Connect to social account
*SocialAccountsApi* | [**disconnect**](docs/SocialAccountsApi.md#disconnect) | **DELETE** /social_accounts | Disconnect from social account
*SocialAccountsApi* | [**findSessionSocialAccounts**](docs/SocialAccountsApi.md#findsessionsocialaccounts) | **GET** /social_accounts | Get status abount social accounts
*SocialAccountsApi* | [**issueCode**](docs/SocialAccountsApi.md#issuecode) | **GET** /sessions/social_accounts/issue_code | Issue authentication code.
*SocialAccountsApi* | [**socialSignIn**](docs/SocialAccountsApi.md#socialsignin) | **GET** /sessions/social_accounts | Sign in by social accounts
*SocialAccountsApi* | [**socialSignUp**](docs/SocialAccountsApi.md#socialsignup) | **POST** /sessions/social_accounts | Sign up by social accounts
*SystemApi* | [**pingGet**](docs/SystemApi.md#pingget) | **GET** /ping | Health checking


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.github.cactacea.backend.Account](docs/Account.md)
 - [io.github.cactacea.backend.AccountId](docs/AccountId.md)
 - [io.github.cactacea.backend.AccountNameNotExists](docs/AccountNameNotExists.md)
 - [io.github.cactacea.backend.AccountStatus](docs/AccountStatus.md)
 - [io.github.cactacea.backend.Authentication](docs/Authentication.md)
 - [io.github.cactacea.backend.BadRequest](docs/BadRequest.md)
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
 - [io.github.cactacea.backend.GetAuthenticationCodeBody](docs/GetAuthenticationCodeBody.md)
 - [io.github.cactacea.backend.GetFeedsBody](docs/GetFeedsBody.md)
 - [io.github.cactacea.backend.GetSocialAccountSignInBody](docs/GetSocialAccountSignInBody.md)
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
 - [io.github.cactacea.backend.MessageCreated](docs/MessageCreated.md)
 - [io.github.cactacea.backend.NotFound](docs/NotFound.md)
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
 - [io.github.cactacea.backend.PostMessageBody](docs/PostMessageBody.md)
 - [io.github.cactacea.backend.PostSignUpBody](docs/PostSignUpBody.md)
 - [io.github.cactacea.backend.PostSocialAccountBody](docs/PostSocialAccountBody.md)
 - [io.github.cactacea.backend.PostSocialAccountSignUpBody](docs/PostSocialAccountSignUpBody.md)
 - [io.github.cactacea.backend.PushNotificationSetting](docs/PushNotificationSetting.md)
 - [io.github.cactacea.backend.PutAccountDisplayNameBody](docs/PutAccountDisplayNameBody.md)
 - [io.github.cactacea.backend.PutFeedBody](docs/PutFeedBody.md)
 - [io.github.cactacea.backend.PutGroupBody](docs/PutGroupBody.md)
 - [io.github.cactacea.backend.PutSessionAccountNameBody](docs/PutSessionAccountNameBody.md)
 - [io.github.cactacea.backend.PutSessionPasswordBody](docs/PutSessionPasswordBody.md)
 - [io.github.cactacea.backend.PutSessionProfileBody](docs/PutSessionProfileBody.md)
 - [io.github.cactacea.backend.PutSessionProfileImageBody](docs/PutSessionProfileImageBody.md)
 - [io.github.cactacea.backend.SocialAccount](docs/SocialAccount.md)
 - [io.github.cactacea.backend.Unauthorized](docs/Unauthorized.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: X-API-KEY
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
  - relationships: to follows and unfollow accounts on a user’s behalf
  - reports: to report account, feed, group and comment on a user’s behalf
  - group_invitations: to create, delete, accept and reject invitations on a user&#39;s behalf
  - media: to create and delete media on a user’s behalf
  - comment_likes: to like and unlike comment on a user’s behalf
  - basic: to read a user’s profile info and media
  - friend_requests: to create and delete friend request on a user’s behalf
  - feeds: to post and delete feeds on a user’s behalf
  - comments: to post and delete comments on a user’s behalf

