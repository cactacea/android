/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.1
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
 * @param id 
 * @param uri 
 * @param width 
 * @param height 
 * @param size 
 * @param thumbnailUrl 
 * @param mediumType 
 * @param contentWarning 
 * @param contentDeleted 
 */
data class Medium (
    val id: java.math.BigDecimal,
    val uri: kotlin.String,
    val width: kotlin.Long,
    val height: kotlin.Long,
    val size: kotlin.Long,
    val mediumType: Medium.MediumType,
    val contentWarning: kotlin.Boolean,
    val contentDeleted: kotlin.Boolean,
    val thumbnailUrl: kotlin.String? = null
) {

    /**
    * 
    * Values: image,movie
    */
    enum class MediumType(val value: kotlin.String){
    
        @Json(name = "image") image("image"),
    
        @Json(name = "movie") movie("movie");
    
    }

}

