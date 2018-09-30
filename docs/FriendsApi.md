# FriendsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFriend**](FriendsApi.md#deleteFriend) | **DELETE** /accounts/{id}/friends | Remove friendship to this account
[**findAccountFriends**](FriendsApi.md#findAccountFriends) | **GET** /accounts/{id}/friends | Get this account&#39;s friends list


<a name="deleteFriend"></a>
# **deleteFriend**
> deleteFriend(id)

Remove friendship to this account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FriendsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    apiInstance.deleteFriend(id)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#deleteFriend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#deleteFriend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccountFriends"></a>
# **findAccountFriends**
> Account findAccountFriends(id, since, offset, count)

Get this account&#39;s friends list

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = FriendsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters friends which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of friends. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50.
try {
    val result : Account = apiInstance.findAccountFriends(id, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#findAccountFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#findAccountFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **since** | **java.math.BigDecimal**| Filters friends which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of friends. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

