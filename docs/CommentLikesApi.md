# CommentLikesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUsersLikedComment**](CommentLikesApi.md#findUsersLikedComment) | **GET** /comments/{id}/likes | Get users list who liked on a comment
[**likeComment**](CommentLikesApi.md#likeComment) | **POST** /comments/{id}/likes | Set a like on a comment
[**unlikeComment**](CommentLikesApi.md#unlikeComment) | **DELETE** /comments/{id}/likes | Remove a like on a comment


<a name="findUsersLikedComment"></a>
# **findUsersLikedComment**
> kotlin.Array&lt;User&gt; findUsersLikedComment(id, since, offset, count)

Get users list who liked on a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findUsersLikedComment(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentLikesApi#findUsersLikedComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentLikesApi#findUsersLikedComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Comment Identifier. |
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

No authorization required

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

