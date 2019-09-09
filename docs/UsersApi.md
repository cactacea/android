# UsersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block**](UsersApi.md#block) | **POST** /users/{id}/blocks | Block an user
[**createRequest**](UsersApi.md#createRequest) | **POST** /users/{id}/requests | Create a friend request to an user
[**deleteInvitation**](UsersApi.md#deleteInvitation) | **DELETE** /invitations | Delete a invitation 
[**deleteRequest**](UsersApi.md#deleteRequest) | **DELETE** /users/{id}/requests | Remove a friend request to an user
[**findFollow**](UsersApi.md#findFollow) | **GET** /users/{id}/follows | Get users list an user follows
[**findUser**](UsersApi.md#findUser) | **GET** /users/{id} | Get information about an user
[**findUserChannel**](UsersApi.md#findUserChannel) | **GET** /users/{id}/channel | Get a direct message channel to an user
[**findUserChannels**](UsersApi.md#findUserChannels) | **GET** /users/{id}/channels | Get channels list an user channelJoined
[**findUserFeeds**](UsersApi.md#findUserFeeds) | **GET** /users/{id}/feeds | Get feeds list an user posted
[**findUserFeedsLiked**](UsersApi.md#findUserFeedsLiked) | **GET** /users/{id}/likes | Get user&#39;s liked feeds
[**findUserFollowers**](UsersApi.md#findUserFollowers) | **GET** /users/{id}/followers | Get users list an user is followed by
[**findUserFriends**](UsersApi.md#findUserFriends) | **GET** /users/{id}/friends | Get an user&#39;s friends list
[**findUserStatus**](UsersApi.md#findUserStatus) | **GET** /users/{id}/status | Get user on
[**followUser**](UsersApi.md#followUser) | **POST** /users/{id}/follow | Follow an user
[**joinUser**](UsersApi.md#joinUser) | **POST** /users/{userId}/channels/{channelId}/join | Join an user in a channel
[**leaveUser**](UsersApi.md#leaveUser) | **POST** /users/{userId}/channels/{channelId}/leave | Leave an user from a channel
[**muteUser**](UsersApi.md#muteUser) | **POST** /users/{id}/mutes | Mute an user
[**reportUser**](UsersApi.md#reportUser) | **POST** /users/{id}/reports | Report an user
[**unblock**](UsersApi.md#unblock) | **DELETE** /users/{id}/blocks | Unblock an user
[**unfollowUser**](UsersApi.md#unfollowUser) | **DELETE** /users/{id}/follow | UnFollow an user
[**unfriend**](UsersApi.md#unfriend) | **DELETE** /users/{id}/friends | Remove friendship to an user
[**unmuteUser**](UsersApi.md#unmuteUser) | **DELETE** /users/{id}/mutes | Unmute an user
[**updateUserDisplayName**](UsersApi.md#updateUserDisplayName) | **PUT** /users/{id}/display_name | Change display name to session user


<a name="block"></a>
# **block**
> block(id)

Block an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
try {
    apiInstance.block(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#block")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#block")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createRequest"></a>
# **createRequest**
> FriendRequestCreated createRequest(id)

Create a friend request to an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
try {
    val result : FriendRequestCreated = apiInstance.createRequest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#createRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#createRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |

### Return type

[**FriendRequestCreated**](FriendRequestCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteInvitation"></a>
# **deleteInvitation**
> deleteInvitation(channelId, userId)

Delete a invitation 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val channelId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel Identifier.
val userId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
try {
    apiInstance.deleteInvitation(channelId, userId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **java.math.BigDecimal**| Channel Identifier. |
 **userId** | **java.math.BigDecimal**| User Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteRequest"></a>
# **deleteRequest**
> deleteRequest(id)

Remove a friend request to an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    apiInstance.deleteRequest(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFollow"></a>
# **findFollow**
> kotlin.Array&lt;User&gt; findFollow(id, userName, since, offset, count)

Get users list an user follows

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters follower which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of follower. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findFollow(id, userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
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

<a name="findUser"></a>
# **findUser**
> User findUser(id)

Get information about an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    val result : User = apiInstance.findUser(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUserChannel"></a>
# **findUserChannel**
> Channel findUserChannel(id)

Get a direct message channel to an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    val result : Channel = apiInstance.findUserChannel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUserChannels"></a>
# **findUserChannels**
> kotlin.Array&lt;Channel&gt; findUserChannels(id, since, offset, count)

Get channels list an user channelJoined

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters channels which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of channels. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of channels returned on one result page. By default the value is 20 channels. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Channel> = apiInstance.findUserChannels(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |
 **since** | **java.math.BigDecimal**| Filters channels which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of channels. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of channels returned on one result page. By default the value is 20 channels. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUserFeeds"></a>
# **findUserFeeds**
> kotlin.Array&lt;Feed&gt; findUserFeeds(id, since, offset, count)

Get feeds list an user posted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findUserFeeds(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserFeeds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUserFeedsLiked"></a>
# **findUserFeedsLiked**
> kotlin.Array&lt;Feed&gt; findUserFeedsLiked(id, since, offset, count)

Get user&#39;s liked feeds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findUserFeedsLiked(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserFeedsLiked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserFeedsLiked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findUserFollowers"></a>
# **findUserFollowers**
> kotlin.Array&lt;User&gt; findUserFollowers(id, userName, since, offset, count)

Get users list an user is followed by

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters followers which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of followers. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findUserFollowers(id, userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
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

<a name="findUserFriends"></a>
# **findUserFriends**
> kotlin.Array&lt;User&gt; findUserFriends(id, userName, since, offset, count)

Get an user&#39;s friends list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friends which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friends. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findUserFriends(id, userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
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

<a name="findUserStatus"></a>
# **findUserStatus**
> UserStatus findUserStatus(id)

Get user on

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    val result : UserStatus = apiInstance.findUserStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

[**UserStatus**](UserStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="followUser"></a>
# **followUser**
> followUser(id)

Follow an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
try {
    apiInstance.followUser(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#followUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#followUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="joinUser"></a>
# **joinUser**
> joinUser(userId, channelId)

Join an user in a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val userId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val channelId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel Identifier.
try {
    apiInstance.joinUser(userId, channelId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#joinUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#joinUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.math.BigDecimal**| User Identifier. |
 **channelId** | **java.math.BigDecimal**| Channel Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="leaveUser"></a>
# **leaveUser**
> leaveUser(userId, channelId)

Leave an user from a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val userId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val channelId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel Identifier.
try {
    apiInstance.leaveUser(userId, channelId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#leaveUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#leaveUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.math.BigDecimal**| User Identifier. |
 **channelId** | **java.math.BigDecimal**| Channel Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="muteUser"></a>
# **muteUser**
> muteUser(id)

Mute an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
try {
    apiInstance.muteUser(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#muteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#muteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportUser"></a>
# **reportUser**
> reportUser(id, body)

Report an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val body : PostUserReportBody =  // PostUserReportBody | 
try {
    apiInstance.reportUser(id, body)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#reportUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#reportUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
 **body** | [**PostUserReportBody**](PostUserReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unblock"></a>
# **unblock**
> unblock(id)

Unblock an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    apiInstance.unblock(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#unblock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#unblock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unfollowUser"></a>
# **unfollowUser**
> unfollowUser(id)

UnFollow an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
try {
    apiInstance.unfollowUser(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#unfollowUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#unfollowUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unfriend"></a>
# **unfriend**
> unfriend(id)

Remove friendship to an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    apiInstance.unfriend(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#unfriend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#unfriend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unmuteUser"></a>
# **unmuteUser**
> unmuteUser(id)

Unmute an user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User identifier.
try {
    apiInstance.unmuteUser(id)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#unmuteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#unmuteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUserDisplayName"></a>
# **updateUserDisplayName**
> updateUserDisplayName(id, body)

Change display name to session user

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = UsersApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | User Identifier.
val body : PutUserDisplayNameBody =  // PutUserDisplayNameBody | 
try {
    apiInstance.updateUserDisplayName(id, body)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUserDisplayName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUserDisplayName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| User Identifier. |
 **body** | [**PutUserDisplayNameBody**](PutUserDisplayNameBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

