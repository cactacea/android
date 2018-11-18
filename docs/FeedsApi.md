# FeedsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFeed**](FeedsApi.md#deleteFeed) | **DELETE** /feeds/{id} | Delete a feed
[**findAccountFeeds**](FeedsApi.md#findAccountFeeds) | **GET** /accounts/{id}/feeds | Get feeds list a account posted
[**findAccountLikes**](FeedsApi.md#findAccountLikes) | **GET** /accounts/{id}/likes | Get account&#39;s liked feeds
[**findFeed**](FeedsApi.md#findFeed) | **GET** /feeds/{id} | Get basic information about a feed
[**findFeeds**](FeedsApi.md#findFeeds) | **GET** /feeds | Search feeds
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
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Feed identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAccountFeeds"></a>
# **findAccountFeeds**
> Feed findAccountFeeds(id, since, offset, count)

Get feeds list a account posted

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Account Identifier. | [default to null]
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**Feed**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAccountLikes"></a>
# **findAccountLikes**
> kotlin.Array&lt;Feed&gt; findAccountLikes(id, since, offset, count)

Get account&#39;s liked feeds

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Account Identifier. | [default to null]
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findFeed"></a>
# **findFeed**
> Feed findFeed(id)

Get basic information about a feed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Feed identifier. | [default to null]

### Return type

[**Feed**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findFeeds"></a>
# **findFeeds**
> kotlin.Array&lt;Feed&gt; findFeeds(since, offset, feedPrivacyType, count)

Search feeds

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **since** | **java.math.BigDecimal**| Filters feeds which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of feeds. By default the value is 0. | [optional] [default to null]
 **feedPrivacyType** | **kotlin.String**| Feed privacy type. By default the value is everyone. | [optional] [default to null] [enum: everyone, followers, friends, self]
 **count** | **java.math.BigDecimal**| Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Feed&gt;**](Feed.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postFeed"></a>
# **postFeed**
> FeedCreated postFeed(postFeedBody)

Post a feed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val postFeedBody : PostFeedBody =  // PostFeedBody | 
try {
    val result : FeedCreated = apiInstance.postFeed(postFeedBody)
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
 **postFeedBody** | [**PostFeedBody**](PostFeedBody.md)|  |

### Return type

[**FeedCreated**](FeedCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reportFeed"></a>
# **reportFeed**
> reportFeed(id, postFeedReportBody)

Report a feed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
val postFeedReportBody : PostFeedReportBody =  // PostFeedReportBody | 
try {
    apiInstance.reportFeed(id, postFeedReportBody)
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
 **id** | **java.math.BigDecimal**| Feed identifier. | [default to null]
 **postFeedReportBody** | [**PostFeedReportBody**](PostFeedReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFeed"></a>
# **updateFeed**
> updateFeed(id, putFeedBody)

Update a feed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FeedsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Feed identifier.
val putFeedBody : PutFeedBody =  // PutFeedBody | 
try {
    apiInstance.updateFeed(id, putFeedBody)
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
 **id** | **java.math.BigDecimal**| Feed identifier. | [default to null]
 **putFeedBody** | [**PutFeedBody**](PutFeedBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

