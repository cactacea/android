# FeedsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](FeedsApi.md#delete) | **DELETE** /feeds/{id} | Delete a feed
[**findFeed**](FeedsApi.md#findFeed) | **GET** /feeds/{id} | Get basic information about a feed
[**findFeeds**](FeedsApi.md#findFeeds) | **GET** /feeds | Search feeds
[**post**](FeedsApi.md#post) | **POST** /feeds | Post a feed
[**report**](FeedsApi.md#report) | **POST** /feeds/{id}/reports | Report a feed
[**update**](FeedsApi.md#update) | **PUT** /feeds/{id} | Update a feed


<a name="delete"></a>
# **delete**
> delete(id)

Delete a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
try {
    apiInstance.delete(id)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#delete")
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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findFeeds"></a>
# **findFeeds**
> kotlin.Array&lt;Feed&gt; findFeeds(since, offset, feedPrivacyType, count)

Search feeds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters feeds which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of feeds. By default the value is 0.
val feedPrivacyType : kotlin.String = feedPrivacyType_example // kotlin.String | Feed privacy type. By default the value is everyone.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Feed> = apiInstance.findFeeds(since, offset, feedPrivacyType, count)
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
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional]
 **feedPrivacyType** | **kotlin.String**| Feed privacy type. By default the value is everyone. | [optional] [enum: everyone, followers, friends, self]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="post"></a>
# **post**
> FeedCreated post(body)

Post a feed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val body : PostFeedBody =  // PostFeedBody | 
try {
    val result : FeedCreated = apiInstance.post(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#post")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#post")
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

<a name="report"></a>
# **report**
> report(id, body)

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
    apiInstance.report(id, body)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#report")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#report")
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

<a name="update"></a>
# **update**
> update(id, body)

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
    apiInstance.update(id, body)
} catch (e: ClientException) {
    println("4xx response calling FeedsApi#update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FeedsApi#update")
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

