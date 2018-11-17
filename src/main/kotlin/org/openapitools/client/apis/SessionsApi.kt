/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import io.github.cactacea.backend.Authentication
import io.github.cactacea.backend.BadRequest
import io.github.cactacea.backend.PostSignUpBody

import org.openapitools.client.infrastructure.*

class SessionsApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Sign in
    * 
    * @param name Account name. 
    * @param password Account password. 
    * @param udid Unique Device Identifier. 
    * @param userAgent  (optional, default to null)
    * @return Authentication
    */
    @Suppress("UNCHECKED_CAST")
    fun signIn(name: kotlin.String, password: kotlin.String, udid: kotlin.String, userAgent: kotlin.String) : Authentication {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("name" to listOf("$name"), "password" to listOf("$password"), "udid" to listOf("$udid"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("user_agent" to userAgent)
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/sessions",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Authentication>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Authentication
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Sign up
    * 
    * @param postSignUpBody  
    * @param userAgent  (optional, default to null)
    * @return Authentication
    */
    @Suppress("UNCHECKED_CAST")
    fun signUp(postSignUpBody: PostSignUpBody, userAgent: kotlin.String) : Authentication {
        val localVariableBody: kotlin.Any? = postSignUpBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("user_agent" to userAgent)
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/sessions",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Authentication>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Authentication
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}