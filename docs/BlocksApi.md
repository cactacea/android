# BlocksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block**](BlocksApi.md#block) | **POST** /accounts/{id}/blocks | Block a account
[**findBlockingAccounts**](BlocksApi.md#findBlockingAccounts) | **GET** /session/blocks | Get blocking accounts list
[**unblock**](BlocksApi.md#unblock) | **DELETE** /accounts/{id}/blocks | Unblock a account


<a name="block"></a>
# **block**
> block(id)

Block a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = BlocksApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
try {
    apiInstance.block(id)
} catch (e: ClientException) {
    println("4xx response calling BlocksApi#block")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlocksApi#block")
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

<a name="findBlockingAccounts"></a>
# **findBlockingAccounts**
> kotlin.Array&lt;Account&gt; findBlockingAccounts(since, offset, count)

Get blocking accounts list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = BlocksApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findBlockingAccounts(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlocksApi#findBlockingAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlocksApi#findBlockingAccounts")
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

<a name="unblock"></a>
# **unblock**
> unblock(id)

Unblock a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = BlocksApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.unblock(id)
} catch (e: ClientException) {
    println("4xx response calling BlocksApi#unblock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlocksApi#unblock")
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

