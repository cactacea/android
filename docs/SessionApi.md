# SessionApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProfileImage**](SessionApi.md#deleteProfileImage) | **DELETE** /session/profile_image | Remove the profile image
[**existAccountName**](SessionApi.md#existAccountName) | **GET** /session/account_name/{accountName} | Confirm account name exist
[**findAccounts**](SessionApi.md#findAccounts) | **GET** /session/accounts | Search accounts
[**findFeeds**](SessionApi.md#findFeeds) | **GET** /session/feeds | Get feeds list session account posted
[**findFollowers**](SessionApi.md#findFollowers) | **GET** /session/followers | Get accounts list session account is followed by
[**findFollowing**](SessionApi.md#findFollowing) | **GET** /session/following | Get accounts list session account followed
[**findFriendRequests**](SessionApi.md#findFriendRequests) | **GET** /session/requests | Get friend requests list session account created or received
[**findFriends**](SessionApi.md#findFriends) | **GET** /session/friends | Get friends list
[**findGroupInvitations**](SessionApi.md#findGroupInvitations) | **GET** /session/invitations | Get invitations list session account received
[**findGroups**](SessionApi.md#findGroups) | **GET** /session/groups | Get groups list session account groupJoined
[**findHiddenGroups**](SessionApi.md#findHiddenGroups) | **GET** /session/hides | Get hidden groups list session account groupJoined
[**findLikes**](SessionApi.md#findLikes) | **GET** /session/likes | Get feeds list session account set a like
[**findMutingAccounts**](SessionApi.md#findMutingAccounts) | **GET** /session/mutes | Get accounts list session account muted
[**findSession**](SessionApi.md#findSession) | **GET** /session | Get basic information about session account
[**signOut**](SessionApi.md#signOut) | **DELETE** /session | Sign out
[**updateAccountName**](SessionApi.md#updateAccountName) | **PUT** /session/account_name | Update the account name
[**updatePassword**](SessionApi.md#updatePassword) | **PUT** /session/password | Update the password
[**updateProfile**](SessionApi.md#updateProfile) | **PUT** /session/profile | Update the profile
[**updateProfileImage**](SessionApi.md#updateProfileImage) | **PUT** /session/profile_image | Update the profile image


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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="existAccountName"></a>
# **existAccountName**
> AccountNameNotExists existAccountName(accountName)

Confirm account name exist

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val accountName : kotlin.String = accountName_example // kotlin.String | Account name.
try {
    val result : AccountNameNotExists = apiInstance.existAccountName(accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#existAccountName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#existAccountName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountName** | **kotlin.String**| Account name. |

### Return type

[**AccountNameNotExists**](AccountNameNotExists.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccounts"></a>
# **findAccounts**
> kotlin.Array&lt;Account&gt; findAccounts(accountName, since, offset, count)

Search accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val accountName : kotlin.String = accountName_example // kotlin.String | Filters accounts whose account name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 accounts. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findAccounts(accountName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountName** | **kotlin.String**| Filters accounts whose account name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 accounts. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFeeds"></a>
# **findFeeds**
> kotlin.Array&lt;Feed&gt; findFeeds(since, offset, count)

Get feeds list session account posted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findFeeds(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findFeeds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> kotlin.Array&lt;Account&gt; findFollowers(since, offset, count)

Get accounts list session account is followed by

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters followers which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of followers. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findFollowers(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> kotlin.Array&lt;Account&gt; findFollowing(since, offset, count)

Get accounts list session account followed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters follower which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of follower. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findFollowing(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findFollowing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findFollowing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="findFriendRequests"></a>
# **findFriendRequests**
> kotlin.Array&lt;FriendRequest&gt; findFriendRequests(received, since, offset, count)

Get friend requests list session account created or received

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
    val result : kotlin.Array<FriendRequest> = apiInstance.findFriendRequests(received, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findFriendRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findFriendRequests")
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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFriends"></a>
# **findFriends**
> kotlin.Array&lt;Account&gt; findFriends(since, offset, count, sortType)

Get friends list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friends which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friends. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
val sortType : kotlin.String = sortType_example // kotlin.String | Friends which sorted by accountName or friendsAt. Default is friendsAt.
try {
    val result : kotlin.Array<Account> = apiInstance.findFriends(since, offset, count, sortType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters friends which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of friends. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]
 **sortType** | **kotlin.String**| Friends which sorted by accountName or friendsAt. Default is friendsAt. | [optional] [enum: friendsAt, accountName]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGroupInvitations"></a>
# **findGroupInvitations**
> kotlin.Array&lt;GroupInvitation&gt; findGroupInvitations(since, offset, count)

Get invitations list session account received

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters invitations which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of group invitations. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<GroupInvitation> = apiInstance.findGroupInvitations(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findGroupInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findGroupInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters invitations which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of group invitations. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;GroupInvitation&gt;**](GroupInvitation.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGroups"></a>
# **findGroups**
> kotlin.Array&lt;Group&gt; findGroups(since, offset, count)

Get groups list session account groupJoined

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of groups. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findGroups(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of groups. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findHiddenGroups"></a>
# **findHiddenGroups**
> kotlin.Array&lt;Group&gt; findHiddenGroups(since, offset, count)

Get hidden groups list session account groupJoined

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of groups. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findHiddenGroups(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findHiddenGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findHiddenGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of groups. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findLikes"></a>
# **findLikes**
> kotlin.Array&lt;Feed&gt; findLikes(since, offset, count)

Get feeds list session account set a like

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
    val result : kotlin.Array<Feed> = apiInstance.findLikes(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findLikes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findLikes")
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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findMutingAccounts"></a>
# **findMutingAccounts**
> kotlin.Array&lt;Account&gt; findMutingAccounts(since, offset, count)

Get accounts list session account muted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findMutingAccounts(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#findMutingAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#findMutingAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSession"></a>
# **findSession**
> Account findSession()

Get basic information about session account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
try {
    val result : Account = apiInstance.findSession()
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

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAccountName"></a>
# **updateAccountName**
> updateAccountName(body)

Update the account name

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionAccountNameBody =  // PutSessionAccountNameBody | 
try {
    apiInstance.updateAccountName(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateAccountName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateAccountName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSessionAccountNameBody**](PutSessionAccountNameBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

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
val body : PutSessionPasswordBody =  // PutSessionPasswordBody | 
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
 **body** | [**PutSessionPasswordBody**](PutSessionPasswordBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

