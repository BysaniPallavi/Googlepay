package com.gpay.Googlepay.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.gpay.Googlepay.entity.Googlepay;
import com.gpay.Googlepay.entity.GooglepayTransfer;

public interface GooglepayService {

	Googlepay registerGooglepay(Googlepay googlepay);

	List<GooglepayTransfer> generateStatement(String phoneNumber);

	Googlepay getGooglepayById(Long Id) throws AccountNotFoundException;

	
}
