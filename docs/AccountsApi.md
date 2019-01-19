# AccountsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block**](AccountsApi.md#block) | **POST** /accounts/{id}/blocks | Block a account
[**findDetail**](AccountsApi.md#findDetail) | **GET** /accounts/{id} | Get information about a account
[**findFeeds**](AccountsApi.md#findFeeds) | **GET** /accounts/{id}/feeds | Get feeds list a account posted
[**findFollowers**](AccountsApi.md#findFollowers) | **GET** /accounts/{id}/followers | Get accounts list a account is followed by
[**findFollowing**](AccountsApi.md#findFollowing) | **GET** /accounts/{id}/following | Get accounts list a account following
[**findFriends**](AccountsApi.md#findFriends) | **GET** /accounts/{id}/friends | Get a account&#39;s friends list
[**findGroup**](AccountsApi.md#findGroup) | **GET** /accounts/{id}/group | Get a direct message group to a account
[**findGroups**](AccountsApi.md#findGroups) | **GET** /accounts/{id}/groups | Get groups list a account groupJoined
[**findLikes**](AccountsApi.md#findLikes) | **GET** /accounts/{id}/likes | Get account&#39;s liked feeds
[**findStatus**](AccountsApi.md#findStatus) | **GET** /accounts/{id}/status | Get account on
[**follow**](AccountsApi.md#follow) | **POST** /accounts/{id}/follow | Follow a account
[**invite**](AccountsApi.md#invite) | **POST** /accounts/{accountId}/groups/{groupId}/invitations | Create a groupInvitation to a account
[**join**](AccountsApi.md#join) | **POST** /accounts/{accountId}/groups/{groupId}/join | Join a account in a group
[**leave**](AccountsApi.md#leave) | **POST** /accounts/{accountId}/groups/{groupId}/leave | Leave a account from a group
[**mute**](AccountsApi.md#mute) | **POST** /accounts/{id}/mutes | Mute a account
[**report**](AccountsApi.md#report) | **POST** /accounts/{id}/reports | Report a account
[**request**](AccountsApi.md#request) | **POST** /accounts/{id}/requests | Create a friend request to a account
[**unblock**](AccountsApi.md#unblock) | **DELETE** /accounts/{id}/blocks | Unblock a account
[**unfollow**](AccountsApi.md#unfollow) | **DELETE** /accounts/{id}/follow | UnFollow a account
[**unfriend**](AccountsApi.md#unfriend) | **DELETE** /accounts/{id}/friends | Remove friendship to a account
[**unmute**](AccountsApi.md#unmute) | **DELETE** /accounts/{id}/mutes | Unmute a account
[**unrequest**](AccountsApi.md#unrequest) | **DELETE** /accounts/{id}/requests | Remove a friend request to a account
[**updateDisplayName**](AccountsApi.md#updateDisplayName) | **PUT** /accounts/{id}/display_name | Change display name to session account


<a name="block"></a>
# **block**
> block(id)

Block a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.block(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#block")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#block")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findDetail"></a>
# **findDetail**
> AccountDetail findDetail(id)

Get information about a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : AccountDetail = apiInstance.findDetail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findDetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

[**AccountDetail**](AccountDetail.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFeeds"></a>
# **findFeeds**
> kotlin.Array&lt;Feed&gt; findFeeds(id, since, offset, count)

Get feeds list a account posted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findFeeds(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findFeeds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFollowers"></a>
# **findFollowers**
> kotlin.Array&lt;Account&gt; findFollowers(id, since, offset, count)

Get accounts list a account is followed by

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters followers which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of followers. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findFollowers(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters followers which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of followers. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFollowing"></a>
# **findFollowing**
> kotlin.Array&lt;Account&gt; findFollowing(id, since, offset, count)

Get accounts list a account following

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters follower which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of follower. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findFollowing(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findFollowing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findFollowing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters follower which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of follower. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFriends"></a>
# **findFriends**
> kotlin.Array&lt;Account&gt; findFriends(id, since, offset, count)

Get a account&#39;s friends list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friends which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friends. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findFriends(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters friends which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of friends. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGroup"></a>
# **findGroup**
> Group findGroup(id)

Get a direct message group to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : Group = apiInstance.findGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

[**Group**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGroups"></a>
# **findGroups**
> kotlin.Array&lt;Group&gt; findGroups(id, since, offset, count)

Get groups list a account groupJoined

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of groups. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 groups. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findGroups(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of groups. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 groups. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findLikes"></a>
# **findLikes**
> kotlin.Array&lt;Feed&gt; findLikes(id, since, offset, count)

Get account&#39;s liked feeds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findLikes(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findLikes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findLikes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findStatus"></a>
# **findStatus**
> AccountStatus findStatus(id)

Get account on

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : AccountStatus = apiInstance.findStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="follow"></a>
# **follow**
> follow(id)

Follow a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.follow(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#follow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#follow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invite"></a>
# **invite**
> InvitationCreated invite(accountId, groupId)

Create a groupInvitation to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    val result : InvitationCreated = apiInstance.invite(accountId, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#invite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#invite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **java.math.BigDecimal**| Account Identifier. |
 **groupId** | **java.math.BigDecimal**| Group Identifier. |

### Return type

[**InvitationCreated**](InvitationCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="join"></a>
# **join**
> join(accountId, groupId)

Join a account in a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    apiInstance.join(accountId, groupId)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#join")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#join")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **java.math.BigDecimal**| Account Identifier. |
 **groupId** | **java.math.BigDecimal**| Group Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="leave"></a>
# **leave**
> leave(accountId, groupId)

Leave a account from a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    apiInstance.leave(accountId, groupId)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#leave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#leave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **java.math.BigDecimal**| Account Identifier. |
 **groupId** | **java.math.BigDecimal**| Group Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="mute"></a>
# **mute**
> mute(id)

Mute a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.mute(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#mute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#mute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="report"></a>
# **report**
> report(id, body)

Report a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val body : PostAccountReportBody =  // PostAccountReportBody | 
try {
    apiInstance.report(id, body)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#report")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#report")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **body** | [**PostAccountReportBody**](PostAccountReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="request"></a>
# **request**
> FriendRequestCreated request(id)

Create a friend request to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    val result : FriendRequestCreated = apiInstance.request(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#request")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#request")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |

### Return type

[**FriendRequestCreated**](FriendRequestCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unblock"></a>
# **unblock**
> unblock(id)

Unblock a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unblock(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unblock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unblock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unfollow"></a>
# **unfollow**
> unfollow(id)

UnFollow a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.unfollow(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unfollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unfollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unfriend"></a>
# **unfriend**
> unfriend(id)

Remove friendship to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unfriend(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unfriend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unfriend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unmute"></a>
# **unmute**
> unmute(id)

Unmute a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unmute(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unmute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unmute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unrequest"></a>
# **unrequest**
> unrequest(id)

Remove a friend request to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unrequest(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unrequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unrequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDisplayName"></a>
# **updateDisplayName**
> updateDisplayName(id, body)

Change display name to session account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val body : PutAccountDisplayNameBody =  // PutAccountDisplayNameBody | 
try {
    apiInstance.updateDisplayName(id, body)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateDisplayName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateDisplayName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **body** | [**PutAccountDisplayNameBody**](PutAccountDisplayNameBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

