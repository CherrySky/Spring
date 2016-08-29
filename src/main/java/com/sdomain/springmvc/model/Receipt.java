package com.sdomain.springmvc.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "RECEIPT")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @NotNull
    @Digits(integer = 8, fraction = 2)
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(name = "PURCHASE_DATE", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate purchaseDate;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(name = "WARRANTY_END_DATE")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate warrantyEndDate;

    @Size(min = 0, max = 20)
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    @Size(min = 0, max = 50)
    @Column(name = "SHOP_NAME")
    private String shopName;

    @Size(min = 0, max = 100)
    @Column(name = "SHOP_ADDRESS")
    private String shopAddress;

    @Size(min = 0, max = 20)
    @Column(name = "SHOP_TELEPHONE")
    private String shopTelephone;

    @Size(min = 0, max = 50)
    @Column(name = "TAG")
    private String tag;

    @Size(min = 0, max = 50)
    @Column(name = "RECEIPT_FILING")
    private String receiptFiling;

    @Size(min = 0, max = 100)
    @Column(name = "REMARKS")
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public LocalDate getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(LocalDate warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopTelephone() {
        return shopTelephone;
    }

    public void setShopTelephone(String shopTelephone) {
        this.shopTelephone = shopTelephone;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getReceiptFiling() {
        return receiptFiling;
    }

    public void setReceiptFiling(String receiptFiling) {
        this.receiptFiling = receiptFiling;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Receipt receipt = (Receipt) o;

        if (id != receipt.id) return false;
        if (productName != null ? !productName.equals(receipt.productName) : receipt.productName != null) return false;
        if (price != null ? !price.equals(receipt.price) : receipt.price != null) return false;
        if (purchaseDate != null ? !purchaseDate.equals(receipt.purchaseDate) : receipt.purchaseDate != null)
            return false;
        if (warrantyEndDate != null ? !warrantyEndDate.equals(receipt.warrantyEndDate) : receipt.warrantyEndDate != null)
            return false;
        if (invoiceNumber != null ? !invoiceNumber.equals(receipt.invoiceNumber) : receipt.invoiceNumber != null)
            return false;
        if (shopName != null ? !shopName.equals(receipt.shopName) : receipt.shopName != null) return false;
        if (shopAddress != null ? !shopAddress.equals(receipt.shopAddress) : receipt.shopAddress != null) return false;
        if (shopTelephone != null ? !shopTelephone.equals(receipt.shopTelephone) : receipt.shopTelephone != null)
            return false;
        if (tag != null ? !tag.equals(receipt.tag) : receipt.tag != null) return false;
        if (receiptFiling != null ? !receiptFiling.equals(receipt.receiptFiling) : receipt.receiptFiling != null)
            return false;
        return !(remarks != null ? !remarks.equals(receipt.remarks) : receipt.remarks != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (purchaseDate != null ? purchaseDate.hashCode() : 0);
        result = 31 * result + (warrantyEndDate != null ? warrantyEndDate.hashCode() : 0);
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (shopAddress != null ? shopAddress.hashCode() : 0);
        result = 31 * result + (shopTelephone != null ? shopTelephone.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (receiptFiling != null ? receiptFiling.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", purchaseDate=" + purchaseDate +
                ", warrantyEndDate=" + warrantyEndDate +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopTelephone='" + shopTelephone + '\'' +
                ", tag='" + tag + '\'' +
                ", receiptFiling='" + receiptFiling + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
