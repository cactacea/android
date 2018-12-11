# RequestsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept**](RequestsApi.md#accept) | **POST** /requests/{id}/accept | Accept a friend request
[**create**](RequestsApi.md#create) | **POST** /accounts/{id}/requests | Create a friend request to a account
[**delete**](RequestsApi.md#delete) | **DELETE** /accounts/{id}/requests | Remove a friend request to a account
[**reject**](RequestsApi.md#reject) | **POST** /requests/{id}/reject | Reject a friend request


<a name="accept"></a>
# **accept**
> accept(id)

Accept a friend request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Friend request Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="create"></a>
# **create**
> FriendRequestCreated create(id)

Create a friend request to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    val result : FriendRequestCreated = apiInstance.create(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#create")
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

<a name="delete"></a>
# **delete**
> delete(id)

Remove a friend request to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = RequestsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.delete(id)
} catch (e: ClientException) {
    println("4xx response calling RequestsApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestsApi#delete")
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

<a name="reject"></a>
# **reject**
> reject(id)

Reject a friend request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Friend request Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

