package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import io.swagger.annotations.ApiModelProperty

/**
 * Describes the result of uploading an image resource
 * @param code 
 * @param type 
 * @param message 
 */
data class ModelApiResponse (

        @ApiModelProperty(value = "")@JsonProperty("code") val code: Int? = null,

        @ApiModelProperty(value = "")@JsonProperty("type") val type: String? = null,

        @ApiModelProperty(value = "")@JsonProperty("message") val message: String? = null
) {

}

