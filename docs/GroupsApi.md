# GroupsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](GroupsApi.md#create) | **POST** /groups | Create a group
[**delete**](GroupsApi.md#delete) | **DELETE** /groups/{id} | Hide a group and delete all messages
[**findAccounts**](GroupsApi.md#findAccounts) | **GET** /groups/{id}/accounts | Get accounts list of a group
[**findGroup**](GroupsApi.md#findGroup) | **GET** /groups/{id} | Get basic information about a group
[**findGroups**](GroupsApi.md#findGroups) | **GET** /groups | Search groups
[**hide**](GroupsApi.md#hide) | **POST** /groups/{id}/hides | Hide a group
[**join**](GroupsApi.md#join) | **POST** /groups/{id}/join | Join to a group,
[**leave**](GroupsApi.md#leave) | **POST** /groups/{id}/leave | Leave from a group
[**report**](GroupsApi.md#report) | **POST** /groups/{id}/reports | Report a group
[**show**](GroupsApi.md#show) | **DELETE** /groups/{id}/hides | Show a group
[**update**](GroupsApi.md#update) | **PUT** /groups/{id} | Update a group


<a name="create"></a>
# **create**
> GroupCreated create(body)

Create a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val body : PostGroupBody =  // PostGroupBody | 
try {
    val result : GroupCreated = apiInstance.create(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#create")
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

<a name="delete"></a>
# **delete**
> delete(id)

Hide a group and delete all messages

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.delete(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#delete")
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

<a name="findAccounts"></a>
# **findAccounts**
> kotlin.Array&lt;Group&gt; findAccounts(id, since, offset, count)

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
    val result : kotlin.Array<Group> = apiInstance.findAccounts(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findAccounts")
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

<a name="findGroups"></a>
# **findGroups**
> kotlin.Array&lt;Group&gt; findGroups(groupName, invitationOnly, groupPrivacyType, since, offset, count)

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
    val result : kotlin.Array<Group> = apiInstance.findGroups(groupName, invitationOnly, groupPrivacyType, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findGroups")
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

<a name="hide"></a>
# **hide**
> hide(id)

Hide a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.hide(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#hide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#hide")
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

<a name="join"></a>
# **join**
> join(id)

Join to a group,

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.join(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#join")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#join")
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

<a name="leave"></a>
# **leave**
> leave(id)

Leave from a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group groupInvitation identifier.
try {
    apiInstance.leave(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#leave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#leave")
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

<a name="report"></a>
# **report**
> report(id, body)

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
    apiInstance.report(id, body)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#report")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#report")
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

<a name="show"></a>
# **show**
> show(id)

Show a group

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.show(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#show")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#show")
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

<a name="update"></a>
# **update**
> update(id, body)

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
    apiInstance.update(id, body)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#update")
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

