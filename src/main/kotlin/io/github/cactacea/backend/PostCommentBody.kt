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
 * @param id Feed Identifier.
 * @param replyId Reply comment identifier.
 * @param message A message will be posted.
 */
data class PostCommentBody (
    /* Feed Identifier. */
    val id: java.math.BigDecimal,
    /* A message will be posted. */
    val message: kotlin.String,
    /* Reply comment identifier. */
    val replyId: java.math.BigDecimal? = null
) {

}

