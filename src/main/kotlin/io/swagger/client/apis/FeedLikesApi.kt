/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.7
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis

import io.github.cactacea.backend.Account
import io.github.cactacea.backend.CactaceaErrors

import io.swagger.client.infrastructure.*

class FeedLikesApi(basePath: kotlin.String = "https://localhost") : ApiClient(basePath) {

    /**
    * Get accounts list who set a like to a feed
    * 
    * @param id Feed identifier. 
    * @param since Filters accounts which started on since or later. (optional)
    * @param offset The offset of accounts. By default the value is 0. (optional)
    * @param count Maximum number of accounts returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional)
    * @return kotlin.Array<Account>
    */
    @Suppress("UNCHECKED_CAST")
    fun findLikes(id: java.math.BigDecimal, since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<Account> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/feeds/{id}/likes".replace("{"+"id"+"}", "$id"),
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
    * Set a like on a feed
    * 
    * @param id Feed identifier. 
    * @return void
    */
    fun like(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/feeds/{id}/likes".replace("{"+"id"+"}", "$id"),
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
    * Remove a like on a feed
    * 
    * @param id Feed identifier. 
    * @return void
    */
    fun unlike(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/feeds/{id}/likes".replace("{"+"id"+"}", "$id"),
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
