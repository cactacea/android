/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 0.6.3-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param report_type 
 * @param report_content 
 */
data class PostCommentReportBody (
    val report_type: PostCommentReportBody.ReportType,
    val report_content: kotlin.String? = null
) {

    /**
    * 
    * Values: none,spam,inappropriate
    */
    enum class ReportType(val value: kotlin.Any){
    
        none("none"),
    
        spam("spam"),
    
        inappropriate("inappropriate");
    
    }

}

