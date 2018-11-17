# SessionsApi

All URIs are relative to *http://localhost*

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
//import org.openapitools.client.infrastructure.*
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
 **name** | **kotlin.String**| Account name. | [default to null]
 **password** | **kotlin.String**| Account password. | [default to null]
 **udid** | **kotlin.String**| Unique Device Identifier. | [default to null]
 **userAgent** | **kotlin.String**|  | [optional] [default to null]

### Return type

[**Authentication**](Authentication.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="signUp"></a>
# **signUp**
> Authentication signUp(postSignUpBody, userAgent)

Sign up

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SessionsApi()
val postSignUpBody : PostSignUpBody =  // PostSignUpBody | 
val userAgent : kotlin.String = userAgent_example // kotlin.String | 
try {
    val result : Authentication = apiInstance.signUp(postSignUpBody, userAgent)
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
 **postSignUpBody** | [**PostSignUpBody**](PostSignUpBody.md)|  |
 **userAgent** | **kotlin.String**|  | [optional] [default to null]

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

