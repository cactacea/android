# InvitationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvitation**](InvitationsApi.md#acceptInvitation) | **POST** /invitations/{id}/accept | Accept a groupInvitation
[**inviteAccounts**](InvitationsApi.md#inviteAccounts) | **POST** /groups/{id}/invitations | Post a groupInvitation to some accounts
[**rejectInvitation**](InvitationsApi.md#rejectInvitation) | **POST** /invitations/{id}/reject | Reject a groupInvitation


<a name="acceptInvitation"></a>
# **acceptInvitation**
> acceptInvitation(id)

Accept a groupInvitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group groupInvitation identifier.
try {
    apiInstance.acceptInvitation(id)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#acceptInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#acceptInvitation")
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

<a name="inviteAccounts"></a>
# **inviteAccounts**
> InvitationCreated inviteAccounts(id, body)

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
    val result : InvitationCreated = apiInstance.inviteAccounts(id, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#inviteAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#inviteAccounts")
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

<a name="rejectInvitation"></a>
# **rejectInvitation**
> rejectInvitation(id)

Reject a groupInvitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group groupInvitation identifier.
try {
    apiInstance.rejectInvitation(id)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#rejectInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#rejectInvitation")
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

