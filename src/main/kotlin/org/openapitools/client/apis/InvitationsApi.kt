/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import io.github.cactacea.backend.CactaceaErrors
import io.github.cactacea.backend.GroupInvitation
import io.github.cactacea.backend.InvitationCreated
import io.github.cactacea.backend.PostInvitationAccountsBody

import org.openapitools.client.infrastructure.*

class InvitationsApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Accept a invitation
    * 
    * @param id Group invitation identifier. 
    * @return void
    */
    fun acceptGroupInvitation(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/invitations/{id}/accept".replace("{"+"id"+"}", "$id"),
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
    * Create a invitation to a account
    * 
    * @param accountId Account Identifier. 
    * @param groupId Group Identifier. 
    * @return InvitationCreated
    */
    @Suppress("UNCHECKED_CAST")
    fun createGroupInvitationToAccount(accountId: java.math.BigDecimal, groupId: java.math.BigDecimal) : InvitationCreated {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/accounts/{accountId}/groups/{groupId}/invitations".replace("{"+"accountId"+"}", "$accountId").replace("{"+"groupId"+"}", "$groupId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InvitationCreated>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InvitationCreated
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Post a invitation to some accounts
    * 
    * @param id Group Identifier. 
    * @param postInvitationAccountsBody  
    * @return InvitationCreated
    */
    @Suppress("UNCHECKED_CAST")
    fun createGroupInvitationToAccounts(id: java.math.BigDecimal, postInvitationAccountsBody: PostInvitationAccountsBody) : InvitationCreated {
        val localVariableBody: kotlin.Any? = postInvitationAccountsBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/groups/{id}/invitations".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InvitationCreated>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InvitationCreated
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get invitations list session account received
    * 
    * @param since Filters invitations which started on since or later. (optional, default to null)
    * @param offset The offset of group invitations. By default the value is 0. (optional, default to null)
    * @param count Maximum number of invitations returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return kotlin.Array<GroupInvitation>
    */
    @Suppress("UNCHECKED_CAST")
    fun findSessionGroupInvitations(since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<GroupInvitation> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/invitations",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<GroupInvitation>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<GroupInvitation>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Reject a invitation
    * 
    * @param id Group invitation identifier. 
    * @return void
    */
    fun rejectGroupInvitation(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/invitations/{id}/reject".replace("{"+"id"+"}", "$id"),
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
