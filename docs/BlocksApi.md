# BlocksApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findBlockingAccounts**](BlocksApi.md#findBlockingAccounts) | **GET** /session/blocks | Get blocking accounts list


<a name="findBlockingAccounts"></a>
# **findBlockingAccounts**
> kotlin.Array&lt;Account&gt; findBlockingAccounts(since, offset, count)

Get blocking accounts list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
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
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

