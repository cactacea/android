/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.2
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param id 
 * @param accountName 
 * @param displayName 
 * @param profileImageUrl 
 * @param friend 
 * @param friendRequestInProgress 
 * @param follow 
 * @param follower 
 * @param followCount 
 * @param followerCount 
 * @param friendCount 
 * @param feedsCount 
 * @param mute 
 * @param web 
 * @param birthday 
 * @param location 
 * @param bio 
 * @param joinedAt 
 * @param next 
 */
data class Account (
    val id: java.math.BigDecimal,
    val accountName: kotlin.String,
    val displayName: kotlin.String,
    val friend: kotlin.Boolean,
    val friendRequestInProgress: kotlin.Boolean,
    val follow: kotlin.Boolean,
    val follower: kotlin.Boolean,
    val mute: kotlin.Boolean,
    val profileImageUrl: kotlin.String? = null,
    val followCount: java.math.BigDecimal? = null,
    val followerCount: java.math.BigDecimal? = null,
    val friendCount: java.math.BigDecimal? = null,
    val feedsCount: java.math.BigDecimal? = null,
    val web: kotlin.String? = null,
    val birthday: java.math.BigDecimal? = null,
    val location: kotlin.String? = null,
    val bio: kotlin.String? = null,
    val joinedAt: java.math.BigDecimal? = null,
    val next: java.math.BigDecimal? = null
) {

}

