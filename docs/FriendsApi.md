# FriendsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFriend**](FriendsApi.md#deleteFriend) | **DELETE** /accounts/{id}/friends | Remove friendship to a account
[**findAccountFriends**](FriendsApi.md#findAccountFriends) | **GET** /accounts/{id}/friends | Get a account&#39;s friends list


<a name="deleteFriend"></a>
# **deleteFriend**
> deleteFriend(id)

Remove friendship to a account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Account identifier. | [default to null]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAccountFriends"></a>
# **findAccountFriends**
> Account findAccountFriends(id, since, offset, count)

Get a account&#39;s friends list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
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
 **id** | **java.math.BigDecimal**| Account Identifier. | [default to null]
 **since** | **java.math.BigDecimal**| Filters friends which started on since or later. | [optional] [default to null]
 **offset** | **java.math.BigDecimal**| The offset of friends. By default the value is 0. | [optional] [default to null]
 **count** | **java.math.BigDecimal**| Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. | [optional] [default to null]

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

