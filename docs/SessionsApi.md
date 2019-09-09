# SessionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signIn**](SessionsApi.md#signIn) | **POST** /signin | Sign in
[**signUp**](SessionsApi.md#signUp) | **POST** /signup | Sign up


<a name="signIn"></a>
# **signIn**
> signIn(body)

Sign in

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionsApi()
val body : PostSignInBody =  // PostSignInBody | 
try {
    apiInstance.signIn(body)
} catch (e: ClientException) {
    println("4xx response calling SessionsApi#signIn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionsApi#signIn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSignInBody**](PostSignInBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="signUp"></a>
# **signUp**
> signUp(body)

Sign up

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionsApi()
val body : PostSignUpBody =  // PostSignUpBody | 
try {
    apiInstance.signUp(body)
} catch (e: ClientException) {
    println("4xx response calling SessionsApi#signUp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SessionsApi#signUp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSignUpBody**](PostSignUpBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

