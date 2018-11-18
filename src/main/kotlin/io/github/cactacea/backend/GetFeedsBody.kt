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


import com.squareup.moshi.Json
/**
 * 
 * @param privacyType Feed privacy type. By default the value is everyone.
 */
data class GetFeedsBody (
    /* Feed privacy type. By default the value is everyone. */
    val privacyType: GetFeedsBody.PrivacyType? = null
) {

    /**
    * Feed privacy type. By default the value is everyone.
    * Values: everyone,followers,friends,self
    */
    enum class PrivacyType(val value: kotlin.String){
    
        @Json(name = "everyone") everyone("everyone"),
    
        @Json(name = "followers") followers("followers"),
    
        @Json(name = "friends") friends("friends"),
    
        @Json(name = "self") self("self");
    
    }

}

