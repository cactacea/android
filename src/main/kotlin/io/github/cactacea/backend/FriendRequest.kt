/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.3
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account

import com.squareup.moshi.Json
/**
 * 
 * @param id 
 * @param account 
 * @param requestStatus 
 * @param requestedAt 
 * @param next 
 */
data class FriendRequest (
    val id: java.math.BigDecimal,
    val account: Account,
    val requestStatus: FriendRequest.RequestStatus,
    val requestedAt: kotlin.Long,
    val next: kotlin.Long
) {

    /**
    * 
    * Values: noResponded,accepted,rejected
    */
    enum class RequestStatus(val value: kotlin.String){
    
        @Json(name = "noResponded") noResponded("noResponded"),
    
        @Json(name = "accepted") accepted("accepted"),
    
        @Json(name = "rejected") rejected("rejected");
    
    }

}

