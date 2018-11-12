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
 * @param message A feed message will be posted.
 * @param medium_ids Medium identifiers of attached.
 * @param tags Tags of feed.
 * @param privacy_type Group privacy type.
 * @param content_warning Content warning.
 * @param expiration Expiration of a feed.
 */
data class PutFeedBody (
    /* A feed message will be posted. */
    val message: kotlin.String,
    /* Group privacy type. */
    val privacy_type: PutFeedBody.PrivacyType,
    /* Content warning. */
    val content_warning: kotlin.Boolean,
    /* Medium identifiers of attached. */
    val medium_ids: kotlin.Array<java.math.BigDecimal>? = null,
    /* Tags of feed. */
    val tags: kotlin.Array<kotlin.String>? = null,
    /* Expiration of a feed. */
    val expiration: java.math.BigDecimal? = null
) {

    /**
    * Group privacy type.
    * Values: everyone,followers,friends,self
    */
    enum class PrivacyType(val value: kotlin.Any){
    
        everyone("everyone"),
    
        followers("followers"),
    
        friends("friends"),
    
        self("self");
    
    }

}

