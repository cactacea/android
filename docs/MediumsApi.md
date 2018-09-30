# MediumsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMedium**](MediumsApi.md#deleteMedium) | **DELETE** /mediums/{id} | Delete this medium
[**uploadMedium**](MediumsApi.md#uploadMedium) | **POST** /mediums | Upload a medium


<a name="deleteMedium"></a>
# **deleteMedium**
> deleteMedium(id)

Delete this medium

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MediumsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Medium identifier.
try {
    apiInstance.deleteMedium(id)
} catch (e: ClientException) {
    println("4xx response calling MediumsApi#deleteMedium")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediumsApi#deleteMedium")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Medium identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadMedium"></a>
# **uploadMedium**
> MediumCreated uploadMedium()

Upload a medium

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MediumsApi()
try {
    val result : MediumCreated = apiInstance.uploadMedium()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MediumsApi#uploadMedium")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediumsApi#uploadMedium")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MediumCreated**](MediumCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

