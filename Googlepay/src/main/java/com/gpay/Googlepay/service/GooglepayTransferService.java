package com.gpay.Googlepay.service;

import org.springframework.stereotype.Service;

import com.gpay.Googlepay.entity.GooglepayTransfer;

public interface GooglepayTransferService {

	GooglepayTransfer transferFund(GooglepayTransfer googlepayTransfer);

}
