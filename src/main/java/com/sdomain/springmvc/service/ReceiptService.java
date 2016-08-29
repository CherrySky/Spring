package com.sdomain.springmvc.service;

import com.sdomain.springmvc.model.Receipt;

import java.util.List;

public interface ReceiptService {

	Receipt findById(int id);
	
	void saveReceipt(Receipt Receipt);
	
	void updateReceipt(Receipt Receipt);
	
	void deleteReceiptById(String id);

	List<Receipt> findAllReceipts(); 
	
}
