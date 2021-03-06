# MessagesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMessage**](MessagesApi.md#deleteMessage) | **DELETE** /messages | Delete messages form a channel
[**findMessages**](MessagesApi.md#findMessages) | **GET** /messages | Search messages
[**postMedium**](MessagesApi.md#postMedium) | **POST** /messages/medium | Send a medium to a channel
[**postText**](MessagesApi.md#postText) | **POST** /messages/text | Send a text to a channel


<a name="deleteMessage"></a>
# **deleteMessage**
> deleteMessage(body)

Delete messages form a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val body : DeleteMessagesBody =  // DeleteMessagesBody | 
try {
    apiInstance.deleteMessage(body)
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
 **body** | [**DeleteMessagesBody**](DeleteMessagesBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findMessages"></a>
# **findMessages**
> kotlin.Array&lt;Message&gt; findMessages(id, ascending, since, offset, count)

Search messages

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel identifier.
val ascending : kotlin.Boolean = true // kotlin.Boolean | Order by posted time.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters messages which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of messages. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Message> = apiInstance.findMessages(id, ascending, since, offset, count)
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
 **id** | **java.math.BigDecimal**| Channel identifier. |
 **ascending** | **kotlin.Boolean**| Order by posted time. |
 **since** | **java.math.BigDecimal**| Filters messages which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of messages. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of entries returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Message&gt;**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postMedium"></a>
# **postMedium**
> Message postMedium(body)

Send a medium to a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val body : PostMediumBody =  // PostMediumBody | 
try {
    val result : Message = apiInstance.postMedium(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#postMedium")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#postMedium")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostMediumBody**](PostMediumBody.md)|  |

### Return type

[**Message**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postText"></a>
# **postText**
> Message postText(body)

Send a text to a channel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MessagesApi()
val body : PostTextBody =  // PostTextBody | 
try {
    val result : Message = apiInstance.postText(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessagesApi#postText")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessagesApi#postText")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostTextBody**](PostTextBody.md)|  |

### Return type

[**Message**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

