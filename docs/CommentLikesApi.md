# CommentLikesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAccountsLikedComment**](CommentLikesApi.md#findAccountsLikedComment) | **GET** /comments/{id}/likes | Get accounts list who liked on a comment
[**likeComment**](CommentLikesApi.md#likeComment) | **POST** /comments/{id}/likes | Set a like on a comment
[**unlikeComment**](CommentLikesApi.md#unlikeComment) | **DELETE** /comments/{id}/likes | Remove a like on a comment


<a name="findAccountsLikedComment"></a>
# **findAccountsLikedComment**
> kotlin.Array&lt;Account&gt; findAccountsLikedComment(id, since, offset, count)

Get accounts list who liked on a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findAccountsLikedComment(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentLikesApi#findAccountsLikedComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentLikesApi#findAccountsLikedComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Comment Identifier. |
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

<a name="likeComment"></a>
# **likeComment**
> likeComment(id)

Set a like on a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
try {
    apiInstance.likeComment(id)
} catch (e: ClientException) {
    println("4xx response calling CommentLikesApi#likeComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentLikesApi#likeComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Comment Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unlikeComment"></a>
# **unlikeComment**
> unlikeComment(id)

Remove a like on a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
try {
    apiInstance.unlikeComment(id)
} catch (e: ClientException) {
    println("4xx response calling CommentLikesApi#unlikeComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentLikesApi#unlikeComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Comment Identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

