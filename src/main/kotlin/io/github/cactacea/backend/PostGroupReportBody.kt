/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.11.0-SNAPSHOT
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param report_type Report type.
 * @param report_content Description about this report.
 */
data class PostGroupReportBody (
    /* Report type. */
    val report_type: PostGroupReportBody.ReportType,
    /* Description about this report. */
    val report_content: kotlin.String
) {

    /**
    * Report type.
    * Values: none,spam,inappropriate
    */
    enum class ReportType(val value: kotlin.Any){
    
        none("none"),
    
        spam("spam"),
    
        inappropriate("inappropriate");
    
    }

}

