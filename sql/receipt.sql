DROP TABLE RECEIPT;

CREATE TABLE RECEIPT (
    id INT NOT NULL auto_increment,
    product_name VARCHAR(50) NOT NULL,
    price DOUBLE NOT NULL,
    purchase_date DATE NOT NULL,
    warranty_end_date DATE NULL,
    invoice_number VARCHAR(20) NULL,
    shop_name VARCHAR(50) NULL,
    shop_address VARCHAR(100) NULL,
    shop_telephone VARCHAR(20) NULL,
    tag VARCHAR(50) NULL,
    receipt_filing VARCHAR(50) NULL,
    remarks VARCHAR(100) NULL,
    PRIMARY KEY (id)
);

COMMIT;
