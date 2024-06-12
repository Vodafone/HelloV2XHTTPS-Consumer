package v2x.consumer.api;

import v2x.consumer.model.Error;
import v2x.consumer.model.MessageBuffer;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link V2xApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
public interface V2xApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /v2x : PoC Service for receiving Kafka Streaming messages
     * Processes a batch of Kafka Messages
     *
     * @param messageBuffer Object containing the encoded message as well as some decoded elements (required)
     * @return message was received (status code 200)
     *         or The received message was not in a correct format (status code 400)
     * @see V2xApi#consumerV2x
     */
    default ResponseEntity<Void> consumerV2x(MessageBuffer messageBuffer) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
