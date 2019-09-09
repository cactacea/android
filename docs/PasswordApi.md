# PasswordApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recover**](PasswordApi.md#recover) | **POST** /password/recover | Recover password
[**reset**](PasswordApi.md#reset) | **POST** /password/reset | Reset Password


<a name="recover"></a>
# **recover**
> recover(body)

Recover password

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = PasswordApi()
val body : PostRecoverBody =  // PostRecoverBody | 
try {
    apiInstance.recover(body)
} catch (e: ClientException) {
    println("4xx response calling PasswordApi#recover")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PasswordApi#recover")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecoverBody**](PostRecoverBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reset"></a>
# **reset**
> reset(body)

Reset Password

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = PasswordApi()
val body : PostResetBody =  // PostResetBody | 
try {
    apiInstance.reset(body)
} catch (e: ClientException) {
    println("4xx response calling PasswordApi#reset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PasswordApi#reset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostResetBody**](PostResetBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

