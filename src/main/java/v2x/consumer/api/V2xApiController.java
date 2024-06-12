package v2x.consumer.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-26T14:15:46.654373300+02:00[Africa/Cairo]")
@Controller
@RequestMapping("${openapi.v2XConsumerAPIDraft.base-path:/v1}")
public class V2xApiController implements V2xApi {

    private final V2xApiDelegate delegate;

    public V2xApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) V2xApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new V2xApiDelegate() {});
    }

    @Override
    public V2xApiDelegate getDelegate() {
        return delegate;
    }

}
