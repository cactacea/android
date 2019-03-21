/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 19.3.3
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Message

/**
 * 
 * @param id 
 * @param name 
 * @param message 
 * @param invitationOnly 
 * @param privacyType 
 * @param authorityType 
 * @param accountCount 
 * @param lastPostedAt 
 * @param organizedAt 
 * @param next 
 */
data class Group (
    val id: java.math.BigDecimal,
    val invitationOnly: kotlin.Boolean,
    val privacyType: Group.PrivacyType,
    val authorityType: Group.AuthorityType,
    val accountCount: kotlin.Long,
    val organizedAt: kotlin.Long,
    val name: kotlin.String? = null,
    val message: Message? = null,
    val lastPostedAt: java.math.BigDecimal? = null,
    val next: java.math.BigDecimal? = null
) {

    /**
    * 
    * Values: everyone,following,followers,friends
    */
    enum class PrivacyType(val value: kotlin.Any){
    
        everyone("everyone"),
    
        following("following"),
    
        followers("followers"),
    
        friends("friends");
    
    }

    /**
    * 
    * Values: owner,member
    */
    enum class AuthorityType(val value: kotlin.Any){
    
        owner("owner"),
    
        member("member");
    
    }

}

