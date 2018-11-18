/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.5-SNAPSHOT
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account
import io.github.cactacea.backend.Medium

/**
 * 
 * @param id 
 * @param message 
 * @param mediums 
 * @param tags 
 * @param account 
 * @param likeCount 
 * @param commentCount 
 * @param contentWarning 
 * @param contentDeleted 
 * @param postedAt 
 * @param next 
 */
data class Feed (
    val id: java.math.BigDecimal,
    val message: kotlin.String,
    val likeCount: kotlin.Long,
    val commentCount: kotlin.Long,
    val contentWarning: kotlin.Boolean,
    val contentDeleted: kotlin.Boolean,
    val postedAt: kotlin.Long,
    val next: kotlin.Long,
    val mediums: kotlin.Array<Medium>? = null,
    val tags: kotlin.Array<kotlin.String>? = null,
    val account: Account? = null
) {

}

