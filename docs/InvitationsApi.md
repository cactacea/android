# InvitationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptGroupInvitation**](InvitationsApi.md#acceptGroupInvitation) | **POST** /invitations/{id}/accept | Accept a invitation
[**createGroupInvitationToAccount**](InvitationsApi.md#createGroupInvitationToAccount) | **POST** /accounts/{account_id}/groups/{group_id}/invitations | Create a invitation to this account
[**createGroupInvitationToAccounts**](InvitationsApi.md#createGroupInvitationToAccounts) | **POST** /groups/{id}/invitations | Post a invitation to some accounts
[**findSessionGroupInvitations**](InvitationsApi.md#findSessionGroupInvitations) | **GET** /session/invitations | Get invitations list session account received
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

<a name="createGroupInvitationToAccount"></a>
# **createGroupInvitationToAccount**
> InvitationCreated createGroupInvitationToAccount(accountId, groupId)

Create a invitation to this account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    val result : InvitationCreated = apiInstance.createGroupInvitationToAccount(accountId, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#createGroupInvitationToAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#createGroupInvitationToAccount")
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

<a name="createGroupInvitationToAccounts"></a>
# **createGroupInvitationToAccounts**
> InvitationCreated createGroupInvitationToAccounts(id, body)

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
    val result : InvitationCreated = apiInstance.createGroupInvitationToAccounts(id, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#createGroupInvitationToAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#createGroupInvitationToAccounts")
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

<a name="findSessionGroupInvitations"></a>
# **findSessionGroupInvitations**
> kotlin.Array&lt;GroupInvitation&gt; findSessionGroupInvitations(since, offset, count)

Get invitations list session account received

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = InvitationsApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters invitations which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of group invitations. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<GroupInvitation> = apiInstance.findSessionGroupInvitations(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvitationsApi#findSessionGroupInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvitationsApi#findSessionGroupInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters invitations which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of group invitations. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;GroupInvitation&gt;**](GroupInvitation.md)

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

