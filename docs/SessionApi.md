# SessionApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProfileImage**](SessionApi.md#deleteProfileImage) | **DELETE** /session/profile_image | Remove the profile image
[**existUserName**](SessionApi.md#existUserName) | **GET** /session/username/{userName} | Confirm user name exist
[**findSession**](SessionApi.md#findSession) | **GET** /session | Get user information
[**findSessionBlocks**](SessionApi.md#findSessionBlocks) | **GET** /session/blocks | Get block users list
[**findSessionChannels**](SessionApi.md#findSessionChannels) | **GET** /session/channels | Get channels list session user channelJoined
[**findSessionFeeds**](SessionApi.md#findSessionFeeds) | **GET** /session/feeds | Find session feeds
[**findSessionFollowers**](SessionApi.md#findSessionFollowers) | **GET** /session/followers | Get users list session user is followed by
[**findSessionFollows**](SessionApi.md#findSessionFollows) | **GET** /session/follows | Get users list session user followed
[**findSessionFriendRequests**](SessionApi.md#findSessionFriendRequests) | **GET** /session/requests | Get friend requests list session user created or received
[**findSessionFriends**](SessionApi.md#findSessionFriends) | **GET** /session/friends | Get friends list
[**findSessionHiddenChannels**](SessionApi.md#findSessionHiddenChannels) | **GET** /session/hides | Get hidden channels list session user channelJoined
[**findSessionInvitations**](SessionApi.md#findSessionInvitations) | **GET** /session/invitations | Get invitations list session user received
[**findSessionLikes**](SessionApi.md#findSessionLikes) | **GET** /session/likes | Get feeds list session user set a like
[**findSessionMutes**](SessionApi.md#findSessionMutes) | **GET** /session/mutes | Get users list session user muted
[**findUsers**](SessionApi.md#findUsers) | **GET** /users | Find users
[**registerSession**](SessionApi.md#registerSession) | **POST** /session | Register user
[**signOut**](SessionApi.md#signOut) | **DELETE** /session | Sign out
[**updatePassword**](SessionApi.md#updatePassword) | **PUT** /session/password | Update the password
[**updateProfile**](SessionApi.md#updateProfile) | **PUT** /session/profile | Update the profile
[**updateProfileImage**](SessionApi.md#updateProfileImage) | **PUT** /session/profile_image | Update the profile image
[**updateUserName**](SessionApi.md#updateUserName) | **PUT** /session/username | Update the user name


<a name="deleteProfileImage"></a>
# **deleteProfileImage**
> deleteProfileImage()

Remove the profile image

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
try {
    apiInstance.deleteProfileImage()
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteProfileImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteProfileImage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="existUserName"></a>
# **existUserName**
> UserNameNotExists existUserName(userName)

Confirm user name exist

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | User name.
try {
    val result : UserNameNotExists = apiInstance.existUserName(userName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#existUserName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#existUserName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| User name. |

### Return type

[**UserNameNotExists**](UserNameNotExists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSession"></a>
# **findSession**
> User findSession()

Get user information

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
try {
    val result : User = apiInstance.findSession()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSession")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionBlocks"></a>
# **findSessionBlocks**
> kotlin.Array&lt;User&gt; findSessionBlocks(userName, since, offset, count)

Get block users list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findSessionBlocks(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionBlocks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionBlocks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters users which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of users. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionChannels"></a>
# **findSessionChannels**
> kotlin.Array&lt;Channel&gt; findSessionChannels(since, offset, count)

Get channels list session user channelJoined

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters channels which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of channels. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of channels returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Channel> = apiInstance.findSessionChannels(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters channels which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of channels. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of channels returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionFeeds"></a>
# **findSessionFeeds**
> kotlin.Array&lt;Feed&gt; findSessionFeeds(since, offset, feedPrivacyType, count)

Find session feeds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val feedPrivacyType : kotlin.String = feedPrivacyType_example // kotlin.String | Feed privacy type. By default the value is everyone.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findSessionFeeds(since, offset, feedPrivacyType, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionFeeds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **feedPrivacyType** | **kotlin.String**| Feed privacy type. By default the value is everyone. | [optional] [enum: everyone, followers, friends, self]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionFollowers"></a>
# **findSessionFollowers**
> kotlin.Array&lt;User&gt; findSessionFollowers(userName, since, offset, count)

Get users list session user is followed by

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters followers which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of followers. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findSessionFollowers(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters followers which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of followers. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionFollows"></a>
# **findSessionFollows**
> kotlin.Array&lt;User&gt; findSessionFollows(userName, since, offset, count)

Get users list session user followed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters follower which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of follower. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findSessionFollows(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionFollows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionFollows")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters follower which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of follower. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionFriendRequests"></a>
# **findSessionFriendRequests**
> kotlin.Array&lt;FriendRequest&gt; findSessionFriendRequests(received, since, offset, count)

Get friend requests list session user created or received

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val received : kotlin.Boolean = true // kotlin.Boolean | Filters friend requests which you have received or sent.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friend requests which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friend request. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friend request returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<FriendRequest> = apiInstance.findSessionFriendRequests(received, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionFriendRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionFriendRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **received** | **kotlin.Boolean**| Filters friend requests which you have received or sent. |
 **since** | **java.math.BigDecimal**| Filters friend requests which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of friend request. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of friend request returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;FriendRequest&gt;**](FriendRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionFriends"></a>
# **findSessionFriends**
> kotlin.Array&lt;User&gt; findSessionFriends(userName, since, offset, count)

Get friends list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters friends which started on
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friends which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friends. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findSessionFriends(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters friends which started on | [optional]
 **since** | **java.math.BigDecimal**| Filters friends which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of friends. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionHiddenChannels"></a>
# **findSessionHiddenChannels**
> kotlin.Array&lt;Channel&gt; findSessionHiddenChannels(since, offset, count)

Get hidden channels list session user channelJoined

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters channels which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of channels. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of channels returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Channel> = apiInstance.findSessionHiddenChannels(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionHiddenChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionHiddenChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters channels which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of channels. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of channels returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionInvitations"></a>
# **findSessionInvitations**
> kotlin.Array&lt;Invitation&gt; findSessionInvitations(since, offset, count)

Get invitations list session user received

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters invitations which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of invitations. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Invitation> = apiInstance.findSessionInvitations(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters invitations which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of invitations. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Invitation&gt;**](Invitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionLikes"></a>
# **findSessionLikes**
> kotlin.Array&lt;Feed&gt; findSessionLikes(since, offset, count)

Get feeds list session user set a like

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters entries which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findSessionLikes(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionLikes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionLikes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters entries which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionMutes"></a>
# **findSessionMutes**
> kotlin.Array&lt;User&gt; findSessionMutes(userName, since, offset, count)

Get users list session user muted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findSessionMutes(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findSessionMutes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findSessionMutes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters users which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of users. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUsers"></a>
# **findUsers**
> kotlin.Array&lt;User&gt; findUsers(userName, since, offset, count)

Find users

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 users. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findUsers(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters users which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of users. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of users returned on one result page. By default the value is 20 users. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registerSession"></a>
# **registerSession**
> User registerSession()

Register user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
try {
    val result : User = apiInstance.registerSession()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#registerSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#registerSession")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="signOut"></a>
# **signOut**
> signOut()

Sign out

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
try {
    apiInstance.signOut()
} catch (e: ClientException) {
    println("4xx response calling SessionApi#signOut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#signOut")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePassword"></a>
# **updatePassword**
> updatePassword(body)

Update the password

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutPasswordBody =  // PutPasswordBody | 
try {
    apiInstance.updatePassword(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updatePassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updatePassword")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutPasswordBody**](PutPasswordBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateProfile"></a>
# **updateProfile**
> updateProfile(body)

Update the profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionProfileBody =  // PutSessionProfileBody | 
try {
    apiInstance.updateProfile(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSessionProfileBody**](PutSessionProfileBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateProfileImage"></a>
# **updateProfileImage**
> updateProfileImage(body)

Update the profile image

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionProfileImageBody =  // PutSessionProfileImageBody | 
try {
    apiInstance.updateProfileImage(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateProfileImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateProfileImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSessionProfileImageBody**](PutSessionProfileImageBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUserName"></a>
# **updateUserName**
> updateUserName(body)

Update the user name

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutUserNameBody =  // PutUserNameBody | 
try {
    apiInstance.updateUserName(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateUserName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateUserName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutUserNameBody**](PutUserNameBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

