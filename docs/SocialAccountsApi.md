# SocialAccountsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connect**](SocialAccountsApi.md#connect) | **POST** /social_accounts | Connect to social account
[**disconnect**](SocialAccountsApi.md#disconnect) | **DELETE** /social_accounts | Disconnect from social account
[**findSessionSocialAccounts**](SocialAccountsApi.md#findSessionSocialAccounts) | **GET** /social_accounts | Get status abount social accounts
[**issueCode**](SocialAccountsApi.md#issueCode) | **GET** /sessions/social_accounts/issue_code | Issue authentication code.
[**socialSignIn**](SocialAccountsApi.md#socialSignIn) | **GET** /sessions/social_accounts | Sign in by social accounts
[**socialSignUp**](SocialAccountsApi.md#socialSignUp) | **POST** /sessions/social_accounts | Sign up by social accounts


<a name="connect"></a>
# **connect**
> connect(accessTokenKey, accessTokenSecret, body)

Connect to social account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SocialAccountsApi()
val accessTokenKey : kotlin.String = accessTokenKey_example // kotlin.String | OAuth2 access token.
val accessTokenSecret : kotlin.String = accessTokenSecret_example // kotlin.String | OAuth2 access token secret.
val body : PostSocialAccountBody =  // PostSocialAccountBody | 
try {
    apiInstance.connect(accessTokenKey, accessTokenSecret, body)
} catch (e: ClientException) {
    println("4xx response calling SocialAccountsApi#connect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialAccountsApi#connect")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenKey** | **kotlin.String**| OAuth2 access token. |
 **accessTokenSecret** | **kotlin.String**| OAuth2 access token secret. |
 **body** | [**PostSocialAccountBody**](PostSocialAccountBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="disconnect"></a>
# **disconnect**
> disconnect()

Disconnect from social account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SocialAccountsApi()
try {
    apiInstance.disconnect()
} catch (e: ClientException) {
    println("4xx response calling SocialAccountsApi#disconnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialAccountsApi#disconnect")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findSessionSocialAccounts"></a>
# **findSessionSocialAccounts**
> kotlin.Array&lt;SocialAccount&gt; findSessionSocialAccounts()

Get status abount social accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SocialAccountsApi()
try {
    val result : kotlin.Array<SocialAccount> = apiInstance.findSessionSocialAccounts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialAccountsApi#findSessionSocialAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialAccountsApi#findSessionSocialAccounts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;SocialAccount&gt;**](SocialAccount.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="issueCode"></a>
# **issueCode**
> Account issueCode(providerKey, body)

Issue authentication code.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SocialAccountsApi()
val providerKey : kotlin.String = providerKey_example // kotlin.String | OAuth2 access token or phone number or email address.
val body : GetAuthenticationCodeBody =  // GetAuthenticationCodeBody | 
try {
    val result : Account = apiInstance.issueCode(providerKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialAccountsApi#issueCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialAccountsApi#issueCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerKey** | **kotlin.String**| OAuth2 access token or phone number or email address. |
 **body** | [**GetAuthenticationCodeBody**](GetAuthenticationCodeBody.md)|  |

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="socialSignIn"></a>
# **socialSignIn**
> Account socialSignIn(providerKey, authenticationCode, udid, body, userAgent)

Sign in by social accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SocialAccountsApi()
val providerKey : kotlin.String = providerKey_example // kotlin.String | OAuth2 access token or phone number or email address.
val authenticationCode : kotlin.String = authenticationCode_example // kotlin.String | OAuth2 access token secret or issued code.
val udid : kotlin.String = udid_example // kotlin.String | Unique Device Identifier.
val body : GetSocialAccountSignInBody =  // GetSocialAccountSignInBody | 
val userAgent : kotlin.String = userAgent_example // kotlin.String | 
try {
    val result : Account = apiInstance.socialSignIn(providerKey, authenticationCode, udid, body, userAgent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialAccountsApi#socialSignIn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialAccountsApi#socialSignIn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerKey** | **kotlin.String**| OAuth2 access token or phone number or email address. |
 **authenticationCode** | **kotlin.String**| OAuth2 access token secret or issued code. |
 **udid** | **kotlin.String**| Unique Device Identifier. |
 **body** | [**GetSocialAccountSignInBody**](GetSocialAccountSignInBody.md)|  |
 **userAgent** | **kotlin.String**|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="socialSignUp"></a>
# **socialSignUp**
> Account socialSignUp(providerKey, authenticationCode, udid, body, userAgent)

Sign up by social accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SocialAccountsApi()
val providerKey : kotlin.String = providerKey_example // kotlin.String | OAuth2 access token or phone number or email address.
val authenticationCode : kotlin.String = authenticationCode_example // kotlin.String | OAuth2 access token secret or issued code.
val udid : kotlin.String = udid_example // kotlin.String | Unique Device Identifier.
val body : PostSocialAccountSignUpBody =  // PostSocialAccountSignUpBody | 
val userAgent : kotlin.String = userAgent_example // kotlin.String | 
try {
    val result : Account = apiInstance.socialSignUp(providerKey, authenticationCode, udid, body, userAgent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialAccountsApi#socialSignUp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialAccountsApi#socialSignUp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerKey** | **kotlin.String**| OAuth2 access token or phone number or email address. |
 **authenticationCode** | **kotlin.String**| OAuth2 access token secret or issued code. |
 **udid** | **kotlin.String**| Unique Device Identifier. |
 **body** | [**PostSocialAccountSignUpBody**](PostSocialAccountSignUpBody.md)|  |
 **userAgent** | **kotlin.String**|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

