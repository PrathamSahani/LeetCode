# Write your MySQL query statement below
SELECT Cinema.id , Cinema.movie, Cinema.description, Cinema.rating
FROM Cinema 
WHERE id%2!=0 AND description!='boring'
ORDER BY rating DESC