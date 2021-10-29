package com.gpay.Googlepay.Impl;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.gpay.Googlepay.Repository.GooglepayRepository;
import com.gpay.Googlepay.entity.Googlepay;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.gpay.Googlepay.service.Impl.GooglepayServiceImpl;

@ExtendWith(SpringExtension.class)
public class GooglePayServiceImplTest {
	@InjectMocks
	GooglepayServiceImpl googlepayServiceImpl;

	@Mock
	GooglepayRepository googlepayRepository;

	@Test
	public void testGetGoogleByIdForPositive() throws AccountNotFoundException {

		Googlepay googlepay = new Googlepay();
		googlepay.setId(1L);
		googlepay.setFirstName("Pallavi");
				

		Mockito.when(googlepayRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(googlepay));

		Googlepay dbGooglepay =	googlepayServiceImpl.getGooglepayById(2L);

		assertNotNull(dbGooglepay);
		assertEquals("Pallavi", dbGooglepay.getFirstName());


	}
	@Test
	public void testGetGooglepayByIdForException(){

		Googlepay googlepay = new Googlepay();
		googlepay.setId(1L);
		googlepay.setFirstName("Pallavi");

		Mockito.when(googlepayRepository.findById(1L)).thenReturn(Optional.of(googlepay));

		try {
			Googlepay dbGoogle = googlepayServiceImpl.getGooglepayById(2L);
			assertTrue(false);
		} catch (AccountNotFoundException e) {
			System.out.println("exception==========>");
			assertTrue(true);
		}
	}

}
