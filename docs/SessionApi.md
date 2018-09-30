# SessionApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSessionProfileImage**](SessionApi.md#deleteSessionProfileImage) | **DELETE** /session/profile_image | Remove the profile image
[**findSession**](SessionApi.md#findSession) | **GET** /session | Get basic information about session account
[**findSessionFeeds**](SessionApi.md#findSessionFeeds) | **GET** /session/feeds | Get feeds list session account posted
[**findSessionFollowers**](SessionApi.md#findSessionFollowers) | **GET** /session/followers | Get accounts list session account is followed by
[**findSessionFollows**](SessionApi.md#findSessionFollows) | **GET** /session/follows | Get accounts list session account followed
[**findSessionFriends**](SessionApi.md#findSessionFriends) | **GET** /session/friends | Get friends list
[**findSessionLikes**](SessionApi.md#findSessionLikes) | **GET** /session/likes | Get feeds list session account set a like
[**signOut**](SessionApi.md#signOut) | **DELETE** /session | Sign out
[**updateSessionAccountName**](SessionApi.md#updateSessionAccountName) | **PUT** /session/account_name | Update the account name
[**updateSessionPassword**](SessionApi.md#updateSessionPassword) | **PUT** /session/password | Update the password
[**updateSessionProfile**](SessionApi.md#updateSessionProfile) | **PUT** /session/profile | Update the profile
[**updateSessionProfileImage**](SessionApi.md#updateSessionProfileImage) | **PUT** /session/profile_image | Update the profile image


<a name="deleteSessionProfileImage"></a>
# **deleteSessionProfileImage**
> deleteSessionProfileImage()

Remove the profile image

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
try {
    apiInstance.deleteSessionProfileImage()
} catch (e: ClientException) {
    println("4xx response calling SessionApi#deleteSessionProfileImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#deleteSessionProfileImage")
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

<a name="findSessionFeeds"></a>
# **findSessionFeeds**
> Feed findSessionFeeds(since, offset, count)

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
    val result : Feed = apiInstance.findSessionFeeds(since, offset, count)
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
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**Feed**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionFollowers"></a>
# **findSessionFollowers**
> kotlin.Array&lt;Account&gt; findSessionFollowers(since, offset, count)

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
    val result : kotlin.Array<Account> = apiInstance.findSessionFollowers(since, offset, count)
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

<a name="findSessionFollows"></a>
# **findSessionFollows**
> kotlin.Array&lt;Account&gt; findSessionFollows(since, offset, count)

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
    val result : kotlin.Array<Account> = apiInstance.findSessionFollows(since, offset, count)
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

<a name="findSessionFriends"></a>
# **findSessionFriends**
> kotlin.Array&lt;Account&gt; findSessionFriends(since, offset, count)

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
try {
    val result : kotlin.Array<Account> = apiInstance.findSessionFriends(since, offset, count)
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

<a name="findSessionLikes"></a>
# **findSessionLikes**
> Feed findSessionLikes(since, offset, count)

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
    val result : Feed = apiInstance.findSessionLikes(since, offset, count)
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

[**Feed**](Feed.md)

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

<a name="updateSessionAccountName"></a>
# **updateSessionAccountName**
> updateSessionAccountName(body)

Update the account name

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionAccountNameBody =  // PutSessionAccountNameBody | 
try {
    apiInstance.updateSessionAccountName(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateSessionAccountName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateSessionAccountName")
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

<a name="updateSessionPassword"></a>
# **updateSessionPassword**
> updateSessionPassword(body)

Update the password

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionPasswordBody =  // PutSessionPasswordBody | 
try {
    apiInstance.updateSessionPassword(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateSessionPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateSessionPassword")
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

<a name="updateSessionProfile"></a>
# **updateSessionProfile**
> updateSessionProfile(body)

Update the profile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionProfileBody =  // PutSessionProfileBody | 
try {
    apiInstance.updateSessionProfile(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateSessionProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateSessionProfile")
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

<a name="updateSessionProfileImage"></a>
# **updateSessionProfileImage**
> updateSessionProfileImage(body)

Update the profile image

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionApi()
val body : PutSessionProfileImageBody =  // PutSessionProfileImageBody | 
try {
    apiInstance.updateSessionProfileImage(body)
} catch (e: ClientException) {
    println("4xx response calling SessionApi#updateSessionProfileImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionApi#updateSessionProfileImage")
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

