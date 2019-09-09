/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 19.9.3
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param token Received token
 * @param newPassword  New password
 */
data class PostResetBody (
    /* Received token */
    val token: kotlin.String,
    /*  New password */
    val newPassword: kotlin.String
) {

}
