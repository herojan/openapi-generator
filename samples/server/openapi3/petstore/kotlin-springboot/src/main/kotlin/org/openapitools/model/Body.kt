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
 * @param name Updated name of the pet
 * @param status Updated status of the pet
 */
data class Body (

        @ApiModelProperty(value = "Updated name of the pet")@JsonProperty("name") val name: String? = null,

        @ApiModelProperty(value = "Updated status of the pet")@JsonProperty("status") val status: String? = null
) {

}

