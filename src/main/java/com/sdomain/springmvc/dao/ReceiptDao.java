package com.sdomain.springmvc.dao;

import com.sdomain.springmvc.model.Receipt;

import java.util.List;

public interface ReceiptDao {

	Receipt findById(int id);

	void saveReceipt(Receipt receipt);
	
	void deleteReceiptById(String id);
	
	List<Receipt> findAllReceipts();

}
