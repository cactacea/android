# InvitationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptGroupInvitation**](InvitationsApi.md#acceptGroupInvitation) | **POST** /invitations/{id}/accept | Accept a invitation
[**create**](InvitationsApi.md#create) | **POST** /groups/{id}/invitations | Post a invitation to some accounts
[**create_0**](InvitationsApi.md#create_0) | **POST** /accounts/{accountId}/groups/{groupId}/invitations | Create a invitation to a account
[**rejectGroupInvitation**](InvitationsApi.md#rejectGroupInvitation) | **POST** /invitations/{id}/reject | Reject a invitation


<a name="acceptGroupInvitation"></a>
# **acceptGroupInvitation**
> acceptGroupInvitation(id)

Accept a invitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group invitation identifier.
try {
    apiInstance.acceptGroupInvitation(id)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#acceptGroupInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#acceptGroupInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group invitation identifier. |

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

Post a invitation to some accounts

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

<a name="create_0"></a>
# **create_0**
> InvitationCreated create_0(accountId, groupId)

Create a invitation to a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    val result : InvitationCreated = apiInstance.create_0(accountId, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#create_0")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#create_0")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **java.math.BigDecimal**| Account Identifier. |
 **groupId** | **java.math.BigDecimal**| Group Identifier. |

### Return type

[**InvitationCreated**](InvitationCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rejectGroupInvitation"></a>
# **rejectGroupInvitation**
> rejectGroupInvitation(id)

Reject a invitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group invitation identifier.
try {
    apiInstance.rejectGroupInvitation(id)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#rejectGroupInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#rejectGroupInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group invitation identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

