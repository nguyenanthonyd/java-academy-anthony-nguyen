CREATE TABLE sales_contracts (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    vin           VARCHAR(17) NOT NULL,
    contract_date DATE        NOT NULL,
    customer_name VARCHAR(100),
    sale_price    DECIMAL(10,2) NOT NULL,
    dealer_fee    DECIMAL(10,2) DEFAULT 0.00,
    total_price   DECIMAL(10,2) NOT NULL,
    is_financed   TINYINT(1) NOT NULL DEFAULT 0,   -- 0 = cash, 1 = financed
    FOREIGN KEY (vin) REFERENCES vehicles(vin)
);
