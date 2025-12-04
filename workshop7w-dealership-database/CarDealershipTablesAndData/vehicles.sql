CREATE TABLE vehicles (
    vin           VARCHAR(17) PRIMARY KEY,    -- VIN is the primary key, not auto-increment
    make          VARCHAR(50)  NOT NULL,
    model         VARCHAR(50)  NOT NULL,
    model_year    INT          NOT NULL,
    color         VARCHAR(30),
    vehicle_type  VARCHAR(30),               -- e.g. SUV, Sedan, Truck
    odometer      INT,
    price         DECIMAL(10,2),
    sold          TINYINT(1) NOT NULL DEFAULT 0  -- 0 = not sold, 1 = sold
);
