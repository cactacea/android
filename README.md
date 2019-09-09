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
*ChannelsApi* | [**createChannel**](docs/ChannelsApi.md#createchannel) | **POST** /channels | Create a channel
*ChannelsApi* | [**deleteChannel**](docs/ChannelsApi.md#deletechannel) | **DELETE** /channels/{id} | Hide a channel and delete all messages
*ChannelsApi* | [**findChannel**](docs/ChannelsApi.md#findchannel) | **GET** /channels/{id} | Get basic information about a channel
*ChannelsApi* | [**findChannelUsers**](docs/ChannelsApi.md#findchannelusers) | **GET** /channels/{id}/users | Get users list of a channel
*ChannelsApi* | [**hideChannel**](docs/ChannelsApi.md#hidechannel) | **POST** /channels/{id}/hides | Hide a channel
*ChannelsApi* | [**joinChannel**](docs/ChannelsApi.md#joinchannel) | **POST** /channels/{id}/join | Join to a channel,
*ChannelsApi* | [**leaveChannel**](docs/ChannelsApi.md#leavechannel) | **POST** /channels/{id}/leave | Leave from a channel
*ChannelsApi* | [**reportChannel**](docs/ChannelsApi.md#reportchannel) | **POST** /channels/{id}/reports | Report a channel
*ChannelsApi* | [**showChannel**](docs/ChannelsApi.md#showchannel) | **DELETE** /channels/{id}/hides | Show a channel
*ChannelsApi* | [**updateChannel**](docs/ChannelsApi.md#updatechannel) | **PUT** /channels/{id} | Update a channel
*CommentLikesApi* | [**findUsersLikedComment**](docs/CommentLikesApi.md#finduserslikedcomment) | **GET** /comments/{id}/likes | Get users list who liked on a comment
*CommentLikesApi* | [**likeComment**](docs/CommentLikesApi.md#likecomment) | **POST** /comments/{id}/likes | Set a like on a comment
*CommentLikesApi* | [**unlikeComment**](docs/CommentLikesApi.md#unlikecomment) | **DELETE** /comments/{id}/likes | Remove a like on a comment
*CommentsApi* | [**deleteComment**](docs/CommentsApi.md#deletecomment) | **DELETE** /comments/{id} | Delete a comment
*CommentsApi* | [**findComment**](docs/CommentsApi.md#findcomment) | **GET** /comments/{id} | Get basic information about a comment
*CommentsApi* | [**findComments**](docs/CommentsApi.md#findcomments) | **GET** /comments | Search comments
*CommentsApi* | [**postComment**](docs/CommentsApi.md#postcomment) | **POST** /comments | Create a comment on a feed
*CommentsApi* | [**reportComment**](docs/CommentsApi.md#reportcomment) | **POST** /comments/{id}/reports | Report a comment
*FeedLikesApi* | [**findUsersLikedFeed**](docs/FeedLikesApi.md#finduserslikedfeed) | **GET** /feeds/{id}/likes | Get users list who set a like to a feed
*FeedLikesApi* | [**likeFeed**](docs/FeedLikesApi.md#likefeed) | **POST** /feeds/{id}/likes | Set a like on a feed
*FeedLikesApi* | [**unlikeFeed**](docs/FeedLikesApi.md#unlikefeed) | **DELETE** /feeds/{id}/likes | Remove a like on a feed
*FeedsApi* | [**deleteFeed**](docs/FeedsApi.md#deletefeed) | **DELETE** /feeds/{id} | Delete a feed
*FeedsApi* | [**findFeed**](docs/FeedsApi.md#findfeed) | **GET** /feeds/{id} | Get basic information about a feed
*FeedsApi* | [**postFeed**](docs/FeedsApi.md#postfeed) | **POST** /feeds | Post a feed
*FeedsApi* | [**reportFeed**](docs/FeedsApi.md#reportfeed) | **POST** /feeds/{id}/reports | Report a feed
*FeedsApi* | [**updateFeed**](docs/FeedsApi.md#updatefeed) | **PUT** /feeds/{id} | Update a feed
*FriendRequestsApi* | [**acceptRequest**](docs/FriendRequestsApi.md#acceptrequest) | **POST** /requests/{id}/accept | Accept a friend request
*FriendRequestsApi* | [**rejectRequest**](docs/FriendRequestsApi.md#rejectrequest) | **POST** /requests/{id}/reject | Reject a friend request
*InvitationsApi* | [**acceptInvitation**](docs/InvitationsApi.md#acceptinvitation) | **POST** /invitations/{id}/accept | Accept a invitation
*InvitationsApi* | [**createInvitations**](docs/InvitationsApi.md#createinvitations) | **POST** /invitations | Create invitations
*InvitationsApi* | [**rejectInvitation**](docs/InvitationsApi.md#rejectinvitation) | **POST** /invitations/{id}/reject | Reject a invitation
*MediumsApi* | [**deleteMedium**](docs/MediumsApi.md#deletemedium) | **DELETE** /mediums/{id} | Delete a medium
*MediumsApi* | [**findMedium**](docs/MediumsApi.md#findmedium) | **GET** /mediums/:* | Get a medium
*MediumsApi* | [**uploadMedium**](docs/MediumsApi.md#uploadmedium) | **POST** /mediums | Upload a medium
*MessagesApi* | [**deleteMessage**](docs/MessagesApi.md#deletemessage) | **DELETE** /messages | Delete messages form a channel
*MessagesApi* | [**findMessages**](docs/MessagesApi.md#findmessages) | **GET** /messages | Search messages
*MessagesApi* | [**postMedium**](docs/MessagesApi.md#postmedium) | **POST** /messages/medium | Send a medium to a channel
*MessagesApi* | [**postText**](docs/MessagesApi.md#posttext) | **POST** /messages/text | Send a text to a channel
*NotificationsApi* | [**findNotifications**](docs/NotificationsApi.md#findnotifications) | **GET** /notifications | Search notifications
*PasswordApi* | [**recover**](docs/PasswordApi.md#recover) | **POST** /password/recover | Recover password
*PasswordApi* | [**reset**](docs/PasswordApi.md#reset) | **POST** /password/reset | Reset Password
*SessionApi* | [**deleteProfileImage**](docs/SessionApi.md#deleteprofileimage) | **DELETE** /session/profile_image | Remove the profile image
*SessionApi* | [**existUserName**](docs/SessionApi.md#existusername) | **GET** /session/username/{userName} | Confirm user name exist
*SessionApi* | [**findSession**](docs/SessionApi.md#findsession) | **GET** /session | Get user information
*SessionApi* | [**findSessionBlocks**](docs/SessionApi.md#findsessionblocks) | **GET** /session/blocks | Get block users list
*SessionApi* | [**findSessionChannels**](docs/SessionApi.md#findsessionchannels) | **GET** /session/channels | Get channels list session user channelJoined
*SessionApi* | [**findSessionFeeds**](docs/SessionApi.md#findsessionfeeds) | **GET** /session/feeds | Find session feeds
*SessionApi* | [**findSessionFollowers**](docs/SessionApi.md#findsessionfollowers) | **GET** /session/followers | Get users list session user is followed by
*SessionApi* | [**findSessionFollows**](docs/SessionApi.md#findsessionfollows) | **GET** /session/follows | Get users list session user followed
*SessionApi* | [**findSessionFriendRequests**](docs/SessionApi.md#findsessionfriendrequests) | **GET** /session/requests | Get friend requests list session user created or received
*SessionApi* | [**findSessionFriends**](docs/SessionApi.md#findsessionfriends) | **GET** /session/friends | Get friends list
*SessionApi* | [**findSessionHiddenChannels**](docs/SessionApi.md#findsessionhiddenchannels) | **GET** /session/hides | Get hidden channels list session user channelJoined
*SessionApi* | [**findSessionInvitations**](docs/SessionApi.md#findsessioninvitations) | **GET** /session/invitations | Get invitations list session user received
*SessionApi* | [**findSessionLikes**](docs/SessionApi.md#findsessionlikes) | **GET** /session/likes | Get feeds list session user set a like
*SessionApi* | [**findSessionMutes**](docs/SessionApi.md#findsessionmutes) | **GET** /session/mutes | Get users list session user muted
*SessionApi* | [**findUsers**](docs/SessionApi.md#findusers) | **GET** /users | Find users
*SessionApi* | [**registerSession**](docs/SessionApi.md#registersession) | **POST** /session | Register user
*SessionApi* | [**signOut**](docs/SessionApi.md#signout) | **DELETE** /session | Sign out
*SessionApi* | [**updatePassword**](docs/SessionApi.md#updatepassword) | **PUT** /session/password | Update the password
*SessionApi* | [**updateProfile**](docs/SessionApi.md#updateprofile) | **PUT** /session/profile | Update the profile
*SessionApi* | [**updateProfileImage**](docs/SessionApi.md#updateprofileimage) | **PUT** /session/profile_image | Update the profile image
*SessionApi* | [**updateUserName**](docs/SessionApi.md#updateusername) | **PUT** /session/username | Update the user name
*SessionsApi* | [**signIn**](docs/SessionsApi.md#signin) | **POST** /signin | Sign in
*SessionsApi* | [**signUp**](docs/SessionsApi.md#signup) | **POST** /signup | Sign up
*SettingsApi* | [**findPushNotification**](docs/SettingsApi.md#findpushnotification) | **GET** /session/push/notification | Get push notification settings
*SettingsApi* | [**updateDeviceStatus**](docs/SettingsApi.md#updatedevicestatus) | **PUT** /session/device | Update device status
*SettingsApi* | [**updatePushNotification**](docs/SettingsApi.md#updatepushnotification) | **PUT** /session/push/notification | Update ths push notification settings
*SystemApi* | [**ping**](docs/SystemApi.md#ping) | **GET** /ping | Health checking
*UsersApi* | [**block**](docs/UsersApi.md#block) | **POST** /users/{id}/blocks | Block an user
*UsersApi* | [**createRequest**](docs/UsersApi.md#createrequest) | **POST** /users/{id}/requests | Create a friend request to an user
*UsersApi* | [**deleteInvitation**](docs/UsersApi.md#deleteinvitation) | **DELETE** /invitations | Delete a invitation 
*UsersApi* | [**deleteRequest**](docs/UsersApi.md#deleterequest) | **DELETE** /users/{id}/requests | Remove a friend request to an user
*UsersApi* | [**findFollow**](docs/UsersApi.md#findfollow) | **GET** /users/{id}/follows | Get users list an user follows
*UsersApi* | [**findUser**](docs/UsersApi.md#finduser) | **GET** /users/{id} | Get information about an user
*UsersApi* | [**findUserChannel**](docs/UsersApi.md#finduserchannel) | **GET** /users/{id}/channel | Get a direct message channel to an user
*UsersApi* | [**findUserChannels**](docs/UsersApi.md#finduserchannels) | **GET** /users/{id}/channels | Get channels list an user channelJoined
*UsersApi* | [**findUserFeeds**](docs/UsersApi.md#finduserfeeds) | **GET** /users/{id}/feeds | Get feeds list an user posted
*UsersApi* | [**findUserFeedsLiked**](docs/UsersApi.md#finduserfeedsliked) | **GET** /users/{id}/likes | Get user's liked feeds
*UsersApi* | [**findUserFollowers**](docs/UsersApi.md#finduserfollowers) | **GET** /users/{id}/followers | Get users list an user is followed by
*UsersApi* | [**findUserFriends**](docs/UsersApi.md#finduserfriends) | **GET** /users/{id}/friends | Get an user's friends list
*UsersApi* | [**findUserStatus**](docs/UsersApi.md#finduserstatus) | **GET** /users/{id}/status | Get user on
*UsersApi* | [**followUser**](docs/UsersApi.md#followuser) | **POST** /users/{id}/follow | Follow an user
*UsersApi* | [**joinUser**](docs/UsersApi.md#joinuser) | **POST** /users/{userId}/channels/{channelId}/join | Join an user in a channel
*UsersApi* | [**leaveUser**](docs/UsersApi.md#leaveuser) | **POST** /users/{userId}/channels/{channelId}/leave | Leave an user from a channel
*UsersApi* | [**muteUser**](docs/UsersApi.md#muteuser) | **POST** /users/{id}/mutes | Mute an user
*UsersApi* | [**reportUser**](docs/UsersApi.md#reportuser) | **POST** /users/{id}/reports | Report an user
*UsersApi* | [**unblock**](docs/UsersApi.md#unblock) | **DELETE** /users/{id}/blocks | Unblock an user
*UsersApi* | [**unfollowUser**](docs/UsersApi.md#unfollowuser) | **DELETE** /users/{id}/follow | UnFollow an user
*UsersApi* | [**unfriend**](docs/UsersApi.md#unfriend) | **DELETE** /users/{id}/friends | Remove friendship to an user
*UsersApi* | [**unmuteUser**](docs/UsersApi.md#unmuteuser) | **DELETE** /users/{id}/mutes | Unmute an user
*UsersApi* | [**updateUserDisplayName**](docs/UsersApi.md#updateuserdisplayname) | **PUT** /users/{id}/display_name | Change display name to session user


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.github.cactacea.backend.CactaceaError](docs/CactaceaError.md)
 - [io.github.cactacea.backend.CactaceaErrors](docs/CactaceaErrors.md)
 - [io.github.cactacea.backend.Channel](docs/Channel.md)
 - [io.github.cactacea.backend.ChannelCreated](docs/ChannelCreated.md)
 - [io.github.cactacea.backend.ChannelId](docs/ChannelId.md)
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
 - [io.github.cactacea.backend.GetNotificationsBody](docs/GetNotificationsBody.md)
 - [io.github.cactacea.backend.Invitation](docs/Invitation.md)
 - [io.github.cactacea.backend.InvitationCreated](docs/InvitationCreated.md)
 - [io.github.cactacea.backend.InvitationId](docs/InvitationId.md)
 - [io.github.cactacea.backend.Medium](docs/Medium.md)
 - [io.github.cactacea.backend.MediumCreated](docs/MediumCreated.md)
 - [io.github.cactacea.backend.MediumId](docs/MediumId.md)
 - [io.github.cactacea.backend.Message](docs/Message.md)
 - [io.github.cactacea.backend.Notification](docs/Notification.md)
 - [io.github.cactacea.backend.PostChannelBody](docs/PostChannelBody.md)
 - [io.github.cactacea.backend.PostChannelReportBody](docs/PostChannelReportBody.md)
 - [io.github.cactacea.backend.PostCommentBody](docs/PostCommentBody.md)
 - [io.github.cactacea.backend.PostCommentReportBody](docs/PostCommentReportBody.md)
 - [io.github.cactacea.backend.PostFeedBody](docs/PostFeedBody.md)
 - [io.github.cactacea.backend.PostFeedReportBody](docs/PostFeedReportBody.md)
 - [io.github.cactacea.backend.PostInvitationsBody](docs/PostInvitationsBody.md)
 - [io.github.cactacea.backend.PostMediumBody](docs/PostMediumBody.md)
 - [io.github.cactacea.backend.PostRecoverBody](docs/PostRecoverBody.md)
 - [io.github.cactacea.backend.PostResetBody](docs/PostResetBody.md)
 - [io.github.cactacea.backend.PostSignInBody](docs/PostSignInBody.md)
 - [io.github.cactacea.backend.PostSignUpBody](docs/PostSignUpBody.md)
 - [io.github.cactacea.backend.PostTextBody](docs/PostTextBody.md)
 - [io.github.cactacea.backend.PostUserReportBody](docs/PostUserReportBody.md)
 - [io.github.cactacea.backend.PushNotificationSetting](docs/PushNotificationSetting.md)
 - [io.github.cactacea.backend.PutChannelBody](docs/PutChannelBody.md)
 - [io.github.cactacea.backend.PutDeviceBody](docs/PutDeviceBody.md)
 - [io.github.cactacea.backend.PutFeedBody](docs/PutFeedBody.md)
 - [io.github.cactacea.backend.PutNotificationSettingBody](docs/PutNotificationSettingBody.md)
 - [io.github.cactacea.backend.PutPasswordBody](docs/PutPasswordBody.md)
 - [io.github.cactacea.backend.PutSessionProfileBody](docs/PutSessionProfileBody.md)
 - [io.github.cactacea.backend.PutSessionProfileImageBody](docs/PutSessionProfileImageBody.md)
 - [io.github.cactacea.backend.PutUserDisplayNameBody](docs/PutUserDisplayNameBody.md)
 - [io.github.cactacea.backend.PutUserNameBody](docs/PutUserNameBody.md)
 - [io.github.cactacea.backend.User](docs/User.md)
 - [io.github.cactacea.backend.UserId](docs/UserId.md)
 - [io.github.cactacea.backend.UserNameNotExists](docs/UserNameNotExists.md)
 - [io.github.cactacea.backend.UserStatus](docs/UserStatus.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

<a name="authorization"></a>
### authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

