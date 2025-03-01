# Write your MySQL query statement below
select euniq.unique_id, e.name 
from Employees e 
left join EmployeeUNI euniq
on e.id = euniq.id;