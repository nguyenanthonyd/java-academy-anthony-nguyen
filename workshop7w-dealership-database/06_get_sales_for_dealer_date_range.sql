USE cardealership;

SELECT
    d.dealership_id,
    d.name          AS dealership_name,
    sc.id           AS contract_id,
    sc.contract_date,
    sc.customer_name,
    sc.sale_price,
    sc.dealer_fee,
    sc.total_price,
    sc.is_financed,
    sc.vin
FROM sales_contracts sc
JOIN inventory i   ON sc.vin = i.vin
JOIN dealerships d ON i.dealership_id = d.dealership_id
WHERE d.dealership_id = 1                          -- pick the dealer
  AND sc.contract_date BETWEEN '2023-09-01' AND '2023-09-30'  -- pick dates
ORDER BY sc.contract_date;
