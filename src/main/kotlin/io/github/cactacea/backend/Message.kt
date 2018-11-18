/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.6
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account
import io.github.cactacea.backend.Medium

import com.squareup.moshi.Json
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
    enum class MessageType(val value: kotlin.String){
    
        @Json(name = "text") text("text"),
    
        @Json(name = "medium") medium("medium"),
    
        @Json(name = "stamp") stamp("stamp"),
    
        @Json(name = "invitation") invitation("invitation"),
    
        @Json(name = "joined") joined("joined"),
    
        @Json(name = "left") left("left");
    
    }

}

