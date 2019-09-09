# BlocksApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findBlockingUsers**](BlocksApi.md#findBlockingUsers) | **GET** /session/blocks | Get blocking users list


<a name="findBlockingUsers"></a>
# **findBlockingUsers**
> kotlin.Array&lt;User&gt; findBlockingUsers(userName, since, offset, count)

Get blocking users list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = BlocksApi()
val userName : kotlin.String = userName_example // kotlin.String | Filters users whose user name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findBlockingUsers(userName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlocksApi#findBlockingUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlocksApi#findBlockingUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **kotlin.String**| Filters users whose user name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters users which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of users. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

