# InvitationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept**](InvitationsApi.md#accept) | **POST** /invitations/{id}/accept | Accept a groupInvitation
[**create**](InvitationsApi.md#create) | **POST** /groups/{id}/invitations | Post a groupInvitation to some accounts
[**reject**](InvitationsApi.md#reject) | **POST** /invitations/{id}/reject | Reject a groupInvitation


<a name="accept"></a>
# **accept**
> accept(id)

Accept a groupInvitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group groupInvitation identifier.
try {
    apiInstance.accept(id)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#accept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#accept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group groupInvitation identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="create"></a>
# **create**
> InvitationCreated create(id, body)

Post a groupInvitation to some accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
val body : PostInvitationAccountsBody =  // PostInvitationAccountsBody | 
try {
    val result : InvitationCreated = apiInstance.create(id, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#create")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group Identifier. |
 **body** | [**PostInvitationAccountsBody**](PostInvitationAccountsBody.md)|  |

### Return type

[**InvitationCreated**](InvitationCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reject"></a>
# **reject**
> reject(id)

Reject a groupInvitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group groupInvitation identifier.
try {
    apiInstance.reject(id)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#reject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#reject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group groupInvitation identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

