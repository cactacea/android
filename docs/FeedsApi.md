# FeedsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFeed**](FeedsApi.md#deleteFeed) | **DELETE** /feeds/{id} | Delete a feed
[**findFeed**](FeedsApi.md#findFeed) | **GET** /feeds/{id} | Get basic information about a feed
[**postFeed**](FeedsApi.md#postFeed) | **POST** /feeds | Post a feed
[**reportFeed**](FeedsApi.md#reportFeed) | **POST** /feeds/{id}/reports | Report a feed
[**updateFeed**](FeedsApi.md#updateFeed) | **PUT** /feeds/{id} | Update a feed


<a name="deleteFeed"></a>
# **deleteFeed**
> deleteFeed(id)

Delete a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
try {
    apiInstance.deleteFeed(id)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#deleteFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#deleteFeed")
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

<a name="findFeed"></a>
# **findFeed**
> Feed findFeed(id)

Get basic information about a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
try {
    val result : Feed = apiInstance.findFeed(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#findFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#findFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |

### Return type

[**Feed**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postFeed"></a>
# **postFeed**
> FeedCreated postFeed(body)

Post a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val body : PostFeedBody =  // PostFeedBody | 
try {
    val result : FeedCreated = apiInstance.postFeed(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#postFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#postFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFeedBody**](PostFeedBody.md)|  |

### Return type

[**FeedCreated**](FeedCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportFeed"></a>
# **reportFeed**
> reportFeed(id, body)

Report a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
val body : PostFeedReportBody =  // PostFeedReportBody | 
try {
    apiInstance.reportFeed(id, body)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#reportFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#reportFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |
 **body** | [**PostFeedReportBody**](PostFeedReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateFeed"></a>
# **updateFeed**
> updateFeed(id, body)

Update a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
val body : PutFeedBody =  // PutFeedBody | 
try {
    apiInstance.updateFeed(id, body)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#updateFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#updateFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Feed identifier. |
 **body** | [**PutFeedBody**](PutFeedBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

