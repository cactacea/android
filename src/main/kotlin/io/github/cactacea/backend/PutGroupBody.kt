/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.github.cactacea.backend


import com.squareup.moshi.Json
/**
 * 
 * @param name Group name.
 * @param byInvitationOnly Only invited accounts can join in.
 * @param privacyType Which accounts can join in.
 * @param authorityType Which accounts can manage a group.
 */
data class PutGroupBody (
    /* Group name. */
    val name: kotlin.String,
    /* Only invited accounts can join in. */
    val byInvitationOnly: kotlin.Boolean,
    /* Which accounts can join in. */
    val privacyType: PutGroupBody.PrivacyType,
    /* Which accounts can manage a group. */
    val authorityType: PutGroupBody.AuthorityType
) {

    /**
    * Which accounts can join in.
    * Values: everyone,follows,followers,friends
    */
    enum class PrivacyType(val value: kotlin.String){
    
        @Json(name = "everyone") everyone("everyone"),
    
        @Json(name = "follows") follows("follows"),
    
        @Json(name = "followers") followers("followers"),
    
        @Json(name = "friends") friends("friends");
    
    }

    /**
    * Which accounts can manage a group.
    * Values: owner,member
    */
    enum class AuthorityType(val value: kotlin.String){
    
        @Json(name = "owner") owner("owner"),
    
        @Json(name = "member") member("member");
    
    }

}

