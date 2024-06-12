package v2x.consumer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import v2x.consumer.model.Message;
import v2x.consumer.model.StreamData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageBuffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
public class MessageBuffer   {
  @JsonProperty("service")
  private String service;

  /**
   * Gets or Sets subService
   */
  public enum SubServiceEnum {
    DENM("DENM"),
    
    IVIM("IVIM");

    private String value;

    SubServiceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubServiceEnum fromValue(String value) {
      for (SubServiceEnum b : SubServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("subService")
  private SubServiceEnum subService;

  @JsonProperty("subServiceGroup")
  private String subServiceGroup;

  @JsonProperty("buffer")
  @Valid
  private List<Message> buffer = null;

  @JsonProperty("stream")
  private StreamData stream;

  @JsonProperty("version")
  private String version;

  public MessageBuffer service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  @ApiModelProperty(example = "v2x", required = true, value = "")
  @NotNull


  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public MessageBuffer subService(SubServiceEnum subService) {
    this.subService = subService;
    return this;
  }

  /**
   * Get subService
   * @return subService
  */
  @ApiModelProperty(example = "DENM", required = true, value = "")
  @NotNull


  public SubServiceEnum getSubService() {
    return subService;
  }

  public void setSubService(SubServiceEnum subService) {
    this.subService = subService;
  }

  public MessageBuffer subServiceGroup(String subServiceGroup) {
    this.subServiceGroup = subServiceGroup;
    return this;
  }

  /**
   * Get subServiceGroup
   * @return subServiceGroup
  */
  @ApiModelProperty(example = "public", required = true, value = "")
  @NotNull


  public String getSubServiceGroup() {
    return subServiceGroup;
  }

  public void setSubServiceGroup(String subServiceGroup) {
    this.subServiceGroup = subServiceGroup;
  }

  public MessageBuffer buffer(List<Message> buffer) {
    this.buffer = buffer;
    return this;
  }

  public MessageBuffer addBufferItem(Message bufferItem) {
    if (this.buffer == null) {
      this.buffer = new ArrayList<>();
    }
    this.buffer.add(bufferItem);
    return this;
  }

  /**
   * Get buffer
   * @return buffer
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Message> getBuffer() {
    return buffer;
  }

  public void setBuffer(List<Message> buffer) {
    this.buffer = buffer;
  }

  public MessageBuffer stream(StreamData stream) {
    this.stream = stream;
    return this;
  }

  /**
   * Get stream
   * @return stream
  */
  @ApiModelProperty(value = "")

  @Valid

  public StreamData getStream() {
    return stream;
  }

  public void setStream(StreamData stream) {
    this.stream = stream;
  }

  public MessageBuffer version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(example = "1", value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageBuffer messageBuffer = (MessageBuffer) o;
    return Objects.equals(this.service, messageBuffer.service) &&
        Objects.equals(this.subService, messageBuffer.subService) &&
        Objects.equals(this.subServiceGroup, messageBuffer.subServiceGroup) &&
        Objects.equals(this.buffer, messageBuffer.buffer) &&
        Objects.equals(this.stream, messageBuffer.stream) &&
        Objects.equals(this.version, messageBuffer.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, subService, subServiceGroup, buffer, stream, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageBuffer {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    subService: ").append(toIndentedString(subService)).append("\n");
    sb.append("    subServiceGroup: ").append(toIndentedString(subServiceGroup)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

