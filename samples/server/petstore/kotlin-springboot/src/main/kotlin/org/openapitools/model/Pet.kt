package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Category
import org.openapitools.model.Tag
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
 * A pet for sale in the pet store
 * @param id 
 * @param category 
 * @param name 
 * @param photoUrls 
 * @param tags 
 * @param status pet status in the store
 */
data class Pet (

        @get:NotNull 
        @ApiModelProperty(example = "doggie", required = true, value = "")
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @ApiModelProperty(required = true, value = "")
        @JsonProperty("photoUrls") val photoUrls: List<String>,

        @ApiModelProperty(value = "")@JsonProperty("id") val id: Long? = null,

        @ApiModelProperty(value = "")@JsonProperty("category") val category: Category? = null,

        @ApiModelProperty(value = "")@JsonProperty("tags") val tags: List<Tag>? = null,

        @ApiModelProperty(value = "pet status in the store")@JsonProperty("status") val status: Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: String) {
    
        @JsonProperty("available") available("available"),
    
        @JsonProperty("pending") pending("pending"),
    
        @JsonProperty("sold") sold("sold");
    
    }

}

