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
 * @param channelId Channel identifier.
 * @param message A message will be posted.
 */
data class PostTextBody (
    /* Channel identifier. */
    val channelId: java.math.BigDecimal,
    /* A message will be posted. */
    val message: kotlin.String
) {

}

