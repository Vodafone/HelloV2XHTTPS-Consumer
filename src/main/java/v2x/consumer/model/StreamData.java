package v2x.consumer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StreamData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
public class StreamData   {
  @JsonProperty("partition")
  private BigDecimal partition;

  @JsonProperty("offset")
  private BigDecimal offset;

  @JsonProperty("messageCount")
  private BigDecimal messageCount;

  public StreamData partition(BigDecimal partition) {
    this.partition = partition;
    return this;
  }

  /**
   * Get partition
   * @return partition
  */
  @ApiModelProperty(example = "1", value = "")

  @Valid

  public BigDecimal getPartition() {
    return partition;
  }

  public void setPartition(BigDecimal partition) {
    this.partition = partition;
  }

  public StreamData offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  @ApiModelProperty(example = "123456789", value = "")

  @Valid

  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }

  public StreamData messageCount(BigDecimal messageCount) {
    this.messageCount = messageCount;
    return this;
  }

  /**
   * Get messageCount
   * @return messageCount
  */
  @ApiModelProperty(example = "10", value = "")

  @Valid

  public BigDecimal getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(BigDecimal messageCount) {
    this.messageCount = messageCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamData streamData = (StreamData) o;
    return Objects.equals(this.partition, streamData.partition) &&
        Objects.equals(this.offset, streamData.offset) &&
        Objects.equals(this.messageCount, streamData.messageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partition, offset, messageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamData {\n");
    
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
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

