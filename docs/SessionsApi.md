# SessionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signIn**](SessionsApi.md#signIn) | **GET** /sessions | Sign in
[**signUp**](SessionsApi.md#signUp) | **POST** /sessions | Sign up


<a name="signIn"></a>
# **signIn**
> Authentication signIn(name, password, udid, userAgent)

Sign in

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionsApi()
val name : kotlin.String = name_example // kotlin.String | Account name.
val password : kotlin.String = password_example // kotlin.String | Account password.
val udid : kotlin.String = udid_example // kotlin.String | Unique Device Identifier.
val userAgent : kotlin.String = userAgent_example // kotlin.String | 
try {
    val result : Authentication = apiInstance.signIn(name, password, udid, userAgent)
    println(result)
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
 **name** | **kotlin.String**| Account name. |
 **password** | **kotlin.String**| Account password. |
 **udid** | **kotlin.String**| Unique Device Identifier. |
 **userAgent** | **kotlin.String**|  | [optional]

### Return type

[**Authentication**](Authentication.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="signUp"></a>
# **signUp**
> Authentication signUp(body, userAgent)

Sign up

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionsApi()
val body : PostSignUpBody =  // PostSignUpBody | 
val userAgent : kotlin.String = userAgent_example // kotlin.String | 
try {
    val result : Authentication = apiInstance.signUp(body, userAgent)
    println(result)
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
 **userAgent** | **kotlin.String**|  | [optional]

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

