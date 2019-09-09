# FriendRequestsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptRequest**](FriendRequestsApi.md#acceptRequest) | **POST** /requests/{id}/accept | Accept a friend request
[**rejectRequest**](FriendRequestsApi.md#rejectRequest) | **POST** /requests/{id}/reject | Reject a friend request


<a name="acceptRequest"></a>
# **acceptRequest**
> acceptRequest(id)

Accept a friend request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FriendRequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | friend request Identifier.
try {
    apiInstance.acceptRequest(id)
} catch (e: ClientException) {
    println("4xx response calling FriendRequestsApi#acceptRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendRequestsApi#acceptRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| friend request Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rejectRequest"></a>
# **rejectRequest**
> rejectRequest(id)

Reject a friend request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FriendRequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | friend request Identifier.
try {
    apiInstance.rejectRequest(id)
} catch (e: ClientException) {
    println("4xx response calling FriendRequestsApi#rejectRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendRequestsApi#rejectRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| friend request Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

