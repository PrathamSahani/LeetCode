SELECT DISTINCT p.product_id , ROUND(sum(units*price)/sum(units), 2) AS average_price
FROM Prices AS p  JOIN UnitsSold AS u ON p.product_id = u.product_id AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id
ORDER BY p.product_id
