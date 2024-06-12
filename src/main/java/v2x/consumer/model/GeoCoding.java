package v2x.consumer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeoCoding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
public class GeoCoding   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("subtopics")
  private String subtopics;

  public GeoCoding type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "g8", value = "")

@Pattern(regexp = "^[g]\\d{1}$") @Size(min = 2, max = 2) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeoCoding subtopics(String subtopics) {
    this.subtopics = subtopics;
    return this;
  }

  /**
   * Get subtopics
   * @return subtopics
  */
  @ApiModelProperty(example = "s/p/u/b/m/s/j/f", value = "")

@Pattern(regexp = "^[a-z]$|(?:^[a-z])(?:[/][a-z]){1,7}") 
  public String getSubtopics() {
    return subtopics;
  }

  public void setSubtopics(String subtopics) {
    this.subtopics = subtopics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCoding geoCoding = (GeoCoding) o;
    return Objects.equals(this.type, geoCoding.type) &&
        Objects.equals(this.subtopics, geoCoding.subtopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoding {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtopics: ").append(toIndentedString(subtopics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

