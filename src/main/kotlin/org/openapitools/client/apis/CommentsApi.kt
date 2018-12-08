/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.2-SNAPSHOT
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import io.github.cactacea.backend.CactaceaErrors
import io.github.cactacea.backend.Comment
import io.github.cactacea.backend.CommentCreated
import io.github.cactacea.backend.PostCommentBody
import io.github.cactacea.backend.PostCommentReportBody

import org.openapitools.client.infrastructure.*

class CommentsApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Remove a comment
    * 
    * @param id Comment Identifier. 
    * @return void
    */
    fun deleteComment(id: java.math.BigDecimal) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/comments/{id}".replace("{"+"id"+"}", "$id"),
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
    * Get basic information about a comment
    * 
    * @param id Comment Identifier. 
    * @return Comment
    */
    @Suppress("UNCHECKED_CAST")
    fun findComment(id: java.math.BigDecimal) : Comment {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/comments/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Comment>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Comment
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Search comments
    * 
    * @param id Feed identifier. 
    * @param since Filters comments which started on since or later. (optional, default to null)
    * @param offset The offset of comments. By default the value is 0. (optional, default to null)
    * @param count Maximum number of comments returned on one result page. By default the value is 20 entries. The page size can never be larger than 50. (optional, default to null)
    * @return kotlin.Array<Comment>
    */
    @Suppress("UNCHECKED_CAST")
    fun findComments(id: java.math.BigDecimal, since: java.math.BigDecimal, offset: java.math.BigDecimal, count: java.math.BigDecimal) : kotlin.Array<Comment> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("id" to listOf("$id"), "since" to listOf("$since"), "offset" to listOf("$offset"), "count" to listOf("$count"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/comments",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Comment>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Comment>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Create a comment on a feed
    * 
    * @param postCommentBody  
    * @return CommentCreated
    */
    @Suppress("UNCHECKED_CAST")
    fun postComment(postCommentBody: PostCommentBody) : CommentCreated {
        val localVariableBody: kotlin.Any? = postCommentBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/comments",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<CommentCreated>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CommentCreated
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Report a comment
    * 
    * @param id Comment Identifier. 
    * @param postCommentReportBody  
    * @return void
    */
    fun reportComment(id: java.math.BigDecimal, postCommentReportBody: PostCommentReportBody) : Unit {
        val localVariableBody: kotlin.Any? = postCommentReportBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/comments/{id}/reports".replace("{"+"id"+"}", "$id"),
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
