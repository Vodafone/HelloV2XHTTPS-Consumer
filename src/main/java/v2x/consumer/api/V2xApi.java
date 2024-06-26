/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package v2x.consumer.api;

import v2x.consumer.model.Error;
import v2x.consumer.model.MessageBuffer;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
@Validated
@Api(value = "v2x", description = "the v2x API")
public interface V2xApi {

    default V2xApiDelegate getDelegate() {
        return new V2xApiDelegate() {};
    }

    /**
     * POST /v2x : PoC Service for receiving Kafka Streaming messages
     * Processes a batch of Kafka Messages
     *
     * @param messageBuffer Object containing the encoded message as well as some decoded elements (required)
     * @return message was received (status code 200)
     *         or The received message was not in a correct format (status code 400)
     */
    @ApiOperation(value = "PoC Service for receiving Kafka Streaming messages", nickname = "consumerV2x", notes = "Processes a batch of Kafka Messages", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "V2X", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "message was received"),
        @ApiResponse(code = 400, message = "The received message was not in a correct format", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/v2x",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> consumerV2x(@ApiParam(value = "Object containing the encoded message as well as some decoded elements", required = true) @Valid @RequestBody MessageBuffer messageBuffer) {
        return getDelegate().consumerV2x(messageBuffer);
    }

}
