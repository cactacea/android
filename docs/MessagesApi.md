# MessagesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMessage**](MessagesApi.md#deleteMessage) | **DELETE** /messages | Delete messages form a group
[**findMessages**](MessagesApi.md#findMessages) | **GET** /messages | Search messages
[**postMessage**](MessagesApi.md#postMessage) | **POST** /messages | Post a message to a group


<a name="deleteMessage"></a>
# **deleteMessage**
> deleteMessage(deleteMessagesBody)

Delete messages form a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val deleteMessagesBody : DeleteMessagesBody =  // DeleteMessagesBody | 
try {
    apiInstance.deleteMessage(deleteMessagesBody)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#deleteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#deleteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteMessagesBody** | [**DeleteMessagesBody**](DeleteMessagesBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findMessages"></a>
# **findMessages**
> Message findMessages(id, ascending, since, offset, count)

Search messages

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
val ascending : kotlin.Boolean = true // kotlin.Boolean | Order by posted time.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters messages which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of messages. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : Message = apiInstance.findMessages(id, ascending, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#findMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#findMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]
 **ascending** | **kotlin.Boolean**| Order by posted time. | [default to null]
 **since** | **java.math.BigDecimal**| Filters messages which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of messages. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**Message**](Message.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postMessage"></a>
# **postMessage**
> MessageCreated postMessage(postMessageBody)

Post a message to a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val postMessageBody : PostMessageBody =  // PostMessageBody | 
try {
    val result : MessageCreated = apiInstance.postMessage(postMessageBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#postMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#postMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postMessageBody** | [**PostMessageBody**](PostMessageBody.md)|  |

### Return type

[**MessageCreated**](MessageCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

