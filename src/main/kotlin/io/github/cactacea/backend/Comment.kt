/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.6
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
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
    val replyId: java.math.BigDecimal? = null,
    val next: java.math.BigDecimal? = null
) {

}

