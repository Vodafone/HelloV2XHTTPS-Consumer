package v2x.consumer.api.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;

import junit.framework.TestCase;
import v2x.consumer.api.impl.V2xDelegateImpl;
import v2x.consumer.model.MessageBuffer;
import v2x.consumer.model.MessageBuffer.SubServiceEnum;

@RunWith(MockitoJUnitRunner.class)
public class V2xDelegateImplTest extends TestCase{
	
	@Spy
	private V2xDelegateImpl service;
	
	
	 private MessageBuffer dto;
	
	@Before
    public void setUp() throws JsonProcessingException {
		dto = new MessageBuffer();
		
		dto.setSubService(SubServiceEnum.IVIM);
		dto.setService("v2x");
		dto.setSubServiceGroup("public");
	
	
	}
	
	
	@Test
	public void testConsumerV2x() {
		
		
		ResponseEntity<Void> response = service.consumerV2x(dto);
        
	    assertEquals(HttpStatus.OK, response.getStatusCode());
	}


}
