# MutesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**muteAccount**](MutesApi.md#muteAccount) | **POST** /accounts/{id}/mutes | Mute a account
[**unmuteAccount**](MutesApi.md#unmuteAccount) | **DELETE** /accounts/{id}/mutes | UnMute a account


<a name="muteAccount"></a>
# **muteAccount**
> muteAccount(id)

Mute a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MutesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.muteAccount(id)
} catch (e: ClientException) {
    println("4xx response calling MutesApi#muteAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MutesApi#muteAccount")
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

<a name="unmuteAccount"></a>
# **unmuteAccount**
> unmuteAccount(id)

UnMute a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MutesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unmuteAccount(id)
} catch (e: ClientException) {
    println("4xx response calling MutesApi#unmuteAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MutesApi#unmuteAccount")
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

