# SettingsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPushNotificationSettings**](SettingsApi.md#findPushNotificationSettings) | **GET** /session/push_notification | Get push notification settings
[**updateDeviceStatus**](SettingsApi.md#updateDeviceStatus) | **POST** /session/status | Update device status
[**updatePushNotificationSettings**](SettingsApi.md#updatePushNotificationSettings) | **PUT** /session/push_notification | Update ths push notification settings
[**updatePushToken**](SettingsApi.md#updatePushToken) | **POST** /session/push_token | Update device push token


<a name="findPushNotificationSettings"></a>
# **findPushNotificationSettings**
> PushNotificationSetting findPushNotificationSettings()

Get push notification settings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
try {
    val result : PushNotificationSetting = apiInstance.findPushNotificationSettings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#findPushNotificationSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#findPushNotificationSettings")
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
val body : PostActiveStatusBody =  // PostActiveStatusBody | 
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
 **body** | [**PostActiveStatusBody**](PostActiveStatusBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePushNotificationSettings"></a>
# **updatePushNotificationSettings**
> updatePushNotificationSettings(body)

Update ths push notification settings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
val body : PutNotificationSettingBody =  // PutNotificationSettingBody | 
try {
    apiInstance.updatePushNotificationSettings(body)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updatePushNotificationSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updatePushNotificationSettings")
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

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePushToken"></a>
# **updatePushToken**
> updatePushToken(body)

Update device push token

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SettingsApi()
val body : PostDevicePushTokenBody =  // PostDevicePushTokenBody | 
try {
    apiInstance.updatePushToken(body)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#updatePushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#updatePushToken")
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

