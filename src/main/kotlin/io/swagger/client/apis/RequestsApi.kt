/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.2
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis

import io.github.cactacea.backend.CactaceaErrors
import io.github.cactacea.backend.FriendRequest
import io.github.cactacea.backend.FriendRequestCreated

import io.swagger.client.infrastructure.*

class RequestsApi(basePath: kotlin.String = "https://localhost") : ApiClient(basePath) {

    /**
    * Accept a friend request
    * 
    * @param id Friend request Identifier. 
    * @return void
    */
    fun accept(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/session/requests/{id}/accept".replace("{"+"id"+"}", "$id"),
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
    * Create a friend request to a account
    * 
    * @param id Account Identifier. 
    * @return FriendRequestCreated
    */
    @Suppress("UNCHECKED_CAST")
    fun createFriendRequest(id: java.math.BigDecimal) : FriendRequestCreated {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/accounts/{id}/requests".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<FriendRequestCreated>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FriendRequestCreated
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Remove a friend request to a account
    * 
    * @param id Account identifier. 
    * @return void
    */
    fun deleteRequest(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/accounts/{id}/requests".replace("{"+"id"+"}", "$id"),
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
    * Get friend requests list session account created or received
    * 
    * @param received Filters friend requests which you have received or sent. 
    * @param since Filters friend requests which started on since or later. (optional)
    * @param offset The offset of friend request. By default the value is 0. (optional)
    * @param count Maximum number of friend request returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional)
    * @return kotlin.Array<FriendRequest>
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionFriendRequests(received: kotlin.Boolean, since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<FriendRequest> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"), "received" to listOf("$received"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/requests",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<FriendRequest>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<FriendRequest>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Reject a friend request
    * 
    * @param id Friend request Identifier. 
    * @return void
    */
    fun reject(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/session/requests/{id}/reject".replace("{"+"id"+"}", "$id"),
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
