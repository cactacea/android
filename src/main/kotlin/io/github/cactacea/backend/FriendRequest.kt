/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.7
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account

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
    val next: java.math.BigDecimal? = null
) {

    /**
    * 
    * Values: noResponded,accepted,rejected
    */
    enum class RequestStatus(val value: kotlin.Any){
    
        noResponded("noResponded"),
    
        accepted("accepted"),
    
        rejected("rejected");
    
    }

}

