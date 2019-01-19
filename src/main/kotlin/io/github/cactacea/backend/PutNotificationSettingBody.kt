/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.12-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param feed Notice new follower feed arrived.
 * @param comment Notice new comment arrived.
 * @param friendRequest Notice new friend request arrived.
 * @param message Notice new message arrived.
 * @param groupMessage Notice new group message arrived.
 * @param groupInvitation Notice new group groupInvitation arrived.
 * @param showMessage Show messages text on notification.
 */
data class PutNotificationSettingBody (
    /* Notice new follower feed arrived. */
    val feed: kotlin.Boolean,
    /* Notice new comment arrived. */
    val comment: kotlin.Boolean,
    /* Notice new friend request arrived. */
    val friendRequest: kotlin.Boolean,
    /* Notice new message arrived. */
    val message: kotlin.Boolean,
    /* Notice new group message arrived. */
    val groupMessage: kotlin.Boolean,
    /* Notice new group groupInvitation arrived. */
    val groupInvitation: kotlin.Boolean,
    /* Show messages text on notification. */
    val showMessage: kotlin.Boolean
) {

}

