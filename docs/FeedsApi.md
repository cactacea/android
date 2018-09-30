# FeedsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFeed**](FeedsApi.md#deleteFeed) | **DELETE** /feeds/{id} | Delete this feed
[**findAccountFeeds**](FeedsApi.md#findAccountFeeds) | **GET** /accounts/{id}/feeds | Get feeds list this account posted
[**findAccountLikes**](FeedsApi.md#findAccountLikes) | **GET** /accounts/{id}/likes | Get account&#39;s liked feeds
[**findFeed**](FeedsApi.md#findFeed) | **GET** /feeds/{id} | Get basic information about this feed
[**findFeeds**](FeedsApi.md#findFeeds) | **GET** /feeds | Search feeds
[**postFeed**](FeedsApi.md#postFeed) | **POST** /feeds | Post a feed
[**reportFeed**](FeedsApi.md#reportFeed) | **POST** /feeds/{id}/reports | Report this feed
[**updateFeed**](FeedsApi.md#updateFeed) | **PUT** /feeds/{id} | Update this feed


<a name="deleteFeed"></a>
# **deleteFeed**
> deleteFeed(id)

Delete this feed

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccountFeeds"></a>
# **findAccountFeeds**
> Feed findAccountFeeds(id, since, offset, count)

Get feeds list this account posted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : Feed = apiInstance.findAccountFeeds(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#findAccountFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#findAccountFeeds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**Feed**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccountLikes"></a>
# **findAccountLikes**
> kotlin.Array&lt;Feed&gt; findAccountLikes(id, since, offset, count)

Get account&#39;s liked feeds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findAccountLikes(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#findAccountLikes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#findAccountLikes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFeed"></a>
# **findFeed**
> Feed findFeed(id)

Get basic information about this feed

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFeeds"></a>
# **findFeeds**
> kotlin.Array&lt;Feed&gt; findFeeds(body, since, offset, count)

Search feeds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val body : GetFeedsBody =  // GetFeedsBody | 
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findFeeds(body, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#findFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#findFeeds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetFeedsBody**](GetFeedsBody.md)|  |
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportFeed"></a>
# **reportFeed**
> reportFeed(id, body)

Report this feed

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateFeed"></a>
# **updateFeed**
> updateFeed(id, body)

Update this feed

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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

