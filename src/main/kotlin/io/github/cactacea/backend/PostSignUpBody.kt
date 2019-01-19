/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.12-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param accountName Account name.
 * @param password Account password.
 * @param udid Unique Device Identifier.
 */
data class PostSignUpBody (
    /* Account name. */
    val accountName: kotlin.String,
    /* Account password. */
    val password: kotlin.String,
    /* Unique Device Identifier. */
    val udid: kotlin.String
) {

}

