# SystemApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ping**](SystemApi.md#ping) | **GET** /ping | Health checking


<a name="ping"></a>
# **ping**
> ping()

Health checking

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = SystemApi()
try {
    apiInstance.ping()
} catch (e: ClientException) {
    println("4xx response calling SystemApi#ping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#ping")
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

