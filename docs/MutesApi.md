# MutesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findSessionMutes**](MutesApi.md#findSessionMutes) | **GET** /session/mutes | Get accounts list session account muted
[**muteAccount**](MutesApi.md#muteAccount) | **POST** /accounts/{id}/mutes | Mute a account
[**unmuteAccount**](MutesApi.md#unmuteAccount) | **DELETE** /accounts/{id}/mutes | UnMute a account


<a name="findSessionMutes"></a>
# **findSessionMutes**
> kotlin.Array&lt;Account&gt; findSessionMutes(since, offset, count)

Get accounts list session account muted

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MutesApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findSessionMutes(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MutesApi#findSessionMutes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MutesApi#findSessionMutes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="muteAccount"></a>
# **muteAccount**
> muteAccount(id)

Mute a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Account Identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="unmuteAccount"></a>
# **unmuteAccount**
> unmuteAccount(id)

UnMute a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Account identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

