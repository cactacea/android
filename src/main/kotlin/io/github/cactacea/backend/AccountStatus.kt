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
 * @param id 
 * @param status 
 */
data class AccountStatus (
    val id: java.math.BigDecimal,
    val status: AccountStatus.Status
) {

    /**
    * 
    * Values: active,inactive
    */
    enum class Status(val value: kotlin.String){
    
        @Json(name = "active") active("active"),
    
        @Json(name = "inactive") inactive("inactive");
    
    }

}

