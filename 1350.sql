#1350  delet  1,7,13 
select Students.id,Students.name 
from Students

where Students.department_id !='1'and Students.department_id !='7' and Students.department_id !='13';
