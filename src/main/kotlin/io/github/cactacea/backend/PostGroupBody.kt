/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 0.6.1-SNAPSHOT
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
 * @param by_invitation_only Only invited accounts can join in.
 * @param privacy_type Which accounts can join in.
 * @param authority_type Which accounts can manage this group.
 */
data class PostGroupBody (
    /* Group name. */
    val name: kotlin.String? = null,
    /* Only invited accounts can join in. */
    val by_invitation_only: kotlin.Boolean? = null,
    /* Which accounts can join in. */
    val privacy_type: PostGroupBody.PrivacyType? = null,
    /* Which accounts can manage this group. */
    val authority_type: PostGroupBody.AuthorityType? = null
) {

    /**
    * Which accounts can join in.
    * Values: everyone,follows,followers,friends
    */
    enum class PrivacyType(val value: kotlin.Any){
    
        everyone("everyone"),
    
        follows("follows"),
    
        followers("followers"),
    
        friends("friends");
    
    }

    /**
    * Which accounts can manage this group.
    * Values: owner,member
    */
    enum class AuthorityType(val value: kotlin.Any){
    
        owner("owner"),
    
        member("member");
    
    }

}

