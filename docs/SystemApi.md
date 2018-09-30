# SystemApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingGet**](SystemApi.md#pingGet) | **GET** /ping | Health checking


<a name="pingGet"></a>
# **pingGet**
> pingGet()

Health checking

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SystemApi()
try {
    apiInstance.pingGet()
} catch (e: ClientException) {
    println("4xx response calling SystemApi#pingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#pingGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

