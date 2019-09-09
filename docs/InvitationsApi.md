# InvitationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvitation**](InvitationsApi.md#acceptInvitation) | **POST** /invitations/{id}/accept | Accept a invitation
[**createInvitations**](InvitationsApi.md#createInvitations) | **POST** /invitations | Create invitations
[**rejectInvitation**](InvitationsApi.md#rejectInvitation) | **POST** /invitations/{id}/reject | Reject a invitation


<a name="acceptInvitation"></a>
# **acceptInvitation**
> acceptInvitation(id)

Accept a invitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Invitation identifier.
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
 **id** | **java.math.BigDecimal**| Invitation identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createInvitations"></a>
# **createInvitations**
> InvitationCreated createInvitations(id, body)

Create invitations

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Channel Identifier.
val body : PostInvitationsBody =  // PostInvitationsBody | 
try {
    val result : InvitationCreated = apiInstance.createInvitations(id, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#createInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#createInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Channel Identifier. |
 **body** | [**PostInvitationsBody**](PostInvitationsBody.md)|  |

### Return type

[**InvitationCreated**](InvitationCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rejectInvitation"></a>
# **rejectInvitation**
> rejectInvitation(id)

Reject a invitation

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Invitation identifier.
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
 **id** | **java.math.BigDecimal**| Invitation identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

