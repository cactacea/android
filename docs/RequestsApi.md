# RequestsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept**](RequestsApi.md#accept) | **POST** /session/requests/{id}/accept | Accept a friend request
[**createFriendRequest**](RequestsApi.md#createFriendRequest) | **POST** /accounts/{id}/requests | Create a friend request to a account
[**deleteRequest**](RequestsApi.md#deleteRequest) | **DELETE** /accounts/{id}/requests | Remove a friend request to a account
[**findSessionFriendRequests**](RequestsApi.md#findSessionFriendRequests) | **GET** /session/requests | Get friend requests list session account created or received
[**reject**](RequestsApi.md#reject) | **POST** /session/requests/{id}/reject | Reject a friend request


<a name="accept"></a>
# **accept**
> accept(id)

Accept a friend request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Friend request Identifier.
try {
    apiInstance.accept(id)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#accept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#accept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Friend request Identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createFriendRequest"></a>
# **createFriendRequest**
> FriendRequestCreated createFriendRequest(id)

Create a friend request to a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    val result : FriendRequestCreated = apiInstance.createFriendRequest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#createFriendRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#createFriendRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. | [default to null]

### Return type

[**FriendRequestCreated**](FriendRequestCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteRequest"></a>
# **deleteRequest**
> deleteRequest(id)

Remove a friend request to a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.deleteRequest(id)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#deleteRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#deleteRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findSessionFriendRequests"></a>
# **findSessionFriendRequests**
> kotlin.Array&lt;FriendRequest&gt; findSessionFriendRequests(received, since, offset, count)

Get friend requests list session account created or received

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val received : kotlin.Boolean = true // kotlin.Boolean | Filters friend requests which you have received or sent.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friend requests which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friend request. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friend request returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<FriendRequest> = apiInstance.findSessionFriendRequests(received, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#findSessionFriendRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#findSessionFriendRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **received** | **kotlin.Boolean**| Filters friend requests which you have received or sent. | [default to null]
 **since** | **java.math.BigDecimal**| Filters friend requests which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of friend request. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of friend request returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;FriendRequest&gt;**](FriendRequest.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reject"></a>
# **reject**
> reject(id)

Reject a friend request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Friend request Identifier.
try {
    apiInstance.reject(id)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#reject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#reject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Friend request Identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

