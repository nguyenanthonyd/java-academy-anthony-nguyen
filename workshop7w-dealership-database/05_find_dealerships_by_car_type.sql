USE cardealership;

SELECT DISTINCT d.*
FROM dealerships d
JOIN inventory i ON d.dealership_id = i.dealership_id
JOIN vehicles v ON v.vin = i.vin
WHERE v.make  = 'Ford'
  AND v.model = 'Mustang'
  AND v.color = 'Red';  -- change these values for other types
