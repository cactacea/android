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
 * @param notificationType 
 * @param contentId 
 * @param message 
 * @param url 
 * @param notifiedAt 
 * @param next 
 */
data class Notification (
    val id: java.math.BigDecimal,
    val notificationType: Notification.NotificationType,
    val message: kotlin.String,
    val url: kotlin.String,
    val notifiedAt: kotlin.Long,
    val next: kotlin.Long,
    val contentId: java.math.BigDecimal? = null
) {

    /**
    * 
    * Values: `operator`,invitation,friendRequest,feed,feedReply,commentReply
    */
    enum class NotificationType(val value: kotlin.Any){
    
        `operator`("operator"),
    
        invitation("invitation"),
    
        friendRequest("friendRequest"),
    
        feed("feed"),
    
        feedReply("feedReply"),
    
        commentReply("commentReply");
    
    }

}

