/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.8
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
 * @param status Device status.
 */
data class PostActiveStatusBody (
    /* Device status. */
    val status: PostActiveStatusBody.Status? = null
) {

    /**
    * Device status.
    * Values: active,inactive
    */
    enum class Status(val value: kotlin.String){
    
        @Json(name = "active") active("active"),
    
        @Json(name = "inactive") inactive("inactive");
    
    }

}

