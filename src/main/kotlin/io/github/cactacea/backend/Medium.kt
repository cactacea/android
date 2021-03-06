/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 19.9.3
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
 * @param uri 
 * @param width 
 * @param height 
 * @param size 
 * @param thumbnailUrl 
 * @param mediumType 
 * @param warning 
 * @param rejected 
 */
data class Medium (
    val id: java.math.BigDecimal,
    val uri: kotlin.String,
    val width: kotlin.Long,
    val height: kotlin.Long,
    val size: kotlin.Long,
    val mediumType: Medium.MediumType,
    val warning: kotlin.Boolean,
    val rejected: kotlin.Boolean,
    val thumbnailUrl: kotlin.String? = null
) {

    /**
    * 
    * Values: image,movie
    */
    enum class MediumType(val value: kotlin.Any){
    
        image("image"),
    
        movie("movie");
    
    }

}

