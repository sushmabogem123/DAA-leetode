# Write your MySQL query statement below
SELECT user_id,CONCAT(Upper(left(name,1)),lower(right(name,length(name)-1))) as name from Users Order by user_id;

