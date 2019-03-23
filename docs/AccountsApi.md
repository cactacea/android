# AccountsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block**](AccountsApi.md#block) | **POST** /accounts/{id}/blocks | Block a account
[**findAccount**](AccountsApi.md#findAccount) | **GET** /accounts/{id} | Get information about a account
[**findAccountFeeds**](AccountsApi.md#findAccountFeeds) | **GET** /accounts/{id}/feeds | Get feeds list a account posted
[**findAccountFeedsLiked**](AccountsApi.md#findAccountFeedsLiked) | **GET** /accounts/{id}/likes | Get account&#39;s liked feeds
[**findAccountFollowers**](AccountsApi.md#findAccountFollowers) | **GET** /accounts/{id}/followers | Get accounts list a account is followed by
[**findAccountFriends**](AccountsApi.md#findAccountFriends) | **GET** /accounts/{id}/friends | Get a account&#39;s friends list
[**findAccountGroup**](AccountsApi.md#findAccountGroup) | **GET** /accounts/{id}/group | Get a direct message group to a account
[**findAccountGroups**](AccountsApi.md#findAccountGroups) | **GET** /accounts/{id}/groups | Get groups list a account groupJoined
[**findAccountStatus**](AccountsApi.md#findAccountStatus) | **GET** /accounts/{id}/status | Get account on
[**findFollowing**](AccountsApi.md#findFollowing) | **GET** /accounts/{id}/following | Get accounts list a account following
[**followAccount**](AccountsApi.md#followAccount) | **POST** /accounts/{id}/follow | Follow a account
[**inviteAccount**](AccountsApi.md#inviteAccount) | **POST** /accounts/{accountId}/groups/{groupId}/invitations | Create a groupInvitation to a account
[**joinAccount**](AccountsApi.md#joinAccount) | **POST** /accounts/{accountId}/groups/{groupId}/join | Join a account in a group
[**leaveAccount**](AccountsApi.md#leaveAccount) | **POST** /accounts/{accountId}/groups/{groupId}/leave | Leave a account from a group
[**muteAccount**](AccountsApi.md#muteAccount) | **POST** /accounts/{id}/mutes | Mute a account
[**reportAccount**](AccountsApi.md#reportAccount) | **POST** /accounts/{id}/reports | Report a account
[**request**](AccountsApi.md#request) | **POST** /accounts/{id}/requests | Create a friend request to a account
[**unblock**](AccountsApi.md#unblock) | **DELETE** /accounts/{id}/blocks | Unblock a account
[**unfollowAccount**](AccountsApi.md#unfollowAccount) | **DELETE** /accounts/{id}/follow | UnFollow a account
[**unfriend**](AccountsApi.md#unfriend) | **DELETE** /accounts/{id}/friends | Remove friendship to a account
[**unmuteAccount**](AccountsApi.md#unmuteAccount) | **DELETE** /accounts/{id}/mutes | Unmute a account
[**unrequest**](AccountsApi.md#unrequest) | **DELETE** /accounts/{id}/requests | Remove a friend request to a account
[**updateAccountDisplayName**](AccountsApi.md#updateAccountDisplayName) | **PUT** /accounts/{id}/display_name | Change display name to session account


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

<a name="findAccount"></a>
# **findAccount**
> Account findAccount(id)

Get information about a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : Account = apiInstance.findAccount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccountFeeds"></a>
# **findAccountFeeds**
> kotlin.Array&lt;Feed&gt; findAccountFeeds(id, since, offset, count)

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
    val result : kotlin.Array<Feed> = apiInstance.findAccountFeeds(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountFeeds")
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

<a name="findAccountFeedsLiked"></a>
# **findAccountFeedsLiked**
> kotlin.Array&lt;Feed&gt; findAccountFeedsLiked(id, since, offset, count)

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
    val result : kotlin.Array<Feed> = apiInstance.findAccountFeedsLiked(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountFeedsLiked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountFeedsLiked")
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

<a name="findAccountFollowers"></a>
# **findAccountFollowers**
> kotlin.Array&lt;Account&gt; findAccountFollowers(id, since, offset, count)

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
    val result : kotlin.Array<Account> = apiInstance.findAccountFollowers(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountFollowers")
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

<a name="findAccountFriends"></a>
# **findAccountFriends**
> kotlin.Array&lt;Account&gt; findAccountFriends(id, since, offset, count)

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
    val result : kotlin.Array<Account> = apiInstance.findAccountFriends(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountFriends")
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

<a name="findAccountGroup"></a>
# **findAccountGroup**
> Group findAccountGroup(id)

Get a direct message group to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : Group = apiInstance.findAccountGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountGroup")
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

<a name="findAccountGroups"></a>
# **findAccountGroups**
> kotlin.Array&lt;Group&gt; findAccountGroups(id, since, offset, count)

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
    val result : kotlin.Array<Group> = apiInstance.findAccountGroups(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountGroups")
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

<a name="findAccountStatus"></a>
# **findAccountStatus**
> AccountStatus findAccountStatus(id)

Get account on

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : AccountStatus = apiInstance.findAccountStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountStatus")
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

<a name="followAccount"></a>
# **followAccount**
> followAccount(id)

Follow a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.followAccount(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#followAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#followAccount")
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

<a name="inviteAccount"></a>
# **inviteAccount**
> InvitationCreated inviteAccount(accountId, groupId)

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
    val result : InvitationCreated = apiInstance.inviteAccount(accountId, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#inviteAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#inviteAccount")
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

<a name="joinAccount"></a>
# **joinAccount**
> joinAccount(accountId, groupId)

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
    apiInstance.joinAccount(accountId, groupId)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#joinAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#joinAccount")
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

<a name="leaveAccount"></a>
# **leaveAccount**
> leaveAccount(accountId, groupId)

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
    apiInstance.leaveAccount(accountId, groupId)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#leaveAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#leaveAccount")
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

<a name="muteAccount"></a>
# **muteAccount**
> muteAccount(id)

Mute a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.muteAccount(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#muteAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#muteAccount")
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

<a name="reportAccount"></a>
# **reportAccount**
> reportAccount(id, body)

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
    apiInstance.reportAccount(id, body)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#reportAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#reportAccount")
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

<a name="unfollowAccount"></a>
# **unfollowAccount**
> unfollowAccount(id)

UnFollow a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.unfollowAccount(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unfollowAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unfollowAccount")
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

<a name="unmuteAccount"></a>
# **unmuteAccount**
> unmuteAccount(id)

Unmute a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unmuteAccount(id)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#unmuteAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#unmuteAccount")
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

<a name="updateAccountDisplayName"></a>
# **updateAccountDisplayName**
> updateAccountDisplayName(id, body)

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
    apiInstance.updateAccountDisplayName(id, body)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateAccountDisplayName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateAccountDisplayName")
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

