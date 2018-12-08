# AccountsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**existAccountName**](AccountsApi.md#existAccountName) | **GET** /account/{accountName} | Confirm account name exist
[**findAccount**](AccountsApi.md#findAccount) | **GET** /accounts/{id} | Get information about a account
[**findAccountStatus**](AccountsApi.md#findAccountStatus) | **GET** /accounts/{id}/status | Get account on
[**findAccounts**](AccountsApi.md#findAccounts) | **GET** /accounts | Search accounts
[**reportAccount**](AccountsApi.md#reportAccount) | **POST** /accounts/{id}/reports | Report a account
[**updateDisplayName**](AccountsApi.md#updateDisplayName) | **PUT** /accounts/{id}/display_name | Change display name to session account


<a name="existAccountName"></a>
# **existAccountName**
> AccountNameNotExists existAccountName(accountName)

Confirm account name exist

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val accountName : kotlin.String = accountName_example // kotlin.String | Account name.
try {
    val result : AccountNameNotExists = apiInstance.existAccountName(accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#existAccountName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#existAccountName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountName** | **kotlin.String**| Account name. |

### Return type

[**AccountNameNotExists**](AccountNameNotExists.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccount"></a>
# **findAccount**
> Account findAccount(id)

Get information about a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : Account = apiInstance.findAccount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

[**Account**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccountStatus"></a>
# **findAccountStatus**
> AccountStatus findAccountStatus(id)

Get account on

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account identifier.
try {
    val result : AccountStatus = apiInstance.findAccountStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccountStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccountStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account identifier. |

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccounts"></a>
# **findAccounts**
> kotlin.Array&lt;Account&gt; findAccounts(accountName, since, offset, count)

Search accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val accountName : kotlin.String = accountName_example // kotlin.String | Filters accounts whose account name start of.
val since : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filters accounts which started on since or later.
val offset : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The offset of accounts. By default the value is 0.
val count : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Maximum number of accounts returned on one result page. By default the value is 20 accounts. The page size can never be larger than 50.
try {
    val result : kotlin.Array<Account> = apiInstance.findAccounts(accountName, since, offset, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#findAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#findAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountName** | **kotlin.String**| Filters accounts whose account name start of. | [optional]
 **since** | **java.math.BigDecimal**| Filters accounts which started on since or later. | [optional]
 **offset** | **java.math.BigDecimal**| The offset of accounts. By default the value is 0. | [optional]
 **count** | **java.math.BigDecimal**| Maximum number of accounts returned on one result page. By default the value is 20 accounts. The page size can never be larger than 50. | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportAccount"></a>
# **reportAccount**
> reportAccount(id, body)

Report a account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val body : PostAccountReportBody =  // PostAccountReportBody | 
try {
    apiInstance.reportAccount(id, body)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#reportAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#reportAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **body** | [**PostAccountReportBody**](PostAccountReportBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDisplayName"></a>
# **updateDisplayName**
> updateDisplayName(id, body)

Change display name to session account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.github.cactacea.backend.*

val apiInstance = AccountsApi()
val id : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Account Identifier.
val body : PutAccountDisplayNameBody =  // PutAccountDisplayNameBody | 
try {
    apiInstance.updateDisplayName(id, body)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateDisplayName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateDisplayName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.math.BigDecimal**| Account Identifier. |
 **body** | [**PutAccountDisplayNameBody**](PutAccountDisplayNameBody.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [cactacea_auth](../README.md#cactacea_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

