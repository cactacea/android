/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 19.3.8
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param name Group name.
 * @param byInvitationOnly Only invited accounts can join in.
 * @param privacyType Which accounts can join in.
 * @param authorityType Which accounts can manage a group.
 */
data class PostGroupBody (
    /* Group name. */
    val name: kotlin.String,
    /* Only invited accounts can join in. */
    val byInvitationOnly: kotlin.Boolean,
    /* Which accounts can join in. */
    val privacyType: PostGroupBody.PrivacyType,
    /* Which accounts can manage a group. */
    val authorityType: PostGroupBody.AuthorityType
) {

    /**
    * Which accounts can join in.
    * Values: everyone,following,followers,friends
    */
    enum class PrivacyType(val value: kotlin.Any){
    
        everyone("everyone"),
    
        following("following"),
    
        followers("followers"),
    
        friends("friends");
    
    }

    /**
    * Which accounts can manage a group.
    * Values: owner,member
    */
    enum class AuthorityType(val value: kotlin.Any){
    
        owner("owner"),
    
        member("member");
    
    }

}

