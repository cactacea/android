# GroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Create a group
[**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{id} | Hide a group and delete all messages
[**findAccountGroup**](GroupsApi.md#findAccountGroup) | **GET** /accounts/{id}/group | Get a direct message group to a account
[**findAccountGroups**](GroupsApi.md#findAccountGroups) | **GET** /accounts/{id}/groups | Get groups list a account joined
[**findGroup**](GroupsApi.md#findGroup) | **GET** /groups/{id} | Get basic information about a group
[**findGroupAccounts**](GroupsApi.md#findGroupAccounts) | **GET** /groups/{id}/accounts | Get accounts list of a group
[**findGroups**](GroupsApi.md#findGroups) | **GET** /groups | Search groups
[**findSessionGroups**](GroupsApi.md#findSessionGroups) | **GET** /session/groups | Get groups list session account joined
[**findSessionHides**](GroupsApi.md#findSessionHides) | **GET** /session/hides | Get hidden groups list session account joined
[**hideGroup**](GroupsApi.md#hideGroup) | **POST** /groups/{id}/hides | Hide a group
[**joinAccountToGroup**](GroupsApi.md#joinAccountToGroup) | **POST** /accounts/{account_id}/groups/{group_id}/join | Join a account in a group
[**joinToGroup**](GroupsApi.md#joinToGroup) | **POST** /groups/{id}/join | Join to a group,
[**leaveAccountFromGroup**](GroupsApi.md#leaveAccountFromGroup) | **POST** /accounts/{account_id}/groups/{group_id}/leave | Leave a account from a group
[**leaveFromGroup**](GroupsApi.md#leaveFromGroup) | **POST** /groups/{id}/leave | Leave from a group
[**reportGroup**](GroupsApi.md#reportGroup) | **POST** /groups/{id}/reports | Report a group
[**showGroup**](GroupsApi.md#showGroup) | **DELETE** /groups/{id}/hides | Show a group
[**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{id} | Update a group


<a name="createGroup"></a>
# **createGroup**
> GroupCreated createGroup(postGroupBody)

Create a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val postGroupBody : PostGroupBody =  // PostGroupBody | 
try {
    val result : GroupCreated = apiInstance.createGroup(postGroupBody)
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
 **postGroupBody** | [**PostGroupBody**](PostGroupBody.md)|  |

### Return type

[**GroupCreated**](GroupCreated.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(id)

Hide a group and delete all messages

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAccountGroup"></a>
# **findAccountGroup**
> Group findAccountGroup(id)

Get a direct message group to a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : Group = apiInstance.findAccountGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findAccountGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findAccountGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. | [default to null]

### Return type

[**Group**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAccountGroups"></a>
# **findAccountGroups**
> kotlin.Array&lt;Group&gt; findAccountGroups(id, since, offset, count)

Get groups list a account joined

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of groups. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 groups. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findAccountGroups(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findAccountGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findAccountGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. | [default to null]
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of groups. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 groups. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findGroup"></a>
# **findGroup**
> Group findGroup(id)

Get basic information about a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]

### Return type

[**Group**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findGroupAccounts"></a>
# **findGroupAccounts**
> kotlin.Array&lt;Group&gt; findGroupAccounts(id, since, offset, count)

Get accounts list of a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findGroups"></a>
# **findGroups**
> kotlin.Array&lt;Group&gt; findGroups(groupName, invitationOnly, privacyType, since, offset, count)

Search groups

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val groupName : kotlin.String = groupName_example // kotlin.String | Filters groups which group name start of.
val invitationOnly : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups that invited accounts can join in.
val privacyType : kotlin.String = privacyType_example // kotlin.String | Filters groups which can join in.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of messages. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findGroups(groupName, invitationOnly, privacyType, since, offset, count)
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
 **groupName** | **kotlin.String**| Filters groups which group name start of. | [optional] [default to null]
 **invitationOnly** | **java.math.BigDecimal**| Filters groups that invited accounts can join in. | [optional] [default to null]
 **privacyType** | **kotlin.String**| Filters groups which can join in. | [optional] [default to null] [enum: everyone, follows, followers, friends]
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of messages. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findSessionGroups"></a>
# **findSessionGroups**
> kotlin.Array&lt;Group&gt; findSessionGroups(since, offset, count)

Get groups list session account joined

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of groups. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findSessionGroups(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findSessionGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findSessionGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of groups. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findSessionHides"></a>
# **findSessionHides**
> kotlin.Array&lt;Group&gt; findSessionHides(since, offset, count)

Get hidden groups list session account joined

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters groups which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of groups. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Group> = apiInstance.findSessionHides(since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#findSessionHides")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#findSessionHides")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.math.BigDecimal**| Filters groups which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of groups. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of groups returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**kotlin.Array&lt;Group&gt;**](Group.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="hideGroup"></a>
# **hideGroup**
> hideGroup(id)

Hide a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="joinAccountToGroup"></a>
# **joinAccountToGroup**
> joinAccountToGroup(accountId, groupId)

Join a account in a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    apiInstance.joinAccountToGroup(accountId, groupId)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#joinAccountToGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#joinAccountToGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **java.math.BigDecimal**| Account Identifier. | [default to null]
 **groupId** | **java.math.BigDecimal**| Group Identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="joinToGroup"></a>
# **joinToGroup**
> joinToGroup(id)

Join to a group,

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
try {
    apiInstance.joinToGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#joinToGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#joinToGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="leaveAccountFromGroup"></a>
# **leaveAccountFromGroup**
> leaveAccountFromGroup(accountId, groupId)

Leave a account from a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val accountId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val groupId : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group Identifier.
try {
    apiInstance.leaveAccountFromGroup(accountId, groupId)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#leaveAccountFromGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#leaveAccountFromGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **java.math.BigDecimal**| Account Identifier. | [default to null]
 **groupId** | **java.math.BigDecimal**| Group Identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="leaveFromGroup"></a>
# **leaveFromGroup**
> leaveFromGroup(id)

Leave from a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group invitation identifier.
try {
    apiInstance.leaveFromGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#leaveFromGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#leaveFromGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Group invitation identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reportGroup"></a>
# **reportGroup**
> reportGroup(id, postGroupReportBody)

Report a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
val postGroupReportBody : PostGroupReportBody =  // PostGroupReportBody | 
try {
    apiInstance.reportGroup(id, postGroupReportBody)
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]
 **postGroupReportBody** | [**PostGroupReportBody**](PostGroupReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="showGroup"></a>
# **showGroup**
> showGroup(id)

Show a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateGroup"></a>
# **updateGroup**
> updateGroup(id, putGroupBody)

Update a group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = GroupsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Group identifier.
val putGroupBody : PutGroupBody =  // PutGroupBody | 
try {
    apiInstance.updateGroup(id, putGroupBody)
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
 **id** | **java.math.BigDecimal**| Group identifier. | [default to null]
 **putGroupBody** | [**PutGroupBody**](PutGroupBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

