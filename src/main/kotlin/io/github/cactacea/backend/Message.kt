/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 0.6.1-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account
import io.github.cactacea.backend.Medium

/**
 * 
 * @param id 
 * @param messageType 
 * @param message 
 * @param medium 
 * @param by 
 * @param account 
 * @param unread 
 * @param accountCount 
 * @param readAccountCount 
 * @param contentWarning 
 * @param contentDeleted 
 * @param postedAt 
 */
data class Message (
    val id: java.math.BigDecimal,
    val messageType: Message.MessageType,
    val by: Account,
    val unread: kotlin.Boolean,
    val accountCount: kotlin.Long,
    val readAccountCount: kotlin.Long,
    val contentWarning: kotlin.Boolean,
    val contentDeleted: kotlin.Boolean,
    val postedAt: kotlin.Long,
    val message: kotlin.String? = null,
    val medium: Medium? = null,
    val account: Account? = null
) {

    /**
    * 
    * Values: text,medium,stamp,invitation,joined,left
    */
    enum class MessageType(val value: kotlin.Any){
    
        text("text"),
    
        medium("medium"),
    
        stamp("stamp"),
    
        invitation("invitation"),
    
        joined("joined"),
    
        left("left");
    
    }

}

