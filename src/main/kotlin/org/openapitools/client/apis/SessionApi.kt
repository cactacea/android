/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.5-SNAPSHOT
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import io.github.cactacea.backend.Account
import io.github.cactacea.backend.CactaceaErrors
import io.github.cactacea.backend.Feed
import io.github.cactacea.backend.PutSessionAccountNameBody
import io.github.cactacea.backend.PutSessionPasswordBody
import io.github.cactacea.backend.PutSessionProfileBody
import io.github.cactacea.backend.PutSessionProfileImageBody

import org.openapitools.client.infrastructure.*

class SessionApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Remove the profile image
    * 
    * @return void
    */
    fun deleteSessionProfileImage() : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/session/profile_image",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get basic information about session account
    * 
    * @return Account
    */
    @Suppress("UNCHECKED_CAST")
    fun findSession() : Account {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Account>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Account
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get feeds list session account posted
    * 
    * @param since Filters feeds which started on since or later. (optional, default to null)
    * @param offset The offset of feeds. By default the value is 0. (optional, default to null)
    * @param count Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return Feed
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionFeeds(since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : Feed {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/feeds",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Feed>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Feed
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get accounts list session account is followed by
    * 
    * @param since Filters followers which started on since or later. (optional, default to null)
    * @param offset The offset of followers. By default the value is 0. (optional, default to null)
    * @param count Maximum number of followers returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return kotlin.Array<Account>
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionFollowers(since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<Account> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/followers",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Account>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Account>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get accounts list session account followed
    * 
    * @param since Filters follower which started on since or later. (optional, default to null)
    * @param offset The offset of follower. By default the value is 0. (optional, default to null)
    * @param count Maximum number of follower returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return kotlin.Array<Account>
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionFollows(since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<Account> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/follows",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Account>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Account>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get friends list
    * 
    * @param since Filters friends which started on since or later. (optional, default to null)
    * @param offset The offset of friends. By default the value is 0. (optional, default to null)
    * @param count Maximum number of friends returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return kotlin.Array<Account>
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionFriends(since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<Account> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/friends",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Account>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Account>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get feeds list session account set a like
    * 
    * @param since Filters entries which started on since or later. (optional, default to null)
    * @param offset The offset of feeds. By default the value is 0. (optional, default to null)
    * @param count Maximum number of feeds returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return Feed
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionLikes(since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : Feed {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/likes",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Feed>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Feed
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Sign out
    * 
    * @return void
    */
    fun signOut() : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/session",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Update the account name
    * 
    * @param putSessionAccountNameBody  
    * @return void
    */
    fun updateSessionAccountName(putSessionAccountNameBody: PutSessionAccountNameBody) : Unit {
        val localVariableBody: kotlin.Any? = putSessionAccountNameBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/session/account_name",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Update the password
    * 
    * @param putSessionPasswordBody  
    * @return void
    */
    fun updateSessionPassword(putSessionPasswordBody: PutSessionPasswordBody) : Unit {
        val localVariableBody: kotlin.Any? = putSessionPasswordBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/session/password",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Update the profile
    * 
    * @param putSessionProfileBody  
    * @return void
    */
    fun updateSessionProfile(putSessionProfileBody: PutSessionProfileBody) : Unit {
        val localVariableBody: kotlin.Any? = putSessionProfileBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/session/profile",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Update the profile image
    * 
    * @param putSessionProfileImageBody  
    * @return void
    */
    fun updateSessionProfileImage(putSessionProfileImageBody: PutSessionProfileImageBody) : Unit {
        val localVariableBody: kotlin.Any? = putSessionProfileImageBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/session/profile_image",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
