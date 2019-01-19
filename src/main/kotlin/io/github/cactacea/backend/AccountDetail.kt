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
 * @param id 
 * @param accountName 
 * @param displayName 
 * @param profileImageUrl 
 * @param isFriend 
 * @param friendRequestInProgress 
 * @param following 
 * @param isFollower 
 * @param followingCount 
 * @param followerCount 
 * @param friendCount 
 * @param feedsCount 
 * @param muting 
 * @param blocking 
 * @param web 
 * @param birthday 
 * @param location 
 * @param bio 
 * @param joinedAt 
 * @param next 
 */
data class AccountDetail (
    val id: java.math.BigDecimal,
    val accountName: kotlin.String,
    val displayName: kotlin.String,
    val isFriend: kotlin.Boolean,
    val friendRequestInProgress: kotlin.Boolean,
    val following: kotlin.Boolean,
    val isFollower: kotlin.Boolean,
    val followingCount: kotlin.Long,
    val followerCount: kotlin.Long,
    val friendCount: kotlin.Long,
    val feedsCount: kotlin.Long,
    val muting: kotlin.Boolean,
    val blocking: kotlin.Boolean,
    val profileImageUrl: kotlin.String? = null,
    val web: kotlin.String? = null,
    val birthday: java.math.BigDecimal? = null,
    val location: kotlin.String? = null,
    val bio: kotlin.String? = null,
    val joinedAt: java.math.BigDecimal? = null,
    val next: java.math.BigDecimal? = null
) {

}

