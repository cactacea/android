/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.8
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
 * @param mediumIds Medium identifiers of attached.
 * @param tags Tags of feed.
 * @param privacyType Feed privacy type.
 * @param contentWarning Content warning.
 * @param expiration Expiration of a feed.
 */
data class PostFeedBody (
    /* A feed message will be posted. */
    val message: kotlin.String,
    /* Feed privacy type. */
    val privacyType: PostFeedBody.PrivacyType,
    /* Content warning. */
    val contentWarning: kotlin.Boolean,
    /* Medium identifiers of attached. */
    val mediumIds: kotlin.Array<java.math.BigDecimal>? = null,
    /* Tags of feed. */
    val tags: kotlin.Array<kotlin.String>? = null,
    /* Expiration of a feed. */
    val expiration: java.math.BigDecimal? = null
) {

    /**
    * Feed privacy type.
    * Values: everyone,followers,friends,self
    */
    enum class PrivacyType(val value: kotlin.Any){
    
        everyone("everyone"),
    
        followers("followers"),
    
        friends("friends"),
    
        self("self");
    
    }

}

