# SettingsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPushNotification**](SettingsApi.md#findPushNotification) | **GET** /session/push/notification | Get push notification settings
[**updateDeviceStatus**](SettingsApi.md#updateDeviceStatus) | **PUT** /session/device | Update device status
[**updatePushNotification**](SettingsApi.md#updatePushNotification) | **PUT** /session/push/notification | Update ths push notification settings


<a name="findPushNotification"></a>
# **findPushNotification**
> PushNotificationSetting findPushNotification()

Get push notification settings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
try {
    val result : PushNotificationSetting = apiInstance.findPushNotification()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#findPushNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#findPushNotification")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PushNotificationSetting**](PushNotificationSetting.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDeviceStatus"></a>
# **updateDeviceStatus**
> updateDeviceStatus(body)

Update device status

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
val body : PutDeviceBody =  // PutDeviceBody | 
try {
    apiInstance.updateDeviceStatus(body)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updateDeviceStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updateDeviceStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutDeviceBody**](PutDeviceBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePushNotification"></a>
# **updatePushNotification**
> updatePushNotification(body)

Update ths push notification settings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
val body : PutNotificationSettingBody =  // PutNotificationSettingBody | 
try {
    apiInstance.updatePushNotification(body)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updatePushNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updatePushNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutNotificationSettingBody**](PutNotificationSettingBody.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

