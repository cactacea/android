/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 19.1.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.github.cactacea.backend


/**
 * 
 * @param reportType Report type.
 * @param reportContent Description about this report.
 */
data class PostAccountReportBody (
    /* Report type. */
    val reportType: PostAccountReportBody.ReportType,
    /* Description about this report. */
    val reportContent: kotlin.String? = null
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

