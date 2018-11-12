/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.0-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param display_name Display name.
 * @param web Profile URL.
 * @param birthday Account birthday.
 * @param location Account address.
 * @param bio Account bio.
 */
data class PutSessionProfileBody (
    /* Display name. */
    val display_name: kotlin.String,
    /* Profile URL. */
    val web: kotlin.String,
    /* Account birthday. */
    val birthday: java.math.BigDecimal,
    /* Account address. */
    val location: kotlin.String,
    /* Account bio. */
    val bio: kotlin.String
) {

}

