# Write your MySQL query statement below
SELECT class 
from Courses
group by class
Having count(student) >= 5;