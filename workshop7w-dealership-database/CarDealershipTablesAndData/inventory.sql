CREATE TABLE inventory (
    dealership_id INT         NOT NULL,
    vin           VARCHAR(17) NOT NULL,
    PRIMARY KEY (dealership_id, vin),
    FOREIGN KEY (dealership_id) REFERENCES dealerships(dealership_id),
    FOREIGN KEY (vin)          REFERENCES vehicles(vin)
);
