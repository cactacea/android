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

/**
 * 
 * @param id 
 * @param replyId 
 * @param message 
 * @param account 
 * @param likeCount 
 * @param contentWarning 
 * @param contentDeleted 
 * @param postedAt 
 * @param next 
 */
data class Comment (
    val id: java.math.BigDecimal,
    val message: kotlin.String,
    val account: Account,
    val likeCount: kotlin.Long,
    val contentWarning: kotlin.Boolean,
    val contentDeleted: kotlin.Boolean,
    val postedAt: kotlin.Long,
    val next: kotlin.Long,
    val replyId: java.math.BigDecimal? = null
) {

}

