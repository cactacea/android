# SettingsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findSessionPushNotificationSettings**](SettingsApi.md#findSessionPushNotificationSettings) | **GET** /session/push_notification | Get this push notification settings
[**updateSessionDeviceStatus**](SettingsApi.md#updateSessionDeviceStatus) | **POST** /session/status | Update device status
[**updateSessionPushNotificationSettings**](SettingsApi.md#updateSessionPushNotificationSettings) | **PUT** /session/push_notification | Update ths push notification settings
[**updateSessionPushToken**](SettingsApi.md#updateSessionPushToken) | **POST** /session/push_token | Update device push token


<a name="findSessionPushNotificationSettings"></a>
# **findSessionPushNotificationSettings**
> PushNotificationSetting findSessionPushNotificationSettings()

Get this push notification settings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
try {
    val result : PushNotificationSetting = apiInstance.findSessionPushNotificationSettings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#findSessionPushNotificationSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#findSessionPushNotificationSettings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PushNotificationSetting**](PushNotificationSetting.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateSessionDeviceStatus"></a>
# **updateSessionDeviceStatus**
> updateSessionDeviceStatus(body)

Update device status

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
val body : PostActiveStatusBody =  // PostActiveStatusBody | 
try {
    apiInstance.updateSessionDeviceStatus(body)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updateSessionDeviceStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updateSessionDeviceStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostActiveStatusBody**](PostActiveStatusBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateSessionPushNotificationSettings"></a>
# **updateSessionPushNotificationSettings**
> updateSessionPushNotificationSettings()

Update ths push notification settings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
try {
    apiInstance.updateSessionPushNotificationSettings()
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updateSessionPushNotificationSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updateSessionPushNotificationSettings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateSessionPushToken"></a>
# **updateSessionPushToken**
> updateSessionPushToken(body)

Update device push token

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
val body : PostDevicePushTokenBody =  // PostDevicePushTokenBody | 
try {
    apiInstance.updateSessionPushToken(body)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updateSessionPushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updateSessionPushToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostDevicePushTokenBody**](PostDevicePushTokenBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

