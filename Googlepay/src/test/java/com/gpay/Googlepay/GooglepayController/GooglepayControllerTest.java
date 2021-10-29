package com.gpay.Googlepay.GooglepayController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.gpay.Googlepay.controller.GooglepayController;
import com.gpay.Googlepay.entity.Googlepay;
import com.gpay.Googlepay.service.GooglepayService;

@ExtendWith(MockitoExtension.class)
public class GooglepayControllerTest {
	
	@InjectMocks
	GooglepayController googlepayController;
	
	@Mock
	GooglepayService googlepayService;
	
	static Googlepay googlepay = new Googlepay();
	static Googlepay request = new Googlepay();

	
	@BeforeAll
	public static void SetUp() {
		
		googlepay.setId(null);
		googlepay.setFirstName("Pallavi");
		googlepay.setLastName("Bysani");
		googlepay.setPhone(null);
		
		request.setFirstName("Pallavi");
		request.setLastName("Bysani");
		request.setPhone(null);
	}
	
	@Test
	public void registerGooglepayTest() {
	Mockito.when(googlepayService.registerGooglepay(request)).thenReturn(googlepay);
	
	Googlepay result = googlepayController.addGooglepay(request);
	assertEquals("Pallavi",result.getFirstName());	
}
	
	

}
