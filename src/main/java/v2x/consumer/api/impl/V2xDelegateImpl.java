package v2x.consumer.api.impl;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import v2x.consumer.api.V2xApiDelegate;
import v2x.consumer.model.MessageBuffer;

@Slf4j
@Service
@AllArgsConstructor
public class V2xDelegateImpl implements V2xApiDelegate{
	
	
	

    public ResponseEntity<Void> consumerV2x(@Parameter(in = ParameterIn.DEFAULT, description = "Object containing the encoded message as well as some decoded elements", required=true) @Valid @RequestBody MessageBuffer body) {
      
        log.info("Message Consumed :"+ body);
       
     
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
