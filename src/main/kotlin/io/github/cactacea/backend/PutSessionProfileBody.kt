/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 19.1.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param displayName Display name.
 * @param web Profile URL.
 * @param birthday Account birthday.
 * @param location Account address.
 * @param bio Account bio.
 */
data class PutSessionProfileBody (
    /* Display name. */
    val displayName: kotlin.String,
    /* Profile URL. */
    val web: kotlin.String? = null,
    /* Account birthday. */
    val birthday: java.math.BigDecimal? = null,
    /* Account address. */
    val location: kotlin.String? = null,
    /* Account bio. */
    val bio: kotlin.String? = null
) {

}

