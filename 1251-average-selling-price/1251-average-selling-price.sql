# Write your MySQL query statement below
SELECT p.product_id,
IFNULL(ROUND(SUM(p.price * u.units)/ SUM(u.units),2),0)AS average_price
From Prices p
left join UnitsSold u
on p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date and p.end_date
group by p.product_id;