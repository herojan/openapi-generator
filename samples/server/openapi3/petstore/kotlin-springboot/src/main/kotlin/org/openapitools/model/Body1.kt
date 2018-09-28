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
 * 
 * @param additionalMetadata Additional data to pass to server
 * @param file file to upload
 */
data class Body1 (

        @ApiModelProperty(value = "Additional data to pass to server")@JsonProperty("additionalMetadata") val additionalMetadata: String? = null,

        @ApiModelProperty(value = "file to upload")@JsonProperty("file") val file: java.io.File? = null
) {

}

