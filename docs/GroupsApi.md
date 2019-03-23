# GroupsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Create a group
[**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{id} | Hide a group and delete all messages
[**findGroup**](GroupsApi.md#findGroup) | **GET** /groups/{id} | Get basic information about a group
[**findGroupAccounts**](GroupsApi.md#findGroupAccounts) | **GET** /groups/{id}/accounts | Get accounts list of a group
[**hideGroup**](GroupsApi.md#hideGroup) | **POST** /groups/{id}/hides | Hide a group
[**joinGroup**](GroupsApi.md#joinGroup) | **POST** /groups/{id}/join | Join to a group,
[**leaveGroup**](GroupsApi.md#leaveGroup) | **POST** /groups/{id}/leave | Leave from a group
[**reportGroup**](GroupsApi.md#reportGroup) | **POST** /groups/{id}/reports | Report a group
[**searchGroups**](GroupsApi.md#searchGroups) | **GET** /groups | Search groups
[**showGroup**](GroupsApi.md#showGroup) | **DELETE** /groups/{id}/hides | Show a group
[**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{id} | Update a group


<a name="createGroup"></a>
# **createGroup**
> GroupCreated createGroup(body)

Create a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val body : PostGroupBody =  // PostGroupBody | 
try {
    val result : GroupCreated = apiInstance.createGroup(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#createGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#createGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGroupBody**](PostGroupBody.md)|  |

### Return type

[**GroupCreated**](GroupCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(id)

Hide a group and delete all messages

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.deleteGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGroup"></a>
# **findGroup**
> Group findGroup(id)

Get basic information about a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    val result : Group = apiInstance.findGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |

### Return type

[**Group**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGroupAccounts"></a>
# **findGroupAccounts**
> kotlin.Array&lt;Group&gt; findGroupAccounts(id, since, offset, count)

Get accounts list of a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findGroupAccounts(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findGroupAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findGroupAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="hideGroup"></a>
# **hideGroup**
> hideGroup(id)

Hide a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.hideGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#hideGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#hideGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="joinGroup"></a>
# **joinGroup**
> joinGroup(id)

Join to a group,

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.joinGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#joinGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#joinGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="leaveGroup"></a>
# **leaveGroup**
> leaveGroup(id)

Leave from a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group groupInvitation identifier.
try {
    apiInstance.leaveGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#leaveGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#leaveGroup")
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

<a name="reportGroup"></a>
# **reportGroup**
> reportGroup(id, body)

Report a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
val body : PostGroupReportBody =  // PostGroupReportBody | 
try {
    apiInstance.reportGroup(id, body)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#reportGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#reportGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |
 **body** | [**PostGroupReportBody**](PostGroupReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="searchGroups"></a>
# **searchGroups**
> kotlin.Array&lt;Group&gt; searchGroups(groupName, invitationOnly, groupPrivacyType, since, offset, count)

Search groups

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val groupName : kotlin.String = groupName_example // kotlin.String | Filters groups which group name start of.
val invitationOnly : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups that invited accounts can join in.
val groupPrivacyType : kotlin.String = groupPrivacyType_example // kotlin.String | Filters groups which can join in.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of messages. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.searchGroups(groupName, invitationOnly, groupPrivacyType, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#searchGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#searchGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **kotlin.String**| Filters groups which group name start of. | [optional]
 **invitationOnly** | **java.math.BigDecimal**| Filters groups that invited accounts can join in. | [optional]
 **groupPrivacyType** | **kotlin.String**| Filters groups which can join in. | [optional] [enum: everyone, following, followers, friends]
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of messages. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="showGroup"></a>
# **showGroup**
> showGroup(id)

Show a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.showGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#showGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#showGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateGroup"></a>
# **updateGroup**
> updateGroup(id, body)

Update a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
val body : PutGroupBody =  // PutGroupBody | 
try {
    apiInstance.updateGroup(id, body)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#updateGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#updateGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. |
 **body** | [**PutGroupBody**](PutGroupBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

