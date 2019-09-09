# ChannelsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChannel**](ChannelsApi.md#createChannel) | **POST** /channels | Create a channel
[**deleteChannel**](ChannelsApi.md#deleteChannel) | **DELETE** /channels/{id} | Hide a channel and delete all messages
[**findChannel**](ChannelsApi.md#findChannel) | **GET** /channels/{id} | Get basic information about a channel
[**findChannelUsers**](ChannelsApi.md#findChannelUsers) | **GET** /channels/{id}/users | Get users list of a channel
[**hideChannel**](ChannelsApi.md#hideChannel) | **POST** /channels/{id}/hides | Hide a channel
[**joinChannel**](ChannelsApi.md#joinChannel) | **POST** /channels/{id}/join | Join to a channel,
[**leaveChannel**](ChannelsApi.md#leaveChannel) | **POST** /channels/{id}/leave | Leave from a channel
[**reportChannel**](ChannelsApi.md#reportChannel) | **POST** /channels/{id}/reports | Report a channel
[**showChannel**](ChannelsApi.md#showChannel) | **DELETE** /channels/{id}/hides | Show a channel
[**updateChannel**](ChannelsApi.md#updateChannel) | **PUT** /channels/{id} | Update a channel


<a name="createChannel"></a>
# **createChannel**
> ChannelCreated createChannel(body)

Create a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val body : PostChannelBody =  // PostChannelBody | 
try {
    val result : ChannelCreated = apiInstance.createChannel(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#createChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#createChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostChannelBody**](PostChannelBody.md)|  |

### Return type

[**ChannelCreated**](ChannelCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteChannel"></a>
# **deleteChannel**
> deleteChannel(id)

Hide a channel and delete all messages

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
try {
    apiInstance.deleteChannel(id)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#deleteChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#deleteChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findChannel"></a>
# **findChannel**
> Channel findChannel(id)

Get basic information about a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
try {
    val result : Channel = apiInstance.findChannel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#findChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#findChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findChannelUsers"></a>
# **findChannelUsers**
> kotlin.Array&lt;Channel&gt; findChannelUsers(id, since, offset, count)

Get users list of a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters users which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of users. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Channel> = apiInstance.findChannelUsers(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#findChannelUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#findChannelUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |
 **since** | **java.math.BigDecimal**| Filters users which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of users. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of users returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="hideChannel"></a>
# **hideChannel**
> hideChannel(id)

Hide a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
try {
    apiInstance.hideChannel(id)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#hideChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#hideChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="joinChannel"></a>
# **joinChannel**
> joinChannel(id)

Join to a channel,

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
try {
    apiInstance.joinChannel(id)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#joinChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#joinChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="leaveChannel"></a>
# **leaveChannel**
> leaveChannel(id)

Leave from a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Invitation identifier.
try {
    apiInstance.leaveChannel(id)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#leaveChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#leaveChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Invitation identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportChannel"></a>
# **reportChannel**
> reportChannel(id, body)

Report a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
val body : PostChannelReportBody =  // PostChannelReportBody | 
try {
    apiInstance.reportChannel(id, body)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#reportChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#reportChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |
 **body** | [**PostChannelReportBody**](PostChannelReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="showChannel"></a>
# **showChannel**
> showChannel(id)

Show a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
try {
    apiInstance.showChannel(id)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#showChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#showChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateChannel"></a>
# **updateChannel**
> updateChannel(id, body)

Update a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = ChannelsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
val body : PutChannelBody =  // PutChannelBody | 
try {
    apiInstance.updateChannel(id, body)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#updateChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#updateChannel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel identifier. |
 **body** | [**PutChannelBody**](PutChannelBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

