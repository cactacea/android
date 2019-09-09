# FeedLikesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUsersLikedFeed**](FeedLikesApi.md#findUsersLikedFeed) | **GET** /feeds/{id}/likes | Get users list who set a like to a feed
[**likeFeed**](FeedLikesApi.md#likeFeed) | **POST** /feeds/{id}/likes | Set a like on a feed
[**unlikeFeed**](FeedLikesApi.md#unlikeFeed) | **DELETE** /feeds/{id}/likes | Remove a like on a feed


<a name="findUsersLikedFeed"></a>
# **findUsersLikedFeed**
> kotlin.Array&lt;User&gt; findUsersLikedFeed(id, since, offset, count)

Get users list who set a like to a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<User> = apiInstance.findUsersLikedFeed(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedLikesApi#findUsersLikedFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedLikesApi#findUsersLikedFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |
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

<a name="likeFeed"></a>
# **likeFeed**
> likeFeed(id)

Set a like on a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
try {
    apiInstance.likeFeed(id)
} catch (e: ClientException) {
    println("4xx response calling FeedLikesApi#likeFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedLikesApi#likeFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unlikeFeed"></a>
# **unlikeFeed**
> unlikeFeed(id)

Remove a like on a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedLikesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
try {
    apiInstance.unlikeFeed(id)
} catch (e: ClientException) {
    println("4xx response calling FeedLikesApi#unlikeFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedLikesApi#unlikeFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

