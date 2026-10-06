# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary from  employee 
where salary<(SELECT MAX(salary) FROM employee);
