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

import io.github.cactacea.backend.Authentication
import io.github.cactacea.backend.CactaceaErrors
import io.github.cactacea.backend.PostSignUpBody

import org.openapitools.client.infrastructure.*

class SessionsApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Sign in
    * 
    * @param accountName Account name. 
    * @param password Account password. 
    * @param udid Unique Device Identifier. 
    * @return Authentication
    */
    @Suppress("UNCHECKED_CAST")
    fun signIn(accountName: kotlin.String, password: kotlin.String, udid: kotlin.String) : Authentication {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("accountName" to listOf("$accountName"), "password" to listOf("$password"), "udid" to listOf("$udid"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
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
    * @return Authentication
    */
    @Suppress("UNCHECKED_CAST")
    fun signUp(postSignUpBody: PostSignUpBody) : Authentication {
        val localVariableBody: kotlin.Any? = postSignUpBody
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
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
