/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 0.6.3-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param id Group identifier.
 * @param message A message will be posted.
 * @param medium_id A medium will be posted.
 */
data class PostMessageBody (
    /* Group identifier. */
    val id: java.math.BigDecimal? = null,
    /* A message will be posted. */
    val message: kotlin.String? = null,
    /* A medium will be posted. */
    val medium_id: java.math.BigDecimal? = null
) {

}

