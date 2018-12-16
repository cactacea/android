# FriendRequestsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept**](FriendRequestsApi.md#accept) | **POST** /requests/{id}/accept | Accept a friend request
[**reject**](FriendRequestsApi.md#reject) | **POST** /requests/{id}/reject | Reject a friend request


<a name="accept"></a>
# **accept**
> accept(id)

Accept a friend request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FriendRequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Friend request Identifier.
try {
    apiInstance.accept(id)
} catch (e: ClientException) {
    println("4xx response calling FriendRequestsApi#accept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendRequestsApi#accept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Friend request Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reject"></a>
# **reject**
> reject(id)

Reject a friend request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FriendRequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Friend request Identifier.
try {
    apiInstance.reject(id)
} catch (e: ClientException) {
    println("4xx response calling FriendRequestsApi#reject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendRequestsApi#reject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Friend request Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

