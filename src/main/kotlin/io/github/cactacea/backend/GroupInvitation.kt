/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.2
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account
import io.github.cactacea.backend.Group

/**
 * 
 * @param id 
 * @param group 
 * @param account 
 * @param invitationStatus 
 * @param invitedAt 
 * @param next 
 */
data class GroupInvitation (
    val id: java.math.BigDecimal,
    val group: Group,
    val account: Account,
    val invitationStatus: GroupInvitation.InvitationStatus,
    val invitedAt: kotlin.Long,
    val next: java.math.BigDecimal? = null
) {

    /**
    * 
    * Values: noResponded,accepted,rejected
    */
    enum class InvitationStatus(val value: kotlin.Any){
    
        noResponded("noResponded"),
    
        accepted("accepted"),
    
        rejected("rejected");
    
    }

}

