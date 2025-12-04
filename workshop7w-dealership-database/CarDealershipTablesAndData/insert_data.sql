-- Insert Data


-- Dealerships
INSERT INTO dealerships (name, address, phone) VALUES
('CarMax Auto Center', '123 Maple Street', '555-123-4567'),
('Premium Motors', '78 Oak Avenue', '555-987-6543'),
('Sunshine Autos', '450 Pine Road', '555-222-3344');

-- Vehicles
INSERT INTO vehicles (vin, make, model, model_year, color, vehicle_type, odometer, price, sold) VALUES
('1HGCM82633A123456', 'Honda', 'Accord', 2020, 'Blue', 'Sedan', 15000, 21999.99, 0),
('1FAFP404X1F123789', 'Ford', 'Mustang', 2019, 'Red', 'Sports', 32000, 27999.99, 0),
('2CNDL23F696123888', 'Chevrolet', 'Equinox', 2021, 'Black', 'SUV', 5000, 30999.99, 1);

-- Inventory (which dealership has which car)
INSERT INTO inventory (dealership_id, vin) VALUES
(1, '1HGCM82633A123456'),
(1, '1FAFP404X1F123789'),
(2, '2CNDL23F696123888');

-- Sales Contracts
INSERT INTO sales_contracts (vin, contract_date, customer_name, sale_price, dealer_fee, total_price, is_financed)
VALUES
('2CNDL23F696123888', '2023-09-15', 'John Doe', 30999.99, 499.00, 31498.99, 1);
