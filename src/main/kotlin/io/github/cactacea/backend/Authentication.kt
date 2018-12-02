/**
* Cactacea backend API
* Cactacea / Cactacea backend API for web and mobile applications
*
* OpenAPI spec version: 18.12.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.github.cactacea.backend

import io.github.cactacea.backend.Account

/**
 * 
 * @param account 
 * @param accessToken 
 */
data class Authentication (
    val account: Account,
    val accessToken: kotlin.String
) {

}

