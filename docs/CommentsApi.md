# CommentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteComment**](CommentsApi.md#deleteComment) | **DELETE** /comments/{id} | Delete a comment
[**findComment**](CommentsApi.md#findComment) | **GET** /comments/{id} | Get basic information about a comment
[**findComments**](CommentsApi.md#findComments) | **GET** /comments | Search comments
[**postComment**](CommentsApi.md#postComment) | **POST** /comments | Create a comment on a feed
[**reportComment**](CommentsApi.md#reportComment) | **POST** /comments/{id}/reports | Report a comment


<a name="deleteComment"></a>
# **deleteComment**
> deleteComment(id)

Delete a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
try {
    apiInstance.deleteComment(id)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#deleteComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#deleteComment")
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

<a name="findComment"></a>
# **findComment**
> Comment findComment(id)

Get basic information about a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
try {
    val result : Comment = apiInstance.findComment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#findComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#findComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Comment Identifier. |

### Return type

[**Comment**](Comment.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findComments"></a>
# **findComments**
> kotlin.Array&lt;Comment&gt; findComments(id, since, offset, count)

Search comments

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters comments which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of comments. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of comments returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Comment> = apiInstance.findComments(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#findComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#findComments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |
 **since** | **java.math.BigDecimal**| Filters comments which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of comments. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of comments returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Comment&gt;**](Comment.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postComment"></a>
# **postComment**
> CommentCreated postComment(body)

Create a comment on a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentsApi()
val body : PostCommentBody =  // PostCommentBody | 
try {
    val result : CommentCreated = apiInstance.postComment(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#postComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#postComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCommentBody**](PostCommentBody.md)|  |

### Return type

[**CommentCreated**](CommentCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportComment"></a>
# **reportComment**
> reportComment(id, body)

Report a comment

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = CommentsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Comment Identifier.
val body : PostCommentReportBody =  // PostCommentReportBody | 
try {
    apiInstance.reportComment(id, body)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#reportComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#reportComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Comment Identifier. |
 **body** | [**PostCommentReportBody**](PostCommentReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

