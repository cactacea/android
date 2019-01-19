# MediumsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](MediumsApi.md#delete) | **DELETE** /mediums/{id} | Delete a medium
[**findMedium**](MediumsApi.md#findMedium) | **GET** /mediums/:* | Get a medium
[**upload**](MediumsApi.md#upload) | **POST** /mediums | Upload a medium


<a name="delete"></a>
# **delete**
> delete(id)

Delete a medium

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MediumsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Medium identifier.
try {
    apiInstance.delete(id)
} catch (e: ClientException) {
    println("4xx response calling MediumsApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediumsApi#delete")
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

<a name="findMedium"></a>
# **findMedium**
> findMedium()

Get a medium

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MediumsApi()
try {
    apiInstance.findMedium()
} catch (e: ClientException) {
    println("4xx response calling MediumsApi#findMedium")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediumsApi#findMedium")
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

<a name="upload"></a>
# **upload**
> kotlin.Array&lt;MediumCreated&gt; upload(file)

Upload a medium

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = MediumsApi()
val file : java.io.File = /path/to/file.txt // java.io.File | Upload a medium file
try {
    val result : kotlin.Array<MediumCreated> = apiInstance.upload(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MediumsApi#upload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediumsApi#upload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| Upload a medium file |

### Return type

[**kotlin.Array&lt;MediumCreated&gt;**](MediumCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

