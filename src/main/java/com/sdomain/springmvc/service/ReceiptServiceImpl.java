package com.sdomain.springmvc.service;

import com.sdomain.springmvc.dao.ReceiptDao;
import com.sdomain.springmvc.model.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("receiptService")
@Transactional
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptDao dao;

    public Receipt findById(int id) {
        return dao.findById(id);
    }

    public void saveReceipt(Receipt receipt) {
        dao.saveReceipt(receipt);
    }

    public void updateReceipt(Receipt receipt) {
        Receipt entity = dao.findById(receipt.getId());
        if(entity!=null){
            entity.setInvoiceNumber(receipt.getInvoiceNumber());
            entity.setPrice(receipt.getPrice());
            entity.setProductName(receipt.getProductName());
            entity.setPurchaseDate(receipt.getPurchaseDate());
            entity.setReceiptFiling(receipt.getReceiptFiling());
            entity.setRemarks(receipt.getRemarks());
            entity.setShopName(receipt.getShopName());
            entity.setShopAddress(receipt.getShopAddress());
            entity.setShopTelephone(receipt.getShopTelephone());
            entity.setTag(receipt.getTag());
            entity.setWarrantyEndDate(receipt.getWarrantyEndDate());
        }
    }

    public void deleteReceiptById(String id) {
        dao.deleteReceiptById(id);
    }

    public List<Receipt> findAllReceipts() {
        return dao.findAllReceipts();
    }
}
