# NotificationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNotifications**](NotificationsApi.md#findNotifications) | **GET** /notifications | Search notifications


<a name="findNotifications"></a>
# **findNotifications**
> kotlin.Array&lt;Notification&gt; findNotifications(body, since, offset, count)

Search notifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = NotificationsApi()
val body : GetNotificationsBody =  // GetNotificationsBody | 
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters notifications which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of notifications. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of notifications returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Notification> = apiInstance.findNotifications(body, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#findNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#findNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetNotificationsBody**](GetNotificationsBody.md)|  |
 **since** | **java.math.BigDecimal**| Filters notifications which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of notifications. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of notifications returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Notification&gt;**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

