package v2x.consumer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import v2x.consumer.model.GeoAddress;
import v2x.consumer.model.GeoCoding;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
public class Message   {
  @JsonProperty("geocoding")
  private GeoCoding geocoding;

  @JsonProperty("geoaddress")
  private GeoAddress geoaddress;

  @JsonProperty("timestamp")
  private String timestamp;

  @JsonProperty("payload")
  private String payload;

  public Message geocoding(GeoCoding geocoding) {
    this.geocoding = geocoding;
    return this;
  }

  /**
   * Get geocoding
   * @return geocoding
  */
  @ApiModelProperty(value = "")

  @Valid

  public GeoCoding getGeocoding() {
    return geocoding;
  }

  public void setGeocoding(GeoCoding geocoding) {
    this.geocoding = geocoding;
  }

  public Message geoaddress(GeoAddress geoaddress) {
    this.geoaddress = geoaddress;
    return this;
  }

  /**
   * Get geoaddress
   * @return geoaddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public GeoAddress getGeoaddress() {
    return geoaddress;
  }

  public void setGeoaddress(GeoAddress geoaddress) {
    this.geoaddress = geoaddress;
  }

  public Message timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(example = "1632838789", value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Message payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  */
  @ApiModelProperty(example = "json representation of the v2x message", value = "")


  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.geocoding, message.geocoding) &&
        Objects.equals(this.geoaddress, message.geoaddress) &&
        Objects.equals(this.timestamp, message.timestamp) &&
        Objects.equals(this.payload, message.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geocoding, geoaddress, timestamp, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    geocoding: ").append(toIndentedString(geocoding)).append("\n");
    sb.append("    geoaddress: ").append(toIndentedString(geoaddress)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

