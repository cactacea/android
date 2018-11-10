# FollowsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAccountFollowers**](FollowsApi.md#findAccountFollowers) | **GET** /accounts/{id}/followers | Get accounts list a account is followed by
[**findFollows**](FollowsApi.md#findFollows) | **GET** /accounts/{id}/follows | Get accounts list a account followed
[**follow**](FollowsApi.md#follow) | **POST** /accounts/{id}/follows | Follow a account
[**unfollow**](FollowsApi.md#unfollow) | **DELETE** /accounts/{id}/follows | UnFollow a account


<a name="findAccountFollowers"></a>
# **findAccountFollowers**
> kotlin.Array&lt;Account&gt; findAccountFollowers(id, since, offset, count)

Get accounts list a account is followed by

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FollowsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters followers which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of followers. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findAccountFollowers(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FollowsApi#findAccountFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FollowsApi#findAccountFollowers")
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

<a name="findFollows"></a>
# **findFollows**
> kotlin.Array&lt;Account&gt; findFollows(id, since, offset, count)

Get accounts list a account followed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FollowsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters follower which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of follower. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findFollows(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FollowsApi#findFollows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FollowsApi#findFollows")
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

<a name="follow"></a>
# **follow**
> follow(id)

Follow a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FollowsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.follow(id)
} catch (e: ClientException) {
    println("4xx response calling FollowsApi#follow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FollowsApi#follow")
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

<a name="unfollow"></a>
# **unfollow**
> unfollow(id)

UnFollow a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FollowsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.unfollow(id)
} catch (e: ClientException) {
    println("4xx response calling FollowsApi#unfollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FollowsApi#unfollow")
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

